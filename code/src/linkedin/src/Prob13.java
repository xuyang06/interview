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
 * https://www.1point3acres.com/bbs/forum.php?mod=viewthread&tid=424490&extra=page%3D1%26filter%3Dsortid%26sortid%3D311%26searchoption%5B3088%5D%5Bvalue%5D%3D12%26searchoption%5B3088%5D%5Btype%5D%3Dradio%26searchoption%5B3046%5D%5Bvalue%5D%3D6%26searchoption%5B3046%5D%5Btype%5D%3Dradio%26sortid%3D311%26orderby%3Ddateline
 * <p>
 * 昨天5.10周四刚刚结束的店面，面的track是data mining，去年12月份跟hr联系过一次，
 * 但是那时候说没有opening了，三周前hr联系说又有opening了，就给我安排了个面试，
 * 不过我一直拖到了昨天才面，为的就是好好准备，结果还是。。。哎。。。
 * 面试官是一个刚升staff的俄罗斯小哥，面试时间1小时左右；上来互相介绍了几句，
 * 小哥是做recommendation的，说接下来半小时ML知识，半小时coding；
 * <p>
 * <p>
 * <p>
 * 嗯，结果事实上，小哥对我之前一个recommendation的项目很感兴趣，问了一大堆detail，
 * 然后又问了evaluation metric， precision, recall这些，我当时做项目就是跟着某些项目班做的，
 * 并没有这些evaluation 的东西，不过还是强行扯了一波这些名词。。后来又问了些ML的知识，
 * logistic regression, L1 L2, feature selection，underfitting, overfitting
 * <p>
 * <p>
 * <p>
 * 然后就是coding的题目，类似这个意思给你一个probablity list, 比如{0.25, 0.25,0.5}，
 * 让你按照这个probablity随机生成相应的N个数，比如N等于8的话，那么output list就是{1 2 3 3 1 2 3 3}，
 * output list里边数字的顺序可以改变，比如{1 1 2 2 3 3 3 3}也行，满足那个概率分布就行，
 * 之前面经里也有这题。然后follow up是如果probablity list很长，
 * 比如{0.0001, 0.0002, 0.0004, ....,}，怎么办？ 其实就是加入一个cdf序列，
 * 然后去判断random生成的数，在某个区间，然后相应生成就行。我follow up部分开始没写好，
 * 还有些小bug，他提醒了我两三次才改好了。。。
 * <p>
 * <p>
 * <p>
 * 做完题又尬聊了五分钟，我最后问了一个关于领英news feed的具体问题，
 * 因为平时用的多，然后总感觉news feed里一些promoted的ads很不personalized，
 * 而且也不能通过user的反馈去学习user的习惯，从而recommend 一些有用的信息，
 * 不知道是不是楼主英语描述的不太好，还是说太2b了在面试的时候给人家的产品提什么具体的改进意见，，
 * 反正感觉说完了之后小哥不是很开心的样子。。。。说这部分不是他们组负责的。。然后也吐槽那个算法不太好。。。
 * <p>
 * 我问了他要不要用二分法，他说不用，就直接判断就行
 */

public class Prob13 {
}
