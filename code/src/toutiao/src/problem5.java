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

package toutiao.src;

import java.util.*;

/**
 * https://www.1point3acres.com/bbs/forum.php?mod=viewthread&tid=470026&extra=page%3D1%26filter%3Dsortid%26sortid%3D311%26searchoption%5B3046%5D%5Bvalue%5D%3D47%26searchoption%5B3046%5D%5Btype%5D%3Dradio%26sortid%3D311%26orderby%3Ddateline
 * <p>
 * <p>
 * 申请的头条美国Bytedance的ML岗位，收到了两轮视频面试的通知，效率非常快非常高，
 * 面试官都是很友好的国人，上来就说中文开心的一匹~~~
 * 两轮都是简历描述加coding challenge的问题，
 * 简历基本是任由你发挥来描述也没有追问的很深~~~
 * <p>
 * Coding都很简单，中途会问各种问题，感觉几个小问题答的不是很好或者说反应慢了一丢丢：
 * <p>
 * 1. Currency Calculator:
 * Design a class with input like [["USD","JPY", 1], ["USD", "EUR", "2"]]
 * 两个货币名称加上对应的exchange rate，然后实现一个function(String s1, String s2)来return汇率.
 * implement了最简单的map的方法，但是如果有两种汇率不能相互转换的话就要躲处理，
 * 比如再多个["A","B",5]求A和USD的汇率。面试官提示下最后得出了用graph来实现然后s1和s2就是start和src的位置变成了路径问题。
 * <p>
 * <p>
 * 2. a =[1,2,4,6,7,8,5,3,1] k = 4;
 * 要你返回有没有两个值加起来等于k，说了无数种方法。。。
 * 和对应的时间空间复杂度（在说heap的时候空间还说错了哭哭）。。。
 * 然后最后如果是sorted的array怎么做，头尾两个pointer找我竟然没想出来真的是。。
 * 。
 * 然后也是design一个class，有一个func做以上的查找，
 * 还要加一个append和pop的func，对应的各种各样的方法，
 * 比如append和pop用的多还有func找sum用的多等等等等。
 * <p>
 * <p>
 * <p>
 * 最后问了threading,如果append和pop被concurrent同时使用怎么办，
 * 刷了五百道李口把本科学的东西忘完了（以前教过很多种方法）.............
 * ........................大概说了下只记得lock了，然后就口头说了下怎么实现。。。
 */

public class problem5 {

    public static double currencyExchange(String[][] inputs, String A, String B) {
        Map<String, Map<String, Double>> map = new HashMap<>();
        for (String[] input : inputs) {
            String currency1 = input[0];
            String currency2 = input[1];
            Double val = Double.parseDouble(input[2]);
            if (map.get(currency1) == null) {
                map.put(currency1, new HashMap<>());
            }
            if (map.get(currency2) == null) {
                map.put(currency2, new HashMap<>());
            }
            map.get(currency1).put(currency2, val);
            map.get(currency2).put(currency1, new Double(1.0 / val));
        }
        System.out.println("map: " + map);
        Queue<String> currencyPq = new LinkedList<>();
        Queue<Double> exchangePq = new LinkedList<>();
        currencyPq.offer(A);
        exchangePq.offer(1.0);
        Set<String> visited = new HashSet<>();
        visited.add(A);
        while (!currencyPq.isEmpty()) {
            String curr = currencyPq.poll();
            Double exchange = exchangePq.poll();
            for (String neighbor : map.get(curr).keySet()) {
                if (!visited.contains(neighbor)) {
                    Double curVal = map.get(curr).get(neighbor) * exchange;
                    if (neighbor.equals(B)) {
                        return curVal;
                    }
                    exchangePq.offer(curVal);
                    currencyPq.offer(neighbor);
                    visited.add(neighbor);
                }
            }
        }
        return -1.0;
    }

    public static void main(String[] args) {
        String[][] inputs = { { "USD", "JPY", "1" }, { "USD", "EUR", "2" }, { "JPY", "CHN", "3" } };
        System.out.println(currencyExchange(inputs, "CHN", "EUR"));
    }
}
