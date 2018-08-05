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
 * https://www.1point3acres.com/bbs/forum.php?mod=viewthread&tid=448887&extra=page%3D4%26filter%3Dsortid%26sortid%3D311%26searchoption%5B3046%5D%5Bvalue%5D%3D22%26searchoption%5B3046%5D%5Btype%5D%3Dradio%26sortid%3D311%26orderby%3Ddateline
 * <p>
 * 来update一个面经。国人小哥。
 * 刚刚面完估计是挂掉了。
 * 给一个n*n的slashes 2d matrix如[['/','/'],['/','/']].
 * 要求
 * 1）生成一个n+1*n+1的图，value是1-n*n,连线是按照slash的方向，每条外边也要连上
 * 123
 * 456
 * 789
 * 对应slash的内联：2-4 3-5 5-7 6-8
 * <p>
 * 2）实现给两点输出所有路径的方法
 * <p>
 * 楼主图的题刷的不多，然后做完第一步时间就差不多了，gg
 * 现在细想应该写快一点，分拆每一步不难的，但是算value啊boarder用掉太多时间了，关键还是编程不熟悉吧
 * 大家要是遇到这样的题别紧张，慢慢来，一步步写会好很多。
 * <p>
 * <p>
 * 补充内容 (2018-10-11 11:42):
 * slashes=[['/','/'],
 * ['/','/']]
 * 要求输出是下图
 * <p>
 * 1--2--3
 * |   /    / |
 * 4   5   6
 * | /    /  |
 * 7--8--9
 */

public class Prob38 {
}
