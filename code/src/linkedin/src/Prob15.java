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

package linkedin.src;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

/**
 * https://www.1point3acres.com/bbs/forum.php?mod=viewthread&tid=455996&extra=page%3D1%26filter%3Dsortid%26sortid%3D311%26searchoption%5B3088%5D%5Bvalue%5D%3D12%26searchoption%5B3088%5D%5Btype%5D%3Dradio%26searchoption%5B3046%5D%5Bvalue%5D%3D6%26searchoption%5B3046%5D%5Btype%5D%3Dradio%26sortid%3D311%26orderby%3Ddateline
 * <p>
 * 第一轮 coding:
 * 中国哥哥
 * 1. Permutation of String
 * 有个小bug, 提示了一下改了
 * <p>
 * leetcode 567
 * <p>
 * <p>
 * 2. 实现Hashmap的put(), get()
 * 这道题讨论了挺久吧，拿到题有点懵，小哥引导了一下，先用了Array存-->后来说map大小不固定，
 * 用了Linkedlist 实现一下，期间小哥一直问问题帮助我考虑各种情况。
 * <p>
 * leetcode 706
 * <p>
 * 3. 没时间了就问了几个问题
 * <p>
 * <p>
 * 第二轮 ML：
 * 大概率有shadow。。但是小哥电脑摄像头挂了，手机电话，电脑代码
 * 1. coding: 给定一个函数getbiasrandom(), 以p概率返回1， （p-1）概率返回0。
 * 实现一个getrandom()函数，以相同概率返回0-6中的一个数
 * <p>
 * 我懵了，特别懵，，提示下只实现了以相同概率返回0/1，没做过的题脑子不转了，当场觉得挂了。
 * <p>
 * <p>
 * 2. 小哥说没时间了，ml:
 * - 解释linear&logistics regression model，问了为什么说logistics regression 是 linear的？
 * - 知不知道怎么feature transformation? 没懂答曰不熟悉
 * - L1&L2区别？答L1能做feature selection，L2能防止overfitting等等，追问问什么？（觉得拿英语解释还是比较捉急）
 * - SVM概念
 * <p>
 * 一周就拒了，HR电话拒，拒的舒舒服服明明白白，HR表示没有feedback因为对于Intern，hc只会回答一个Y or N。
 */

public class Prob15 {

    private static int getbiasrandom() {
        Random rand = new Random();
        int val = rand.nextInt(15);
        if (val < 4) {
            return 0;
        }
        return 1;
    }

    private static int getRandomBinaryVal() {
        while (true) {
            int firstV = getbiasrandom();
            int secondV = getbiasrandom();
            if (firstV == 1 && secondV == 0) {
                return 1;
            }
            if (firstV == 0 && secondV == 1) {
                return 0;
            }
        }
    }

    public static int getRandomRangeVal() {
        while (true) {
            int val = 0;
            for (int i = 0; i < 3; i++) {
                val = (val << 1) + getRandomBinaryVal();
            }
            if (val < 7) {
                return val;
            }
        }
    }

    public static void main(String[] args) {
        Map<Integer, Integer> freq = new HashMap<>();
        for (int i = 0; i < 100000; i++) {
            int randVal = getRandomRangeVal();
            if (freq.get(randVal) == null) {
                freq.put(randVal, 0);
            }
            freq.put(randVal, freq.get(randVal) + 1);
        }
        System.out.println(freq);
    }

}
