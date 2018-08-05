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
 * https://www.1point3acres.com/bbs/forum.php?mod=viewthread&tid=458951&extra=page%3D1%26filter%3Dsortid%26sortid%3D311%26searchoption%5B3046%5D%5Bvalue%5D%3D22%26searchoption%5B3046%5D%5Btype%5D%3Dradio%26sortid%3D311%26orderby%3Ddateline
 * <p>
 * Uber ATG 三番无人车perception组 computer vision engineer 面经。
 * 职位是十月初在校园招聘会上投的，经过一轮oncampus面试和5轮onsite面试，
 * 时间有点久远了。
 * <p>
 * oncampus：
 * leetcode原题，trapping raining water。
 * 用的dp做。follow up：怎么并行化处理很长的数据（随便扯了一通），
 * show了下做的project的demo。
 * <p>
 * leetcode 42
 * <p>
 * <p>
 * <p>
 * onsite：
 * 面的非常cv，应该是和具体的职位有关。
 * 第一轮，天竺hiring manager，问简历和project，
 * 问publication的具体idea和实现。还问了很多object
 * detection相关的知识（比如Faster R-CNN和YOLO的区别），
 * 检测小目标的技巧，训练数据不够怎么解决。以及双目视觉相关的知识，
 * 怎么从stereo camera还原物体的深度信息等等。
 * 最后问想来了之后做research还是工程。
 * <p>
 * <p>
 * 第二轮，白人小哥，design面试。一上来问我battleship游戏有没有玩过，
 * 答曰不会。然后上了leetcode原题贪吃蛇，
 * <p>
 * leetcode 353
 * 让白板实现（也是非常幸运了）。最后还剩下很多时间，
 * 问了怎分布式neural network训练的实现，答曰parameter server。
 * 然后白板分析了瓶颈在哪儿，最后吹捧了下他们的horovod框架的优点。结束。
 * <p>
 * <p>
 * 第三轮，和匹兹堡office的远程面试，又是cv和无人车相关的。
 * 问简历和cvpr paper，极其细致。又问无人车里面的一些问题，
 * 如怎么预测一个目标接下来几秒的运动轨迹（胡说一通）。
 * 接下来问了很多machine learning的知识，主成分分析啊，
 * linear regression和logistic regression区别啊。
 * 最后反问问题，结束。
 * <p>
 * <p>
 * 第四轮，coding轮，天竺小哥。考了numpy、pytorch里面的矩阵操作（slicing啊这些），
 * 不让用for循环。白板实现后，第二题是手写none-maximum-suppersssion （NMS)，
 * （做老板project的时候写过，秒之，go through了几个test case。
 * 最后问了下video里面做object detection和多目标跟踪的知识（
 * 类似做smoothing，插值啊这些，又简单介绍了下之前水论文的相关工作),结束。
 * <p>
 * <p>
 * 中饭，一般般，尬聊了好久。
 * <p>
 * 第五轮，匹兹堡office远程behavior面试，面试官很nice，于是就坦诚的聊了30分钟，结束。
 * <p>
 * <p>
 * 第二周通知pass，感觉ATG的office和车真高大上，面的问题很cv，也很细致，
 * 体验不错。缺点就是package实在太少，还在纠结去不去。
 */

public class Prob79 {

}
