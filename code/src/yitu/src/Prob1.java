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

public class Prob1 {
    /**
     * 1、LeetCode原题，判断一个数是不是2的幂。
     当时没想起来是LeetCode原题，直观地利用二进制表示是否只有一个1的做法，
     因为如果是2的幂的话二进制表示肯定只有一个1，这样做法是O(32)的。
     后来面试官问有什么可以优化的，我没直接想出来，但给出了思考方向。
     先是试探性地问面试官他现在是希望我想出一个一步到位的算法，
     得到肯定回答后可以排除一些奇怪的想法，那么只剩下两种可能性。
     一种是一步算出有多少个1，另一种是消掉其中一个1然后看是否还有1。
     显然第一种是走不通的，那么只省下第二种可能性，面试官表示了赞同。
     在经过这样一番沟通后，面试官提示我可以考虑下和x-1的关系，这个时候我才想起这事leetCode原题，
     但时间太久还是没想起来，现场试验后发现这就是消掉最右边一个1的做法。

     Leetcode 231

     2、下围棋的情况判断
     面试官拿了一张纸画了一个围棋盘，然后用黑白磁铁当做棋子摆出个棋局。
     是围棋规则，要让对手没一口活棋（就是他落哪都不能围住我但自己会被围）。
     然后又画了一个空格，两个空格，三个空格，四个空格及其以上的情况，
     其实问题的关键是黑棋只要能构建出两个独立的联通分量的话他就能活（不被围死）。
     但当时对规则理解实在没咋懂，加上中午没睡觉所以有点懵，没找出关键。


     *
     * */

}
