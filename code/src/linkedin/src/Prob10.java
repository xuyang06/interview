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

package linkedin.src;

/**
 * https://www.1point3acres.com/bbs/forum.php?mod=viewthread&tid=452210&extra=page%3D1%26filter%3Dsortid%26sortid%3D311%26searchoption%5B3088%5D%5Bvalue%5D%3D12%26searchoption%5B3088%5D%5Btype%5D%3Dradio%26searchoption%5B3046%5D%5Bvalue%5D%3D6%26searchoption%5B3046%5D%5Btype%5D%3Dradio%26sortid%3D311%26orderby%3Ddateline
 * <p>
 * <p>
 * <p>
 * 前言：楼主菜机一枚，之前面了很多公司，很多感觉大差不差能拿到offer，
 * 最终却一个一个的全跪了，这次面领英，一共四轮，两轮码，两轮机器学习，
 * 可惜两轮码都没码好，以为跪了，最终却过了，再此特意感谢两轮码中的面试，
 * 一位国人大姐和一位国人大哥高抬贵手（如果他们能看到的话），另外也激励一下找工作的小伙伴，
 * 很多情况下面跪了不一定是你技术不行，可能还是没有沟通好，没把面试官聊爽了，
 * 很多小伙伴技术过硬，但是毕竟面试官也是人，楼主的经历感觉还是要和面试官多沟通，废话有点多先上面经：
 * <p>
 * <p>
 * 第一轮：一位中国大姐姐，面色和善，出了一体类似于merge interval的题，题目其实不难，
 * 题目最终表达的意思是这样，有很多很多intervals代表进程，比如 [5-20],代表5-20秒之间在跑一个进程，
 * 输出所有空闲的时间interval，就是这个时间段上没有任何进程(如果题目我没记错的话)，
 * 写完程序后大姐姐让我跑了几个test case，不过程序中我总是丢三落四忘东西，一个小时一共就写了一题，
 * 心情比较沉重。。不过最终大姐高抬贵手，感谢国人不杀之恩！
 * <p>
 * leetcode 56
 * <p>
 * <p>
 * <p>
 * 第二轮：一位和善的中国小哥，给一个凹函数f(x)，并且给区间[a,b]，并且f(x)的最小值就在这个区间内，
 * 要求找出f(x)最小值那个点的x是多少。由于这一轮说是data mining 的编程，
 * 所以楼主首先去想怎么estimate gradient，中国小哥说不用想estimate gradient，
 * 然后我就去想可不可以用sampling，然后每次sampling排除掉一部分区间，
 * 写到后面发现逻辑上有些问题，没法完全排除掉一些区间，中国小哥又耐心的给了提示说其实不用那么复杂，
 * 就是a和b按照一定步长往中间缩就行，最终就按照这个方法说的，分析下复杂度，
 * 至此楼主感觉面领英彻底歇菜了，不过最终中国小哥也高抬贵手，谢不杀之恩！
 * <p>
 * <p>
 * <p>
 * 第三轮午饭：一位中国小哥，聊了聊加州买房有多么的不易
 * <p>
 * <p>
 * 第四轮：hiring manager，问如何设计一个推荐系统，给一堆feature，比较open的问题，
 * 感觉把他聊high了.
 * <p>
 * <p>
 * 第五轮：hiring manager，中国大哥，先问各种machine learning基础知识，这类题目真的非常多非常杂，
 * 我觉得基本该cover的都cover到了，接下来中国大哥问了一个和research相关的，
 * 让我用自己的research的方法来尝试解决一个他们现实中遇到的问题。
 * <p>
 * <p>
 * 公式让写很简单的，比如cross entropy loss之类的，没有要求从头推到尾的那种
 */

public class Prob10 {

}
