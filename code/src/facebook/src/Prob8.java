/*************************************************************************
 *
 * [LeetCode,239] Given an array nums, there is a sliding window of size k which is
 moving from the very left of the array to the very right. You can only see the k numbers in
 the window. Each time the sliding window moves right by one position.
 思路路
 ● 记录当前窗⼝口内的最⼤大值，新元素加⼊入后，去掉之前的元素并且进⾏行行相关的⽐比较
 ● 也可以维持⼀一个BST
 ● 也可以维持⼀一个递减的stack，从⽽而实现O(n)复杂度
 Follow up
 ● 如果要求的是求出⼀一个区间内元素的范围呢？可以分开计算max 和min 即可
 字符串串排序题：排序 “ABC” “CAC” “AB” 但已知 C > A > B 这种。
 思路路
 ● ⾃自定义⽐比较函数
 ● 可以使⽤用Tri 排序
 Follow up
 ● 如果数据特别⼤大怎么办？可以根据⾸首字⺟母Sharding
 *
 */

package facebook.src;

import java.util.Arrays;
import java.util.Comparator;

public class Prob8 {

    public static String[] sortStrs(String[] input) {
        Arrays.sort(input, new Comparator<String>() {
            @Override public int compare(String o1, String o2) {
                int i = 0;
                while (i < o1.length() && i < o2.length() && o1.charAt(i) == o2.charAt(i)) {
                    i++;
                }
                if (i == o1.length() || i == o2.length()) {
                    return o1.length() - o2.length();
                }
                if (o1.charAt(i) == 'C') {
                    return 1;
                } else if (o1.charAt(i) == 'A') {
                    return o2.charAt(i) == 'C' ? -1 : 1;
                } else {
                    return -1;
                }
            }
        });
        return input;
    }

    public static void main(String[] args) {
        String[] input = { "ABC", "CAC", "AB", "BA" };
        input = sortStrs(input);
        for (String val : input) {
            System.out.print(val + " ");
        }
        System.out.println();
    }

}
