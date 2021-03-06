package google.src;

/**
 * Created by yangxu on 8/4/18.
 * 1.给⼀一个list of points， 求这些点可以组成的rectangle 的⾯面积最⼩小是多少， rectangle 的
 边跟轴平⾏行行
 思路路
 ● 枚举对⻆角的两个点，查询剩下两个点是否存在
 ● 把节点按照x 排序，然后扫描所有的节点，当两个节点的x 相同，保存他们能够构成的y
 的pair。最后扫描所有的pair 情况，推理理⾯面积
 Follow up
 ● 如果计算的是棱形呢？第⼆二个⽅方法依然可⾏行行，但是需要记录的是length，⽽而不不是两个y 的
 pair
 2．给⼀一个list of int， 然后给我⼀一个query with start and end index， 问我这个区间的最
 ⼩小值是多少
 思路路
 ● 最简单的是O(n)的查找
 ● 也可以使⽤用线段树
 Follow up
 ● 如果可以更更新数值呢？也需要更更新相应的树
 3.给⼀一个list of int， 找出其中最⼩小cycle 的⻓长度。 ⽐比如 1， 2， 1， 2， cycle 的⻓长度就是
 2。然后 1， 2， 1， 2， 1 的最⼩小⻓长度也是2。 然后1， 2， 1， 2， 3 的⻓长度应该是5， 因为
 整个list 没有在repeat。 然后1， 2， 1， 2， 1， 2，1，2 的最⼩小⻓长度也是2
 思路路
 ● 从⻓长度为1 开始判断，逐步增加
 ● 也可以记录通过前k 个元素的最⼩小⻓长度，然后推理理使⽤用前k+1 个的最⼩小元素
 Follow up
 ● 如果要求求出所有可⾏行行的环呢？找出⼀一个k，那么tk 都是可⾏行行的
 *
 */
public class Prob10 {
}
