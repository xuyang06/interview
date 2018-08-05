/*************************************************************************
 *
 * 1.实现把⼀一个数字翻译成英语，⽐比如111， 输出one hundred and eleven
 地址：
 http://www.1point3acres.com/bbs/forum.php?mod=viewthread&tid=428118&extra=page%
 3D1%26filter%3Ddateline%26orderby%3Ddateline%26sortid%3D311%26sortid%3D311%2
 6orderby%3Ddateline

 1. behavior，米国大哥，问了超多
 2. coding，中国小哥，人很好，树序列化非序列化，leetcode 449
 以及面经题目，给一个矩阵里面是1和0求第一个1在的列，特征是在同一行里面，只要遇到一个1，它右边都是1 (leetcode 898)
 3. 系统，泰普额害的
 4. coding， 树的最长路径，还有一道让我想想
 5. coding， 实现把一个数字翻译成英语，比如111， 输出one hundred and eleven

 */

package facebook.src;

public class Prob30 {

    public static void main(String[] args) {
        String str = "12,23,34,45,";
        String[] vals = str.split(",");
        System.out.println("vals length: " + vals.length);
        for (int i = 0; i < vals.length; i++) {
            System.out.print(vals[i] + ", ");
        }
        System.out.println();
    }

}
