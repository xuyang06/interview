package google.src;

/**
 * Created by yangxu on 8/4/18.
 * 1.⼀一个image 以2D byte array 的⽅方式储存（byte[][] image），每个象素点是1 个bit（0 或1）。
 现在要求每⾏行行的象素点做对称翻转。
 2. game of life 变形，⼀一个2D matrix 只有0 或1，要求把所有上下左右被1 包围的1 变成0。先
 给了了个space O（n^2）暴暴⼒力力解，然后让优化空间，就说了了⽤用两个bit 存放前后state 的⽅方法，
 space 变O（1），但⾯面试官说假设每个格⼦子只有⼀一个bit 空间怎么办？答三⾏行行三⾏行行做，他说⾏行行。
 3.设计⼀一个interface 实现有timestamp 的hashmap，即（key，value，time），写出get 和
 put ⽅方法。过期的key value pair 不不能被get。
 4. ⾯面经题，给⼀一个国王家的family tree （n-ary tree），王位继承是先传国王最年年⻓长的⼉儿⼦子，假
 如最年年⻓长⼉儿⼦子死了了，就传给他最年年⻓长的⼉儿⼦子。。。如果这些⼈人都不不存在，再考虑国王次年年⻓长的⼉儿
 ⼦子，以此类推。要求设计这样⼀一棵树，死掉的⼈人不不要求删除，实现birth（）和输出王位继承顺序
 的method（死掉的⼈人不不在继承顺序结果⾥里里）。
 地址：
 http://www.1point3acres.com/bbs/forum.php?mod=viewthread&tid=409626&extra=page%
 3D4%26filter%3Ddateline%26orderby%3Ddateline%26sortid%3D311%26sortid%3D311%2
 6orderby%3Ddateline
 */
public class Prob26 {
}
