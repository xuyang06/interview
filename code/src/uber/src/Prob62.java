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
 * https://www.1point3acres.com/bbs/forum.php?mod=viewthread&tid=450051&extra=page%3D4%26filter%3Dsortid%26sortid%3D311%26searchoption%5B3046%5D%5Bvalue%5D%3D22%26searchoption%5B3046%5D%5Btype%5D%3Dradio%26sortid%3D311%26orderby%3Ddateline
 * <p>
 * 刚刚结束的电面，正好一个小时。10分钟时间对方介绍自己组做的东西，20分钟问简历上的项目和实习项目。30分钟做题和问问题。
 * 一道题：
 * input是两个参数，一个list of string，和一个string target。
 * output，找list里包含target里所有字符的最长的string。
 * 问了input string包含字符的情况，得到许可可以认为都是小写字母。口述思路，小哥认为思路没问题后开始写code。
 * 写完test code的时候我在写Stdin 读入input，写到一半的时候小哥说你直接hard code在main里吧，要不没时间问问题了。然后test了一遍，口头跑了一遍上面写的那个test case就让问问题了。
 * 求过求加米~~-
 * <p>
 * <p>
 * array counter 记录target里每个字符出现的次数，然后扫一遍list里的字符。处理每个string的时候clone
 * 一下那个counter，然后用string里的char 来给counter减，处理完一个string就检查是否valid，
 * AKA counter里没有正数。如果valid 再看是否能update最长string。
 * <p>
 * leetcode 67
 * <p>
 */
public class Prob62 {
}
