/*************************************************************************
 *
 * 1. [LeetCode,139] Given a non-empty string s and a dictionary wordDict containing a list
 of non-empty words, determine if s can be segmented into a space-separated sequence
 of one or more dictionary words.
 Note:
 · The same word in the dictionary may be reused multiple times in the segmentation.
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
 2. [LeetCode,56]Given a collection of intervals, merge all overlapping intervals.
 Example
 1:
 Input: [[1,3],[2,6],[8,10],[15,18]]
 Output: [[1,6],[8,10],[15,18]]
 Explanation: Since intervals [1,3] and [2,6]
 overlaps, merge them into [1,6].
 Example
 2:
 Input: [[1,4],[4,5]]
 Output: [[1,5]]
 Explanation: Intervals [1,4] and [4,5] are
 considered overlapping.
 3. [LeetCode,98] Given a binary tree,
 determine if it is a valid binary search tree (BST).
 Assume a BST is
 defined as follows:
 The left subtree of a node contains only nodes with keys less than the node's key.
 The right subtree of a node contains only nodes with keys greater than the node's key.
 Both the left and right subtrees must also be binary search trees.
 Example
 1:
 Input:
 2
 / \
 1
 3
 Output: true
 4. [LeetCode,311] Given two sparse matrices A and B, return the result of AB.
 You may assume that A's column number is equal to B's row number.
 Example:
 A = [
 [ 1, 0, 0],
 [-1, 0, 3]
 ]
 B = [
 [ 7, 0, 0 ],
 [ 0, 0, 0 ],
 [ 0, 0, 1 ]
 ]
 | 1 0 0 | | 7 0 0 | | 7 0 0 |
 AB = | -1 0 3 | x | 0 0 0 | = | -7 0 3 |
 | 0 0 1 |
 5. [LeetCode, 67] Given two binary strings, return their sum (also a binary string).
 The input strings are both non-empty and contains only characters 1 or 0.
 Example 1:
 Input: a = "11", b = "1"
 Output: "100"
 地址：
 http://www.1point3acres.com/bbs/forum.php?mod=viewthread&tid=427124&extra=page%
 3D1%26filter%3Ddateline%26orderby%3Ddateline%26sortid%3D311%26sortid%3D311%2
 6orderby%3Ddateline
 */

package facebook.src;

public class Prob24 {

    /**
     * Leetcode 69
     * */

    /**
     * Leetcode 76
     */

    public static String minWindow(String s, String t) {
        int[] win = new int[128];
        char[] sChars = s.toCharArray();
        for (char c : t.toCharArray()) {
            win[c]++;
        }
        int count = t.length();
        int begin = 0, end = 0, d = Integer.MAX_VALUE, head = 0;
        while (end < sChars.length) {
            if (win[sChars[end++]]-- > 0) {
                count--;
            }
            while (count == 0) {
                if (end - begin < d) {
                    d = end - begin;
                    head = begin;
                    System.out.println("end: " + end + ", begin: " + begin);
                }
                if (win[sChars[begin++]]++ == 0) {
                    count++;
                }
            }
        }
        return d == Integer.MAX_VALUE ? "" : s.substring(head, head + d);
    }

    public static void main(String[] args) {
        String s = "ADOBECODEBANC";
        String t = "ABC";
        System.out.println(minWindow(s, t));
    }

}
