package google.src;

/**
 * Created by yangxu on 8/4/18.
 * 给定⼀一个矩形的⻓长宽，⽤用多少种⽅方法可以从左上⻆角⾛走到右上⻆角（每⼀一步，只能向正右、右上或右
 下⾛走）；
 follow up：如果给矩形⾥里里的三个点，要求解决上述问题的同时，遍历这三个点；
 follow up：如何判断这三个点是合理理的，即存在遍历这三个点的路路经；
 follow up：如果给你⼀一个H，要求你的路路径必须向下越过H 这个界。
 Dp/bfs/dfs
 Follow up 1: 存路路径，检验3 个点在路路径中
 Follow up 2: 3 个点按y 排序，检验x？随y 增加⽽而增加
 Follow up 3: h 定义是啥？Y 值？如果y 值太⼤大，左上⻆角可能回不不到右上⻆角，先按y 值算x 的限
 定值。E.g.在x = x1 时，如果y < h，dfs 需要返回上⼀一级
 *
 * */
public class Prob1 {
}
