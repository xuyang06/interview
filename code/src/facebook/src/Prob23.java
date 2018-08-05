/*************************************************************************
 *
 * 1 .[LeetCode,173] Implement an iterator over a binary search tree (BST). Your iterator will
 be initialized with the root node of a BST.
 Calling next() will return the next smallest number in the BST.
 Note: next() and hasNext() should run in average O(1) time and uses O(h) memory, where h
 is the height of the tree.
 follow up：两个BST，然后按顺序iterate。
 2. Given an array of integers and an integer k, you need to find the total number of
 continuous subarrays whose sum equals to k.
 Example 1:
 Input:nums = [1,1,1], k = 2
 Output: 2
 Note:
 1. The length of the array is in range [1, 20,000].
 2. The range of numbers in the array is [-1000, 1000] and the range of the
 integer k is [-1e7, 1e7].
 Sum = ?
 3. [LeetCode,543] Given a binary tree, you need to compute the length of the diameter of
 the tree. The diameter of a binary tree is the length of the longest path between any two
 nodes in a tree. This path may or may not pass through the root.
 Example:
 Given a binary tree
 1
 / \
 2 3
 / \
 4 5
 Return 3, which is the length of the path [4,2,1,3] or [5,2,1,3].
 Note: The length of path between two nodes is represented by the number of edges
 between them.
 **要注意算法复杂度，需要O(n)，n 为node 的个数**
 follow up，将最⻓长路路径打印出来。
 4.给⼀一个letters 的顺序，然后判断给定的string array ⾥里里⾯面的单词之间是否满⾜足这个顺序。举例例：
 letters：[d, a, c, f, j] 满⾜足顺序的strings: {dict, cat, finger} 不不满⾜足顺序的strings：{dag，ddtt}
 或者{jack，act}。
 5.[LeetCode,543]There is a new alien language which uses the latin alphabet. However, the
 order among letters are unknown to you. You receive a list of words from the dictionary,
 where words are sorted lexicographically by the rules of this new language. Derive the
 order of letters in this language.
 For example,
 Given the following words in dictionary,
 [
 "wrt",
 "wrf",
 "er",
 "ett",
 "rftt"
 ]
 The correct order is: "wertf".
 Note:
 1. You may assume all letters are in lowercase.
 2. If the order is invalid, return an empty string.
 3. There may be multiple valid order of letters, return any one of them is fine.
 地址：
 http://www.1point3acres.com/bbs/forum.php?mod=viewthread&tid=425348&extra=page%
 3D2%26filter%3Ddateline%26orderby%3Ddateline%26sortid%3D311%26sortid%3D311%2
 6orderby%3Ddateline
 */

package facebook.src;

public class Prob23 {
    /**
     * Leetcode 523
     * */



}
