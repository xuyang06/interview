/*************************************************************************
 *
 * 1.给⼀一个Word list 和⼀一个字⺟母list，要求按给定字⺟母的顺序返回这个list 是不不是已经sort。⽐比如
 给了了['cc','ab','ca']，['c','b','a'], 返回false 因为ca 应该在ab 前⾯面。
 2. [LeetCode, 67] Given two binary strings, return their sum (also a binary string).
 The input strings are both non-empty and contains only characters 1 or 0.
 Example 1:
 Input: a = "11", b = "1"
 Output: "100"
 3. [LeetCode, 86]Given a linked list and a value x, partition it such that all nodes less than
 x come before nodes greater than or equal to x.
 You should preserve the original relative order of the nodes in each of the two partitions.
 Example:
 Input: head = 1->4->3->2->5->2, x = 3
 Output: 1->2->2->4->3->5
 4. [LeetCode, 278]You are a product manager and currently leading a team to develop a
 new product. Unfortunately, the latest version of your product fails the quality check. Since
 each version is developed based on the previous version, all the versions after a bad
 version are also bad.
 Suppose you have n versions [1, 2, ..., n] and you want to find out the first bad one, which
 causes all the following ones to be bad.
 You are given an API bool isBadVersion(version) which will return whether version is bad.
 Implement a function to find the first bad version. You should minimize the number of calls
 to the API.
 Example:
 Given n = 5
 call isBadVersion(3) -> false
 call isBadVersion(5) -> true
 call isBadVersion(4) -> true
 Then 4 is the first bad version.
 地址：
 http://www.1point3acres.com/bbs/forum.php?mod=viewthread&tid=427770&extra=page%
 3D2%26filter%3Ddateline%26orderby%3Ddateline%26sortid%3D311%26sortid%3D311%2
 6orderby%3Ddateline
 */

package facebook.src;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

public class Prob33 {

    public static boolean check(String[] strs, char[] vals) {
        Map<Character, Integer> weights = new HashMap<>();
        for (int i = 0; i < vals.length; i++) {
            weights.put(vals[i], i + 1);
        }
        String[] sortedStrs = strs.clone();
        Arrays.sort(sortedStrs, new Comparator<String>() {
            public int compare(String str1, String str2) {
                int ind = 0;
                while (ind < Math.min(str1.length(), str2.length())) {
                    if (str1.charAt(ind) == str2.charAt(ind)) {
                        ind++;
                    } else {
                        return weights.get(str1.charAt(ind)) - weights.get(str2.charAt(ind));
                    }
                }
                return str1.length() - str2.length();
            }
        });
        for (int i = 0; i < sortedStrs.length; i++) {
            if (sortedStrs[i] != strs[i]) {
                return false;
            }
        }
        return true;
    }

//    public static boolean check1(String[] strs, char[] vals) {
    //        Map<Character, Set<Character>> graph = new HashMap<>();
    //        for (int i = 0; i < vals.length - 1; i++) {
    //            graph.getOrDefault(vals[i], new HashSet<>()).add(vals[i + 1]);
    //        }
    //        for (int i = 0; i < strs.length - 1; i++) {
    //            String preStr = strs[i];
    //            String curStr = strs[i];
    //            int ind = 0;
    //
    //        }
    //
    //        String[] sortedStrs = strs.clone();
    //        Arrays.sort(sortedStrs, new Comparator<String>() {
    //            public int compare(String str1, String str2) {
    //                int ind = 0;
    //                while (ind < Math.min(str1.length(), str2.length())) {
    //                    if (str1.charAt(ind) == str2.charAt(ind)) {
    //                        ind++;
    //                    } else {
    //                        return weights.get(str1.charAt(ind)) - weights.get(str2.charAt(ind));
    //                    }
    //                }
    //                return str1.length() - str2.length();
    //            }
    //        });
    //        for (int i = 0; i < sortedStrs.length; i++) {
    //            if (sortedStrs[i] != strs[i]) {
    //                return false;
    //            }
    //        }
    //        return true;
    //    }

    public static void main(String[] args) {
        char[] vals = { 'c', 'b', 'a' };
        String[] strs = { "cc", "ab", "ca" };
        System.out.println(check(strs, vals));
        strs = new String[] { "cc", "cad", "cade", "cad", "abed" };
        System.out.println(check(strs, vals));

    }
}
