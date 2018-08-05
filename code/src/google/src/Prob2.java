package google.src;

/**
 * Created by yangxu on 8/4/18.
 * 给⼀一个数组，要求尽可能多的切割这个数组，使得每⼀一个⼩小段分别sort 之后，整个数组就sort
 了了。
 参考http://www.1point3acres.com/bbs/thread-380867-1-1.html
 区间之间需要按照⼤大⼩小排序，每个区间的最⼩小值⼤大于等于上⼀一个区间的最⼤大值。
 从后向前扫⼀一遍，找出每个位置之后的最⼩小值，时空O(n)。
 再从前往后扫⼀一边，如果某⼀一个区间的最⼤大值⼩小于之后的所有值，那就切⼀一⼑刀。

 Leetcode 769
 * */
public class Prob2 {
}
