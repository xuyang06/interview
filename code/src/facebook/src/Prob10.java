/*************************************************************************
 * 1.[ Leetcode,283] Given an array nums, write a function to move all 0's to the end of it
 while maintaining the relative order of the non-zero elements.
 For example, given nums = [0, 1, 0, 3, 12], after calling your function, nums should be [1, 3,
 12, 0, 0].
 Note:
 You must do this in-place without making a copy of the array.
 Minimize the total number of operations.
 2. 给⼀一个数组，问有多少个集合，满⾜足这个集合中的最大最⼩值之和⼩小于k，k 是输⼊入的⼀一
 个参数

 他说直接求个数，因为第一问耽误时间，时间不太够了，就直接说思想。
 我说首先考虑只有一个元素的情况（二分法），然后针对集合元素个数大于等于两个的情况，双指针，找出边界，然后用Math.pow(2,n)-1求非空子集个数
 三哥问n是多少，我说j-i+1，事后发现应该是j-i-1（最小最大是必取，所以j-i+1-2）。

 地址：
 http://www.1point3acres.com/bbs/forum.php?mod=viewthread&tid=404505&extra=page%
 3D3%26filter%3Ddateline%26orderby%3Ddateline%26dateline%3D604800%26sortid%3
 D311%26dateline%3D604800%26sortid%3D311%26orderby%3Ddateline
 *
 */

package facebook.src;

public class Prob10 {

    /**
     * Leetcode 283
     *
     * */
}
