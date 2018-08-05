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

package yitu.src;

public class Prob3 {
    /**
     *    1、写最短路
     写了个最好写的floyed..

     2、证明最短路
     写了之后发现自己把自己坑了，竟然要求证明…
     实在不知道从何下手，
     在面试官提醒下才加了一维F[i][j][k]用动态规划的方法写出了转移方程。
     最后问了一个为什么第三维可以省略，这个实在不知道怎么表达，
     最后他跟我说只需要答在第k次计算时f[i][j]的值还是表示k-1，即没有被更新过即可。

     3、LeetCode原题，ZigZag打印
     LeetCode原题，方阵打印。先枚举对角线x + y的和，
     在逐个遍历即可。当时脑子不清醒用了m,n两个变量变成不是方阵了。

     4、介绍项目
     就简单地介绍了下传承，还是被问到了老问题，遇到的最大困难是什么。
     我答了一是项目协同工作以及我们怎么克服，二是资料审查，
     当前只能人工，后期打算通过用户筛选。

     *
     * */

}
