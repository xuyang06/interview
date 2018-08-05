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
 * https://www.1point3acres.com/bbs/forum.php?mod=viewthread&tid=450366&extra=page%3D4%26filter%3Dsortid%26sortid%3D311%26searchoption%5B3046%5D%5Bvalue%5D%3D22%26searchoption%5B3046%5D%5Btype%5D%3Dradio%26sortid%3D311%26orderby%3Ddateline
 * <p>
 * 刚刚面的热乎uber电面面经
 * 时长：1h (3min interviewer self-introduction +
 * 3min self-introduction & a project + 40min coding &follow-up
 * + 10min Q&A)
 * <p>
 * 面试官：烙印（不要相信收到面试通知的邮件里面的人名，显示的明明是一个中国人，
 * 不过在面经里看好多人这样说了还是有心理准备的）感觉人还挺nice的，
 * 对打车也是一腔热忱那种，就是驮马我真的听不懂他说啥，
 * 他自我介绍和回答问题的时候我就great nice cool interesting的忽悠过去了
 * <p>
 * <p>
 * <p>
 * coding:
 * given二位数列，里面一堆各种字母，找到每个字母的cluster个数（有点类似于number of islands）
 * ex:
 * a a b c
 * a b c c
 * c c c a
 * return [('a', 2), ('b', 1), ('c', 1)] #注意这里每个position的neighborhood有八个，
 * diagonal也算，so b只有一个cluster
 * <p>
 * <p>
 * solution:（我菜 欢迎探讨 轻喷）
 * 先把每个character作为key，这个character对应的所有位置（二维list）
 * 作为value弄了个map
 * <p>
 * 然后对每个key中的所有positions做dfs，used为True的跳过，neighbor不在这些position里的也跳过。
 * 做一次count++，当一个key全做完了把(key,count) pair加到result list里面就行。
 * 注意：
 * main函数自己写 还好array给了不用stdin读，要跑，跑了四个例子，都对了，
 * 本人没什么创造力，栗子都是他要求的。
 * <p>
 * follow-up:
 * 1 time complexity - 欢迎地友指点啊dfs我一做就懵，感觉说的不对
 * 2 我做了两次循环能不能合并成一次
 * <p>
 * 求亲爱的地友们给点大米（不会扣自己的），给点祝福（比大米更重要！）。#后面碎碎念可以跳过了
 * 找工作快俩月了，background真的次所以没拿到什么面试，人生第一次面试面的fb，秒挂。
 * 今天得知了平时一起自习的大佬喜提fb offer的消息，真的替他高兴，羡慕，也开始怀疑自己，
 * 感觉自己折腾几个月最后可能只能进个没啥钱的小公司庸碌无为的过一生了。。。
 * 太丧了题也不想刷了 遂来分享一波面经，，，希望对大家有用！
 * <p>
 * 丧归丧，还是一起加油吧！
 * <p>
 * <p>
 * <p>
 * <p>
 * <p>
 * <p>
 * <p>
 * 可以扫一遍matrix，如果不允许修改原matrix，那就用一个bool matrix 标记走过的，
 * 结果先用一个map 来存着。对于每一个点如果没有走过，就从这个点开始dfs,
 * 然后在map 里increment着点对应的char 的node 数。最后对map的keset里的每个值输出相应的key-value
 * 就可以了。时间空间都是m*n。
 */

public class Prob64 {
}
