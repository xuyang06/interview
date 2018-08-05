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
 * https://www.1point3acres.com/bbs/forum.php?mod=viewthread&tid=451507&extra=page%3D1%26filter%3Dsortid%26sortid%3D311%26searchoption%5B3046%5D%5Bvalue%5D%3D22%26searchoption%5B3046%5D%5Btype%5D%3Dradio%26sortid%3D311%26orderby%3Ddateline
 * <p>
 * <p>
 * 地点在 Amsterdam，LZ 人在国内，第一次飞这么远参加 Onsite。
 * 一共 5 轮，2 Coding + 2 System Design + 1 Hiring Manager，感觉运气也挺好，题目基本都是基础的经典题，难度还好。
 * <p>
 * <p>
 * 第一轮，System Design：
 * Design Instagram，经典的题了吧，问的比较细的是图片如何存储、如何优化请求链路，反正往 CDN 的思路说就可以了。
 * <p>
 * <p>
 * 第二轮，Coding：
 * M x N 的网格，扫雷游戏，input 告诉你所有雷的位置。
 * 第一步，找出并标记数字，就是循环每个格子，看其周围的 8 个格子一共有多少雷。
 * 第二步，游戏开始，实现一个 mine(i, j) 函数：.1point3acres网
 * 1. 如果挖到雷，返回 Game Over
 * 2. 如果挖到数字，返回数字
 * 3. 如果挖到空白格子，需要打印此次点击打开的区域（遇到数字为止）
 * 整体就是一个 bfs 的过程，不麻烦。
 * Leetcode 529
 * <p>
 * <p>
 * 中饭：
 * 跟 Recruiter 一起吃的，食堂还可以，菜比较多，不过味道一般，喝完可乐再喝咖啡，提提神迎接下午三轮。
 * <p>
 * <p>
 * 第三轮，Hiring Manager：
 * 主要问了之前工作项目的细节，主动在白板上画了些图方便解释。
 * 其他 BQ 主要在问同事之间合作、关系相关的问题。.留学论坛-一亩-三分地
 * 整轮聊的很愉快，大家都很放松。. 1point 3acres 论坛
 * <p>
 * <p>
 * 第四轮，Coding：
 * 给一个 M x N 的网格，表示一个没有岛屿的海洋，需要实现两个函数：
 * 1. insert(i,j) 在 (i,j) 放置一个岛屿. 1point3acres
 * 2. query() 返回大陆数量，上下左右连接在一起的岛屿算同一个大陆，其实就是连通块的数量. 牛人云集,一亩三分地
 * 先给了每次 query 做一次 dfs 的方案，问有没有更好的做法。肯定有啊，然后用 UnionFind 秒了。
 * 但是后面花了几分钟查代码里的小问题，没有做到 bug free，尴尬。
 * <p>
 * <p>
 * 第五轮，System Design：
 * 设计 Netflix，还是一个经典的题，其中问的比较细节的点是数据在多机房之间的同步问题，我说可以做 cluster replication，再做一些脚本 check 之类的，他说行吧。
 * <p>
 * 找工了大约半年，面了不下 10 家国外的公司，终于幸运的拿到了肉翻的 offer。
 * 大家千万别放弃，努力过一定会有回报的，不要被暂时的失败所打败。
 * 祝大家都能找到心仪的工作。
 */

public class Prob27 {

}
