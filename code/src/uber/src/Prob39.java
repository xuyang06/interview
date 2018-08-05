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
 * https://www.1point3acres.com/bbs/forum.php?mod=viewthread&tid=453063&extra=page%3D3%26filter%3Dsortid%26sortid%3D311%26searchoption%5B3046%5D%5Bvalue%5D%3D22%26searchoption%5B3046%5D%5Btype%5D%3Dradio%26sortid%3D311%26orderby%3Ddateline
 * <p>
 * 在codepair 上跑
 * 需要写test case 并跑通代码.
 * <p>
 * 题目比较简单
 * find common elements in k sorted array
 * 问了两种解法
 * 给了一个 binary search 一个heap
 * 做完发现其实可以有iterative 的 o(KN)解， 就是先找a1,a2 -> a 12  再找a12, a3 -> a123以此类推每次time 都是o(n).
 * 求加米~ 求onsite
 */

public class Prob39 {
    /**
     * Binary search -> O(log n) For searching 1 num in n-1 rows :
     * O(nlogn) Binary search for each number in first row : O(n2logn)
     * */

    /**
     * Explanation of algorithm. We use the first array (or any arbitrary array)
     * as the reference algorithm, and iterate through all the other arrays in parallel
     * (kind of like the merge step of a merge sort, except with N arrays.)
     * Every value of the reference array that is common to all the arrays must
     * be present in all the other arrays. So for each other array (since they are sorted),
     * we increase the index x_i until the value at that index A_i[x_i] is at least the
     * value we are looking for (we don't care about lesser values; they can't be common.)
     * We can do this since the arrays are sorted and thus monotonically nondecreasing.
     * If all the arrays had this value, then we print it, otherwise we increment x_1 in
     * the reference array and keep going. We have to do this even if we don't print the value.

     By the end, we've printed all the values that are common to all the arrays, while only
     having examined each element once.
     *
     *
     *
     * public static void main(String[] args) {
     int[][] a = {
     { 10, 160, 200, 500, 500, },
     { 4, 150, 160, 170, 500, },
     { 2, 160, 200, 202, 203, },
     { 3, 150, 155, 160, 300 },
     { 3, 150, 155, 160, 301 } };

     int n = a.length;
     int[] x = new int[n];

     for( ; x[0] < n; x[0]++ ) {
     int val = a[0][x[0]];
     boolean print = true;
     for( int i = 1; i < n; i++ ) {
     while (a[i][x[i]] < val && x[i] < n-1) x[i]++;
     if (a[i][x[i]] != val) print = false;
     }
     if (print) System.out.println(val);
     }
     }
     *
     * */

}
