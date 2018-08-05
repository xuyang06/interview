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

/**
 * https://www.1point3acres.com/bbs/forum.php?mod=viewthread&tid=449999&extra=page%3D4%26filter%3Dsortid%26sortid%3D311%26searchoption%5B3046%5D%5Bvalue%5D%3D22%26searchoption%5B3046%5D%5Btype%5D%3Dradio%26sortid%3D311%26orderby%3Ddateline
 * 楼楼上周四面的uber, 面试官是一个国人大叔, 人超级好,全程carry。
 * 出了一道新题.其实题目很简单,但是,楼主太紧张了.前半个小时一直讨论,
 * 最后15min写了代码,并且跑了test case.
 * <p>
 * 题目是: 求n的阶层.F(n) = n*(n-1)*(n-2)....1;
 * 但是n很大，所以不能整数相乘。我提出写一个helper function,
 * 转换成两个string 相乘,但是他说一个可以不用转换， 直接用int.
 * 这个地方我confuse很久,花了很多时间和他讨论.不过最后还是转换成了两个string 相乘.
 * 上周四面的。。。。现在还没有消息,好着急呀。 求过啊,求offer.
 * 请教各位大神他家是不是一两天之内没结果就算默拒呀？我看地里,也有过一周收到offer的。
 * 现在自己很紧张啊,他家准备了很久,真的很想去！！！ 发个面经求offer!!!
 */

public class Prob61 {

    private static String multi(String a, int b) {
        int carry = 0;
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < a.length(); i++) {
            int cur = (a.charAt(a.length() - 1 - i) - '0') * b + carry;
            sb.append(cur % 10);
            carry = cur / 10;
        }
        if (carry != 0) {
            sb.append(carry);
        }
        return sb.reverse().toString();
    }

    public static String fac(int n) {
        String cur = "1";
        for (int i = 2; i <= n; i++) {
            cur = multi(cur, i);
        }
        return cur;
    }

    public static void main(String[] args) {
        System.out.println(fac(20));
    }

}
