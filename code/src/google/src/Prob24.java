package google.src;

/**
 * Created by yangxu on 8/4/18.
 *
 * 1. [LeetCode,312]Given n balloons, indexed from 0 to n-1. Each balloon is painted with a
 number on it represented by array nums. You are asked to burst all the balloons. If the you
 burst balloon i you will get nums[left] * nums[i] * nums[right] coins. Here left and right are
 adjacent indices of i. After the burst, the left and right then becomes adjacent.
 Find the maximum coins you can collect by bursting the balloons wisely.
 Note:
 (1) You may imagine nums[-1] = nums[n] = 1. They are not real therefore you can not burst
 them.
 (2) 0 ≤ n ≤ 500, 0 ≤ nums[i] ≤ 100
 Example:
 Given [3, 1, 5, 8] Return 167
 2. [LeetCode,727]Given strings S and T, find the minimum (contiguous) substring W of S,
 so that T is a subsequence of W.
 If there is no such window in S that covers all characters in T, return the empty string "". If
 there are multiple such minimum-length windows, return the one with the left-most
 starting index.
 Example:
 Input:
 S = "abcdebdde", T = "bde"
 Output: "bcde"
 Explanation:
 "bcde" is the answer because it occurs before "bdde" which has the same length.
 "deb" is not a smaller window because the elements of T in the window must occur in
 order.
 Note:
 All the strings in the input will only contain lowercase letters.The length of S will be in the
 range [1, 20000].The length of T will be in the range [1, 100].
 3. [LeetCode,805] In a given integer array A, we must move every element of A to either
 list B or list C. (B and C initially start empty.)
 Return true if and only if after such a move, it is possible that the average value of B is
 equal to the average value of C, and B and C are both non-empty.
 Example :
 Input:
 [1,2,3,4,5,6,7,8]
 Output: true
 Explanation: We can split the array into [1,4,5,8] and [2,3,6,7], and both of them have the
 average of 4.5.
 Note:
 · The length of A will be in the range [1, 30].
 · A[i] will be in the range of [0, 10000].
 4. [LeetCode,815] We have a list of bus routes. Each routes[i] is a bus route that the i-th
 bus repeats forever. For example if routes[0] = [1, 5, 7], this means that the first bus (0-th
 indexed) travels in the sequence 1->5->7->1->5->7->1->... forever.
 We start at bus stop S (initially not on a bus), and we want to go to bus stop T. Travelling
 by buses only, what is the least number of buses we must take to reach our destination?
 Return -1 if it is not possible.
 Example:
 Input:
 routes = [[1, 2, 7], [3, 6, 7]]
 S = 1
 T = 6
 Output: 2
 Explanation:
 The best strategy is take the first bus to the bus stop 7, then take the second bus to the
 bus stop 6.
 Note:
 · 1 <= routes.length <= 500.
 · 1 <= routes[i].length <= 500.
 · 0 <= routes[i][j] < 10 ^ 6.
 地址：
 http://www.1point3acres.com/bbs/forum.php?mod=viewthread&tid=409786&extra=page%
 3D4%26filter%3Ddateline%26orderby%3Ddateline%26sortid%3D311%26sortid%3D311%2
 6orderby%3Ddateline
 */
public class Prob24 {
}
