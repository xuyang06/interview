/*************************************************************************
 *
 * 1.[LeetCode,91] A message containing letters from A-Z is being encoded to numbers using
 the following mapping:
 'A'
 -> 1
 'B'
 -> 2
 ...
 'Z'
 -> 26
 Given
 a non-empty string containing only digits, determine the total number of ways
 to decode it.
 Example:
 Input:
 "12"
 Output:
 2
 Explanation:
 It could be decoded as "AB" (1 2) or "L" (12).
 演绎模型，memo[k]是前k 个数字的可⾏行行组合数，然后基于k 和k-1 可以推理理k+1 的情况
 地址：
 http://www.1point3acres.com/bbs/forum.php?mod=viewthread&tid=424528&extra=page%
 3D1%26filter%3Ddateline%26orderby%3Ddateline%26sortid%3D311%26sortid%3D311%2
 6orderby%3Ddateline
 */

package facebook.src;

public class Prob18 {

    /***
     * 系统设计 国人大哥 typeahead: 心中窃喜 然后刚说到qps 大哥问你是不是看过这道题 一下子怔住了不知道怎么回答 后来实诚的说 确实以前见过 然后就换了道题 是关于如何search fb的post (比如搜apple,出来苹果公司消息的post) 全程阴着脸 不苟言笑 最后这轮好像也没过
     4. ML 设计 国人大姐 问一些以前的项目经历 然后问的是 怎么设计fb的page模块的 search,比如搜san jose 出来的是地名 搜lady gaga 出来的是人的page.
     *
     * */

}
