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

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * https://www.1point3acres.com/bbs/forum.php?mod=viewthread&tid=487754&extra=page%3D2%26filter%3Dsortid%26sortid%3D311%26searchoption%255B3046%255D%255Bvalue%255D%3D22%26searchoption%255B3046%255D%255Btype%255D%3Dradio%26orderby%3Ddateline&page=1
 * <p>
 * 已经过去一段时间了，但是还是发一下吧，顺便求点米~
 * <p>
 * 一共6轮9个面试官，是我遇到人数最多的onsite面试了。。。 神了个奇的. 1point3acres
 * <p>
 * 1. product manager, 30分钟纯聊天， bq
 * 午饭， 下午的一个面试官带着去吃的，不好吃...
 * 2. hiring manager, 45分钟纯聊天，bq
 * 3. sr engineer， 45分钟zoom纯聊天， bq
 * 以下内容需要积分高于 110 您已经可以浏览
 * <p>
 * 4. 中午带着吃饭的小哥，coding
 * 4a. 滑动窗口, 刷题网76
 * <p>
 * 4b. 三组数字， 第一组其中的一个数字和第二组其中的一个数字相加，
 * 等于第三组的其中一个数字，找出所有的组合，每一组的数字可能有重复
 * leetcode 454
 * <p>
 * 5. 系统设计， 设计facebook
 * <p>
 * 6. 先聊了会简历啥的然后coding，有向图，先找出图中一个点最远能travel多远，
 * follow up是找出图中能travel最远的点.
 * 比如， 我有一个图， a->b    a->c    a->d    b->c    c->d    followup就是要找a-b-c-d这条路径
 * 给了timeline吧
 * 12/17/2018 phone interview, 3天后通知过了安排onsite
 * 01/25/2019 onsite, 周五onsite，周一通知move forward，要和hiring manger再面一下
 * 02/01/2019 hiring manger加面，各种聊背景，简历
 * 02/04/2019 通知move forward
 * 然后黑车开始了漫长的拖拖拉拉，一直到今天，给了offer letter... 就酱
 */

public class Prob91 {

    public static String findDepth(Map<Character, List<Character>> map, char start) {
        Map<Character, String> pathMap = new HashMap<>();
        helper(map, start, pathMap);
        return pathMap.get(start);
    }

    private static int helper(Map<Character, List<Character>> map, char cur,
            Map<Character, String> pathMap) {
        if (map.get(cur) == null) {
            pathMap.put(cur, cur + "");
            return 1;
        }
        int res = 0;
        for (Character neighbor : map.get(cur)) {
            int tmp = helper(map, neighbor, pathMap) + 1;
            if (tmp > res) {
                res = tmp;
                pathMap.put(cur, cur + " -> " + pathMap.get(neighbor));
            }
        }
        return res;
    }

    public static void main(String[] args) {
        Map<Character, List<Character>> map = new HashMap<>();
        map.put('a', Arrays.asList(new Character[] { 'b', 'c', 'd' }));
        map.put('b', Arrays.asList(new Character[] { 'c' }));
        map.put('c', Arrays.asList(new Character[] { 'd' }));
        System.out.println(findDepth(map, 'a'));
    }

}
