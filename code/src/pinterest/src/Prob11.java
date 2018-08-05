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

public class Prob11 {

    /**
     *
     * 面试的职位是 2018 Machine learning software Enginneer (new grad ms/phd).  一共有四轮面试
     * 2轮算法 1轮系统设计
     * 和1轮机器学习
     * 每轮45分钟，
     * 中间无大休息(喝口水上个厕所还是可以的）。
     *
     *
     *   第一轮： 给一个字符串， 给一个字典，字典里是不重复的单个字母。
     *
     * 问这个字符串中最短的substring，条件是包含所有字典中的字母。
     *
     *  应该是leetcode的原题了。 
     *
     * 做法是two pointer + hash.
     *
     *  做完之后还剩25分钟。结果小哥直接中文聊起来了（原来是学长），就这么聊了20分钟的天
     *
     *
     *    第二轮： 给一个sorted linked list，建一个balanced BST。
     *
     *  也是leetcode的原题 109 
     *
     *  这题是1年前找实习的时候做的，没太大印象了。
     *
     *  在不考虑递归占用的空间复杂度的情况下， 我先给了一个把linked list转换成array的解法
     * O(n)时间复杂度  O(n)空间复杂度 又给了一个不转换成array的
     * O(nlogn)解法 O(1) 空间复杂度 做完两个解法之后大概还有20分钟。 小哥问我能不能再优化一点。  
     * O(n) + O(1)  当时没想出来，
     * 面试结束后看了看leetcode的讨论，是用一种类似于inorder traversal的方式。
     *   
     *
     *   第三轮：设计一个图片搜索系统 search engine 准备面试的时候
     * 看到过类似的题目 也就比较顺利的和面试官好好交流了一下 中间
     * 涉及到的算法知识有 hash 和 toplogical sort
     *  强推下面的github用于准备system design.
     *
     *  https://github.com/donnemartin/system-design-primer  
     *
     *
     * 第四轮： 机器学习 先问了问实习的项目 接着问了问基础知识  overfitting, bagging, randomforest
     *  然后就是设计一个组成语句的API(马尔科夫链)
     *  例子: 如果我们现在有三条语句
     *  "one two three four" 
     * "two three four".
     *  "two five four"
     *  那以"two" 开头的概率是2/3 "one" 开头的概率是1/3
     *  那我们先选开头的这个词， 
     * 如果选到了two， 那在two这个阶段上再往后看，three跟着two的概率是2/3 five跟着two的概率是1/3 
     * 如果选到了three，.............
     *  按照这样的模式直到结束。
     *
     *   面完了之后又跟hr聊了10分钟，大概什么时候给feedback之类的。
     * 当时面试完已经快不会说话了。
     *   大概是昨天问了问同学有没有消息，因为手中有pending offer。
     * 他帮我看了看，说有feedback， 3个weak hire 和 1个strong hire。
     * 当时以为weak hire和 strong hire 之间还有一个hire档，
     * 结果同学说 strong hire下面就是 weak hire了，是有戏的。
     * 但是问完两个小时之后， 同学收到了系统提示说被拒了。
     *  今早就收到了hr的邮件。  总的来说，面试下来还是比较开心的。
     * Pinterest也确实是一个很棒的公司！ 
     * 就个人来讲，觉得有些可惜，第一面的学长竟然不是给我strong的那个，
     * 反而是准备时间不久的系统设计 给了strong。
     *
     * 3个positive和1个strong positive还是被拒了还是有一些伤心的。 
     *
     *  

     * */

}
