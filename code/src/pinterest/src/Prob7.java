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

public class Prob7 {
    /**
     * 1. 给⼀一个字典list of strings，和⼀一个2D 的matrix，把string 填到matrix ⾥里里，使得matrix 的每
     ⾏行行每列列都是字典⾥里里的单词。


     2. [LeetCode,29] Given two integers dividend and divisor, divide two integers without using
     multiplication, division and mod operator.
     Return the quotient after dividing dividend by divisor.
     The integer division should truncate toward zero.
     Example 1:
     Input: dividend = 10, divisor = 3
     Output: 3
     Note:
     · Both dividend and divisor will be 32-bit signed integers.
     · The divisor will never be 0.
     · Assume we are dealing with an environment which could only store integers
     within the 32-bit signed integer range: [−231, 231 − 1]. For the purpose of this
     problem, assume that your function returns 231 − 1 when the division result
     overflows.


     地址：
     http://www.1point3acres.com/bbs/forum.php?mod=viewthread&tid=426959&extra=page%
     3D2%26filter%3Ddateline%26orderby%3Ddateline%26sortid%3D311%26sortid%3D311%2
     6orderby%3Ddateline
     *
     * */

    /**
     *
     onsite西雅图的office，三轮coding，中午跟manager吃饭，他家面试可以自己带电脑，我第一轮和第三轮都是在我电脑上直接写的，第二轮是白板. visit 1point3acres for more.
     1. 给一个字典list of strings，和一个2D的matrix，把string填到matrix里，
     使得matrix的每行每列都是字典里的单词-google 1point3acres


     dreamj 发表于 2018-7-18 12:29
     楼主，1可以说得详细点么？比如strings是不是等长的，matrix是正方形还是矩形。是只要求每行每列只出现一个 ...

     字典中的字符串可以任意长度，但你填到matrix的时候只能填符合matrix长度的字符串，matrix的长宽可以不等，要求是用字典中的字符串填matrix之后，
     matrix的每行和每列都必须是字典中的单词。.本文原创自1point3acres论坛
     比如字典中含有一下字符串abc, aaac, ace, ade, aaa, ace, ccc, bacc, caec, abcdde，
     填到一个4x3的矩阵，填好的matrix可以是这样的：
     abc
     aaa
     ace
     ccc

     暴力搜吧。首先只对行去递归（对列递归也行）。
     所以每一行只考虑词典里一个长度和行长度相等的单词。
     每次填充一行之后判断一下当前每一列是否已经不是任何单词的前缀。
     这一步要加速可以先对每个长度为列长度的单词建TRIE。
     如果不是就试下一个单词填充这一行。
     填充所有行之后判断一遍每列是不是一个词典中存在的单词。




     2. 利口尔酒，剩的时间询问了一些关于组里做的东西

     3. OOD，实现一个游戏，游戏就是两个选手可以在一个2D board上造船，船就是一条线，可以是横着的也可以是竖着的，两个选手互相攻击对方，直到一个选手的船全部被攻击了，游戏结束

     4. HM吃饭，没怎么问BQ，都是我在问问题。。。
     *
     *
     * */
}
