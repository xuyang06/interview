package google.src;

/**
 * Created by yangxu on 8/4/18.
 *
 * 1. 有⼀一个曲线，曲线的形状是先递减再增加，找曲线的最低点，如果只考虑int 怎么做，如果考
 虑double 怎么做
 2. ⼀一堆⾃自⾏行行⻋车和⼀一些⼈人在⼀一个2D 的matrix ⾥里里，要每个⼈人match 到⼀一辆⾃自⾏行行⻋车，⼈人和⾃自⾏行行⻋车的
 距离越短越好
 3. 给了了⼀一堆log，log ⾥里里有⽤用户id，resource id 以resource 在某个起始时间和终⽌止时间的使⽤用
 量量，⽐比如⽤用户abc 在1 到5 秒钟使⽤用了了CPU 的数量量是2，⽤用户abc 在2 到3 秒使⽤用的CPU 数
 量量是4，也就是⼀一个⽤用户对某个resource 的使⽤用在某个时间是可以叠加的，给定⼀一个resource
 id，根据⽤用户对这个resource 的peak 使⽤用量量，找到top k 的⽤用户。上⾯面的例例⼦子中abc 的CPU
 的peak 使⽤用量量是2+4=6
 4. 两道题，第⼀一个是给⼀一个数组，找到三个数字, 他们相乘的乘积最⼤大。 第⼆二题是给⼀一堆数组，
 数组中的每个数都是⼀一对，只有⼀一个是单独，同时相同的数字⼀一定都是挨着的，找到单独的数字
 5. 给⼀一堆排好序的non-overlapped interva，要插⼊入⼀一个数字，如果这个数字可以和某个
 interval 的起始时间或者结束时间挨着，就要把这个数字merge 到那个interval 之中，如果不不挨
 着，就把数字当成interval 插⼊入到那堆interval 当中，⽐比如给定的interval 是[1,2], [4,5], [9,10],
 插⼊入7 的话，结果是[1,2], [4,5], [7,7], [8, 9]，插⼊入3 的话，结果是[1,5], [9,10]
 地址：
 http://www.1point3acres.com/bbs/forum.php?mod=viewthread&tid=428197&extra=page%
 3D1%26filter%3Ddateline%26orderby%3Ddateline%26sortid%3D311%26sortid%3D311%2
 6orderby%3Ddateline
 */
public class Prob67 {
}
