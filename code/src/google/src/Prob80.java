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

package google.src;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * https://www.1point3acres.com/bbs/forum.php?mod=viewthread&tid=482917&extra=page%3D1%26filter%3Dsortid%26sortid%3D311%26searchoption%5B3088%5D%5Bvalue%5D%3D12%26searchoption%5B3088%5D%5Btype%5D%3Dradio%26searchoption%5B3046%5D%5Bvalue%5D%3D1%26searchoption%5B3046%5D%5Btype%5D%3Dradio%26sortid%3D311%26orderby%3Ddateline
 * <p>
 * 1. 开始就是一个Staff Engineer面ML，我给HR说对NLP比较熟，
 * 所以这轮问的都是NLP相关，比如RNN，LSTM什么的，然后让写代码说明LSTM原理，
 * Vector进去是怎么操作的，但是我只记得三个门了...之后问了一道ML的设计题，
 * 如何设计一个Type suggestion系统(吐槽下，HR明明说了不考设计)，
 * 从数据收集到最后的Serving，最后问了推荐的词和用户实际输的词不一样如何把这点考虑进去改进系统，
 * 以及模型很大，但是用户在手机上使用latency要求很高怎么做，
 * 想考的是模型压缩，半路出家搞ML的表示不懂...
 * <p>
 * <p>
 * 2. 一个是骰子每个面是一个字母（可能为空），给N个骰子和长度<=N的string，
 * 判断用这些骰子能不能组成string，给每个骰子编上号的话组成string的骰子顺序是啥？
 * follow up是如果给个字典，骰子上的字母如果在字典里可以用字典的value代替怎么做。
 * Eg： 骰子是{0: ['A','B','C','H','E', ''],
 * 1:['C','W','O','P','I','U'],
 * 2:['E','R','W','X','A','I']}, String='HWO'，输出就是[0,2,1]
 * Follow up就是如果String='HVW'，同时给个字典比如{'U':'V'}表示UV可以互换，
 * 如果还是可以组成string，改变字母次数最少的骰子组合是什么
 * <p>
 * <p>
 * 我说的是对每个字母建字典的时候把本来就有这个字母的骰子放list前面，就会优先backtrack这些了
 * <p>
 * <p>
 * 3. 印度小姐姐，出的给一个integer数组和一堆query，
 * 每个query是[i,j)，表示数组从i到j这一段(不含j)，然后返回该段的最大值，
 * 有时间复杂度要求，没想出来，然后小姐姐直接把办法说出来了，
 * 把数组划分成K个interval来做，可能需要线段树，但是并不会 :)
 * <p>
 * <p>
 * 4. 非常基础的题，给一个graph，找从A到B的最短距离，follow up 1是同时需要打印最短路径，
 * follow up 2是graph改成weighted
 * <p>
 * <p>
 * 5. 一道没刷到的面经题，一个knight在无限大的棋盘上走（规矩是象棋里面的knight走法），
 * 先问从原点开始走，到给定坐标的最短路程是多少，
 * 然后follow up是给定一些不能走的点如何修改算法
 * <p>
 * <p>
 * http://www.voidcn.com/article/p-gpbqgrjq-zt.html
 */

public class Prob80 {

    public static List<Integer> solveQuestion2(Map<Integer, char[]> dicts, String input) {
        Map<Character, List<Integer>> reverseIndMap = new HashMap<>();
        for (Integer key : dicts.keySet()) {
            for (char c : dicts.get(key)) {
                if (reverseIndMap.get(c) == null) {
                    reverseIndMap.put(c, new ArrayList<>());
                }
                reverseIndMap.get(c).add(key);
            }
        }
        List<Integer> res = helper(reverseIndMap, input, new ArrayList<>(), 0);
        return res;
    }

    private static List<Integer> helper(Map<Character, List<Integer>> reverseIndMap, String input,
            List<Integer> tmp, int i) {
        if (i == input.length()) {
            return tmp;
        }
        for (Integer ind : reverseIndMap.get(input.charAt(i))) {
            if (!tmp.contains(ind)) {
                tmp.add(ind);
                List<Integer> tmpL = helper(reverseIndMap, input, tmp, i + 1);
                if (!tmpL.isEmpty()) {
                    return tmpL;
                }
                tmp.remove(tmp.size() - 1);
            }
        }
        return new ArrayList<>();
    }

    public static void main(String[] args) {
        // {0: ['A','B','C','H','E', ''], 1:['C','W','O','P','I','U'], 2:['E','R','W','X','A','I']}
        Map<Integer, char[]> dicts = new HashMap<>();
        dicts.put(0, new char[] { 'A', 'B', 'C', 'H', 'E' });
        dicts.put(1, new char[] { 'C', 'W', 'O', 'P', 'I', 'U' });
        dicts.put(2, new char[] { 'E', 'R', 'W', 'X', 'A', 'I' });
        List<Integer> res = solveQuestion2(dicts, "HWO");
        System.out.println("res: " + res);
    }

}
