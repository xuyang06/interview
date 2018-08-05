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

package linkedin.src;

import java.util.*;

/**
 * https://www.1point3acres.com/bbs/forum.php?mod=viewthread&tid=452897&extra=page%3D1%26filter%3Dsortid%26sortid%3D311%26searchoption%5B3088%5D%5Bvalue%5D%3D12%26searchoption%5B3088%5D%5Btype%5D%3Dradio%26sortid%3D311%26orderby%3Ddateline
 * <p>
 * 面的Machine Learning Engineer，直接linkedin上找HR内推得，很快就安排面试
 * <p>
 * 电面一轮：
 * 聊聊背景，coding写kmeans
 * <p>
 * onsite：
 * 一轮HM聊天，各种behavior问题，包括为什么linkedin，想做什么样的项目，
 * 5年后的目标，团队合作经历等等
 * <p>
 * 二轮吃饭随便聊
 * <p>
 * <p>
 * 三轮给一些一维坐标上的点，找一个点到所有点的距离最小。证明并且coding。这轮答的很差。
 * <p>
 * <p>
 * 四轮聊过去做的项目
 * <p>
 * 五轮coding，max stack，实现pop/push，popmax/peekmax等等，要求尽量优化时间复杂度
 * <p>
 * 六轮聊过去做的项目，这轮更偏system design一些
 */

public class prob1 {

    public static List<Double> kmeans(List<Double> input, int k) {
        double minV = Double.MAX_VALUE;
        double maxV = Double.MIN_VALUE;
        for (double val : input) {
            minV = Math.min(minV, val);
            maxV = Math.max(maxV, val);
        }
        //System.out.println("maxV: " + maxV);
        //System.out.println("minV: " + minV);
        List<Double> centroids = new ArrayList<>();
        Random rand = new Random();
        for (int i = 0; i < k; i++) {
            centroids.add(minV + (rand.nextDouble()) * (maxV - minV));
        }
        System.out.println("centroids: " + centroids);
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

    private static double calDist(double centroid, double val) {
        return Math.abs(val - centroid);
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

    public static void main(String[] args) {
        List<Double> input = Arrays.asList(new Double[] { 1.0, 2.0, 3.0, 4.0, 5.0 });
        int k = 2;
        List<Double> res = kmeans(input, k);
        System.out.println("res: " + res);
    }
}
