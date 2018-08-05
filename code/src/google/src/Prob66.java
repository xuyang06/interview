package google.src;

/**
 * Created by yangxu on 8/4/18.
 *
 * 1.Input: "I am {0} {2}." 和 {“ very”，“apple”, "happy"}, Ouput: "I am very happy" 要⾃自⼰己分析
 各种corner case。
 2.Hangman Game，两个玩家：player1 出题，player2 通过call ⼀一个叫做guess(char letter)解
 答。已经有⼀一个dictionary 包含了了所有的英⽂文单词，player2 要猜hangman ⾥里里有那些词的话，
 最坏情况把a-z 全部猜⼀一遍。所以这题要求：1. 想⼀一个数据结构来减少到disctionary search 的
 时间 2. 优化guess(char letter)的效率，想办法让player2 尽可能减少猜的次数。
 3. [LeetCode,394]Given an encoded string, return it's decoded string.
 The encoding rule is: k[encoded_string], where the encoded_string inside the square
 brackets is being repeated exactly k times. Note that k is guaranteed to be a positive
 integer.
 You may assume that the input string is always valid; No extra white spaces, square
 brackets are well-formed, etc.
 Furthermore, you may assume that the original data does not contain any digits and that
 digits are only for those repeat numbers, k. For example, there won't be input like 3a or
 2[4].
 Examples:
 s = "3[a]2[bc]", return "aaabcbc".
 s = "3[a2[c]]", return "accaccacc".
 s = "2[abc]3[cd]ef", return "abcabccdcdcdef".
 地址：
 http://www.1point3acres.com/bbs/forum.php?mod=viewthread&tid=426249&extra=page%
 3D3%26filter%3Ddateline%26orderby%3Ddateline%26sortid%3D311%26sortid%3D311%2
 6orderby%3Ddateline
 */
public class Prob66 {
}
