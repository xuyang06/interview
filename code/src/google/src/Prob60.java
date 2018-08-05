package google.src;

/**
 * Created by yangxu on 8/4/18.
 *
 * 1.公交⻋车站⾥里里⾯面有若⼲干公共汽⻋车，类似这样 terminal:{bus1, bus2, bus3, ...}， bus 是⼀一个类， 有
 int id, String company name 和⼀一个出发时间 int time. 然后让实现⼏几个函数 ： add(bus) 向⼀一
 个⻋车站⾥里里加⼊入⼀一辆⻋车，getnext() 得到下⼀一辆出发的⻋车， dispatch() 让下⼀一辆⻋车从⻋车站出发,
 removeAll(company) 除掉⻋车站中某⼀一个公司的所有⻋车。 每个函数的时间复杂度。
 follow up：⾃自⼰己实现priority queue 来实现上⾯面的每个函数。
 2. 判断⼀一个⼆二叉树是否是完全⼆二叉树。
 3. 给⼀一个sorted array，构建完全⼆二叉树。
 4.A, B 两个⼈人从左到右拿卡，每个卡上有分数，每个⼈人能拿1 - 3 张，问A 最多能拿到的分数。
 分数可以是负数。
 5.N 个很⼤大的file ⾥里里⾯面都是数, 和⽆无限多个machine. 有⼀一个函数 : int computeSum(fileID,
 machineID) 可以让⼀一个机器器计算⼀一个file ⾥里里⾯面数的和。 最后求所有N 个file 的总和。
 follow up: machine 会有硬件原因卡住⽆无法出结果， 然后computeSum 会return 多⼀一个status,
 来告诉你是不不是有故障。 问code 如何改进来避免卡住超时。
 follow up: computeSum 这个函数有p 的概率计算结果是错的，如果改进让总结果错误率⼩小于p.
 地址：
 http://www.1point3acres.com/bbs/forum.php?mod=viewthread&tid=426968&extra=page%
 3D2%26filter%3Ddateline%26orderby%3Ddateline%26sortid%3D311%26sortid%3D311%2
 6orderby%3Ddateline
 */
public class Prob60 {
}
