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
 * https://www.1point3acres.com/bbs/forum.php?mod=viewthread&tid=443963&extra=page%3D1%26filter%3Dsortid%26sortid%3D311%26searchoption%5B3088%5D%5Bvalue%5D%3D12%26searchoption%5B3088%5D%5Btype%5D%3Dradio%26searchoption%5B3046%5D%5Bvalue%5D%3D6%26searchoption%5B3046%5D%5Btype%5D%3Dradio%26sortid%3D311%26orderby%3Ddateline
 * <p>
 * 1. 算法
 * 1） 设计一个数据结构存储整数，支持三种操作：常数时间插入，
 * 常数时间删除特定元素，常数时间随机删除一个元素。不需要存储重复元素。.
 * <p>
 * 2）设计一个数据结构与算法，存储区间。待插入的区间端点均为整数。
 * 需要支持两种操作：插入，计算区间覆盖长度。没有时间复杂度的硬性要求。
 * 计算区间覆盖长度问题描述：对已插入的所有区间求并集，度量并集（可能是多个不重叠区间）的长度和。
 * 如，[1,3), [0,2), [5,6), [6,7)，覆盖长度结果应该是5: [0,3), [5,7)
 * <p>
 * <p>
 * <p>
 * 2.数据挖掘
 * 主要是一些基本概念：区分有监督学习、无监督学习。什么是过拟合，
 * 如何防止以及解决过拟合。并行计算的范式MapReduce。embedding的相关知识
 * 问题不是很深，不偏数理统计。不需要算损失函数、推公式。
 * <p>
 * <p>
 * 3.数据编程
 * 网格上有若干个点，要求设计算法计算一个“中心点”。中心点到各个点的曼哈顿距离之和要最小。
 * 中心点可以不在数据集中。是leetcode原题，但是我记不得题号了。
 * <p>
 * 我被要求证明算法的正确性，并且写代码。一开始设计了O(NlogN)基于排序的算法，被要求优化。
 * 然后想出了类似于快速排序的线性方法，要自己手写，不能直接调用库函数。
 * <p>
 * <p>
 * 4.跟经理聊天
 * 讲过去的实习经历。讨论如何设计一个推荐系统。
 */

public class Prob7 {
}
