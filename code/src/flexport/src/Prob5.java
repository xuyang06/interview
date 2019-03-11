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

import java.util.*;

/**
 * https://www.1point3acres.com/bbs/thread-506647-1-1.html
 * <p>
 * Flexport是我比较看好的一家独角兽 去年收了软银的一轮融资已经有>￥3b的估值。
 * 做国际物流系统的，就是用技术取代传统公司之间的电话和传真。也支持10年期权持有，
 * 跟quora，Pinterest， Airbnb一样。总部300多人。
 * <p>
 * 这里就直接上我之前记录的面经信息:
 * process 也是 普遍的 hr聊话 => 电话coding => onsite
 * 电面：
 * 五子棋简化版3子棋，在3*3board上
 * - 要写command输入和print（可以看文档）
 * - 两个player 一个机器（随便下） command输入
 * - 每次下完判断输赢
 * <p>
 * <p>
 * leetcode 348
 * <p>
 * <p>
 * <p>
 * onsite (之前用英文记录的，就不翻译了，原谅我表达逻辑时候捉急的英语）：
 * 1. Coding: Given a string of words divided by spaces and number of N，
 * Return a sentence with 5 words. Every word is picked randomly after the
 * last occurrence, if it is the end of the string next round back to first one.
 * First word is picked randomly from any of the words.
 * E.g. "let us go to the supermarket to get the to go bundle" First word can be
 * "go", second be be either "to" or "bundle".
 * If n = 5, one possible solution is: "go bundle let us go"
 * <p>
 * <p>
 * Lunch with Kevin Cai & Jake Zerrer
 * <p>
 * <p>
 * 2. Design a system like OpenTable for reserving a table.
 * 3 user interface steps: party size, date, and location ==click search==> A list of restarant,
 * each of which shows list of time available ==click the time==>
 * review of reservation and confirm button to reserve
 * <p>
 * <p>
 * 3. Coding Card game, step by step.
 * Money is represented in number of each color: black, blue, green, green, white.
 * A card has properties of how much it requires by it.
 * Implement a canPurchase() method to decide whether a certain amount of money can buy a card.
 * Implement the purchase method, which should update the money and cards owned.
 * Discount with card owned. Each card has a property of color. If you own cards of a color.
 * Next time purchase of another card, the price of this color can be discounted by the number
 * of card you owned. Update the canPurchase and purchase method.
 * <p>
 * <p>
 * <p>
 * 4. Deep dive and discuss projects you have done in the past.
 * <p>
 * 系统设计没有给出很好的结果，不过这个设计本身也并不容易 如果没有提前准备过45分钟我真是没办法，
 * party size 和location怎么实现 query是个大问题。其它轮还行coding题目也不难。
 * 不过最后还是没给offer，也没给个feedback很郁闷。
 */

public class Prob5 {

    public static String formWordSeq(String seq, int N) {
        String[] strs = seq.split(" ");
        Map<String, List<String>> map = new HashMap<>();
        for (int i = 0; i < strs.length; i++) {
            if (map.get(strs[i]) == null) {
                map.put(strs[i], new ArrayList<>());
            }
            map.get(strs[i]).add(strs[(i + 1) % strs.length]);
        }
        StringBuilder sb = new StringBuilder();
        Random rand = new Random();
        String curW = strs[rand.nextInt(strs.length)];
        sb.append(curW + " ");
        for (int i = 2; i <= N; i++) {
            List<String> nextWords = map.get(curW);
            curW = nextWords.get(rand.nextInt(nextWords.size()));
            sb.append(curW + " ");
        }
        sb.deleteCharAt(sb.length() - 1);
        return sb.toString();
    }

    public static void main(String[] args) {
        String seq = "let us go to the supermarket to get the to go bundle";
        System.out.println(formWordSeq(seq, 5));
    }

}
