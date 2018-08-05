package google.src;

/**
 * Created by yangxu on 8/4/18.
 *
 * 1.给出⼀一个int array，找出其中⼀一个index 使得index 左边所有的数加起来等于index 右边所有
 的数加起来（左右not inclusive）。时间复杂度要求O(n)，空间复杂度O(1)。
 2.给定两个string， 判断这两个string 是否有且仅有两个字⺟母调换了了顺序，举例例：abcd 和acbd
 （b 和c 调换），affhsgn 和afghsfn（f 和g 调换了了）
 3.给若⼲干个string 和int k,得到所有k 个string 的组合，例例⼦子：{run，age，app, cat, dog} k =
 3, output:[{run, age, app}, {run, age, cat}, {run, age, dog}, {run, app, cat} ....]
 4.给⼀一个chars 的顺序，然后判断给定的char array ⾥里里⾯面的所有的chars 之间是否满⾜足这个顺序。
 举例例：dict：[d, a, c, f, j] 满⾜足顺序的chars: {d, a, f, f, j} 不不满⾜足顺序的chars：{a, c, c, d, j}或
 者{c, f, j, j, d, a}. 要求时间复杂度是O（n），n 是chars 的⻓长度（假设chars 的⻓长度⼤大于dict ⻓长
 度）。
 5. [LeetCode, 676] Given n, how many structurally unique BST's (binary search trees) that
 store values 1 ... n?
 Example:
 Input: 3 Output: 5
 Explanation:Given n = 3, there are a total of 5 unique BST's:
 1 3 3 2 1
 \ / / / \ \
 3 2 1 1 3 2
 / / \ \
 2 1 2 3
 6.给定⼀一个multiple tree，以及需要删除的多个nodes，要求返回⼀一个node 的list，以便便在
 nodes 被删除之后可以找到这些nodes 的child。
 例例⼦子：
 a
 / / \ \
 b d c f
 / \ \
 H z i
 a
 / / \ \
 b ->d -> c -> f ->
 / \
 X -> y
 假如删除b 和f，返回{a, d, c, h, z, i}
 假如删除a 和b，返回{d, c, f, h, z, i}
 7.给定⼀一个multiple tree，除了了parent 指向child，同⼀一层的children：第⼀一个child 指向第⼆二个，
 第⼆二个指向第三个。。。以此类推，最后⼀一个指向第⼀一个，形成⼀一个回路路。求出最⻓长的路路径。
 地址：
 http://www.1point3acres.com/bbs/forum.php?mod=viewthread&tid=425363&extra=page%
 3D2%26filter%3Ddateline%26orderby%3Ddateline%26sortid%3D311%26sortid%3D311%2
 6orderby%3Ddateline
 */
public class Prob51 {
}
