/*************************************************************************
 *
 * Copyright (c) 2016, DATAVISOR, INC.
 * All rights reserved.
 * __________________
 *
 * NOTICE:  All information contained herein is, and remains
 * the property of DataVisor, Inc.
 * The intellectual and technical concepts contained
 * herein are proprietary to DataVisor, Inc. and
 * may be covered by U.S. and Foreign Patents,
 * patents in process, and are protected by trade secret or copyright law.
 * Dissemination of this information or reproduction of this material
 * is strictly forbidden unless prior written permission is obtained
 * from DataVisor, Inc.
 */

package facebook.src;

/**
 * https://www.1point3acres.com/bbs/forum.php?mod=viewthread&tid=508083&extra=page%3D1%26filter%3Dsortid%26sortid%3D311%26searchoption%5B3088%5D%5Bvalue%5D%3D12%26searchoption%5B3088%5D%5Btype%5D%3Dradio%26searchoption%5B3046%5D%5Bvalue%5D%3D2%26searchoption%5B3046%5D%5Btype%5D%3Dradio%26sortid%3D311%26orderby%3Ddateline
 * <p>
 * 第一轮: bh问题.
 * 第二轮: research talk.
 * 第三轮: nlp design: 假定现在有个机器翻译系统上线了，如何评估翻译质量.
 * 第四轮: ml design: newsfeed.
 * <p>
 * https://www.slideshare.net/SessionsEvents/ewa-dominowska-engineering-manager-facebook-at-mlconf-sea-52016
 * https://www.youtube.com/watch?v=wcVJZwO_py0
 * <p>
 * <p>
 * 第五轮: coding: 蠡口伞思久， 伞武玲+followup. 蠡口酒气伞。
 * <p>
 * leetcode 349
 * leetcode 350
 * leetcode 973
 * 第六轮: ml coding: kmeans+followup。
 * <p>
 * <p>
 * 第三轮的意思是，比如在fb的feed里，自动把英文翻译成了德语，如何知道现在这个系统的翻译质量。
 **/

import java.util.*;

/**
 * 比如在fb的feed里，自动把英文翻译成了德语，如何知道现在这个系统的翻译质量。
 * <= 我的想法适用user 的behavior 当作feedback
 * 比如说 user preference 是德文 看了翻译的之后
 * 就有做post or like 等等action ,
 * 这就是ㄍㄧ个质量的说明 ? 不知到lz 怎答的?
 * <p>
 * 和你的答复差不多， 构建一个机器模型预测用户feedback的置信度。
 * 主要讨论在于如何收集user feedback , 怎么进行 training 吗? 还是是别的
 * 我是主要说了些用什么feature， 用什么model， 最后稍微提了下怎么收集数据。 我感觉可能是跪在这一轮了。。。
 * <p>
 * <p>
 * <p>
 * <p>
 * say543 发表于 2019-4-2 14:45
 * 能问下 k means 的follow up 是什么吗?
 * <p>
 * 如何更好初始化， 如何消除for循环，如何判断收敛等等。
 **/

public class Prob47 {

    public static List<Double> kmeans(List<Double> input, int k) {
        List<Double> centroids = new ArrayList<>();
        Random rand = new Random();
        for (int i = 0; i < k; i++) {
            centroids.add(rand.nextDouble());
        }
        int iter = 0;
        List<Double> oldCentroids = new ArrayList<>();
        while (!shouldStop(oldCentroids, centroids, iter)) {
            oldCentroids = new ArrayList<>(centroids);
            Map<Double, Integer> labels = getLabels(input, centroids);
            centroids = calCentroids(labels, k);
            iter++;
            //System.out.println("labels: " + labels);
        }
        return centroids;
    }

    private static List<Double> calCentroids(Map<Double, Integer> labels, int k) {
        List<Double> centroids = new ArrayList<>();
        for (int i = 0; i < k; i++) {
            centroids.add(0.0);
        }
        Map<Integer, Integer> centroidNum = new HashMap<>();
        for (int i = 0; i < k; i++) {
            centroidNum.put(i, 0);
        }
        for (double val : labels.keySet()) {
            int label = labels.get(val);
            centroids.set(label, centroids.get(label) + val);
            centroidNum.put(label, centroidNum.get(label) + 1);
        }
        for (int i = 0; i < k; i++) {
            centroids.set(i, centroids.get(i) / centroidNum.get(i));
        }
        return centroids;
    }

    private static Map<Double, Integer> getLabels(List<Double> input, List<Double> centroids) {
        Map<Double, Integer> labels = new HashMap<>();
        for (double val : input) {
            int label = 0;
            double dist = Double.MAX_VALUE;
            for (int i = 0; i < centroids.size(); i++) {
                double centroidVal = centroids.get(i);
                double tmpDist = calDist(centroidVal, val);
                if (tmpDist < dist) {
                    dist = tmpDist;
                    label = i;
                }
            }
            labels.put(val, label);
        }
        return labels;
    }

    private static double calDist(double centroid, double val) {
        return Math.abs(val - centroid);
    }

    private static boolean shouldStop(List<Double> oldCentroids, List<Double> centroids, int iter) {
        if (iter > 100000) {
            return true;
        }
        if (oldCentroids.size() == 0) {
            return false;
        } else {
            for (int i = 0; i < centroids.size(); i++) {
                if (Math.abs(oldCentroids.get(i) - centroids.get(i)) > 0.0001) {
                    return false;
                }
            }
        }
        return true;
    }

}
