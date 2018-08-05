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
 * https://www.1point3acres.com/bbs/forum.php?mod=viewthread&tid=454205&extra=page%3D1%26filter%3Dsortid%26sortid%3D311%26searchoption%5B3088%5D%5Bvalue%5D%3D12%26searchoption%5B3088%5D%5Btype%5D%3Dradio%26sortid%3D311%26orderby%3Ddateline
 * <p>
 * 为了能和老婆大人早日汇合，弱弱的我在8月中旬开始了在职找工的刷题节奏。
 * 电面在九月初，一道find first unique简单题和一道get intervals from two sorted intervals的中等题。
 * <p>
 * <p>
 * Onsite约在了10月25日，结果今天在回程的飞机上收到了拒信，当时心里很是苦涩，但生活奋斗还是得继续！
 * HR给了deeper反馈，说coding and behavior rounds did well,
 * but designs are below FB expectation.
 * 具体的coding题目其实都是LC原题，但要求bug free，途中对复杂度讨论面试官会故意发问质疑，
 * 但只要很友好的解释思路，别一上来就code，保证了好的交流，算法不难的。
 * 这次面试官们都非常Nice， 很向往的组，可惜了。。。
 * a). 10:00 一个韩国的大姐（背景巨牛，各大公司的principal machine leanring SE),
 * 题目是LC124(follow up是打印出path）。
 * <p>
 * b). 10:45 一个印度的CMU小哥（比较腼腆），高频题LC297.
 * 对空间复杂度要注意，因为要存Null，所以worst case需要O(2n + 1)的space（n是所有node数量）。
 * 第二题是LC238，但要注意是允许除法，切记别一上来按照原题思路来做，这样很明显就给人无脑刷题的印象。
 * <p>
 * c). 11:30 一个中国小哥（很开朗）的behavior轮，问了proud project， conflict，
 * career path等经典的问题。最后一道简单的Dictionary中能不能组成target word，
 * 最后follow up关于dictionary很大的情况怎么办，比如用cache。
 * <p>
 * d). （噩梦开始）12:30， 一个白人大哥很犀利的样子（背景也很牛），爬虫设计，
 * 10k的机子爬1B的wiki，不能爬重复的page。本人准备的设计题中恰巧没注重这方面，
 * 所以答的很磕绊。大哥先问了单机子多线程怎么实现，怎么加锁，然后到了分布式。
 * 其实核心思想是hash url，然后进行更even的分配负载。
 * <p>
 * e). 1:15，很nice的国人小哥，问的是ML design关于POI（point of interest).
 * 注重点是ML的整体思路，从问题的描述道最后的service搭建，
 * 过程中会涉及到database的query，categorical feature的降唯（embedding）等等细节。
 * 这轮楼主表示面的一般，但不至于挂。
 * <p>
 * 总体来说真的蛮失望的，fb是拿到的面试中离老婆最近的公司了，而且绿卡政策，
 * 福利都很好，面完当天已经开始未来生活的憧憬，然而现在得忘记一切，
 * 总结失误，继续奋斗了！希望下面的面试能有好运。大家一定别忽视系统设计，
 * 一轮weak的system design很有可能挂全局。。。
 */

public class Prob36 {
}
