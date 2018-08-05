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
 * https://www.1point3acres.com/bbs/forum.php?mod=viewthread&tid=452036&extra=page%3D1%26filter%3Dsortid%26sortid%3D311%26searchoption%5B3046%5D%5Bvalue%5D%3D33%26searchoption%5B3046%5D%5Btype%5D%3Dradio%26sortid%3D311%26orderby%3Ddateline
 * <p>
 * 一共四轮，从十点面到一点，不知道为什么hr没给安排午饭
 * 第一轮是三姐，问了一道识别text是否safe。 假设有一个black list, 里面有一些phrase,
 * 比如["machine guns", "world war i"], 再给一个输入的pintext，
 * 如果pintext里有完整的phrase, 就判断为unsafe.
 * 注意，"i love world war i"是unsafe的，但"world war ii"是safe的，
 * 因为是以word为单位match的。.
 * <p>
 * 第二轮是三哥，问了一道类似开心消消乐的题，只是board是固定的，不会有新的东西掉落。
 * 感觉是面试官拍脑袋想出来的，他自己也各种不清楚...
 *
 *
 *
 * <p>
 * 第三轮是个白人小姐妹，问了string array的共同最长前缀。
 * <p>
 * 第四轮给一些pair, 代表(employee, manager), 然后按照organizaition的结构打印。
 * 比如[2, 1],[1, 0], [3, 0], [0, 0], 0是自己的manager, 就代表他是CEO，输出是：.
 * 0
 * |_1
 * |_2
 * |_3
 */

public class Prob16 {
}
