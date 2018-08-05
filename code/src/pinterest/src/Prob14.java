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
 * https://www.1point3acres.com/bbs/forum.php?mod=viewthread&tid=452707&extra=page%3D1%26filter%3Dsortid%26sortid%3D311%26searchoption%5B3046%5D%5Bvalue%5D%3D33%26searchoption%5B3046%5D%5Btype%5D%3Dradio%26sortid%3D311%26orderby%3Ddateline
 * <p>
 * <p>
 * /
 * /*
 * blacklisted_phrases = [
 * "machine guns"
 * "free ray bans",
 * "pornography",.
 * "world war i",.
 * "world war ii",
 * "sun ray",
 * "cool day"
 * ]
 * <p>
 * is_blacklisted("i like machine guns") -> True
 * is_blacklisted("world war is bad") -> False
 * is_blacklisted("i like pie") -> False
 * is_blacklisted("war i world") -> False
 * is_blackListed("cool machine guns") -> True
 */

/**
 * .
 * 給一個blacklisted_phrases, 與一個string 輸入
 * 判斷這個string有沒有含有blacklisted_phrases裡面的phrase，上面有input與output結果. Waral 博客有更多文章,
 * <p>
 * <p>
 * 我一開始用兩個map做，
 * 接著被面試官要求用最簡單的方式做
 * . 围观我们@1point 3 acres
 * 最後快結束時，我才想起來可以用trie來解，稍微講了一下時間就到了，一定妥妥的跪了
 */

public class Prob14 {
}
