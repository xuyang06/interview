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
 * https://www.1point3acres.com/bbs/forum.php?mod=viewthread&tid=466670&extra=page%3D2%26filter%3Dsortid%26sortid%3D311%26searchoption%5B3088%5D%5Bvalue%5D%3D12%26searchoption%5B3088%5D%5Btype%5D%3Dradio%26searchoption%5B3046%5D%5Bvalue%5D%3D2%26searchoption%5B3046%5D%5Btype%5D%3Dradio%26sortid%3D311%26orderby%3Ddateline
 * <p>
 * 发个面经，楼主刷题少，很多经典题对楼主来说都是新题 😓
 * coding每轮只做了一道题加扩展，感觉bug free和communication很重要，并不一定要每轮做两道题才够。如果对各位有用的话跪求各位大侠加米～
 * <p>
 * Prob 1: Powerset. Recursive + iterative  leetcode 78
 * / for loop
 * <p>
 * Prob 2: Binary search in a sorted array that
 * has been rotated. Ext: what if there are duplicates
 * <p>
 * Prob 3: Find the perimeter of each island in a
 * given 0/1 matrix. Ext: how to dedup islands with the same shape
 * <p>
 * Prob 4: ML design. Some NLP prediction task.
 * Basic questions about data collection,
 * loss function design, and so on.
 * Don't remember the details.
 * <p>
 * Prob 5: ML design. FB newsfeed ranking design.
 * Basic questions about data collection,
 * loss function design, and so on.
 * <p>
 * <p>
 * <p>
 * Offer大概一周之后送到，目前还在negotiate。祝各位也和楼主一样幸运早日拿到心仪的offer
 */

/**
 * https://www.quora.com/How-does-Facebook-feed-use-deep-learning
 * <p>
 * Facebook’s feed is designed and optimized to drive engagement.
 * What kind of engagement has been changing a lot lately [1].
 * Engagement can be determined by a lot of factors,
 * such as click, view, like, comment, and share.
 * <p>
 * By treating each of these as a metric to predict [2],
 * Facebook can treat the feed as a machine learning problem,
 * where the inputs are the content of the feed,
 * and the output the probability of an engagement event.
 * Figuring out how to input content into a machine learning model
 * is one area where deep learning is extremely helpful.
 * A Facebook post can typical consist of text, image, and video content.
 * <p>
 * By analyzing all of these features with deep learning,
 * one can use their feature vectors as inputs into a
 * logistic regression model (which can also be a deep learning model).
 * <p>
 * I wrote a quick blog post which explains how that works a little more.
 * <p>
 * <p>
 * I highly recommend taking a look at Facebook’s research blog . They have some awesome stuff there explaining some of the techniques they use over at Facebook.
 */

public class Prob50 {
}
