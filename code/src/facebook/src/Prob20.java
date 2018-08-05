/*************************************************************************
 *
 * 1.[LeetCode,621] Given a char array representing tasks CPU need to do. It contains capital
 letters A to Z where different letters represent different tasks.Tasks could be done without
 original order. Each task could be done in one interval. For each interval, CPU could finish
 one task or just be idle.
 However,
 there is a non-negative cooling interval n that means between
 two same tasks, there must be at least n intervals that CPU are
 doing different tasks or just be idle.
 You
 need to return the least number of intervals the CPU will take to finish
 all the given tasks.
 Example 1:
 Input: tasks = ["A","A","A","B","B","B"], n = 2
 Output: 8
 Explanation: A -> B -> idle -> A -> B -> idle -> A -> B.
 Note:
 1. The number of tasks is in the range [1, 10000].
 2. The integer n is in the range [0, 100].
 贪⼼心法⾸首先填⼊入频率最⾼高的任务，然后依次填充
 地址：
 http://www.1point3acres.com/bbs/forum.php?mod=viewthread&tid=423470&extra=page%
 3D3%26filter%3Ddateline%26orderby%3Ddateline%26sortid%3D311%26sortid%3D311%2
 6orderby%3Ddateline
 */

package facebook.src;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Prob20 {

    /**
     * 白人小哥。简单相互介绍下背景后小哥出题。
     * 蠡口遛而腰的变种
     * 给的任务不能打乱顺序执行，同样的任务如果在cooldown里面则加idle。要求给出所有任务执行的结果。
     * 例子：
     * 1)
     * Input: [A,A,B,B], cooldown = 2.
     * Output:[A,_,_,A,B,_,_,B].
     * 2)
     * Input: [A,B,A,B], cooldown = 2.
     * Output:[A,B,_,A,B]
     */

    private static List<Character> taskSchedule(List<Character> input, int cooldown) {
        List<Character> res = new ArrayList<>();
        Map<Character, Integer> lastActive = new HashMap<>();
        for (char c : input) {
            if (lastActive.containsKey(c)) {
                int diff = res.size() - lastActive.get(c);
                if (diff < cooldown) {
                    for (int i = 0; i < cooldown - diff; i++) {
                        res.add('_');
                    }
                }
            }
            res.add(c);
            lastActive.put(c, res.size());
        }
        return res;
    }

    public static void main(String[] args) {
        List<Character> input = new ArrayList<>();
        input.add('A');
        input.add('A');
        input.add('B');
        input.add('B');
        int cooldown = 2;
        System.out.println(taskSchedule(input, cooldown));
        input = new ArrayList<>();
        input.add('A');
        input.add('B');
        input.add('A');
        input.add('B');
        System.out.println(taskSchedule(input, cooldown));
    }
}
