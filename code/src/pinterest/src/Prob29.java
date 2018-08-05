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
 * https://www.1point3acres.com/bbs/forum.php?mod=viewthread&tid=456020&extra=page%3D1%26filter%3Dsortid%26sortid%3D311%26searchoption%5B3088%5D%5Bvalue%5D%3D12%26searchoption%5B3088%5D%5Btype%5D%3Dradio%26searchoption%5B3046%5D%5Bvalue%5D%3D33%26searchoption%5B3046%5D%5Btype%5D%3Dradio%26sortid%3D311%26orderby%3Ddateline
 * <p>
 * 前10分钟问简历和project 经历。后50分钟做题。
 * <p>
 * 1. 给你一个Amazon S3 的 link，打开是一个几万行的文本文件，
 * 每一行有两个字段，第一个是 word（全是大写字母），
 * 第二个是该 word 的频数，用 tab 分割字段。
 * 已知该文件按照频数降序排列，给你 N 和 K 要求找到所有长度不小于2不大于N的 top-K 个词和其出现的频数。（
 * 要求从link中读入文本文件）
 * <p>
 * <p>
 * <p>
 * 2. 对第一问得到的 top-K 个词中的每一个，找到其存在于这K个词中的 1-step 近邻（以任意数据结构返回）。
 * 任意词 A 的 1-step 近邻的定义：在 A 的任意位置插入任意的一个大写字母，并对其乱序产生的所有词的集合。
 * <p>
 * <p>
 * <p>
 * 3. 基于 1，2 问的答案，给一个 start word 和一个 end word，返回从 start word 到 end word 的最大路径。
 * （类似LC Word Ladder） leetcode 126 leetcode 127
 * <p>
 * 要求 path 中的每一步都是前一步的 1-step 近邻且存在于第1问得到的词表中，路径的大小是路径中每个词的频数之和。
 */

public class Prob29 {

}
