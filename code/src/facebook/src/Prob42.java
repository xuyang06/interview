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
 * https://www.1point3acres.com/bbs/forum.php?mod=viewthread&tid=479633&extra=page%3D1%26filter%3Dsortid%26sortid%3D311%26searchoption%5B3088%5D%5Bvalue%5D%3D12%26searchoption%5B3088%5D%5Btype%5D%3Dradio%26searchoption%5B3046%5D%5Bvalue%5D%3D2%26searchoption%5B3046%5D%5Btype%5D%3Dradio%26sortid%3D311%26orderby%3Ddateline
 * <p>
 * screen round
 * LC 273 Integer to English Words，感觉就是硬解，边界条件很多
 * <p>
 * Onsite
 * 1. LC 157 Read N Characters Given Read4K，这一题楼主面的时候比较脑残，完全没想到用queue，
 * 用了一个array做，有各种边界条件，最后还有bug，感觉面试的大哥对我也很无语
 * <p>
 * 2. LC 114 Flatten Binary Tree to LinkedList
 * <p>
 * 3. Career conversation 尬聊. LC 125 Valid Palimdrome
 * <p>
 * 4. Design Twitter
 * <p>
 * Pull + push model, nosql, multi-level cache, load balancing, using queue to prevent leaky requests,
 * db separate read/write, request cross region route vs request local route, data cross regiona sync,
 * data sharding, photo support
 * <p>
 * 5. Design Feeds Ranking, feeds include a mix of friend feeds, news feed
 * <p>
 * <p>
 * <p>
 * Learning to rank framework -> chose pairwise, just because it's more familiar
 * post embedding, user embedding
 * feature engineering, feature engineering, feature engineering
 * pairwise scoring function architecture -> any binary classifier (nn tower + sigmod,
 * fb btst + log regression, google long and wide, linkedin modified version of long and wide)
 * <p>
 * embedding cold start -> global average, airbnb bucket overage, cron job re-train
 * ab test, sticky session, maybe you can also talk about session vs tracking during ab testing
 * metrics: ndcg vs map vs mrr, how to calculate
 */

public class Prob42 {
}
