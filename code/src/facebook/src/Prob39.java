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
 * https://www.1point3acres.com/bbs/forum.php?mod=viewthread&tid=454101&extra=page%3D1%26filter%3Dsortid%26sortid%3D311%26searchoption%5B3088%5D%5Bvalue%5D%3D12%26searchoption%5B3088%5D%5Btype%5D%3Dradio%26sortid%3D311%26orderby%3Ddateline
 * <p>
 * <p>
 * 昨天去FB onsite一共六轮，累死了。。。我在newgrad的时候曾经来FB onsite过，秒跪。三年后又一次onsite，希望有好结果吧。
 * 1. System design: typeahead. 问得很详细，比如DB里面存什么内容，如何index，
 * 如何对suggestion排序，如何更新排序等等。并不太清楚trie是怎么存在DB里面的，
 * 所以只答了trie在cache里面。DB里面就存排序好的words。
 * <p>
 * <p>
 * 2. coding: output binary tree in column order.比如下面的树
 * 1.
 * /  \.
 * 2     4.
 * \
 * 3.
 * 1和3是属于同一个column的，应该output [2,1,3,4]
 * <p>
 * leetcode 314
 * <p>
 * <p>
 * 3. ML design: 设计marketplace的recommendation，
 * 主要讲了选什么样的feature和model overfitting了怎么办
 * <p>
 * <p>
 * 4. coding: 给一个按照某种字母顺序排好序的word list，
 * 要求找出对应的字母顺序。比如给了words = [cb,ca,ba],
 * 从中我们可以推导出c>b, b>a 所以最后输出的顺序是[c,b,a]
 * 我先把输入的words转化成了graph的边，然后union find一步步找出字母。
 * 时间紧张没有写完。讲思路就讲了大半天。。。
 * leetcode 269
 * <p>
 * <p>
 * 5. manager聊。聊得不咋开心。。。。
 * <p>
 * <p>
 * 6. coding: Add binary 最后要求优化到使用位运算。
 * 总结一下ML engineer的面试除了考ML design之外，coding一点也不能落下。
 * 十分懊悔没有好好刷FB的面经题，不知道我这几个题是不是tag题？
 * leetcode 67
 * <p>
 * <p>
 * <p>
 * 谢谢大家。
 * <p>
 * <p>
 * 补充内容 (2018-11-1 07:29):. more info on 1point3acres
 * 今天收到消息说要加面一轮coding 果然。。。。
 */

public class Prob39 {
}
