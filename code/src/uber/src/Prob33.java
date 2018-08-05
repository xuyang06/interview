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
 * https://www.1point3acres.com/bbs/forum.php?mod=viewthread&tid=455781&extra=page%3D2%26filter%3Dsortid%26sortid%3D311%26searchoption%5B3046%5D%5Bvalue%5D%3D22%26searchoption%5B3046%5D%5Btype%5D%3Dradio%26sortid%3D311%26orderby%3Ddateline
 * <p>
 * 感觉类似walls and gates
 * 输入list of string. 是space # 是墙 G 是人，人可以上下左右走
 * 更新每个空地到人的最近距离，先让写一个人的情况
 * 比如 [ "G...",
 * ".#.#",
 * "...."]
 * 输出[[0,1,2,3],
 * [1,-1,3,-1],
 * [2,3,4,5]]
 * 用bfs做的，问了下复杂度
 * followup 人被围住了怎么办，
 * 有好多人怎么办，
 * <p>
 * 还剩十分钟的时候加了个followup，如果走每个space有权重，更新到每个点的最小值，大概说了下dp不知道对不对。。
 * <p>
 * 最后问graph最短路径知道什么算法
 * <p>
 * <p>
 * followup1 人被围住了怎么办？
 * 人被围住了，就有一些点走不到，最后再扫描一遍，把走不到的点置成-1就行了？
 * followup2 有好多人怎么办？
 * 多次BFS, 每次从一个人开始，每个到达的点存最短距离
 * followup3 如果走每个space有权重？. check 1point3acres for more.
 * 要用Dijkstra算法
 */

public class Prob33 {
}
