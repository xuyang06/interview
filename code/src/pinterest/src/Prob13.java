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
 * https://www.1point3acres.com/bbs/forum.php?mod=viewthread&tid=452806&extra=page%3D1%26filter%3Dsortid%26sortid%3D311%26searchoption%5B3046%5D%5Bvalue%5D%3D33%26searchoption%5B3046%5D%5Btype%5D%3Dradio%26sortid%3D311%26orderby%3Ddateline
 * <p>
 * 第一轮：韩国小姐姐，2d砖块排列在一起，每块砖的厚度是一样的，
 * 但长度不一样（每一行是对齐的，每一列不一定对齐）。
 * 现在要从上到下垂直切一刀，问切在哪里能使break的砖块数最少。
 * 我的思路是先把x坐标放进hashmap，然后按x坐标从左到右扫一遍招count最大的那个坐标。
 * Follow up: 如果每一行都很长很长放不进内存，但行数不多的时候该怎么优化。(heap)
 *
 *
 * 我的想法是类似于多个sorted list merge，每次pop出来最小的长度，
 * 然后count这个值的个数然后加上这行的下一块砖再放进heap中。
 * <p>
 * .
 * 第二轮：国人大哥，给一个API每次能从文件里读8KB数据到buffer里，
 * 要求用这个API实现一个getline函数，每次读到"\n"或EOF为止。
 * Follow up: 如果每行都太长，但只要求返回每行的某个statistics (e.g. length)，
 * 要怎么改
 * <p>
 * <p>
 * 第三轮：美国小哥，给一个grid每个格子都是一个像素，提供一个API能返回两个像素是否属于同一个物品，
 * 假设每个物品的像素是联通的，问输入的grid里有几个物品。(union find)
 * Follow up: 如果grid太大放不进内存咋办，怎么分割.
 * <p>
 * 第四轮：印度小哥，利口散流&散漆。.
 * Follow up: 推广到 n*n 的情形
 */

public class Prob13 {
}
