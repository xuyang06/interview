/*************************************************************************
 *
 * 1. [LeetCode,680]Given a non-empty string s, you may delete at most one character.
 Judge whether you can make it a palindrome.
 Example 1:
 Input: "aba"
 Output: True
 Example 2:
 Input: "abca"
 Output: True
 Explanation: You could delete the character 'c'.
 Note:
 1. The string will only contain lowercase characters a-z. The maximum length of
 the string is 50000.
 2. [LeetCode,301]Remove the minimum number of invalid parentheses in order to make the
 input string valid. Return all possible results.
 Note: The input string may contain letters other than the parentheses ( and ).
 Example 1:
 Input: "()())()"
 Output: ["()()()", "(())()"]
 Example 2:
 Input: "(a)())()"
 Output: ["(a)()()", "(a())()"]
 Example 3:
 Input: ")("
 Output: [""]
 地址：
 http://www.1point3acres.com/bbs/forum.php?mod=viewthread&tid=427540&extra=page%
 3D3%26filter%3Ddateline%26orderby%3Ddateline%26sortid%3D311%26sortid%3D311%2
 6orderby%3Ddateline
 */

package facebook.src;

/**
 * https://www.1point3acres.com/bbs/forum.php?mod=viewthread&tid=452939&extra=page%3D1%26filter%3Dsortid%26sortid%3D192%26searchoption%5B3046%5D%5Bvalue%5D%3D2%26searchoption%5B3046%5D%5Btype%5D%3Dradio%26sortid%3D192%26orderby%3Ddateline
 * <p>
 * 1.给一个包含小括号的string 求一个对括号的最小removal使得这个string是valid的。
 * 用stack O(n)做的，给followup能不能节省空间，用pointer写出来
 * 后来知道是利口301
 * <p>
 * 2.写一个BST的iterator 按升序输出数字
 * 利口173
 * <p>
 * <p>
 * <p>
 * <p>
 * <p>
 * https://www.1point3acres.com/bbs/forum.php?mod=viewthread&tid=452877&extra=page%3D1%26filter%3Dsortid%26sortid%3D192%26searchoption%5B3046%5D%5Bvalue%5D%3D2%26searchoption%5B3046%5D%5Btype%5D%3Dradio%26sortid%3D192%26orderby%3Ddateline
 * <p>
 * 第一题，很简单，给一串航班的起点和终点，按顺序输出所有的航班。比如说[[北京，广州],[上海，北京],[深圳，上海]]，
 * 要求输出[[深圳，上海],[上海，北京],[北京，广州]]，直接拿哈希表存下来，然后找只有一个出度的点，顺着遍历就行了。
 *
 * 第二题，一个01矩阵，每一行所有的0在前，1在后，要求给出矩阵中最左边的1所在的列id。我先给了一种O（m logn）的方法，
 * 面试官说我这个方法在n大的时候可以，然后直接告诉我了O（m+n）的方法让我实现，不知道算不算黑点。
 */
public class Prob34 {
}
