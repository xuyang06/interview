/*************************************************************************
 *
 * Copyright (c) 2016, DATAVISOR, INC.
 * All rights reserved.
 * __________________
 *
 * NOTICE:  All information contained herein is, and remains
 * the property of DataVisor, Inc.
 * The intellectual and technical concepts contained
 * herein are proprietary to DataVisor, Inc. and
 * may be covered by U.S. and Foreign Patents,
 * patents in process, and are protected by trade secret or copyright law.
 * Dissemination of this information or reproduction of this material
 * is strictly forbidden unless prior written permission is obtained
 * from DataVisor, Inc.
 */

package pinterest.src;

import java.util.Arrays;
import java.util.List;

/**
 * https://www.1point3acres.com/bbs/forum.php?mod=viewthread&tid=453648&extra=page%3D1%26filter%3Dsortid%26sortid%3D311%26searchoption%5B3088%5D%5Bvalue%5D%3D12%26searchoption%5B3088%5D%5Btype%5D%3Dradio%26sortid%3D311%26orderby%3Ddateline
 * <p>
 * 面的Machine Learning engineer，聊了四十分钟research，给了二十分钟做题目
 * You are given a list of integers, e.g.[1, 3, 2, 0, 5, 2, 8, 2]
 * <p>
 * Given a start index in the list, you “win” by landing on a zero, where you move by jumping through the array either left or right the number of spaces specified at the index you are currently looking at.
 * 貌似很简单的DFS  但是当时写的磕磕撞撞的，最后没有时间写Test Case了
 * <p>
 * 几天后通知挂了。
 * <p>
 * 个人感觉Pinterest coding的Bar还是很高的，很强调Efficiency。 . From 1point 3acres bbs
 * 求小伙伴加大米啊，地里一堆200的帖子看不了。
 * <p>
 * 问了关于regression的一些问题，基本的regression 还有Logistics Regression。
 */

public class Prob19 {

    public static boolean feasible(List<Integer> vals, int ind) {
        return helper(vals, ind);
    }

    private static boolean helper(List<Integer> vals, int ind) {
        if (ind < 0 || ind >= vals.size() || vals.get(ind) < 0) {
            return false;
        }
        if (vals.get(ind) == 0) {
            return true;
        }
        int item = vals.get(ind);
        vals.set(ind, -1);
        if (helper(vals, ind - item) || helper(vals, ind + item)) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        List<Integer> vals = Arrays.asList(new Integer[] { 1, 3, 2, 0, 5, 2, 8, 2 });
        //System.out.println(feasible(vals, 3));
        //System.out.println(feasible(vals, 4));
        //System.out.println(feasible(vals, 5));
        System.out.println(feasible(vals, 7));
    }
}
