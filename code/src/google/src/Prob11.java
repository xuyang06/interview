package google.src;

/**
 * Created by yangxu on 8/4/18.
 *
 * 1.n*n 的digit matrix，从⼀一个点开始，往周围⼋八个⽅方向都可以⾛走，⾛走出⼀一个数字，然后求这
 个digit matrix ⾥里里⾯面出现次数最多的素数，boolean isPrime()不不⽤用写
 思路路
 ● 可以暴暴⼒力力计算
 ● 也可以倒着⾛走来进⾏行行部分加速
 Follow up
 ● 如果求的是出现最多的数呢？同样可以暴暴⼒力力求解
 2.有⼀一个b-tree，其中有且只有⼀一个节点有两个⽗父节点，也就是两个⽗父节点有同样的⼉儿⼦子，
 找到这个错误的节点并返回⼀一个正确的树。
 思路路
 ● 记录⼀一个节点是否被访问过
 Follow up
 ● 如果是BST 呢？⼀一样判断
 3.spellcheck，给你⼀一个词，返回词典⾥里里所有和它edit distance <= 2 的词，如果词典⾥里里有
 了了，那就只返回它本身
 思路路
 ● 可以构建Tri-Tree，然后记录mismatch 的数量量进⾏行行遍历
 Follow up
 ● 如果给你的是⼀一个句句⼦子呢，句句⼦子⾥里里⾯面能有最多两个char 不不同？也是⼀一样，但是每次新
 word 都要从头继续扫⼀一遍，我们可以记录之前的情况有⼏几个diff

 */
public class Prob11 {
}
