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

package uber.src;

import java.util.*;

/**
 * https://www.1point3acres.com/bbs/forum.php?mod=viewthread&tid=450254&extra=page%3D4%26filter%3Dsortid%26sortid%3D311%26searchoption%5B3046%5D%5Bvalue%5D%3D22%26searchoption%5B3046%5D%5Btype%5D%3Dradio%26sortid%3D311%26orderby%3Ddateline
 * <p>
 * 力扣遛舞巴要求先用sort写了，然后优化到 two pointer。
 * 面试官是中国人，但是英语很棒，而且交流非常的顺畅，说思路时该给反馈的地方也会给反馈。
 * 感觉自己运气很不错，希望接下来onsite能够顺利！
 * <p>
 * leetcode 658
 */

public class Prob35 {

    public static List<Integer> findClosestElementsI(int[] arr, int k, int x) {
        int l = 0, r = arr.length - 1;
        List<Integer> res = new ArrayList<>();
        PriorityQueue<Integer> pq = new PriorityQueue<>(k, new Comparator<Integer>() {
            @Override public int compare(Integer o1, Integer o2) {
                return Math.abs(o2 - x) != Math.abs(o1 - x) ?
                        Math.abs(o2 - x) - Math.abs(o1 - x) :
                        o2 - o1;
            }
        });
        for (Integer elem : arr) {
            pq.offer(elem);
            if (pq.size() > k) {
                pq.poll();
            }
        }
        while (!pq.isEmpty()) {
            res.add(pq.poll());
        }
        Collections.sort(res);
        return res;
    }

    public static List<Integer> findClosestElementsII(int[] arr, int k, int x) {
        int l = 0, r = arr.length - 1;
        List<Integer> res = new ArrayList<>();
        List<Integer> tmp = new ArrayList<>();
        for (int elem : arr) {
            tmp.add(elem);
        }
        Collections.sort(tmp, new Comparator<Integer>() {
            public int compare(Integer o1, Integer o2) {
                return Math.abs(o1 - x) != Math.abs(o2 - x) ?
                        Math.abs(o1 - x) - Math.abs(o2 - x) :
                        o1 - o2;
            }
        });
        for (int i = 0; i < k; i++) {
            res.add(tmp.get(i));
        }
        Collections.sort(res);
        return res;
    }

    public static void main(String[] args) {
        int[] arr = { 2, 1, 3, 5, 4 };
        int k = 4, x = -1;
        List<Integer> res = findClosestElementsII(arr, k, x);
        System.out.println("res: " + res);
    }

}
