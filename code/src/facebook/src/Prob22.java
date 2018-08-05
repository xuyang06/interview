/*************************************************************************
 *
 * 1.Merge Interval，给两个sorted list of interval，⽐比如 [ [1,3], [4,6] ]和[ [1,9], [11,12] ]，返回
 [ [1,9], [11,12] ]
 地址：
 http://www.1point3acres.com/bbs/forum.php?mod=viewthread&tid=425399&extra=page%
 3D2%26filter%3Ddateline%26orderby%3Ddateline%26sortid%3D311%26sortid%3D311%2
 6orderby%3Ddateline
 */

package facebook.src;

import java.util.ArrayList;
import java.util.List;

public class Prob22 {

    public static List<List<Integer>> mergeList(List<List<Integer>> list1,
            List<List<Integer>> list2) {
        List<List<Integer>> res = new ArrayList<>();
        int i1 = 0, i2 = 0;
        while (i1 < list1.size() || i2 < list2.size()) {
            List<Integer> curL1 = i1 < list1.size() ? list1.get(i1) : null;
            List<Integer> curL2 = i2 < list2.size() ? list2.get(i2) : null;
            if (res.size() != 0) {
                List<Integer> lastL = res.get(res.size() - 1);
                if (curL1 != null && overlap(curL1, lastL)) {
                    lastL.set(1, Math.max(curL1.get(1), lastL.get(1)));
                    i1++;
                    continue;
                }
                if (curL2 != null && overlap(curL2, lastL)) {
                    lastL.set(1, Math.max(curL2.get(1), lastL.get(1)));
                    i2++;
                    continue;
                }
            }
            if (curL1 != null && (curL2 == null || curL2.get(0) >= curL1.get(0))) {
                res.add(curL1);
                i1++;
                continue;
            }
            if (curL2 != null && (curL1 == null || curL1.get(0) >= curL2.get(0))) {
                res.add(curL2);
                i2++;
                continue;
            }
        }
        return res;
    }

    private static boolean overlap(List<Integer> l1, List<Integer> l2) {
        if (l1.get(1) < l2.get(0) || l2.get(1) < l1.get(0)) {
            return false;
        }
        return true;
    }

    public static void main(String[] args) {
        List<List<Integer>> list1 = new ArrayList<>();
        List<Integer> val11 = new ArrayList<>();
        val11.add(1);
        val11.add(3);
        list1.add(val11);
        List<Integer> val12 = new ArrayList<>();
        val12.add(4);
        val12.add(6);
        list1.add(val12);
        List<List<Integer>> list2 = new ArrayList<>();
        List<Integer> val21 = new ArrayList<>();
        val21.add(1);
        val21.add(2);
        list2.add(val21);
        List<Integer> val22 = new ArrayList<>();
        val22.add(11);
        val22.add(12);
        list2.add(val22);
        System.out.println(mergeList(list1, list2));
    }

}
