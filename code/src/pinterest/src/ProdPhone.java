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

import java.util.HashSet;
import java.util.Set;

/**
 * Design Hit Counter (Leetcode 362)
 * <p>
 * Word Ladder (Leetcode 127)
 * <p>
 * <p>
 * Is Graph Bipartite? (leetcode 785)
 * <p>
 * Longest Word in Dictionary (leetcode 720)
 * <p>
 * Read N Characters Given Read4 (leetcode 157)
 * Read N Characters Given Read4 II(leetcode 158)
 * <p>
 * Longest Increasing Subsequence (leetcode 300)
 * <p>
 * Diameter of Binary Tree (leetcode 543)
 * <p>
 * Binary Tree Longest Consecutive Sequence (leetcode 298)
 * <p>
 * Diagonal Traverse (leetcode 498)
 * <p>
 * word search (leetcode 79)
 * <p>
 * Basic Calculator I (leetcode 224)
 * Basic Calculator II (leetcode 227)
 * Basic Calculator III (leetcode 772)
 * <p>
 * <p>
 * Subdomain Visit Count (leetcode 811)
 * <p>
 * <p>
 * <p>
 * Employee Free Time (leetcode 759)
 * <p>
 * 3 sum
 * 4 sum
 */
public class ProdPhone {

    /**
     * 给定两个字符串串数组，找出最⻓长的相同subarray
     * Longest Common Substring problem
     * <p>
     * https://blog.csdn.net/u013385925/article/details/81029185
     */

    public static Set<String> formLcsStr(String s, String t) {
        Set<String> res = new HashSet<>();
        int m = s.length(), n = t.length();
        int[][] counter = new int[m + 1][n + 1];
        int longest = 0;
        for (int i = 0; i < s.length(); i++) {
            for (int j = 0; j < t.length(); j++) {
                if (s.charAt(i) == t.charAt(j)) {
                    counter[i + 1][j + 1] = counter[i][j] + 1;
                    if (counter[i + 1][j + 1] > longest) {
                        res = new HashSet<>();
                        longest = counter[i + 1][j + 1];
                        res.add(s.substring(i - longest + 1, i + 1));
                    } else if (counter[i + 1][j + 1] == longest) {
                        res.add(s.substring(i - longest + 1, i + 1));
                    }
                }
            }
        }
        return res;
    }

    /**
     * 1. ⼀一个矩阵，只有0和1，找到⾥里里⾯面全为1的矩形的坐标。输⼊入⼀一定有效，保
     * 证有⼀一个满⾜足要求的矩形。⽤用左上和右下坐标表示
     * ⽐比如：
     * 0 0 0 0 0. ⽜牛⼈人云集,⼀一亩三分地
     * 0 1 1 0 0. more info on 1point3acres
     * 0 0 0 0 0
     * 结果就是返回
     * [1,1], [1,2]
     * 2. follow up 有很多个这样的矩形， 返回所有的矩形的左上右下坐标
     * 3. 不不⼀一定是矩形，找出所有连通的1. . from: 1point3acres
     * 1 0 0 1 1
     * 0 0 0 1 1
     * 1 0 0 0 1
     * 这样的输⼊入，返回⼀一个⼤大数组
     * [
     * [0,0],
     * [[0,3], [0,4], [1,3], [1,4], [2,4]],
     * [2,1]
     * ]
     */

    /**
     * You and your friend are going to hang out together, but you are all very busy.
     * Your friends tell you their busy times, you need to design a function to find a
     * spare time which could give all the spare time for everyone.
     * <p>
     * <p>
     * <p>
     * 输⼊入输出格式什什么的，全都⾃自⼰己定义。
     * 我先问了了⼀一下，这个hang out是⼀一天的还是⼏几天的。然后说，先假设所有的
     * time都是同⼀一天的。
     * 我先写了了⼀一个⼩小函数，在输⼊入都是integer的情况下，格式是 [[1,4],[2,5],
     * [7,8]] 这样，排序之后，⽤用⼀一个变量量keep latest busy time，如果新的busy
     * time ⼤大于已选 timeslots 的 latest busy time，就找到⼀一段空闲。
     * 然后她问有没有需要改进的地⽅方，我就写了了time conversion的函数，可以
     * take 9:40, 11:20这样的输⼊入，转化成整数，再进⾏行行操作。
     * ⼜又问了了⼀一下时间复杂度，能不不能优化等。
     * 题⽬目很容易易，就是有挺多细节需要注意的。⽐比如输出的时候，如果是 9h
     * 4min，要输出 9:04 ⽽而不不是 9:4。⽐比如第⼀一个busy 时间是10:00开始busy
     * 的，那10:00之前也要算上空闲。还有edge cases，如果⼤大家都没有busy要
     * 输出全部时间等。做的时候要⾮非常细⼼心。。。
     */

