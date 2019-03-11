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

package flexport.src;

/**
 * https://www.1point3acres.com/bbs/thread-304427-1-1.html
 * <p>
 * Flexport是个湾区做freight/cargo service的startup。。
 * 他们自己号称是freight届的uber，近几年听说发展还不错
 * <p>
 * 60分钟的技术店面，面试官是个白人小哥，人很nice。。
 * 一上来先介绍自己和Flexport，说这家公司蛮新的，现在只有50个engineer。
 * 。他自己是之前也是在那里实习的。
 * <p>
 * 然后简单10分钟聊了聊project，之前有用过React + Rails
 * 所以小哥挺有兴趣说他们的Stack也都是React + Rails。。
 * 闲扯两句开始做题
 * <p>
 * <p>
 * <p>
 * 题目是有一个checker棋盘，顶上都是黑棋，最底下都是白棋，
 * 两个玩家轮流走棋，每一步黑棋只能走左下和右下，白棋只能走左上和右上。
 * <p>
 * 问如果给一个现在棋盘的state （state就是棋盘上现在所有棋的位置和轮到哪个玩家），
 * 返回all possible moves。
 * <p>
 * <p>
 * <p>
 * input, output和棋盘的state自己随便选data structure。。
 * 为了方便楼主棋盘就用了个2D char array，
 * 然后定义了一个Coordinate类用来记录棋子的位置，
 * 然后用一个List在存一个start和end coordinate来表示一个possible move，
 * 最后返回一个List<List<Coordinate>>
 * <p>
 * <p>
 * <p>
 * 先说了个brute force solution给他，就遍历整个棋盘。。
 * 然后我说这个应该不是很好的解法，但他直接说他不是很在意最优解，
 * 写出来比较重要。
 * <p>
 * <p>
 * <p>
 * 15分钟写完了之后小哥说好，follow-up来优化一下
 * (因为lz写了4个if，他说可以简化成两个，因为可以不需要检查是白棋还是黑棋，
 * 楼主就define了个offset = +1/-1 来表示往上走还是往下走，
 * 搜索周围的时候就直接i+offset）
 * <p>
 * <p>
 * <p>
 * 小哥说不错，然后第二个follow-up是现在有一个新的棋子，
 * 叫国王，国王可以走任何方向，然后lz又加了个condition.
 * <p>
 * <p>
 * <p>
 * 做完之后小哥问我有没有问题，就问了问他实习做的工作之类的，
 * 听得出他对他做的东西很感兴趣， 然后讲着讲着刚好一个小时结束。
 * <p>
 * <p>
 * 求过求onsite。。
 */

public class Prob11 {

}
