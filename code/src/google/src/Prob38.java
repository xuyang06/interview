package google.src;

/**
 * Created by yangxu on 8/4/18.
 *
 * 1.找⽂文章⾥里里出现频率最⾼高的⼗十个连续单词对。
 Hash 保存，然后⽐比较
 2.有⼀一个⼆二叉树，每个边上有值，怎样选择边cut，能够以最⼩小代价cut 掉所有叶⼦子节点。
 备忘模型，砍掉⼀一个区间的最⼩小代价
 3.N 个⼈人给K 个candidate 投票，N 个⼈人给出K 个candidate 的偏好排序，得到⼀一个矩阵：例例如
 4 个⼈人给3 个⼈人投票：
 [[1,2,3],
 [1,3,2],
 [2,1,3],
 [3,1,3]]
 然后选择第⼀一列列，找出得票最少的candidate 排除，然后得到新的矩阵，继续上述步骤，直到最
 后返回最后剩下的candidate。
 举例例：选票假如是
 【1，2，3】
 【1，3，2】
 【2，3，1】
 【2，1，3】.
 那么第⼀一次排除的是3，不不是1 也不不是2。
 Followup：如果N 很⼤大，K 很⼩小怎么优化
 可以不不断的模拟这个过程， 如果选票多，第⼀一次记录所有情况，每次只是更更新diff 即可
 地址：
 http://www.1point3acres.com/bbs/forum.php?mod=viewthread&tid=424395&extra=page%
 3D1%26filter%3Ddateline%26orderby%3Ddateline%26sortid%3D311%26sortid%3D311%2
 6orderby%3Ddateline
 */
public class Prob38 {
}
