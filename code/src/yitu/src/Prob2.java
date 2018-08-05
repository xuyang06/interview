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

package yitu.src;

public class Prob2 {
    /**
     *  1、给一个三维坐标A，找另一个高低位相同的三维坐标，使得离A最近。
     根据距离公式可以得出三个分量独立，然后每个分量只需要16次枚举就行。
     当时没想到按最直接的想法想就行，想偏了。在提示下才做出来的。
     接下来是写代码，这题涉及到字符串和整型的互相转化，写了四个函数。
     写得比较慢，但好险没出bug，弥补了前面的失误。

     2、LeetCode原题，给一个字符串，找出最长子串使得其实没一个字符重复
     LeetCode原题，直接用个数组标记就行，但实在很困，语言表达得很渣。这题没写代码。

     {Leetcode 3}

     3、给一个整型数组，找出能整除p的子数组的个数。
     一开始想复杂了，甚至往动态规划上想去了，其实也是从最直接的做法优化。
     O（N^2）枚举所有情况，用前缀和(sum[j] - sum[i]) mod p判断，
     代入问题转换成将前缀和mod p之后看有多少对相同的。这个用个统排计算一下即可，
     当时漏了一种情况就是sum[i] mod p == 0时要单独加上（长度为1的也符合条件）。
     这个代码也比较好实现。

     *
     * */

}
