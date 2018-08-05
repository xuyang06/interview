package google.src;

/**
 * Created by yangxu on 8/4/18.
 *
 * 1. 在⼀一个grid ⾥里里，给两个list，分别是bikes 和⼈人的坐标，以及⾃自⼰己当前的坐标。grid ⾥里里的每个
 ⼈人都去拿距离⾃自⼰己最近的bike。返回⾃自⼰己应该去取的⾃自⾏行行⻋车的坐标。
 分治法求最近点对
 2. [LeetCode,815] We have a list of bus routes. Each routes[i] is a bus route that the i-th
 bus repeats forever. For example if routes[0] = [1, 5, 7], this means that the first bus (0-th
 indexed) travels in the sequence 1->5->7->1->5->7->1->... forever.
 We start at bus stop S (initially not on a bus), and we want to go to bus stop T. Travelling
 by buses only, what is the least number of buses we must take to reach our destination?
 Return -1 if it is not possible.
 Example:
 Input:
 routes = [[1, 2, 7], [3, 6, 7]]
 S = 1
 T = 6
 Output: 2
 根据bus 的停靠站的重合来构建遍，BFS 问题
 3. [LeetCode,486]Given an array of scores that are non-negative integers. Player 1 picks
 one of the numbers from either end of the array followed by the player 2 and then player 1
 and so on. Each time a player picks a number, that number will not be available for the
 next player. This continues until all the scores have been chosen. The player with the
 maximum score wins.
 Given an array of scores, predict whether player 1 is the winner. You can assume each
 player plays to maximize his score.
 Example 1:
 Input: [1, 5, 2]
 Output: False
 Explanation: Initially, player 1 can choose between 1 and 2.
 If he chooses 2 (or 1), then player 2 can choose from 1 (or 2) and 5. If player 2 chooses 5,
 then player 1 will be left with 1 (or 2).
 So, final score of player 1 is 1 + 2 = 3, and player 2 is 5.
 Hence, player 1 will never be the winner and you need to return False.
 Example 2:
 Input: [1, 5, 233, 7]
 Output: True
 Explanation: Player 1 first chooses 1. Then player 2 have to choose between 5 and 7. No
 matter which number player 2 choose, player 1 can choose 233.
 Finally, player 1 has more score (234) than player 2 (12), so you need to return True
 representing player1 can win.
 Note:
 1. 1 <= length of the array <= 20.
 2. Any scores in the given array are non-negative integers and will not exceed
 10,000,000.
 3. If the scores of both players are equal, then player 1 is still the winner.
 演绎模型，对于区间[x,y]的最优解由取左边或者取右边决定
 地址：
 http://www.1point3acres.com/bbs/forum.php?mod=viewthread&tid=424260&extra=page%
 3D2%26filter%3Ddateline%26orderby%3Ddateline%26sortid%3D311%26sortid%3D311%2
 6orderby%3Ddateline
 */
public class Prob40 {
}
