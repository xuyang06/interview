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

/**
 * 第⼀一轮：让design⼀一下Pinterest的home feed system。主要讨论如何设计
 * social graph和feed的存储https://medium.com/@Pinterest_Engineering/
 * building-a-smarter-home-feed-ad1918fdfbe3
 * <p>
 * <p>
 * <p>
 * 第⼆二轮：给⼀一个N⻓长度的unsorted array，array中的每个数都是8bit的正数
 * integer，以及M个query，每个query⾥里里有个start index和end index， 要求
 * 出原array中每个start point到end point的平均数。先说了了⼀一下brute force的
 * 解法，时间O(N*M)，⼩小哥问能不不能优化，给出了了⽤用累加array的解法，时间
 * O(N+M)，⼩小哥表示ok。follow up，如果找中数怎么找。这⾥里里有点卡住，⼩小
 * 哥提示每个数都是8bit的这个条件还没⽤用，想出了了bucket sort的解法，说完
 * 时间不不够了了，没有写代码。
 * 中间轮，⼀一个美国⼩小姐姐带着吃。
 * <p>
 * <p>
 * <p>
 * 第三轮：Pinterest主⻚页上有N个column，给⼀一个set of pins，pins有score和
 * length，每次把score最⾼高的pin贴到最短的column上，return
 * List<List<pins>> 表示每个column⾥里里的pins。⽤用priority queue做，写完之
 * 后follow up：⽤用户的⼿手机屏幕只有M⻓长，如果屏幕的顶点距离主⻚页顶点距离
 * 为K，求出能显示出的pins。思路路是⽤用数组存⼀一个column中每个pins到顶点
 * 的距离，然后找到最上⾯面的和最下⾯面的，再求中间的。⼩小优化是⽤用binary
 * search找start point 和 end point。写了了⼀一半，时间不不够了了，问了了点问题就
 * 结束了了。
 * <p>
 * <p>
 * <p>
 * 第四轮：给⼀一个list of intervals， interval有start， end 和 weight，如果两
 * 个interval overlap了了，overlap部分的weight相加变成新的interval，start和
 * end point是overlap部分的两个边界。return原list overlap之后的新list of
 * intervals。说了了个priority queue的解法
 * http://www.voidcn.com/article/p-yvscwuip-d.html
 **/

public class Prob30 {
}
