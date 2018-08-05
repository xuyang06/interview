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

public class Prob2 {
    /**
     * 输⼊入是⼀一组int[][] parentChildPairs = {{1, 3}, {2, 3}, {3, 6}, {5, 6}, {5, 7}, {4, 5}, {4, 8}, {8, 9}},
     表示1 是3 的parent，2 是3 的parent，如此类推下去。画成图形就是：
     1 2 4
     \ / /\
     3 5 8
     \ / \ \
     6 7 9
     1) 第1 个问就是返回所有no parents 的person 和只有1 个parent 的person，即 {{1, 2, 4}, {5,
     8, 7, 9}}。
     2) 第⼆二个问题就是给input (int[][] parentChildPairs, int person1, int person2)，返回 person1
     和person2 有没有共同的ancestor，⽐比如 (5, 8) => true; (3, 5) => false
     3) 给input(int[][] parentChildPairs, int person)，找出person 最远的ancestor。⽐比如 对于6，
     其“最远”的ancestor 是1， 2， 4，那么返回其中任何⼀一个即可；对于 9，其“最远”的ancestor
     是4， return 4 就可以。如果没有ancestor，return -1 即可。
     地址：
     http://www.1point3acres.com/bbs/forum.php?mod=viewthread&tid=413627&extra=page%
     3D2%26filter%3Ddateline%26orderby%3Ddateline%26sortid%3D311%26sortid%3D311%2
     6orderby%3Ddateline
     *
     * */



}
