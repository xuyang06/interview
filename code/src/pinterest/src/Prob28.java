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
 * https://www.1point3acres.com/bbs/forum.php?mod=viewthread&tid=446040&extra=page%3D1%26filter%3Dsortid%26sortid%3D311%26searchoption%5B3088%5D%5Bvalue%5D%3D12%26searchoption%5B3088%5D%5Btype%5D%3Dradio%26searchoption%5B3046%5D%5Bvalue%5D%3D33%26searchoption%5B3046%5D%5Btype%5D%3Dradio%26sortid%3D311%26orderby%3Ddateline
 * <p>
 * 两轮店面分开，先通过第一个，然后再来第二个
 * <p>
 * 初面
 * <p>
 * 输入一个整数矩阵，其中的整数可能有重复。要求返回 最长上升序列 的长度。 序列为四联通。比如：
 * [1,5,4,3]
 * 2,2,3,1
 * 3,4,2,2]. from: 1point3acres
 * 最长长度应为4 1-2-3-4 or 2 (2,2)-3 (1,2)-4 (0,2)-5 (0,1).
 * <p>
 * leetcode 329
 * <p>
 * <p>
 * 后来又问了一些机器学习方面的问题：logistic regression是什么，损失函数怎么写
 * <p>
 * <p>
 * <p>
 * <p>
 * <p>
 * <p>
 * 二面
 * 图像识别。考虑最简单的情境：待识别手写数字只有0与1，图像灰度值只有两级，像素点存在一个矩阵中。
 * 要求设计算法判断一个输入矩阵表示0还是1.
 * <p>
 * 如果有多个分类器，如何叠加？如果有十种待识别数字，应该如何设计分类器、如何集成分类器？
 * 如果选择用神经网络，用哪种，损失函数如何，如何训练？
 * <p>
 * <p>
 * 当日贵体有恙，本来以为要跪，结果题不难。
 * <p>
 * 利特口 Longest Increasing Path in a Matrix
 */

public class Prob28 {
}
