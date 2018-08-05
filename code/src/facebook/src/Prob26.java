/*************************************************************************
 *
 * 1. [LeetCode,785]Given an undirected graph, return true if and only if it is bipartite.
 Recall that a graph is bipartite if we can split it's set of nodes into two independent
 subsets A and B such that every edge in the graph has one node in A and another node in
 B.
 The graph is given in the following form: graph[i] is a list of indexes j for which the edge
 between nodes iand j exists. Each node is an integer between 0 and graph.length - 1.
 There are no self edges or parallel edges: graph[i] does not contain i, and it doesn't
 contain any element twice.
 Example 1:
 Input: [[1,3], [0,2], [1,3], [0,2]]
 Output: true
 Explanation:
 The graph looks like this:
 0----1
 | |
 | |
 3----2
 We can divide the vertices into two groups: {0, 2} and {1, 3}.
 地址：
 http://www.1point3acres.com/bbs/forum.php?mod=viewthread&tid=426912&extra=page%
 3D2%26filter%3Ddateline%26orderby%3Ddateline%26sortid%3D311%26sortid%3D311%2
 6orderby%3Ddateline
 */

package facebook.src;

public class Prob26 {
    /**
     * N + E time complexity DFS + BFS
     * */
}
