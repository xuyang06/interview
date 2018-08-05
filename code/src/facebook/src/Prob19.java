/*************************************************************************
 *
 * 1. [LeetCode,159] Given a string, find the length of the longest substring T that contains at
 most 2 distinct characters.
 For example, Given s = “eceba”,
 T is "ece" which its length is 3.
 双针模型，对于⼀一个终点最靠前的起点；也可以理理解为演绎模型，从k 的情况推理理k+1 的情况
 2. [LeetCode,253] Given an array of meeting time intervals consisting of start and end
 times [[s1,e1],[s2,e2],...] (si < ei), find the minimum number of conference rooms required.
 For example,
 Given [[0, 30],[5, 10],[15, 20]],
 return 2.
 排序所有的起点和终点，然后扫⾯面，遇到起点和终点分别+1 和-1
 3. [LeetCode,621] Given a char array representing tasks CPU need to do. It contains
 capital letters A to Z where different letters represent different tasks.Tasks could be done
 without original order. Each task could be done in one interval. For each interval, CPU
 could finish one task or just be idle.
 However, there is a non-negative cooling interval n that means between two same tasks,
 there must be at least n intervals that CPU are doing different tasks or just be idle.
 You need to return the least number of intervals the CPU will take to finish all the given
 tasks.
 Example 1:
 Input: tasks = ["A","A","A","B","B","B"], n = 2
 Output: 8
 Explanation: A -> B -> idle -> A -> B -> idle -> A -> B.
 Note:
 1. The number of tasks is in the range [1, 10000].
 2. The integer n is in the range [0, 100].
 *题⽬目和后⾯面的重复了了，贪⼼心策略略⾸首先填写频率最⼤大的
 地址：
 http://www.1point3acres.com/bbs/forum.php?mod=viewthread&tid=424119&extra=page%
 3D2%26filter%3Ddateline%26orderby%3Ddateline%26sortid%3D311%26sortid%3D311%2
 6orderby%3Ddateline

 Leetcode 274

 设计数据库

 */

package facebook.src;

import java.util.*;

public class Prob19 {
    /**
     * Leetcode 358
     */

    public static String rearrangeString(String s, int k) {
        Map<Character, Integer> freq = new HashMap();
        for (char c: s.toCharArray()) {
            freq.put(c, freq.getOrDefault(c, 0) + 1);
        }
        PriorityQueue<Character> pq = new PriorityQueue<Character>(freq.size(), new Comparator<Character>(){
            public int compare(Character c1, Character c2) {
                return freq.get(c2) - freq.get(c1);
            }
        });
        pq.addAll(freq.keySet());
        StringBuilder sb = new StringBuilder();
        Queue<Character> tmp = new LinkedList();
        while (!pq.isEmpty()) {
            Character cur = pq.poll();
            sb.append(cur);
            freq.put(cur, freq.get(cur) - 1);
            tmp.offer(cur);
            if (tmp.size() < k) {
                continue;
            }
            Character front = tmp.poll();
            if (freq.get(front) > 0) {
                pq.offer(front);
            }
        }
        return sb.length() == s.length() ? sb.toString() : "";
    }

    public static void main(String[] args) {
        String s = "aabbcc";
        int k = 3;
        System.out.println(rearrangeString(s, k));
    }

}
