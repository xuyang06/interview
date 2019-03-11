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

package flexport.src;

import java.util.ArrayList;
import java.util.List;

/**
 * https://www.1point3acres.com/bbs/thread-408586-1-1.html
 * <p>
 * 店面:
 * LC 91 但不是return数字，需return所有的combination
 * <p>
 * leetcode 91
 * <p>
 * <p>
 * <p>
 * onsite:
 * 1. Game of checker 详情请见 https://en.wikipedia.org/wiki/Draughts
 * implement一个api (什么语言都可以，我用Java)
 * List<Pair<Pair<Integer, Integer>>> nextMove(char[][] board, boolean turn)
 * board纪录当前的棋盘的status，board[j] 可为 'O', 'X' or ''.
 * turn自己定义  (换Ｘ方进攻或是Ｏ方进攻)
 * return 所有可能的下一步 (不考虑吃掉对方棋子的情况，也不考虑King. 只考虑能不能移动到新的位置)
 * EX: [ ((2,3),(3,4)), ((5,8),(4,9)),  ... ] => 从(2,3)移动到(3,4) 从(5,8)移动到(4,9),  etc
 * follow up :
 * 两边个加入King该怎么modify. 加入可以吃掉对方棋子的规则
 * <p>
 * <p>
 * 2. Merge intervals (乐扣舞时遛) leetcode 56
 * <p>
 * <p>
 * 3. System Design : OpenTable
 * 感觉更像在考database schema design, 怎么存interval.
 * 例如我要预定6pm, 用餐时间两小时，那么被我reserve的位子在6pm-8pm之间不可以被其他人reserve.
 * <p>
 * <p>
 * 4. behavior
 */

/**
 * 1. lc 469, 93
 * 2. lc348
 * 3. 设计open table，基本上只考db schema design，怎样avoid double booking, etc
 * 4. 主要讲讲自己的project，少许behavior
 */

public class Prob8 {
    public static List<String> formDecodings(String s) {
        List<String> res = new ArrayList<>();
        if (s == null || s.length() == 0) {
            return res;
        }
        formDecodingsHelper(s, new StringBuilder(), 0, res);
        return res;
    }

    public static void formDecodingsHelper(String s, StringBuilder sb, int i, List<String> res) {
        if (i == s.length()) {
            res.add(sb.toString());
            return;
        }
        if (s.charAt(i) == '0') {
            return;
        }
        sb.append((char) ('A' + s.charAt(i) - '1'));
        formDecodingsHelper(s, sb, i + 1, res);
        sb.deleteCharAt(sb.length() - 1);
        if (i + 1 < s.length()) {
            if (s.charAt(i) == '1' || (s.charAt(i) == '2' && s.charAt(i + 1) >= '0'
                    && s.charAt(i + 1) <= '6')) {
                int val = (s.charAt(i) - '0') * 10 + (s.charAt(i + 1) - '0');
                sb.append((char) ('A' + val - 1));
                formDecodingsHelper(s, sb, i + 2, res);
                sb.deleteCharAt(sb.length() - 1);
            }
        }
    }

    public static void main(String[] args) {
        String s = "12";
        List<String> res = formDecodings(s);
        System.out.println(res);
    }

}
