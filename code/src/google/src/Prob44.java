package google.src;

/**
 * Created by yangxu on 8/4/18.
 *
 * 1.定义 n-straight 指连续的n 个数字, 输⼊入是⼀一个integer array 和n , 要求返回array 满不不满⾜足
 n-straight 的要求:
 eg 3-straight [1,2,3,5,6,7]返回true, [1,2,3,4,5] 返回False
 follow up: 如果n-straight 指⾄至少n 个连续的数字, 应该怎么写函数
 连续n 个进⾏行行判断，followup 则在递增时⼀一直向后⾛走
 2.给⼀一个integer array 表示不不同符号的个数和输⼊入n, 返回所有可能的n 个符号的组合(不不在乎顺
 序)
 follow up: 返回这些组合的个数, 优化时间空间复杂度
 组合输出
 3.给⼀一个integer array, 表示每辆⻋车在路路上的速度, 假设他们都往同⼀一个⽅方向开, 开的快的会被开
 的慢的卡住, 问你最后整个路路上的⻋车, 会被分成⼏几组 ,每组有⼏几辆⻋车
 follow up, 往这个⻋车队⾥里里加⼀一辆⻋车(所有可能的位置), 返回所有可能的下⼀一步的结果
 寻找⾮非递增序列列，followup 看加⼊入的⻋车的速度位于⾮非递增序列列的哪个位置即可
 4.两个字符串串, ⼀一个字符串串⽐比另⼀一个多⼀一个字⺟母, 其余出现顺序相同,返回那个字⺟母,
 follow up: 出现顺序不不⼀一定相同, 返回那个字⺟母
 follow up: 如果字符串串特别⼤大, 怎么办?
 可以hash ⽐比较，也可以XOR
 地址：
 http://www.1point3acres.com/bbs/forum.php?mod=viewthread&tid=423736&extra=page%
 3D3%26filter%3Ddateline%26orderby%3Ddateline%26sortid%3D311%26sortid%3D311%2
 6orderby%3Ddateline
 */
public class Prob44 {
}
