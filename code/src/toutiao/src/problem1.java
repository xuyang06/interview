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

package toutiao.src;

import java.util.ArrayList;
import java.util.List;

/**
 * https://www.1point3acres.com/bbs/forum.php?mod=viewthread&tid=455627&extra=page%3D1%26filter%3Dsortid%26sortid%3D311%26searchoption%5B3046%5D%5Bvalue%5D%3D47%26searchoption%5B3046%5D%5Btype%5D%3Dradio%26sortid%3D311%26orderby%3Ddateline
 * <p>
 * OA 五道题，分别是Leetcode 叁 久散 而领令 伞酒馓  以及一道原创的图的题，
 * 也不难-
 * <p>
 * leetcode 393 203 200
 * <p>
 * <p>
 * 第一轮电面是和北京那边面的， 问了很多project的问题，还有CV的基础知识，
 * 算法题考的是流唔扒，但是要求用O(logn + logk)的复杂度做
 * <p>
 * leetcode 658
 * <p>
 * <p>
 * 第二轮电面是和Menlo Park这边面的，考的很简单，说了说简历，
 * 还有一道稀疏向量点乘的那道题（FB面经题）
 * Leetcode 311
 * <p>
 * <p>
 * Onsite在Menlo Park, 当天老大不在只面了两轮。
 * 第一轮是Coding，先考了一道大数据的题，说头条有很多（billion级别）message
 * （uid, message, timestamp），要统计最活跃的1000个uid怎么做。就是用map-reduce
 * <p>
 * 然后考的是一道在BST中找第k大的数（每个TreeNode里有一个值域告诉你subtree有多少个TreeNode）
 * ，用个recursion就行
 * leetcode 230
 * <p>
 * 第三题是edit distance，但是add,insert,replace的cost不一样，求最小cost
 * leetcode 72
 * <p>
 * 第二轮是CV的，主要就是问简历，问的非常细，很多CV基础的东西
 */

public class problem1 {

    public static List<Integer> findClosestElements(int[] arr, int k, int x) {
        List<Integer> res = new ArrayList<>();
        int l = 0, r = arr.length - 1;
        while (l < r) {
            int m = l + (r - l) / 2;
            if (arr[m] >= x) {
                r = m;
            } else {
                l = m + 1;
            }
        }
        System.out.println("l: " + l);
        l = Math.max(0, l - k);
        r = Math.min(l + k, arr.length - 1);
        System.out.println("l: " + l);
        System.out.println("r: " + r);
        while (r - l + 1 > k) {
            if (Math.abs(arr[l] - x) <= Math.abs(arr[r] - x)) {
                r--;
            } else {
                l++;
            }
        }
        while (l <= r) {
            res.add(arr[l++]);
        }
        return res;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 5, 5, 6, 6, 7, 7, 8, 9 };
        int k = 7;
        int x = 7;
        List<Integer> res = findClosestElements(arr, k, x);
        System.out.println("res: " + res);
    }

}
