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

import java.util.Random;

/**
 * https://www.1point3acres.com/bbs/forum.php?mod=viewthread&tid=451814&extra=page%3D1%26filter%3Dsortid%26sortid%3D311%26searchoption%5B3088%5D%5Bvalue%5D%3D12%26searchoption%5B3088%5D%5Btype%5D%3Dradio%26searchoption%5B3046%5D%5Bvalue%5D%3D6%26searchoption%5B3046%5D%5Btype%5D%3Dradio%26sortid%3D311%26orderby%3Ddateline
 * <p>
 * 我投的是ML的engineer组 2019 - SUMMER的实习。一共是两面，连续两个小时，之后是一个team match，
 * 和经理聊了聊天， 20分钟吧，上周给了offer，今天接受了。之后可以好好做research了，这事儿算是过去了。
 * <p>
 * <p>
 * <p>
 * 第一面：问了简历 - 20分钟，做题 - 20分钟，ML的问题 - 20分钟
 * <p>
 * <p>
 * <p>
 * 简历问的还是比较细，关于发的文章还是问了问细节，包括想法和细节
 * 题目：给一个list的数字，randomly shuffle the list, make sure when you run the function,
 * each time should output randomly with same distribution.
 * 关于这个题目，我也卡了一下，还是用了python里面random function做了。
 * 做出了之后，会问你如何保证每一次不同结果的probability都是一样的. 需要手动证明
 * <p>
 * http://www.vogella.com/tutorials/JavaAlgorithmsShuffle/article.html
 * <p>
 * <p>
 * ML问的是LR。写出来了optimization function，问了L1和L2的区别。不同metrics的区别。
 * 什么时候用L1或者L2，为什么L1会得到更多的weights as zeros。
 * <p>
 * <p>
 * 第二面：单纯的面试，一共三道题，都比较简单，前两个都是关于parentheses match的问题，
 * 一种括号或者三种括号怎么做。第三题是关于 function的 inclusive and exclusive时间的，
 * 我不知道蠡口对应的是那个题目。主要是说，一个function里面可以嵌套function，
 * 每一个function有start和end的时间，让你算出来两个时间是多少。还是用stack做，
 * 见过的同学可以补充下是蠡寇的哪个题目。 636
 * <p>
 * <p>
 * 第三面：这个比较简单了，manager介绍了自己和团队，让我介绍了下research，讲了讲possible projects。
 * 还是比较贴近我的research的，20分钟，结束！
 * <p>
 * <p>
 * 是说给一个list a =  [1,2,3], function f(a) 需要output.
 * [1,2,3]
 * [1,3,2]
 * [2,1,3]
 * [2,3,1]
 * [3,1,2]
 * [3,2,1]. visit 1point3acres for more.
 * <p>
 * 中的任意一个，并且确保你的function output 这六个candidates的probability都是一样的
 */

public class Prob8 {

    /**
     * https://en.wikipedia.org/wiki/Fisher%E2%80%93Yates_shuffle
     */

    public static void shuffle(int[] array) {
        Random rand = new Random();
        for (int i = array.length - 1; i >= 0; i--) {
            int ind = rand.nextInt(i + 1);
            swap(array, ind, i);
        }
    }

    private static void swap(int[] array, int l, int r) {
        int tmp = array[r];
        array[r] = array[l];
        array[l] = tmp;
    }

    public static void main(String[] args) {
        int[] array = { 1, 2, 3, 4 };
        shuffle(array);
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    /**
     * Fisher–Yates shuffle
     * 要证明算法的正确性也很简单，即任何一个元素shuffle之后出现在任意位置的概率都是1/N。
     * 任意一个元素，放在第N-1个位置的概率是1/N， 放在pos N-2的位置是 (N-1)/N * 1 / (N-1) = 1/N 。
     * 需要注意的是，一个元素一旦被交换到了序列的尾部，那么就不会再被选中，这也是算法一目了然的原因。
     * */
}
