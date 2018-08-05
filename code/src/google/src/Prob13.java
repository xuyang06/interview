package google.src;

/**
 * Created by yangxu on 8/4/18.
 *
 * 1. 给⼀一个时间t，问下⼀一个跟该时间t 有同样数字的时间是什什么时候。举例例,t="11:00",输出
 "00:11";t=“23:59”,输出"23:59"
 2.[Leetcode,683] There is a garden with N slots. In each slot, there is a flower. The N
 flowers will bloom one by one in N days. In each day, there will be exactly one flower
 blooming and it will be in the status of blooming since then.
 Given an array flowers consists of number from 1 to N. Each number in the array
 represents the place where the flower will open in that day.
 For example, flowers[i] = x means that the unique flower that blooms at day i will be at
 position x, where i and x will be in the range from 1 to N.
 Also given an integer k, you need to output in which day there exists two flowers in
 the status of blooming, and also the number of flowers between them is k and these
 flowers are not blooming.
 If there isn't such day, output -1.
 3. 给⼀一个字符串串s, ⼀一些forbidden words，把s 中的forbidden words 替换为"***"
 4. [Leetcode,157] The API: int read4(char *buf) reads 4 characters at a time from a file.
 The return value is the actual number of characters read. For example, it returns 3 if
 there is only 3 characters left in the file.
 By using the read4 API, implement the function int read(char *buf, int n) that reads n
 characters from the file.
 Note: The read function will only be called once for each test case.
 5. 两个数组guess, real，⻓长度相同，对应位置的数字相同称为⼀一个black-match，除此之
 外的存在数字相同的为white-match。给定guess, real，算有多少个black-match 和whitematch
 。举例例,guess=[1,5,3,4], real=[1,3,2,4]，输出[2,1]（2 个black-match，1 个whitematch）
 。follow-up 是给定⼀一个数组guess，对该数组的评判结果score(score[0]=blackmatch,
 score[1]=white-match)，问⼀一个新的数组newGuess 可不不可能是real
 6. 给定⼀一个字符串串s1,问可不不可以变换成另外⼀一个字符串串s2。变换的规则是：所有s1 中的同
 ⼀一个字符都必须统⼀一变换成另外⼀一个相同字符。举例例，'abc'->'cba', true; 'bab'->'abc', false。
 7. 按left most, right most, second left most, second right most...的⽅方式遍历⼀一个BST
 第L 层的所有元素
 8. ⼀一个NxN 的矩阵，横⾏行行纵列列都是有序的，求第k ⼩小的元素
 地址：
 http://www.1point3acres.com/bbs/forum.php?mod=viewthread&tid=402928&extra=page%
 3D4%26filter%3Ddateline%26orderby%3Ddateline%26dateline%3D604800%26sortid%3
 D311%26dateline%3D604800%26sortid%3D311%26orderby%3Ddateline
 */
public class Prob13 {
}
