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
 * https://www.1point3acres.com/bbs/forum.php?mod=viewthread&tid=487589&extra=page%3D1%26filter%3Dsortid%26sortid%3D311%26searchoption%5B3046%5D%5Bvalue%5D%3D22%26searchoption%5B3046%5D%5Btype%5D%3Dradio%26sortid%3D311%26orderby%3Ddateline
 * <p>
 * uber有个好处是会把面试官的全名附带在schedule里提前发来，
 * 去领英上查查就大致能知道会问什么问题。。。
 * <p>
 * 第一轮：所面的组的Hiring manager，看领英是非常senior的大哥，
 * 估计是bar raiser+项目
 * 果然，半小时讨论了最主要的项目的细节，剩下时间问了一些behavior，
 * 比如和manager的意见不一致，如何应对tight deadline等等。
 * <p>
 * <p>
 * 第二轮：另一个组的hiring manager，工作年限不多但是前一份工作的项目是关于云服务infra的，
 * 感觉很厉害。估计也是bar raiser，会问behavior以及工程能力。
 * 上来自我介绍，顺便夸对方之前的工作好屌在这方面我还得多多努力。
 * 结果面试官就着这个话头问到底还差哪些能力，以及我对这个职位的理解。
 * 之后又是一堆behavior。. 1point3acres
 * . From 1point 3acres bbs
 * <p>
 * 第三轮：组里的engineer。我看他做的东西和我正在做的几乎完全一致，而且他之前是非CS出身，
 * 以为会主要面项目或者ML算法，结果，
 * 简单自我介绍以后直接做题：不用sqrt方法来求平方根。
 * 因为一直觉得他会面ML算法而不是一般的算法题，所以没说二分，直接说用牛顿法。
 * 白板上公式推了一下，伪代码大致过了下流程，就继续在白板上正式写代码了。
 * 牛顿法基本上做好终止阈值设置就没太大问题，需要注意的是中间运算不要越界，
 * 以及如果函数收敛的话可能需要用反函数来确定阈值。之后问了复杂度及其原因，以及test case。
 * <p>
 * 午饭：两个engineer（似乎是测试工程师？）带着吃饭，后来又有第三个工程师加入，
 * 聊城市和工作体验之类的。人多不尴尬，撩（大误）得他们很开心。
 * <p>
 * 第四轮：system design
 * 面试官非常和蔼。题目是如何做一个uber车辆状态的监测系统（
 * 比如如果车辆正常会定时发一个信号，如果发警报或者好久没响应就会提示后台介入）。
 * 之后又问如何做一个全球uber数量可视化系统，给CEO看的那种。
 * 这部分我不是很擅长，尽量按照套路来走了，先问用例再问规模。
 * 估算了一下两个题都是单机规模可解的，可能是面试官看我太菜了没出难题？
 * 然后单机规模下分别提一个实现。第一题我提用一个以时间戳为Key的priority queue
 * + 以车辆id为key 节点指针为value的map来做，有点类似LRU cache。
 * 第二题我提的是搞一个不同zoom in大小下的grid构成的tree（octree），
 * 然后算出grid里所有车的平均位置作为显示时的代表节点。都不知道对不对。.
 * From 1point 3acres bbs
 * <p>
 * <p>
 * 第五轮：coding
 * 聊了一点点项目里的实现细节，直接做题。假设有一个linkedlist，
 * 但只提供三个接口：getNode(value), getRightNode(Node)
 * 以及 getLeftNode(Node)。另给了一个vector<int>，
 * 问这些数字在linkedlist里构成了几段连续的片段。
 * 其实就是把vector转成set (unordered_map)，然后遍历一遍set，
 * 如果在linkedlist里找到当前值，就往左右继续查找直到不在set里为止。
 * 同时注意找到的值要从set里删掉。
 * <p>
 * 之后问set冲突怎么办，以及如果set遍历时要保证按大小顺序/插入顺序输出，
 * 但依然要保证set的θ(1)性质，分别应该用什么结构，分别是什么复杂度。
 * 其实就是unordered_map和map的底层实现方法，BST和红黑树之类的。
 * <p>
 * <p>
 * 其实每轮答得都有些虚，也都有些小遗憾。不过和每个面试官都聊得很开心，早上还很困面试完反而精神了。
 * <p>
 * 几天后收到offer
 * <p>
 ***/

public class Prob84 {

}
