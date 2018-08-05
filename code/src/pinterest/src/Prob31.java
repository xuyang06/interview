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

package pinterest.src;

/**
 * https://www.1point3acres.com/bbs/forum.php?mod=viewthread&tid=474697&extra=page%3D1%26filter%3Dsortid%26sortid%3D311%26searchoption%5B3088%5D%5Bvalue%5D%3D12%26searchoption%5B3088%5D%5Btype%5D%3Dradio%26sortid%3D311%26orderby%3Ddateline
 * <p>
 * <p>
 * 面试的Machine learning engineer, 很曲折面了总共6轮。
 * <p>
 * 0. HR pick up，简单walk around了这个building，
 * 介绍了他们家的几个building，食堂，以及culture。
 * <p>
 * 1. ML design, 白人小哥，做知识图谱的，具体细节有点忘记，
 * 主干是给定一堆pins的集合A（随机），如何找出相似的pins B。
 * <p>
 * 2. System design, 华裔小哥，刚从推荐组转到vision组，设计yelp的一个功能，
 * 给定餐馆ID list R以及经纬坐标C，如何找出给定餐馆Q的 near 餐馆集合，
 * 如何scale。
 * <p>
 * 3. Coding, 华裔小哥，蠡口 散把灵 + 聊project （他是P家一篇很有名文章的作者）
 * leetcode 380
 * <p>
 * <p>
 * 4. 原本schedule上该是ML design，但是搞错了进来的国人大叔说他分到的是coding，
 * 于是就面了coding，蠡口 留酒屋 和尔凌凌合体，
 * leetcode 695, leetcode 200
 * <p>
 * 同时聊了一些behavior question， 遇到的最难的项目啊，
 * 如何处理conflict啊balabala。
 * <p>
 * <p>
 * HR follow up后反映了面试和schedule不一致的情况，飞回家后第二天接到电话，
 * 补上一轮ML design还有一轮coding。
 * <p>
 * 5. 某年轻牛教授，给定用户的pins 和board，如何设计一个user modeling系统，
 * 如何measure performance，如何scale。同时问了ML/DL的几个问题，
 * dropout为什么work，怎么理解L1 和L2正则，
 * 为什么会gradient vanishing或者exlosion以及怎么解决等。
 * <p>
 * 6.  Coding，有点忘记了，但是是用trie 做，大概类似于蠡口 尔要要，
 * 裹了了Pins的外衣。
 * Leetcode 211
 * <p>
 * <p>
 * <p>
 * 他们家HR态度很好，速度很快，面试到加试到出结果大概一周。
 * <p>
 * 希望对大家有帮助，有问题请直问哈我只要记得就会知无不言，求大米！感谢各位！
 */

/**
 * 真的是运气好，我的profile特别平均。答的时候我基本是按ML pipeline来走，
 * 首先clarify问题，应用场景，input, output,
 * 然后从数据收集，清理，feature，模型，measurement，
 * A/B test以及可能的改进，很开放，
 * <p>
 * 更多具体信息需要的话可以一起探讨哈~
 */

public class Prob31 {

}
