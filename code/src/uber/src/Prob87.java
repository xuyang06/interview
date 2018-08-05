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
 * https://www.1point3acres.com/bbs/forum.php?mod=viewthread&tid=482548&extra=page%3D2%26filter%3Dsortid%26sortid%3D311%26searchoption%5B3046%5D%5Bvalue%5D%3D22%26searchoption%5B3046%5D%5Btype%5D%3Dradio%26sortid%3D311%26orderby%3Ddateline
 * <p>
 * 二月初面的Uber，因为是在职跳槽平时没时间刷题，coding面的不好挂了。
 * 没拿到offer只能把面经分享出来了。
 * <p>
 * <p>
 * 1. Coding 亚裔大哥，带一个老美shadow
 * 输入是一个字符串数组，每个字符串由三部分组成
 * <p>
 * <p>
 * 以下内容需要积分高于 130 您已经可以浏览
 * <p>
 * name cost provider
 * a         10   CN
 * b         20   CN
 * c         30    US
 * d         50   US
 * e         70   JP
 * ...
 * <p>
 * name 没有重复， provider有重复。 要求给定一个数k，输出前k个name，
 * 在provider尽可能多(首先要满足)的情况下cost尽可能小。
 * <p>
 * Example：
 * k = 4, 输出 [a,c,e,b]
 * k = 2, 输出 [a,c] (注意虽然a,b之和更小，但是不满足provider尽可能多的条件)
 * <p>
 * <p>
 * <p>
 * 我当时用了HashMap统计每个provider的names，用PriorityQueue保证按cost排序
 * <p>
 * <p>
 * 2. 吃饭。和第一轮的大哥+hiring manager吃饭，尬聊
 * <p>
 * <p>
 * 3. Coding 三哥带老美shadow. 1point3acres
 * <p>
 * <p>
 * <p>
 * 刷题网第儿时，你没有看错就是这道easy题。10分钟写完，改了个小bug，
 * 讨论了一下corner case。
 * 面试官说，有没有别的方法。
 * 根据之前刷题的经验，stack和递归通常可以互相转化，就试着写了一下递归。
 * 写了一半三哥说时间不多了，讲一下思路吧。
 * 当时脑子有点糊涂了，面试完又整理了一下思路。大概就是input string长度是even。
 * 找到一对括号()、[]、{}就删掉，如果找不到且字符串长度>0，invalid。
 * 最后看一下字符串长度。
 * <p>
 * <p>
 * <p>
 * 4. System Design
 * <p>
 * 先聊了一些之前的project，讨论了一下怎么scale。又给了一个题，
 * 让设计一个可以批量修改大量服务器上配置文件的系统。主要聊了一下table，
 * log，cache。就是一些system design的基本知识。
 * <p>
 * 这一轮是个白人小哥，非常热情，基本上是一起合作设计的
 * <p>
 * <p>
 * <p>
 * 5. Bar Raiser
 * 小黑哥带国人小哥。behavior question一个接一个，嗓子说哑了。.
 * check 1point3acres for more.
 * <p>
 * 6. Hiring manager
 * 亚裔小哥。问之前经历，有哪方面想要提升的，别的问题记不清了。
 */

public class Prob87 {
}
