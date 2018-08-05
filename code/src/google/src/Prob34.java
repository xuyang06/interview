package google.src;

/**
 * Created by yangxu on 8/4/18.
 *
 * 1.给⼀一个sorted key-value pairs，例例如[1-43, 2-34, 6-23, 8-22, 11-90, 14-7, 18-20]，然后
 再给⼀一个list of range length，例例如[5,10,5]，要求按照这个range ⻓长度把之前的key 拆成三组：
 [0,5),[5,15),[15,20)，所以返回结果应该是[[1-43, 2-34], [6-23, 8-22, 11-90, 14-7], [18-20]]。
 Followup：如果value 不不是数字怎么办，要求我改成template。
 Followup：如果key 不不是sorted 怎么办，
 LogK * N(倒过来放)
 2.⼀一个binary tree 如果多了了多余的edge 变成了了graph，想办法把多余的edge 删掉变成valid
 binary tree。
 Followup：⽤用bfs 实现。
 3.有⼀一个游乐园（2d matrix），有空地，也有已经建成了了的游乐设施（对应的单个坐标标记上），
 还有障碍物（对应的单个坐标不不能⾛走），然后在游乐园⾥里里⾯面⾛走路路只能上下左右。问如果新建⼀一个
 游乐设施，怎样让它距离已有的游乐设施距离总和最短。
 4.如果有⼀一个n*n 的正⽅方形，⾥里里⾯面有多少个⼩小正⽅方形（包括本身）。
 followup 如果是m*n 的⻓长⽅方形呢
 followup 如果这个⻓长⽅方形⾥里里⾯面有些格⼦子是灰⾊色的，然后灰⾊色的格⼦子不不能出现在⼩小正⽅方形⾥里里⾯面怎么
 办。
 5.要找⼀一个binary tree 最⼤大的两个identical subtree。
 地址：
 http://www.1point3acres.com/bbs/forum.php?mod=viewthread&tid=417466&extra=page%
 3D4%26filter%3Ddateline%26orderby%3Ddateline%26sortid%3D311%26sortid%3D311%2
 6orderby%3Ddateline
 merkle tree
 */
public class Prob34 {
}
