package facebook.src;

/**
 * Created by yangxu on 8/4/18.
 * <p>
 * 对⼀一个integer array ，找所有两两组合的bit difference 的sum
 * 思路路
 * ● 因为计算的是具体的bit 位的情况，因此我们可以统计每个具体的⽐比特上0 或者1 的个数，
 * 从⽽而⽤用排列列组合得到这⼀一位的最终值，然后求和。
 * 考点：
 * ● 能否按照bit 位进⾏行行拆解
 * ● 能否想到bit 位上排列列组合的数学公式
 * Follow up
 * 如果是三三组合进⾏行行xor 呢？
 * 只是更更改组合函数
 * 如果是⼀一个3 进制的数进⾏行行计算，要怎么做呢？
 * 本质是⼀一样的，只是组合的case 有所变化
 * Leetcode 477
 * <p>
 * 给⼀一个matrix，给你两个坐标点，求通过这两点切割出的两个区间的元素的个数
 * 思路路
 * ● 可以找出这条切割线，然后每⼀一⾏行行都进⾏行行判断，这样复杂度是O(n)
 * ● 可以进⼀一步利利⽤用数学的⽅方式判断节点在哪⼀一侧
 * 考点
 * ● 能够想到每⼀一⾏行行的判断
 * ● 能够⽤用数学公式进⾏行行优化
 * ● 能够处理理横着⼀一条线，或者竖着⼀一条线的情况
 * Follow up
 * 如果是两条线进⾏行行切割，求每⼀一个范围内节点的个数？
 * 每⼀一⾏行行最多有三个区间
 */
public class Prob2 {

    public static void main(String[] args) {
        System.out.println(1 ^ 1 ^ 0);
        System.out.println(1 ^ 0 ^ 1);
        System.out.println(0 ^ 0 ^ 1);
        System.out.println(0 ^ 0);
        System.out.println(0 ^ 1);
    }
}
