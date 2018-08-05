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

package facebook.src;

/**
 * https://www.1point3acres.com/bbs/forum.php?mod=viewthread&tid=454229&extra=page%3D1%26filter%3Dsortid%26sortid%3D311%26searchoption%5B3088%5D%5Bvalue%5D%3D12%26searchoption%5B3088%5D%5Btype%5D%3Dradio%26sortid%3D311%26orderby%3Ddateline
 * <p>
 * 店面
 * 利口 74： 序号转成1维， 然后二分查找，做完聊了以前做的，
 * 过了几天收到onsite通知
 * <p>
 * onsite:
 * 轮1:
 * 利口 199， 递归解的， 把层数传进去，每层第一个遇到的存进去。利口 480，
 * 用一个中位数的队列做的，中数队列部分时间不够了，大致说了下剩下的
 *
 * round2:
 * 给一个已经排好序的数组， 返回每个元素的平方，并且也是排好序的数组。感觉解得慌了点，
 * 用了额外的空间，做完也没让改进了，直接上第二题。.
 * 第二题利口 139, 变成返回最少能组成的词数，方法差不多，也是用dp解的.
 *
 * round3:
 * 系统设计，设计记录手机用户浏览和点击广告，并用来算点击率。主要是写的部分，用户读手机不用管
 *
 * round4:
 * Behavior, 聊了很多之前做的，还有些是和经理相处的问题，经常被打断。最后剩个5分钟来了一题, -_-||
 * 二叉树 先序 的iterator, 用个stack存节点，最后还在纠结先走左边还是右边的时候，时间到了
 *
 * round5:
 * ml 设计，facebook marketplace， 基本上是ranking的问题.留学论坛-一亩-三分地
 * <p>
 * 面完大概一周多收到据信，估计主要跪在behavior轮
 */

public class Prob35 {
}
