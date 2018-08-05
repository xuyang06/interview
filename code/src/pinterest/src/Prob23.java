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
 * https://www.1point3acres.com/bbs/forum.php?mod=viewthread&tid=426865&extra=page%3D1%26filter%3Dsortid%26sortid%3D311%26searchoption%5B3088%5D%5Bvalue%5D%3D12%26searchoption%5B3088%5D%5Btype%5D%3Dradio%26searchoption%5B3046%5D%5Bvalue%5D%3D33%26searchoption%5B3046%5D%5Btype%5D%3Dradio%26sortid%3D311%26orderby%3Ddateline
 * <p>
 * <p>
 * 上周五面的onsite，结果跪了。总共有六轮，其中两轮是manager的轮次。
 * 1. System Design/ ML. 本来应该要考SD的，结果一上来看了我的背景说，
 * 我们直接考machine learning design吧，然后就是问设计pinterest的推荐系统。
 * <p>
 * 2. Hiring manager，主要就是谈为什么Pinterest，之前做过的project等等。
 * <p>
 * 3. Engineer manager，另外一个manager，主要就是随便聊，因为是lunch，
 * 聊得还挺开心的，一直鼓励我好好面，虽然最后挂掉了。
 * <p>
 * 4. 又一轮的ML的问题，主要是问了各种cold start的问题怎么做推荐。
 * <p>
 * 5. LC 698的变形，输出的结果是分组的情况。没有做到bug free，中间进行了debug，
 * 最后run了两个test case，时间到。
 * <p>
 * 6. 总共有三小问，第一问：给定一个很长的数组N，每个数字都是0-255的数值，
 * 和各种pair的index的数组M （可能是[[1,100],[5,1000],etc]）。
 * M的长度最大是N*(N-1)/2. 问求M中所有pair的mean。用个presum，效率是O(M+N).
 * 第二问：相同的数组，求M中所有pair的median，在预处理的时候给每一位计算当前总共有多少个0，
 * 多少个1，。。多少个255. 每一位用256的数组存储。效率O(M+N)。
 * 第三问：当N特别大的时候，我们无法存进内存中，给定一个压缩指标K, K<<N， 问怎么在预处理的时候进行压缩，
 * 同时效率还是O(M+N). 答案是每次隔K个进行存储，这样在查找的时候每次需要K次，
 * 但是K是常数，所以效率还是O(M+N).
 * <p>
 * 最后给HR要了反馈，说的是ML中希望能够答更多的trade off。自我感觉在回答过程中基本都是按照问题进行回答，
 * 可能缺乏了一些组织化。最后一轮的coding反馈很好。Anyway，已经move on了，准备新一轮的面试。
 */

public class Prob23 {
}
