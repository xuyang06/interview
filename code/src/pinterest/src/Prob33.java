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

import java.util.*;

/**
 * https://www.1point3acres.com/bbs/forum.php?mod=viewthread&tid=466566&extra=page%3D1%26filter%3Dsortid%26sortid%3D311%26searchoption%5B3088%5D%5Bvalue%5D%3D12%26searchoption%5B3088%5D%5Btype%5D%3Dradio%26searchoption%5B3046%5D%5Bvalue%5D%3D33%26searchoption%5B3046%5D%5Btype%5D%3Dradio%26sortid%3D311%26orderby%3Ddateline
 * <p>
 * 上周五面的MLE onsite，这周三收到邮件拒. From 1point 3acres bbs
 * 之前的karat是subdomian三件套，感谢地里面经
 * <p>
 * ML system design：用户在homefeed主页上面点开了一张图片，
 * 怎么找相关图片并推送给用户相关度最高的几张图片
 * <p>
 * ML domain knowledge： 设计一个ML系统predict广告的CTR，
 * 从model selection到feature engineering到metric&evaluation
 * <p>
 * <p>
 * coding： 给一个unsorted 数组：[1, 2, 5, 10, 11]和一个target：10. 找出target在sorted pairwise里面排第几
 * 该数组的soreted pairwise 是：1+1, 1+2, 2+2, 1+5, 2+5, 5+5, 1+10.....那么就返回6。
 * 具体请看https://www.1point3acres.com/bbs ... read&tid=454688
 * <p>
 * coding： 输入一个整数，返大于该输入的最小回文整数，
 * 比如输入12300，返回12321；输入12，返回22。input >= 10
 */

/**
 * https://www.1point3acres.com/bbs/forum.php?mod=viewthread&tid=454688
 * <p>
 * 第一轮：
 * 一个二维的board,里面有0（表示可以通过），1（wall不能通过），6（monster，可以通过但是会丢一条命）。
 * input是start position, end position 和lives(有多少命)。问start到end的最短距离.
 * 1point3acres
 * <p>
 * <p>
 * 第二轮：
 * LC 原题：alien dictionary leetcode 269
 * <p>
 * 第三轮：
 * blacklist
 * 有一个blacklist，比如{"porn","world war I"}. 找出所有含有黑名单里句子的句子。
 * input是List of sentence 碧如:{"I love porn", "I love world war II"}.
 * 那么"I love porn"含有"porn"，就被找出来。"world war II"就不对，
 * 因为blacklist里面是"world war I". 要求是word level的
 * <p>
 * <p>
 * 第四轮：
 * 给一个unsorted 数组：[1, 2, 5, 10, 11]和一个target：10.
 * 找出target在sorted pairwise里面排第几
 * <p>
 * <p>
 * 该数组的soreted pairwise 是：1+1, 1+2, 2+2, 1+5, 2+5, 5+5, 1+10.....
 * 那么就返回6
 * <p>
 * <p>
 * 面试感受：对P家无限好感。hr小姐姐回复非常及时，很有诚意。两轮国人面试官非常亲切，各种鼓励我，
 * 感谢抬一手。感觉找工季真的收到同胞们的很多照顾很帮助，真的非常非常感激。
 * 大概率去P家了（太喜欢了），暗暗下决心，等我入了职，我也要像前辈们帮助我那样，
 * 帮助其他人（希望自己有这个实力？）。
 */

class TrieN {
    public Map<String, TrieN> children = new HashMap<>();
    public boolean isSeq = false;

    public TrieN() {
    }
}

public class Prob33 {

    public static String calMinSymmetricNum(String input) {
        int len = input.length();
        int l = 0, r = len - 1, flag = 1;
        char[] array = input.toCharArray();
        while (l < r) {
            if (array[l] - '0' < array[r] - '0') {
                flag = 1;
            } else if (array[l] - '0' > array[r] - '0') {
                flag = 0;
            }
            array[r] = array[l];
            l++;
            r--;
        }

        boolean addOneMoreBit = false;
        if (flag == 1) {
            while (true) {
                if (l == r) {
                    array[l]++;
                    if (array[l] <= '9') {
                        break;
                    }
                    array[l] = '0';
                    l++;
                    r--;
                } else {
                    array[l]++;
                    array[r]++;
                    if (array[l] <= '9') {
                        break;
                    }
                    array[l] = array[r] = '0';
                    l++;
                    r--;
                }
                if (r < 0) {
                    addOneMoreBit = true;
                    break;
                }
            }
        }
        if (addOneMoreBit) {
            array = new char[len + 1];
            array[0] = array[len] = '1';
            l = 1;
            r = len - 1;
            while (l <= r) {
                array[l] = array[r] = '0';
                l++;
                r--;
            }
        }
        return new String(array);
    }

