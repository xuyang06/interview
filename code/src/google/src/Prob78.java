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

package google.src;

/**
 * https://www.1point3acres.com/bbs/forum.php?mod=viewthread&tid=458428&extra=page%3D1%26filter%3Dsortid%26sortid%3D311%26searchoption%5B3088%5D%5Bvalue%5D%3D12%26searchoption%5B3088%5D%5Btype%5D%3Dradio%26searchoption%5B3046%5D%5Bvalue%5D%3D1%26searchoption%5B3046%5D%5Btype%5D%3Dradio%26sortid%3D311%26orderby%3Ddateline
 * <p>
 * 发一个狗家的ML面经攒攒人品，求team match赶紧给我找个喜欢的组。
 * ML application 老鼠吃奶酪：假设有一个老鼠在房间任意走，
 * 房间里面有奶酪和毒药。每走到一个点就call function Sniff_and_move().
 * Sniff() function会返回四个vector代表上下左右四个方向嗅到的味道，
 * 比如[[0,0,1,1],[0,0,1,0],[0,1,0,1],[1,1,1,0]].
 * 需要设计某种方法从这个四个方向中挑一个，move。
 * Move以后会call function Eat_and_learn(),
 * 吃这个格子上的东西，可能是cheese或者poisoner。
 * 要求设计算法优化使得老鼠吃到最多的cheese。
 * 初始时候并不知道cheese和poisoner的味道vector是什么样的，
 * 所以要通过建模，学习，用模型来区分二者。要用到简单的online learning来解。
 * 面试官要求用python写出一个完整能跑的code，给了函数sniff() 和 eat() 。
 * 要自己实现所有其他的函数，包括初始化，每一次eat之后如何更新model，
 * 每一次move之后如何用已有的model判断该向哪个方向移动。Model可以选择简单的LR，
 * 为了实现方便。但是要说清楚objective function和如何学习。用SGD是标准的方法，
 * 不过online learning的SGD我只讲了思路没有推公式。
 * <p>
 * <p>
 * 之后面试官提到了可能有多种cheese和多种poisoner，所以变成了一个多分类问题。
 * 了解ML的算法是一部分，能把python从头到尾写出来也很重要。
 */

public class Prob78 {

    /**
     * https://machinelearningmastery.com/implement-logistic-regression-stochastic-gradient-descent-scratch-python/
     *
     *
     * */

}
