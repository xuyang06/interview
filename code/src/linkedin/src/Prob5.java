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

/**
 * https://www.1point3acres.com/bbs/forum.php?mod=viewthread&tid=449827&extra=page%3D1%26filter%3Dsortid%26sortid%3D311%26searchoption%5B3088%5D%5Bvalue%5D%3D12%26searchoption%5B3088%5D%5Btype%5D%3Dradio%26searchoption%5B3046%5D%5Bvalue%5D%3D6%26searchoption%5B3046%5D%5Btype%5D%3Dradio%26sortid%3D311%26orderby%3Ddateline
 * <p>
 * 0月10日领英ML实习电面，两轮背靠背，各1h
 * 之前在地里看了很多面经，然而竟然遇到了两道没见过的题。。做题时有点慌脑子不太清醒，估计悲剧啦QAQ
 * <p>
 * 一面：应该是两个印度小哥哥
 * 先聊了聊简历的项目，问了一些技术细节。.
 * 然后做了一道题：给一个convex函数，已知函数取最小值的点x的范围[l,r]，
 * 并提供一个可以得到任意点x函数值f(x)的接口，写程序返回该函数取最小值时的点x。
 * 我用了类似二分的方法。写完后大概用一个例子讲了一下，讨论了一下时间复杂度。
 * <p>
 * 之后让随便选一个熟悉的ml model介绍，讲了logistic regression，目标函数、如何优化等等，
 * 这一部分基础知识和之前的面经差不多。
 * <p>
 * <p>
 * <p>
 * 二面：白人小哥和国人小哥.
 * 自我介绍后直接做题。
 * 实现一个hash table，主要是俩函数get和put。
 * 题目很简单，可是当时脑子不清楚，在如何解决conflict上卡了很久，然后一直注意和面试官讨论。。。
 * 小哥人很好一直有引导我。。最后在提示下写完了。
 * 时间有点久。。于是就问了问问题然后结束。。
 * <p>
 * 楼主hash table 用linked list 做还是linear probing/rehash 做比较好啊。
 * 我猜是linked list就好了? 我当时提到了可以linear probing/rehash，小哥说可以是可以但是可以不要那么麻烦~
 * <p>
 * <p>
 * <p>
 * <p>
 * 希望对大家有帮助！为了之后的面试攒rp。。不设置隐藏了因为很懂大米不够看不了面经的痛QAQ
 * 求加大米啊啊啊啊感谢大家，好多面经看不了QAQ
 * <p>
 * 感谢楼主分享，想请问下convec function那道题怎么做呢，能想到的就是用个小邻域近似求导数，
 * 但最后应该也不可能精确地返回极值点吧
 */

public class Prob5 {

    /**
     *
     * https://stackoverflow.com/questions/30764296/algorithm-to-find-the-minimum-value-point-of-a-function
     *
     *
     *
     * Assuming that the function is convex and the derivative of
     * f(x) exist for all points => there is only one minima.
     * The reason I am stressing the derivative constrain is that in
     * the case when the function looks like two convex functions one next
     * to another at the point of intersection the derivative doesn't exist,
     * but the function is still convex and there are two local minima.
     *
     *

     The derivative will have opposite signs to the left and
     to the right of the minima (the slope changes the directions)
     You can see a visualization of that here. Having this in mind
     you can do a simple binary search on your domain to find a point k
     that satisfies f'(k-e) * f'(k+e) < 0 the smaller you pick e,
     better the precision of the result. When doing the search let
     [a,b] be the interval and  k=(a+b)/2 you would select left if
     f'(k)*f'(a) < 0 and right otherwise.

     Having f(x), f'(x) = (f(x+e)-f(x))/e, again smaller you pick e,
     better the precision of the derivative.
     *
     * */

}
