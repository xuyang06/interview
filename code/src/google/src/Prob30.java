package google.src;

/**
 * Created by yangxu on 8/4/18.
 *
 * 1. 给⼀一个⿊黑名单的list，⾥里里⾯面都是ip address，ip address ⾥里里可能包含通配符字符 "*", 问如果现
 在有⼀一个ip address，返回它是否在list ⾥里里。ip address 都是合法的，⽽而通配符只会出现每个地
 址的最后。例例⼦子：List“192.168.0.*”，输⼊入“192.168.0.1”，输出这个ip 在list 中。
 2. 给⼀一个数组代表⼀一个跑道，数组上的数字表示为⻋车速。如果前⾯面的⻋车⽐比后⾯面的⻋车慢，则会
 block 后⾯面的⻋车，这时会形成⼀一个cluster。⽐比如[1, 2, 3]是⼀一个cluster， [2, 3, 1, 2] 这⾥里里有[2, 3]
 和 [1, 2]两个cluster, ⽽而[2, 3, 2, 2]这⾥里里有1 个cluster, 要求输出每个cluster 的size. 这题的本
 质其实就是找出第⼀一个⽐比前⼀一个cluster 开头的数⼩小的数，其中第⼀一个cluster 的开头肯定是数组
 的第⼀一个数。
 Follow up：如果现在在数组上插⼊入⼀一个数，这个数⽐比数组上的任意⼀一个数字都⼤大，问每个
 cluster 的size 会有什什么影响。显然这时插⼊入数组的开头会形成⼀一个新的cluster，⽽而其他位置都
 不不会影响原来cluster 的size。
 3.已知screen 的⾼高和宽，给你最⼩小和最⼤大的fontSize，要求将⼀一个给定的string ⽤用尽可能⼤大的
 fontSize 显示在screen ⾥里里。已知两个API getHeight(int fontSize), getWidth(char c, int
 fontSize)，可以得到每个character 在不不同fontSize 下的⾼高和宽。string 可以拆分成⼏几⾏行行显示在
 screen 中。
 4. 给定⼀一个范围，⽐比如1-100，输出所有翻转180 度后还在这个范围内，且不不等于它本身的数。
 这个是leetcode 248 的变形。
 地址：
 http://www.1point3acres.com/bbs/forum.php?mod=viewthread&tid=420963&extra=page%
 3D2%26filter%3Ddateline%26orderby%3Ddateline%26sortid%3D311%26sortid%3D311%2
 6orderby%3Ddateline
 */
public class Prob30 {
}
