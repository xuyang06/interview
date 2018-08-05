/*************************************************************************
 *
 * Yangxu
 *
 * 给⼀一个质数数组，没有重复元素，⽐比如[2, 3, 5]，要求返回所有元素之间可能的乘积，⽐比如结果
 是[2, 3, 5, 6, 10, 15, 30]，每个数最多⽤用⼀一次，结果不不⼀一定需要是有序的
 思路路
 ● 因为我们会有多个元素的乘积。但是我们可以使⽤用动态规划的推理理，当我们求出前k 个元
 素的结果后，针对第k+1 个，只需要⽤用它乘以之前k 的结果，然后拼接即可
 考点
 ● 能否想到DP 的演绎思想
 ● 如何保存之前的结果
 ● 如何进⾏行行拼接
 Follow up
 如果最多要求使⽤用t 个元素呢？
 可以额外记录⼀一下⼀一个元素的t 的个数
 */

package facebook.src;

public class Prob4 {
}
