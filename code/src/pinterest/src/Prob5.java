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

public class Prob5 {
    /**
     * wordbreak变形...
     *
     *
     * 1. [LeetCode,139] Given a non-empty string s and a dictionary wordDict containing
     * a list of non-empty words, determine if s can be segmented into a space-separated
     * sequence of one or more dictionary words.
     *
     *
     Note:
     · The same word in the dictionary may be reused multiple times in the
     segmentation.
     · You may assume the dictionary does not contain duplicate words.
     Example 1:
     Input: s = "leetcode", wordDict = ["leet", "code"]
     Output: true
     Explanation: Return true because "leetcode" can be segmented as "leet code".
     Example 2:
     Input: s = "applepenapple", wordDict = ["apple", "pen"]
     Output: true
     Explanation: Return true because "applepenapple" can be segmented as "apple pen apple".
     Note that you are allowed to reuse a dictionary word.
     Example 3:
     Input: s = "catsandog", wordDict = ["cats", "dog", "sand", "and", "cat"]
     Output: false
     演绎模型：前k 个字符可⾏行行
     可以使⽤用Tri 树优化

     http://www.1point3acres.com/bbs/forum.php?mod=viewthread&tid=424540&extra=page%
     3D1%26filter%3Ddateline%26orderby%3Ddateline%26sortid%3D311%26sortid%3D311%2
     6orderby%3Ddateline

     *
     *
     * */

}
