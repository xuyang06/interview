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

public class Prob9 {


    /**
     * 1.给⼀一堆有序号的⽆无限block，给你⼀一个读给定index 的单个block 的API，每个block 64MB，
     然后给你⼀一个开始的byte 位置(例例如：3MB，就是从index = 0 开始)，和要读的byte ⻓长度(例例如：
     67MB)，如果返回读的结果。类似read4 变种，不不过挺简单的，楼主就分情况，慢慢写，先是第
     ⼀一个block(可能，只是读部分)，然后中间连续读⼏几个block(计算⼀一下就好)，最后⼀一个block 可
     能只读部分。 感觉整体就是玩index。

     2. [LeetCode,36]Determine if a 9x9 Sudoku board is valid. Only the filled cells need to be
     validated according to the following rules:
     1. Each row must contain the digits 1-9 without repetition.
     2. Each column must contain the digits 1-9 without repetition.


     3. Each of the 9 3x3 sub-boxes of the grid must contain the digits 1-9 without
     repetition.
     The Sudoku board could be partially filled, where empty cells are filled with the character
     '.'.
     Example 1:
     Input:
     [
     ["5","3",".",".","7",".",".",".","."],
     ["6",".",".","1","9","5",".",".","."],
     [".","9","8",".",".",".",".","6","."],
     ["8",".",".",".","6",".",".",".","3"],
     ["4",".",".","8",".","3",".",".","1"],
     ["7",".",".",".","2",".",".",".","6"],
     [".","6",".",".",".",".","2","8","."],
     [".",".",".","4","1","9",".",".","5"],
     [".",".",".",".","8",".",".","7","9"]
     ]
     Output: true
     Note:
     · A Sudoku board (partially filled) could be valid but is not necessarily solvable.
     · Only the filled cells need to be validated according to the mentioned rules.
     · The given board contain only digits 1-9 and the character '.'.
     · The given board size is always 9x9.




     地址：
     http://www.1point3acres.com/bbs/forum.php?mod=viewthread&tid=427590&extra=page%
     3D2%26filter%3Ddateline%26orderby%3Ddateline%26sortid%3D311%26sortid%3D311%2
     6orderby%3Ddateline
     *
     * */

}
