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

package uber.src;

import java.util.*;

/**
 * https://www.1point3acres.com/bbs/forum.php?mod=viewthread&tid=490045&extra=page%3D1%26filter%3Dsortid%26sortid%3D311%26searchoption%5B3046%5D%5Bvalue%5D%3D22%26searchoption%5B3046%5D%5Btype%5D%3Dradio%26sortid%3D311%26orderby%3Ddateline
 * <p>
 * 第一轮： 面经题， 给起始和终点时间，按月输出中间的时间段，比如给定范围 [2019-01-10,  2019-03-15]，
 * 输出 -> [2019-01-10, 2019-01-31], [2019-02-01, 2019-02-28],
 * [2019-03-01, 2019-03-15]
 * 要考虑不同年月份的，个人觉得有时间还是提前写写吧，各种cases挺多的
 * <p>
 * <p>
 * 第二轮： 韩国大叔，给一个un sorted array，里面数unique，找出所有两两和相等的pairs，
 * 比如[9, 4, 3, 1, 7, 12]
 * 返回：[1, 12] & [4, 9],    [3, 7]. & [1, 9],   [4, 12] & [7, 9]
 * 卡住了，最后只好暴力解，卒
 * <p>
 * <p>
 * 第三轮： system design， 友好的美国小哥，设计 oneBusAway 这个app，
 * 主要功能为：用户打开app，要显示出周围的bus stops, 点进其中一个bus stop
 * 要展示出该站所经过的公交车，再进一步点某个公交车，显示其路线，
 * 小哥好心的简化了题目，说不考虑时间，只考虑static 状态
 * 这轮交流很顺，就是一步一步讨论，画图，写schema，跟平常工作一样，很舒服
 * <p>
 * <p>
 * 第四轮： system design 烙印，设计 messanger group chat，比如，
 * 关于有收到群聊消息，用户在线或者不在线，怎么更新显示之类的，我提了一些他都不满意，
 * 就说latency太高，然后看着你。。。。
 * 本来我就惧怕design，交流真累， 卒
 * <p>
 * <p>
 * 第五轮： hiring manager，各种瞎聊，挺好的老板
 */

/**
 * 第三轮，没有什么最佳吧，我就是把整体框架画出来，然后每一步讨论清楚再往下，比如api 怎么设计，
 * 然后具体db的schema写了写，用什么db，等等各种细节
 * <p>
 * <p>
 * 第四轮  我上面举的例子是，怎么实时update 用户的message queue，有新消息来了，加进去后，
 * 显示的聊天记录有多少，唉我也不知道他到底想要怎样的设计，反正每一步都被反问一堆
 * <p>
 * <p>
 * 我现在想想大概应该是像fb那样，弄两个pointer，管理一个queue之类的吧
 */

public class Prob80 {

    public static List<String[]> formTimeSeq(String start, String end) {
        List<String[]> res = new ArrayList<>();
        String[] startStrs = start.split("-");
        String[] endStrs = end.split("-");
        int[] days = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
        int[] startVals = convert2Int(startStrs);
        int[] endVals = convert2Int(endStrs);
        int curYear = startVals[0];
        int curMonth = startVals[1];
        int curDay = startVals[2];
        while (curYear < endVals[0] || (curYear == endVals[0] && curMonth < endVals[1])) {
            res.add(new String[] { formDateStr(curYear, curMonth, curDay),
                    formDateStr(curYear, curMonth, days[curMonth - 1]) });
            curYear = (curMonth == 12 ? curYear + 1 : curYear);
            curMonth = (curMonth == 12 ? 1 : curMonth + 1);
            curDay = 1;
        }
        res.add(new String[] { formDateStr(curYear, curMonth, curDay), end });
        return res;
    }

    private static String formDateStr(int year, int month, int day) {
        return String.format("%04d-%02d-%02d", year, month, day);
    }

    private static int[] convert2Int(String[] strs) {
        int[] res = new int[3];
        for (int i = 0; i < 3; i++) {
            res[i] = Integer.parseInt(strs[i]);
        }
        return res;
    }

    public static List<List<int[]>> uniquePairs(int[] input) {
        List<List<int[]>> res = new ArrayList<>();
        Arrays.sort(input);
        Map<Integer, List<int[]>> map = new HashMap<>();
        for (int i = 0; i < input.length; i++) {
            for (int j = i + 1; j < input.length; j++) {
                if (!map.containsKey(input[i] + input[j])) {
                    map.put(input[i] + input[j], new ArrayList<>());
                }
                map.get(input[i] + input[j]).add(new int[] { input[i], input[j] });
            }
        }
        for (int key : map.keySet()) {
            if (map.get(key).size() >= 2) {
                res.add(map.get(key));
            }
        }
        return res;
    }

    public static void main(String[] args) {
        // prob 1
        String start = "2019-01-10";
        String end = "2020-03-15";
        List<String[]> res = formTimeSeq(start, end);
        System.out.println("res: ");
        for (String[] vals : res) {
            for (String val : vals) {
                System.out.print(val + ",");
            }
            System.out.println();
        }

        // prob 2
        //        int[] input = { 9, 4, 3, 1, 7, 12 };
        //        List<List<int[]>> res = uniquePairs(input);
        //        for (List<int[]> items : res) {
        //            for (int[] item : items) {
        //                System.out.print(item[0] + "," + item[1] + "; ");
        //            }
        //            System.out.println();
        //        }
    }
}