    TrieN root = new TrieN();

    public void insertW(String[] words) {
        TrieN node = root;
        for (int i = 0; i < words.length; i++) {
            String word = words[i];
            if (node.children.get(word) == null) {
                node.children.put(word, new TrieN());
            }
            node = node.children.get(word);
        }
        node.isSeq = true;
    }

    public boolean findWords(String[] words, int startInd) {
        TrieN node = root;
        for (int i = startInd; i < words.length; i++) {
            if (node.children.get(words[i]) == null) {
                return false;
            }
            node = node.children.get(words[i]);
            if (node.isSeq) {
                return true;
            }
        }
        return false;
    }

    public List<String> findBlackWord(String[] blackList, List<String> input) {
        List<String> res = new ArrayList<>();
        for (String line : blackList) {
            String[] words = line.split(" ");
            insertW(words);
        }
        for (String inputStr : input) {
            String[] inputStrs = inputStr.split(" ");
            for (int startInd = 0; startInd < inputStrs.length; startInd++) {
                if (findWords(inputStrs, startInd)) {
                    res.add(inputStr);
                    break;
                }
            }
        }
        return res;
    }

    private static boolean samePoint(int[] p1, int[] p2) {
        return p1[0] == p2[0] && p1[1] == p2[1];
    }

    public static int calDist(int[][] array, int[] start, int[] end, int lives) {
        if (samePoint(start, end)) {
            return 0;
        }
        int M = array.length, N = array[0].length;
        Queue<int[]> pQueue = new LinkedList<>();
        Queue<Integer> lQueue = new LinkedList<>();
        int[][] directs = { { -1, 0 }, { 1, 0 }, { 0, 1 }, { 0, -1 } };
        Map<Integer, Integer> visited = new HashMap<>();
        pQueue.offer(start);
        lQueue.offer(lives);
        visited.put(start[0] * N + start[1], lives);
        int dist = 0;
        while (pQueue.size() != 0) {
            int size = pQueue.size();
            for (int i = 0; i < size; i++) {
                int[] curP = pQueue.poll();
                int live = lQueue.poll();
                for (int[] direct : directs) {
                    int newX = curP[0] + direct[0];
                    int newY = curP[1] + direct[1];
                    if (newX >= 0 && newX < M && newY >= 0 && newY < N && array[newX][newY] != 1) {
                        System.out.println("newX - " + newX + ", newY - " + newY);
                        int newL = live + (array[newX][newY] == 6 ? -1 : 0);
                        System.out.println("newL - " + newL);
                        if (newL > 0) {
                            if (samePoint(new int[] { newX, newY }, end)) {
                                return dist + 1;
                            }
                            if (visited.get(newX * N + newY) == null
                                    || visited.get(newX * N + newY) < newL) {
                                pQueue.offer(new int[] { newX, newY });
                                lQueue.offer(newL);
                                visited.put(newX * N + newY, newL);
                            }
                        }
                    }
                }
            }
            dist += 1;
        }
        return -1;
    }

    public static int findInd(int[] array, int target) {
        Arrays.sort(array);
        if (target < array[0] * 2) {
            return 0;
        }
        int len = array.length;
        if (target > array[len - 1] * 2) {
            return len * len + 1;
        }
        int order = 1;
        int l = 0, r = len - 1;
        while (l <= r) {
            if (array[l] + array[r] >= target) {
                r--;
            } else {
                order += (r - l + 1);
                l++;
            }
        }
        return order;
    }

    public static void main(String[] args) {
        //        int[] array = { 1, 2, 5, 10, 11 };
        //        System.out.println(findInd(array, 10));

        //        int[][] array = { { 0, 6, 0 }, { 1, 6, 0 }, { 1, 0, 0 } };
        //        int[] start = { 0, 0 };
        //        int[] end = { 2, 2 };
        //        int lives = 3;
        //        System.out.println(calDist(array, start, end, lives));

        //        Prob33 prob33 = new Prob33();
        //        String[] blackList = { "porn", "world war I" };
        //        List<String> input = Arrays.asList(new String[] { "I love porn", "I love world war II" });
        //        List<String> res = prob33.findBlackWord(blackList, input);
        //        System.out.println("res: " + res);
        String input = "44";
        //input = "3";
        input = "175";

        System.out.println(calMinSymmetricNum(input));

    }
}
