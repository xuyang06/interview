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

package google.src;

/**
 * https://www.1point3acres.com/bbs/forum.php?mod=viewthread&tid=478258&extra=page%3D1%26filter%3Dsortid%26sortid%3D311%26searchoption%5B3088%5D%5Bvalue%5D%3D12%26searchoption%5B3088%5D%5Btype%5D%3Dradio%26searchoption%5B3046%5D%5Bvalue%5D%3D1%26searchoption%5B3046%5D%5Btype%5D%3Dradio%26sortid%3D311%26orderby%3Ddateline
 * <p>
 * 1.第一轮是一个在音乐领域里做机器学习的老美大哥。最开始我还以为他是recruiter之类的出来接待我，结果第一轮面试就是他。
 * 第一个题目是用n-gram language model来随机生成句子。本质上是披着NLP外衣的蠡口乌尔吧。
 * 给一个dictionary，key是prefix，val 是一个distribution。比如abc: {b: 0.3, c: 0.4, d: 0.2, #: 0.1}。
 * 要求模拟用这个dictionary来随机生成句子。比如我们有abc: {b: 0.3, c:0.4, d:0.2, #: 0.1}。
 * 那么有30%可能接下来生成b，40%可能生成c，20%可能性生成d，10%可能性生成#（句子结束）。
 * 这样可能得到的string是abcb, abcc, abcd, abc#。如果句子没结束，
 * 继续根据prefix（花括号里面的）来生成下一个字母,a{bcb}, a{bcc}, a{bcd}。
 * 这个问题本质上是weighted sampling。对于每一个prefix，我们可以得到一个distribution，
 * 然后用一个array来存放accumulated probability。之后随机生成一个0~1之间的数用二分查找找到对应的index。
 * 这个index对应的字母就是这一轮sample到的字母。不断重复知道sample到#。讲解了思路后就开始写code了。
 * <p>
 * leetcode 528
 * <p>
 * <p>
 * 第二个题目是给一个graphical model，每一个变量的值依赖于其他某些变量。要求根据joint distribution来sample。
 * 比如有四五变量ABCDE，AB没有依赖，所以可以直接根据给定distribution来sample，C和D依赖于AB，
 * 所以我们根据p(C|A,B)来sample（同理p(D|A,B))。这题的做法是先用一个dictionary来存parent的关系，
 * 每当要sample一个变量的时候，先sample它的父变量。所以本质上就是一个recursion+memoization+sampling。
 * sampling的方法可以直接用第一题的方法。讲解了思路后就开始写code了。
 * <p>
 * <p>
 * <p>
 * 2. 一个貌似东欧小哥。这一轮面得不好。第一题是给定一个长度为1的线段AD，随机sample两个点B和C。
 * 这样就会有3条线段，AB, BC, CD。问这样3个线段能组成三角形的概率。这题有个大概的感觉，就是任一一条线段应该小于另外两条线段之和。
 * <p>
 * https://blog.csdn.net/wangche320/article/details/9270575
 * <p>
 * 第二个问题是个纯coding，给定一个board，board上面有些blocker，让判断可不可能从左上角走到右下角。
 * 这个问题我提出可以用dfs来做。小哥表示同意。
 * 之后没让我写code直接问我follow up。如果不存在一条可达路径，但是允许我们去除一个block。
 * 问这时怎么做。我提出可以用union find先判断整个board中empty cell的connectiveness，
 * 然后尝试把每一个block变成empty cell然后用union find链接相邻的empty cell。如果这时start和end是联通的则表明可行。
 * 小哥仍然没有让我写code，继续问如果允许最多移除k个block怎么做。大概想了5分钟只想到一个大概的解法。
 * 即用一个budget来表示目前可以移除多少blocker，然后用一个matrix来保存到达每个cell是最多可能剩多少budget，
 * 之后用DFS遍历。每个cell最多update k次。这样的时间复杂度是O(knn)。小哥表示可以，然后终于开始让写code。
 * 不过由于只想到一个大概思路，只是把dfs的框架写出来就没时间了。小哥说大概知道你的思路然后就结束了。
 * <p>
 * <p>
 * <p>
 * 3.一个看起来很有资历的老美大叔。问了一下我的motivation和background。然后问我如何从头搭建一个推荐系统。
 * 大概花了25分钟讲这些。之后出了一个longest common continuous subsequence。很快dp做了，
 * 并且讲空间可以优化到常数。不过大叔问有没有更快的方法，这时候只剩下不到5分钟了。想了一下没想出来，
 * 于是大叔大概讲了下可以用sort就结束了。我现在还没想出来如何用sort来做。
 * <p>
 * <p>
 * 4.吃饭，和一个在英国长大的（中国？）帅哥吃饭。大概聊了下research和product的不同工作方式。
 * <p>
 * <p>
 * 5.另一个很有资历的老美大叔。在Google待了十几年，前8年在做ads。这一轮是纯ML，没有coding。
 * 大叔深入浅出，从overfitting开始聊。让我解释什么是overfitting，如何检测overfitting，
 * 以及如何预防overfitting。之后根据我的回答让解释l1和l2 regularization的区别以及为啥不用l0。
 * 我才疏学浅，没想到l0，更没想到l0实际上就是dropout。大叔很清楚的给我解释了下为什么对于linear model不用l0，
 * 但对DNN用l0。原因是linear model的hypothesis space是convex的，存在唯一最优解，但是l0会导致多个解。
 * 而对于DNN，hypothesis space不是convex的，我们也不期望找到global optimal，因此l0有用武之地。
 * <p>
 * <p>
 * <p>
 * 之后又问了我如何从data入手解决overfitting。然后我大概讲了下如何分别用bagging，boosting，
 * 以及stacking这些ensemble的方法来降低overfitting的几率。之后大叔问了random sampling会造成什么问题。
 * 我大概解释了下如果有sample imbalance的问题的话random sample可能导致training data没有所有类型的label。
 * 解决方法是stratified sampling，并且大概讲了下stratified sampling的原理。
 * 估计大叔心里的想问的另外的情况，于是接着问如果假设数据量很大只能扫数据一遍，
 * 并且由于某些原因出现了重复的数据，如何sample数据使得boosting能够解决overfitting的问题。
 * 想了一下卡住了，然后大叔提示如果有training data的id的话就直接hash，保证相同的data总是assign到同一个data block。
 * 之后又说没有training data id并并且identical training instance也会由于noise稍微不同，这种情况下怎么办。
 * 想了一下说可以用locality sensitive hashing。大叔表示同意，并说用clustering的方法就可以解决了。
 * <p>
 * <p>
 * <p>
 * 6. 这一轮又是一个老美大哥。一来就给我讲每个面试官的风格不一样，他希望面试者在写code前解释清楚每一步要做什么。
 * 我表示赞同。之后就花了至少5分钟讲了下 k fold cross validation是什么。其实原理我知道，
 * 但是不大好打断他说我知道了... 然后将假设大家写了很多系统做model training和prediction，
 * 有两个api（我主动问的）: train(labeled data), predict(unlabeled data)。
 * 让写code实现k fold cross validation。由于大哥之前讲清楚了他的风格。
 * 于是我把大致流程讲了一下，之后才开始写code。花了大概15-20分钟边写边解释每一步是啥。
 * 之后大哥问了下时间复杂度。脑抽了回答错误，大哥让我再看看之后说对了。
 * <p>
 * 之后大哥又问如果是multiclass classification的话这个code要如何改。
 * 基本就是把evaluation那部分改了就行了，把计算misclassification error改成confusion matrix。
 * 之后大哥又问了下如何做stratified sampling，花了1分钟解释了一下。
 */

public class Prob76 {
}
