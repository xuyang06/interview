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

public class Prob7 {
    /**
     * 作者：.戊龙
     链接：https://www.nowcoder.com/discuss/25714
     来源：牛客网

     一面面试官是个看起来就觉得很聪明的人，或者说长的很聪明的人，先问了问3个项目。
     因为我直说机器学习这块我正在恶补，他就说那就不问机器 学习，直接出算法。
     第一题很简单： 有序数组 从中间某点隔开，右边的放到左边，
     然后问在这个数组中怎么进行二分查找。讲了思路后手写代码

     Leetcode 33

     第二题第一问也很简单： 一个矩阵上每一点都有分值，从左上角走到右下角，
     只能往下或者往右，问走一遍能够取到的最大分值，简单DP一下。
     第二问比较有难度，问走两遍能够取到的最大分值，大概花费了15分钟才解出来，面试官很满意。

     https://blog.csdn.net/u011077606/article/details/43302987



     二面面试官看起来也蛮聪明，上来啥都不说直接出算法题
     第一题：有一个数组，让找到两个不重复的连续子序列A,B ，
     求Max(Sum(A)-Sum(B)。 3分钟解出，10分钟写完代码

     https://blog.csdn.net/wangyuquanliuli/article/details/46653443

     第二题：有一个GOD（）函数，能够以C的概率返回0，
     以1-C的概率返回1，C未知，让利用GOD（）构造P（x )实现以X的概率返回0,
     1-X的概率返回1，不能使用随机函数
     我说了两个解法，但都是错的，因为还是用了随机函数。
     最后面试官说了解法，感觉trick痕迹太明显了，正常根本想不出来啊。

     http://sumnous.github.io/blog/2014/05/13/random-pick-function/

     https://www.zhihu.com/question/266814537/answer/340164700


     /
     作者：Tang Master
     链接：https://www.zhihu.com/question/266814537/answer/314942825
     来源：知乎
     著作权归作者所有。商业转载请联系作者获得授权，非商业转载请注明出处。

     如果你想产生概率为p的1和概率为1-p的0，只要把p写成二进制小数，
     小数点后第k位记作ak（p=0.a1a2a3....）。算法：对i=1到∞（虽然如此，它还是可以在有限步内结束的）：
     随机生成一个t=0或者1。如果ai<t，返回1；如果ai>t，返回0；如果ai=t，进入下一轮循环。
     容易证明这个算法返回1的概率是p：返回1的概率=（在第k轮返回1的概率）
     （k从1到∞）的和=（从1到k-1轮都有t=ai，第k轮t=0且ak=1）
     （k从1到∞）的和而（从1到k-1轮都有t=ai）的概率是0.5^(k-1)，
     （第k轮有t=0且ak=1）的概率是0.5*ak（即ak=0时为0，ak=1时为1/2）。
     于是（从1到k-1轮都有t=ai，第k轮t=0且ak=1）的概率为ak*0.5^k。
     于是返回1的概率=ak*0.5^k（k从1到∞）的和。
     注意到左边等于0.a1a2a3.....=p，所以返回1的概率=p。
     而那个P(n+1)和Pn间的递推式起的作用，简而言之就是，
     如果Pn=0.b1b2b3.....，那么Pn+1=0.b2b3b4.....。
     使用这个递推，再依次判断Pk是否小于0.5，就顺次得到了二进制p小数点后每一位的值。
     /


     三面主管面，首先让我讲一个我觉得最值得讲的项目，我选了股票舆情分类来讲，
     但应该是被鄙视了，面试官言外之意就是个二分类而已。
     然后还问了些为什么不尝试用深度模型之类。

     然后又出了道算法题：
     LeetCode原题： 有一个集合A包含了一些数，输入N，
     求元素个数最小的集合B，使得A并B后内的数组合相加能够组成1到N中的所有数
     主要是这题表述有点模糊，理解清楚题意后就想起来解法，
     很快解了出来，然后写代码，但还是漏了一个细节造成一个BUG被面试官发现了
     随后随便聊天，我问了一个问题，
     就是华为现在要用开发历史数据中挖掘信息来提高软件工程师效率，
     这个事能否做，面试官很鄙视的向我解释了这个事情做不了，
     说了一大堆，原因我其实也知道。。
     后来我说我们现在确实让华为提供数据和一个想做的细节点的LIST。

     <leetcode 330></leetcode>
     * */
}
