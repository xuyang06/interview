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

import java.util.Random;

/**
 * https://www.1point3acres.com/bbs/forum.php?mod=viewthread&tid=451935&extra=page%3D2%26filter%3Dsortid%26sortid%3D311%26searchoption%5B3088%5D%5Bvalue%5D%3D12%26searchoption%5B3088%5D%5Btype%5D%3Dradio%26sortid%3D311%26orderby%3Ddateline
 * <p>
 * 第一轮 coding
 * - find 3 numbers from array to form a triangle.
 * leetcode 611
 * <p>
 * - number of island.
 * leetcode 200
 * <p>
 * <p>
 * 第二轮 lunch + behavior
 * 我觉得应该是被三哥带错食堂了，特么吃了一顿orange chicken.
 * <p>
 * <p>
 * 第三轮 data mining product design
 * 设计home feed, 强推这篇blog https://blog.statsbot.co/recomme ... rithms-ba67f39ac9a3，
 * 特别是讲解youtube paper的部分，简直是谈笑风生装逼利器 来源一亩.三分地论坛.
 * <p>
 * <p>
 * <p>
 * https://blog.statsbot.co/recommendation-system-algorithms-ba67f39ac9a3
 * <p>
 * <p>
 * 第四轮 data mining
 * - 推导MLE
 * - LR能想到的所有公式，cost，求导，gradient descent,
 * l1 / l2 reg, LR的适用范围.
 * <p>
 * - 如何选择不同的model，比如LR， tree based，NN等，debug各种的model的常用方法
 * <p>
 * <p>
 * 第五轮 data coding
 * - Find median from array, must use quick select leetcode 215
 * - Weighted random sample (leetcode 528)
 * 三哥加一个挺年轻的国人shaodow，两人全程都在看自己的电脑，都是我写完了提醒他们才开始抬头看白板，交流个鬼
 * <p>
 * <p>
 * 第六轮 host manager
 * - 各种乱七八糟的behavior
 * - design job recommendation
 * 国人manager，长的神似有头发的徐峥
 * <p>
 * 出结果巨慢无比，等了两周跟我说觉得经验不够不能给sr，但是可以给swe offer，真是日了狗，没有当场拒掉，
 * 不过也懒得理他们接下来的team match了
 */

public class Prob2 {

    /**
     * https://leetcode.com/problems/kth-largest-element-in-an-array/discuss/60300/java-quick-select
     * <p>
     * https://stackoverflow.com/questions/8783408/why-is-the-runtime-of-the-selection-algorithm-on
     */

    public static int findMedium(int[] input) {
        return findKth(input, (input.length - 1) / 2);
    }

    private static int randomPivot(int left, int right) {
        return left + new Random().nextInt(right - left + 1);
    }

    private static int partition(int[] input, int start, int end, int pivotInd) {
        int pivotVal = input[pivotInd];
        swap(input, pivotInd, end);
        pivotInd = end;
        while (start <= end) {
            while (start <= end && input[start] <= pivotVal) {
                start += 1;
            }
            while (start <= end && input[end] > pivotVal) {
                end -= 1;
            }
            if (start > end)
                break;
            swap(input, start, end);
        }
        swap(input, end, pivotInd);
        return end;
    }

    private static void swap(int[] input, int l, int r) {
        int tmp = input[r];
        input[r] = input[l];
        input[l] = tmp;
    }

    public static int findKth(int[] input, int k) {
        int start = 0, end = input.length - 1;
        while (start < end) {
            int pivot = randomPivot(start, end);
            System.out.println("pivot 1: " + pivot);
            pivot = partition(input, start, end, pivot);
            System.out.println("pivot 2: " + pivot);
            if (pivot < k) {
                start = pivot + 1;
            } else if (pivot > k) {
                end = pivot - 1;
            } else {
                return input[pivot];
            }
        }
        return input[start];
    }

    public static void main(String[] args) {
        int[] input = { 3, 4, 6, 2, 1 };
        System.out.println(findMedium(input));

    }

}
