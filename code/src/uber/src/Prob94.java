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

/**
 * https://www.1point3acres.com/bbs/forum.php?mod=viewthread&tid=496015&extra=page%3D1%26filter%3Dsortid%26sortid%3D311%26searchoption%5B3046%5D%5Bvalue%5D%3D22%26searchoption%5B3046%5D%5Btype%5D%3Dradio%26sortid%3D311%26orderby%3Ddateline
 * <p>
 * 匹兹堡一个做运动规划工程师面我的，一开始自我介绍他说的不多直接上来两题.
 * 问题一: 在数组中找第二大的的数，没有重复
 * 问题二: 力口误溜 leetcode 56
 */

public class Prob94 {

    public static int secondLargest(int[] nums) {
        int maxV = Integer.MIN_VALUE, secondMaxV = Integer.MIN_VALUE;
        for (int num : nums) {
            if (num >= maxV) {
                secondMaxV = maxV;
                maxV = num;
            } else if (num >= secondMaxV) {
                secondMaxV = num;
            }
        }
        return secondMaxV;
    }

    public static void main(String[] args) {
        int[] nums = { 3, 4, 2, 6, 10, 7 };
        System.out.println(secondLargest(nums));
    }
}
