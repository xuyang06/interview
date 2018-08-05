/*************************************************************************
 *
 * Copyright (c) 2016, DATAVISOR, INC.
 * All rights reserved.
 * __________________
 *
 * NOTICE:  All information contained herein is, and remains
 * the property of DataVisor, Inc.
 * The intellectual and technical concepts contained
 * herein are proprietary to DataVisor, Inc. and
 * may be covered by U.S. and Foreign Patents,
 * patents in process, and are protected by trade secret or copyright law.
 * Dissemination of this information or reproduction of this material
 * is strictly forbidden unless prior written permission is obtained
 * from DataVisor, Inc.
 */

package uber.src;

/**
 * https://www.1point3acres.com/bbs/forum.php?mod=viewthread&tid=457783&extra=page%3D1%26filter%3Dsortid%26sortid%3D311%26searchoption%5B3046%5D%5Bvalue%5D%3D22%26searchoption%5B3046%5D%5Btype%5D%3Dradio%26sortid%3D311%26orderby%3Ddateline
 * <p>
 * 第一轮hiring manager，因为起得太早整个脑子都是乱的，开始胡说八道。就开始问项目，
 * 最challenge的是什么，怎么解决的，用什么方法解决。
 * 强烈建议挑一个pj好好练一下，一不小心说了一个自己不怎么熟的结果被问倒。感觉这一轮非挂不可。
 * <p>
 * <p>
 * 第二轮coding，没做过，如果lc有原题求告知～。给你一个array，每个数字代表工作量。
 * 再给一个K，表示最多几天做完。要minimize 每天工作量的max。
 * 比如说给你[1,2,3],要一天内做完，那么答案就是6，要两天内做完的话，
 * 可以第一天做1，第二天做5，也可以第一天做3，第二天做3。
 * 这种情况下output是min{max{1, 5}, max{3, 3}} = 3。挺难的，好在小哥给了好多引导，谢谢小哥～
 * <p>
 * <p>
 * 第三轮是coding，第一题给定一些起点和终点，要求把他们连在一起，比如说a->b,
 * c->a, d->c，因为output d->c->a->b，讨论了一些corner case。
 * <p>
 * topological sort
 * <p>
 * 第二题search element in rotated array。 这一轮要求coderpad跑case。
 * <p>
 * leetcode 33
 * <p>
 * <p>
 * <p>
 * 第四轮coding+design，给一些log，表示用户的上下线时间，要求print出每个时间点在线用户的数量，
 * 挺简单的，就是想复杂了。然后问design，写一些interface，
 * 如果不停有新的log进来怎么处理，用什么数据结构，
 * 怎么节省空间和query的时间。是一个挺senior的小哥，
 * 人真的非常nice，一直在引导我，还和我说我做得很不错。
 * 面完被送出uber大楼的时候还一直问我要不要拿点吃的路上吃，还说现在小孩不容易，人真的很好很好很好了！
 */

public class Prob76 {

    /**
     * copy book: https://zhengyang2015.gitbooks.io/lintcode/copy_books_437.html
     *
     *
     * Given an array A of integer with size of n( means n books and number of pages of each book)
     * and k people to copy the book. You must distribute the continuous
     * id books to one people to copy. (You can give book A[1],A[2] to one people,
     * but you cannot give book A[1], A[3] to one people,
     * because book A[1] and A[3] is not continuous.) Each person have can copy
     * one page per minute. Return the number of smallest minutes need to copy all the books.
     */

    /**
     * Example
     * Given array A = [3,2,4], k = 2.
     * Return 5( First person spends 5 minutes to copy book 1 and book 2 and
     * second person spends 4 minutes to copy book 3. )
     *
     * Challenge
     * Could you do this in O(n*k) time ?
     *
     * */

    /**
     * 第一种DP建立一个二维数组(n+1 * k+1)，T[i][j]表示前i本书分配给j个人copy。
     * 初始化T[1][j]=pages[0]，初始化T[i][1]= pages[0] + pages[1] + ... + pages[i-1]
     * 然后从2本书开始到n本书为止，依次计算分配给2～k个人的最小时间。
     * 当人数比书大时，有些人不干活也不会影响速度，因此和少一个人情况相同。
     * 对于新加进来的人j，考虑让前j－1个人copy的书的数量h（0～n），
     * 则新进来的人相应的copy的数量为n～0本，前者的时间为T[h][j-1]，
     * 后者的时间为T[i][1]-T[h][1]（即一个人copy从h＋1到i本需要的时间），
     * 两者的较大值即为T[i][j]的一个后选项。选择所有后选项中的最小值即为T[i][j]的值。
     * 这里可以优化，即我们知道如果前j－1个人copy的书的数量少于j－1必然有人不干活，
     * 而所有人都干活的结果一定会更快，所以h的范围可以从j－1～n，
     * 因为我们知道h为0～j－1时的结果一定不会是最优的答案。
     */

    public static int copyBooks1(int[] pages, int k) {
        int n = pages.length;
        int[][] times = new int[n + 1][k + 1];

        for (int i = 1; i <= k; i++) {
            times[1][i] = pages[0];
        }

        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += pages[i - 1];
            times[i][1] = sum;
        }

        for (int i = 2; i <= n; i++) {
            for (int j = 2; j <= k; j++) {
                if (j > i) {
                    times[i][j] = times[i][j - 1];
                    continue;
                }
                int min = Integer.MAX_VALUE;
                for (int h = j - 1; h <= i; h++) {
                    int tmp = Math.max(times[h][j - 1], times[i][1] - times[h][1]);
                    min = Math.min(tmp, min);
                }
                times[i][j] = min;
            }
        }
        return times[n][k];
    }

    /**
     * 第二种方法很巧妙地用到了二分搜索的方法。我们要找的最优解是某一个时间的临界点，
     * 当时间小于这个值时，k个人一定不可能完成任务，当时间大于等于这个值时，则可以完成。
     * 首先将时间的范围设为所有整数（0～99999999）。计算中点作为这次的假设时间临界点，
     * 尽量让每个人的工作时间都接近这个临界点。
     * 假设当前某个人之前分配的书的页数加上当前书的页数小于当前临界点，则直接把这本书分配给这个人
     * 而不会影响最优解；
     * <p>
     * 若大于，则看当前书的页数是否大于临界点： 1）若大于，则说明当前的临界值太小，连这本书都不能copy完全，
     * 所以最优解一定大于当前临界点，因此要增大临界点再重复2 2）若小于，则将书分配给下一个人copy
     * 若所有书分配完时，所需要的人数比k小（即还剩下人没用），则说明每个人干活的时间太多，
     * 最优时间一定比当前值小，反之则说明每个人干活的时间太少，最优时间比当前值大
     * 考虑3-4中的所有情况，若最优解比当前临界点小，则向当前临界点左半边搜索，
     * 否则向当前临界点右半边搜索，直到左右边界重合，此时的临界点（即左右边界）即为最优解。
     */

    public static int copyBooks2(int[] pages, int k) {
        int l = 0, r = 9999999;
        while (l < r) {
            int m = l + (r - l) / 2 + 1;
            if (search(m, pages, k)) {
                r = m;
            } else {
                l = m + 1;
            }
        }
        return l;
    }

    private static boolean search(int total, int[] pages, int k) {
        int count = 1, sum = 0, i = 0;
        while (i < pages.length) {
            if (sum + pages[i] <= total) {
                sum += pages[i++];
            } else if (pages[i] <= total) {
                sum = 0;
                count++;
            } else {
                return false;
            }
        }
        return count <= k;
    }

}
