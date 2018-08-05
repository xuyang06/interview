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
 * https://www.1point3acres.com/bbs/forum.php?mod=viewthread&tid=448270&extra=page%3D1%26filter%3Dsortid%26sortid%3D311%26searchoption%5B3088%5D%5Bvalue%5D%3D12%26searchoption%5B3088%5D%5Btype%5D%3Dradio%26searchoption%5B3046%5D%5Bvalue%5D%3D6%26searchoption%5B3046%5D%5Btype%5D%3Dradio%26sortid%3D311%26orderby%3Ddateline
 * <p>
 * 上周三下午两小时实习店面
 * <p>
 * 第一小时 白人和印度姐
 * 第一题从一个一半0一半1的random number generator
 * 2进制，用给的01rng随机取每一位，最后去掉多余的（如果超出范围就重新做）
 * <p>
 * <p>
 * 自己做一个在(a,b)区间内产生uniform random integer的函数.
 * 后面问了ml 自己选一个binary classifier具体讲一下(logistic regression,
 * svm, nn, decision trees应该都可以)
 * <p>
 * 问了regularization都有哪些（有loss function可以l1 l2, 没有怎么办）
 * <p>
 * <p>
 * relu
 * dropout
 * <p>
 * 基本说了early stopping, 还有L1, L2的表达式写出来，
 * 说了一下L1可以选feature。没有loss function的话我就说了一下bagging
 * 然后根据cv结果调整模型之类的
 * <p>
 * <p>
 * 谢谢分享！我今天刚好看decision tree书上也讲到了regularization,
 * 说通过调节hyperparameters 来实现。min_* 的参数增大，
 * max_.*的参数调小就可以regularization.
 * 可能再看到其他章节又会有不同的感想了，哈哈。
 * <p>
 * <p>
 * 分类metric 什么时候accuracy不好用 precision recall auc roc都要知道
 * <p>
 * <p>
 * 第二小时纯码 一个abc和一个白人 很nice
 * 第一题有点像把伞伞 leetcode 833
 * 第二题排好序的有重复数列找某个数开始和结束的index
 * 比如[0,2,3,3,3,3,3,3,7]找3开始和结束的index是2,7
 * 第三题留疤
 * 之前以为hard不会考 没想到还真出了
 * 还好面试的software engineer人好 降低了要求 他们自己看起来好像也并没有亲自做过题
 * <p>
 * <p>
 * 今天收到hr电话已过hc
 * 下一步是跟有兴趣的manager面谈
 * 求team match
 */

public class Prob4 {
}
