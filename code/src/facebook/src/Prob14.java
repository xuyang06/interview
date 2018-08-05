/*************************************************************************
 *
 * 在⼀一个⽆无序的数列列⾥里里⾯面，找到所有的subsets 的min 和max 的和⼩小于等于target，返回subsets
 的个数。可以优化到O(n).
 地址：
 http://www.1point3acres.com/bbs/forum.php?mod=viewthread&tid=409008&extra=page%
 3D4%26filter%3Ddateline%26orderby%3Ddateline%26sortid%3D311%26sortid%3D311%2
 6orderby%3Ddateline
 */

package facebook.src;

import java.util.Arrays;

public class Prob14 {

    private static int check2(int[] nums, int k) {
        int res = 0;
        if (nums == null || nums.length == 0) {
            return res;
        }
        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] <= k) {
                res += 1;
            }
        }
        int l = 0, r = nums.length - 1;
        while (l < r) {
            if (nums[l] + nums[r] > k) {
                r--;
            } else {
                res += (int) Math.pow(2, r - l) - 1;
                l++;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int[] nums = { 1, 5, 3, 6 };
        int k = 6;
        System.out.println(check2(nums, k));
    }

}
