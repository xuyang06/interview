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
 * https://www.1point3acres.com/bbs/forum.php?mod=viewthread&tid=479631&extra=page%3D1%26filter%3Dsortid%26sortid%3D311%26searchoption%5B3088%5D%5Bvalue%5D%3D12%26searchoption%5B3088%5D%5Btype%5D%3Dradio%26searchoption%5B3046%5D%5Bvalue%5D%3D33%26searchoption%5B3046%5D%5Btype%5D%3Dradio%26sortid%3D311%26orderby%3Ddateline
 * <p>
 * 之前一个帖子讲了电面：https://www.1point3acres.com/bbs ... p;page=1#pid5656840。有兴趣的朋友可以看看。此外版上的ML面经很少，之前我写了一个g的：https://www.1point3acres.com/bbs ... p;page=1#pid5662346。
 * <p>
 * <p>
 * <p>
 * 店面过了过后recruiter讲了有4轮面试，两轮coding，
 * 一轮ML domain knowledge，一轮ML system design。
 * 我还纳闷为什么没有HM面试，结果到了过后发现有6轮，包括两轮HM面试。
 * lunch也算一轮面试。
 * <p>
 * [hide=66]
 * 1. 韩国小哥。ML System design。别干年纪轻，其实交谈过后发现他基本功很扎实。
 * 主要讨论如何搭建一个home feed ML system。包括如何logging
 * （impression，feature，conversion），如何modularize每一个部分（
 * candidate generation， recommendation service，remote predictor，
 * offline training），如何prepare training data等。
 * 重点集中在system design上面，并没有讨论任何modeling 的东西。
 * <p>
 * <p>
 * <p>
 * 2. 中国大哥TL面coding。这轮没面好。刚开始相互介绍后感觉出大哥对目前的工作兴趣不大。。。
 * 之后出了一个题，给定一个matrix，找出第k大的island的面积。
 * 基本就是算岛面积和kth largest两道题的综合。
 * 大概讲了下用union find + size compression来做。
 * 不过大哥似乎第一时间没反应过来为union find可以解决这个问题，
 * 于是我额外解释了下。之后让我上机写。把code写了，但是发现有bug。
 * 到最后都没有完全把bug调好。不过思路和code框架讲得很清楚了。
 * <p>
 * <p>
 * <p>
 * 3.HM1 欧洲大叔 lunch。没想到lunch是一轮正式面试，HM1和我拿了饭直接回会议室聊天。
 * 期间一直问问题，弄得我最后一半的饭都没吃完。没有任何behavior question，
 * 全是关于简历上面的经历相关的问题。到最后变成我问他问题。。。
 * <p>
 * <p>
 * <p>
 * 4.HM2 两个HM面试背靠背。这一次是以为年轻有为ABC。又是一通简历问。
 * 但是相比于前一个HM，这一个更加technical，问我如果加入他们组的话打算提什么新的idea来做。
 * 以及从一product team ML engineer的角度来讨论如何改进ML platform and tooling。
 * 然后我就讲了一些product team ML engineer的痛点。
 * 最后反过去问了他一些behavior问题。比如作为manager如何帮助组员成长，
 * 如何对高层展现team的impact，以及如何prioritize 组里的项目等。
 * <p>
 * <p>
 * <p>
 * 5.一个三哥TL面ML domain knowledge。看名字完全就是老美的名字，
 * 不知道为啥是个三哥（三哥确认了那就是他自己的名字，没有换人）。
 * 前面几分钟让我讲了下自己的经历，并且讲了下每个项目的challenge是什么。
 * 然后从modeling的角度问了下如何解决pin recommendation quality/integrity的问题。
 * 三哥最初把这个问题描述成了一个纯粹的behavior modeling的问题，
 * 想的是通过收集user report的方法来自动获取ground truth。
 * 我强调了下integrity问题大多都是adversarial的，
 * 任何user feedback都可能被weaponize，因此建议介入人工来标注数据。
 * 三哥起初不是很清楚，如实我讲了下user report和人工标注的区别。
 * 不知道三哥是否表示认同，但是让我继续。之后我们讨论了什么时候logging，
 * 如何准备training data（oversampling，downsampling）。以及用什么feature。
 * 在讲feature engineering的时候顺便讲了下如何利用user pin access sequence
 * 通过skip gram model来算item embedding和如何用graph embedding来算user embedding。
 * 最后讨论了下可以用什么model，我强调在adversarial环境下我们追求的不是最好的predictive
 * performance，而是首要追求稳定性，于是用ensemble model最靠谱。
 * 但是我还是讲了下用NN以及为什么NN好于linear model以及tree based model。
 * 因为NN对于hypothesis space的假设最弱，再给定足够的training data的情况下，
 * 如果NN能够保证收敛，那么可以达到最好的效果。
 * <p>
 * <p>
 * <p>
 * 6.一个很漂亮的韩国小妹妹。问了coding。蠡口二琪期。做了过后还剩二十多分钟，
 * 于是又出了蠡口伊尔留的变体。花了十五分钟又写完了并且根据妹子的要求考虑了一些边界条件（
 * 最初我说假设输入总是有解的）。之后随便问了个follow up，我也随便答了下（
 * 后来我发觉我的回答并不能很有效的解决她的follow up的问题）。
 * 面完过后就把我walk out了。估计小妹妹是感冒了，面试中一直打喷嚏，表现得很抱歉的样子。
 * <p>
 * leetcode 277
 * leetcode 126
 */

public class Prob34 {
}
