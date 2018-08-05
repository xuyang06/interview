/*************************************************************************
 *
 * 1. [LeetCode,15]Given an array nums of n integers, are there elements a, b, c in nums such
 that a + b + c = 0? Find all unique triplets in the array which gives the sum of zero.
 地址：
 http://www.1point3acres.com/bbs/forum.php?mod=viewthread&tid=426435&extra=page%
 3D3%26filter%3Ddateline%26orderby%3Ddateline%26sortid%3D311%26sortid%3D311%2
 6orderby%3Ddateline
 */

package facebook.src;

public class Prob28 {

    /**
     * Two pointer
     * <p>
     * Corner case:
     * <p>
     * if (dividend == Integer.MIN_VALUE && divisor == -1) {
     * return Integer.MAX_VALUE;
     * }
     */

    public static void main(String[] args) {
        int l = -1;
        int r = 1;
        for (int i = 0; i < 32; i++) {
            System.out.println("l: " + l);
            System.out.println("r: " + r);
            System.out.println((l ^ r) & 1);
            l >>>= 1;
            r >>>= 1;
        }
    }
}