    /**
     * A log System with structure like this
     * ex.
     * |---register_button (10)
     * | |---register_email (4).
     * | | |---email_already_exists (1)
     * | | |---register_success (3)
     * | |---register_facebook (4)
     * | | |---register_success (4)
     * | |---dropoff (2)
     * |---login_button (10)
     * | |---login_email (4)
     * | | |---login_success (4)
     * | |---login_facebook (4)
     * | | |---login_success (3)
     * | | |---login_failure (1)
     * | |---dropoff (2)
     * now we have data with 3 properties
     * <p>
     * <p>
     * ex with A, B, C
     * user_id, timestamp, action. visit 1point3acres for more.
     * 100, 1000, A. 1point3acres
     * 200, 1003, A
     * 300, 1009, B
     * 100, 1026, B. visit 1point3acres for more.
     * 100, 1030, C
     * 200, 1109, B
     * 200, 1503, A
     * We want to output a graph to visualize it
     * Graph from input:
     * |---A (2)
     * | |---B (2)
     * | | |---C (1)
     * | | |---A (1)
     * |---B (1)
     * <p>
     * 1. define data structure and classes. From 1point 3acres bbs
     * 2. construct the graph from logfile
     * 3. print out the graph similar to above
     */

    /**
     * Maximum product of 4 adjacent elements in matrix
     * Given a square matrix, find the maximum product of four adjacent
     * elements of matrix. The adjacent elements of matrix can be top, down,
     * left, right, diagonal or anti diagonal. The four or more numbers should
     * be adjacent to each other.
     * Note: n should be greater than or equal to 4 i.e n >= 4
     * #Project Euler Problem 11
     * g = [map(int, s.split()) for s in open('pe11.in').readlines()]
     * maxp = 0
     * rows, cols, path_size = len(g), len(g[0]), 4
     * for i in range(rows):
     * for j in range(cols - path_size + 1):
     * phv = max(g[i][j] * g[i][j+1] * g[i][j+2] * g[i][j+3],
     * g[j][i] * g[j+1][i] * g[j+2][i] * g[j+3][i])
     * if i < rows - path_size:
     * pdd = max(g[i][j] * g[i+1][j+1] * g[i+2][j+2] * g[i+3][j+3],
     * g[i][j+3] * g[i+1][j+2] * g[i+2][j+1] * g[i+3][j])
     * maxp = max(maxp, phv, pdd)
     * print "Greatest product of", path_size, "adjacent numbers:", maxp
     */

    /**
     * 给⼀一个由单个字符串串表示的log string, 每⼀一⾏行行都是（PIN，BOARD, SEARCH).
     * 将三个操作看做⼀一个sequence，⽐比如（P, B, S), 要求返回⼀一个log file⾥里里⾯面频
     * 率最⾼高的sequence
     * hashmap + queue 秒了了。
     * coding的follow up说是如果有很多很多这样的log files, 内存盛不不下，我现在
     * 想找所有Logs⾥里里⾯面最Popular的sequence， 应该怎么做。答，⽤用map
     * reduce。每个machine尽可能多的处理理files, mapping 的时候emit 所有locally
     * 最好的 (sequence, count) pairs， reduce的时候把sequence作为key来
     * reduce。
     * def find_popular_sequence_0(s_lst):
     * from collections import Counter
     * c = Counter(s_lst)
     * return c.most_common()[0][0]
     * def find_popular_sequence_1(s_lst):
     * d = {}
     * m_val, m_s = 0, ''
     * for s in s_lst:
     * if s not in d:
     * d[s] = 1
     * else:
     * d[s] += 1
     * if d[s] > m_val:
     * m_val = d[s]
     * m_s = s
     * return m_s
     */

    /**
     * A - ⾯面试官
     * B - 我
     * <p>
     * A： 观察到了了什什么？
     * B：很多图⽚片，宽度⼀一样，⻓长度不不⼀一样
     * A：在不不同的屏幕（⼤大⼩小不不同）上这些图⽚片的安排位置怎么变化？
     * A：如何把他们安排的好看？或者说给定column数字，和list of pins(图⽚片), 如何安排的
     * 好看？
     * B：好看的定义是？
     * A：按顺序处理理图⽚片，总是想把当前的图⽚片放在 最短的那个column上
     * B：输⼊入格式是？ 输出格式是？
     * A : 输⼊入pins = [{'id':1, 'height': 100}, {'id':2, 'height':300}, {'id':3, 'height':150}.....],
     * col = 3
     * 返回 [[1,.....],[2,...],[3,...]] list of list。 每个list含有⼀一个col安排的图⽚片的编号
     * B : minheap O(nlogk) n:number of pins k: col
     * A : 如果不不让⽤用heap 你会⽤用什什么？
     * B : array + binarysearch
     * A : 如果连binarysearch都不不⽤用， 给⼀一个最最基础的
     * B : O(nk) 每次扫描所有col得到最⼩小的index. more info on 1point3acres
     * A : 什什么时候我们想⽤用 O(nk) 的⽅方法
     * B : k 很⼩小， logk, k 都是常数级别
     * 这算是第⼀一问吧。写完之后继续回到刚刚的⽹网⻚页。. from: 1point3acres
     * A : 你resize⼀一下看看发⽣生了了什什么. more info on 1point3acres
     * B : 恩，位置发⽣生了了变化 ⽽而且还有特效， 很炫酷. 围观我们@1point 3 acres
     * A : 如果是你 你怎么实现它。
     */

    public static void main(String[] args) {
        //        String s = "ababc";
        //        String t = "abcdaba";
        //        System.out.println(formLcsStr(s, t));
    }

}
