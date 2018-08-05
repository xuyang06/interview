package google.src;

/**
 * Created by yangxu on 8/4/18.
 *
 * 1.给⼀一个⻓长度为N 的数组A，数组每个元素是0 到N-1 之间的整数，A[i] = j 表示数组j 号元素的
 排名在i 的前⾯面，且A[i] = -1 表示i 是第⼀一名。给出数组A，求所有数组元素的完整排名。例例如
 输⼊入A = [2,3,-1,0,1]，输出B = [2,0,3,1,4]。
 Follow up 1: 你原来的做法⽤用了了hashmap（避免下标为-1 的情况），能否直接⽤用数组来做？
 Follow up 2: 如何不不⽤用计算完整排名，推出排名垫底的元素？
 2.给两组坐标，例例如A 组(0,0), (0,1), (0,-1)，B 组(0,0), (0,2), 求⼀一个坐标(x,y)，使A 组的坐标偏
 移(x,y)之后尽可能多得和B 组坐标相等。例例如样例例数据的结果是(0,1)，有两对坐标可以匹配。
 3.给⼀一组字符串串，每个字符串串有⼀一个排名值v，⽤用hashmap 表示就是
 unordered_map<string,int>。给⼀一个input string，求以input string 为前缀的top 5 字符串串。
 地址：
 http://www.1point3acres.com/bbs/forum.php?mod=viewthread&tid=426657&extra=page%
 3D2%26filter%3Ddateline%26orderby%3Ddateline%26sortid%3D311%26sortid%3D311%2
 6orderby%3Ddateline
 */
public class Prob63 {
}
