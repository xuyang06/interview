package google.src;

/**
 * Created by yangxu on 8/4/18.
 *
 * 1.[LeetCode,399] Equations are given in the format A / B = k, where A and B are variables
 represented as strings, and k is a real number (floating point number). Given some queries,
 return the answers. If the answer does not exist, return -1.0.
 Example:
 Given a / b = 2.0, b / c = 3.0.
 queries are: a / c = ?, b / a = ?, a / e = ?, a / a = ?, x / x = ? .
 return [6.0, 0.5, -1.0, 1.0, -1.0 ].
 The input is: vector<pair<string, string>> equations, vector<double>& values,
 vector<pair<string, string>> queries , where equations.size() == values.size(), and the
 values are positive. This represents the equations. Return vector<double>.
 According to the example above:
 equations = [ ["a", "b"], ["b", "c"] ],
 values = [2.0, 3.0],
 queries = [ ["a", "c"], ["b", "a"], ["a", "e"], ["a", "a"], ["x", "x"] ].
 The input is always valid. You may assume that evaluating the queries will result in no
 division by zero and there is no contradiction.
 2．系统给⼀一个log 输⼊入，每⼀一条是时间，ID 和说的话， 统计说话字数最多的⼈人。
 3.⼀一个树有⼀一个edge 是多余的。找出并移除。
 地址：
 http://www.1point3acres.com/bbs/forum.php?mod=viewthread&tid=427167&extra=page%
 3D1%26filter%3Ddateline%26orderby%3Ddateline%26sortid%3D311%26sortid%3D311%2
 6orderby%3Ddateline
 */
public class Prob58 {
}
