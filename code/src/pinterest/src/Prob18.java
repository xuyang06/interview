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

package pinterest.src;

import java.util.*;

/**
 * https://www.1point3acres.com/bbs/forum.php?mod=viewthread&tid=454755&extra=page%3D1%26filter%3Dsortid%26sortid%3D311%26searchoption%5B3088%5D%5Bvalue%5D%3D12%26searchoption%5B3088%5D%5Btype%5D%3Dradio%26sortid%3D311%26orderby%3Ddateline
 * <p>
 * 第一轮 1）如何测量两个图片的相似度。
 * 2)无向图中找connected component。用的Union find，要分析复杂度。
 * 3）图比较大怎么办，map reduce
 * <p>
 * <p>
 * 第二轮 alien dictionary，要求按字典顺序输出所有合理的结果。有向图上backtracking，
 * 有一个小问题没有想到怎么漂亮地解决，最后code写出来了很难看，跪了
 * <p>
 * leetcode 269
 * <p>
 * <p>
 * <p>
 * <p>
 * <p>
 * 第三轮 设计pinterest的boards的推荐系统，没怎么做过这方面的东西，面试之前突击看了点相关的东西，不管好坏全都说出来了。
 * 面试官跟机器人一样一直重复sounds good, interesting, um..that might work这几句话，也不知道答得怎么样
 * <p>
 * <p>
 * 第四轮 ml的细碎的基本知识，没什么难的。
 * <p>
 * <p>
 * 第四轮只记得一小部分问题，logistic regression和random forest的比较，
 * 一些gradient descent的优化比如adam和momentum，
 * dropout，data augumentation，overfitting
 */

public class Prob18 {

    public static List<String> alienOrder(String[] words) {
        List<String> res = new ArrayList<>();
        if (words == null || words.length == 0) {
            return res;
        }
        if (words == null || words.length == 0) {
            return res;
        }
        Map<Character, Set<Character>> graph = new HashMap<>();
        for (int i = 0; i < words.length - 1; i++) {
            String cur = words[i];
            String next = words[i + 1];
            for (int j = 0; j < Math.min(cur.length(), next.length()); j++) {
                if (cur.charAt(j) != next.charAt(j)) {
                    if (graph.get(cur.charAt(j)) == null) {
                        graph.put(cur.charAt(j), new HashSet<>());
                    }
                    graph.get(cur.charAt(j)).add(next.charAt(j));
                    break;
                }
            }
        }
        Map<Character, Integer> incomingDegree = new HashMap<>();
        for (Set<Character> values : graph.values()) {
            for (Character c : values) {
                incomingDegree.put(c, incomingDegree.getOrDefault(c, 0) + 1);
            }
        }
        Set<Character> chars = new HashSet<>();
        for (String word : words) {
            for (char c : word.toCharArray()) {
                chars.add(c);
                if (incomingDegree.get(c) == null) {
                    incomingDegree.put(c, 0);
                }
            }
        }
        helper(new StringBuilder(), chars, incomingDegree, res, graph);
        return res;
    }

    private static void helper(StringBuilder sb, Set<Character> chars,
            Map<Character, Integer> incomingDegree, List<String> res,
            Map<Character, Set<Character>> graph) {
        if (sb.length() == chars.size()) {
            res.add(sb.toString());
            return;
        }
        for (char c : incomingDegree.keySet()) {
            if (incomingDegree.get(c) == 0) {
                sb.append(c);
                Map<Character, Integer> incomingDegreeCp = new HashMap<>(incomingDegree);
                incomingDegreeCp.remove(c);
                if (graph.get(c) != null) {
                    for (Character neighbor : graph.get(c)) {
                        incomingDegreeCp.put(neighbor, incomingDegree.get(neighbor) - 1);
                    }
                }
                helper(sb, chars, incomingDegreeCp, res, graph);
                sb.deleteCharAt(sb.length() - 1);
            }
        }
    }

    public static void main(String[] args) {
        String[] words = {
                "z",
                "x",
                "z",
                "rftt" };
        List<String> alienSet = alienOrder(words);
        System.out.println(alienSet);
    }

}
