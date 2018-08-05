/*************************************************************************
 *
 * 1.给⼀一个list, [8, 4, 3] 求 ⽐比他⼩小的permutation ⾥里里⾯面最⼤大的⼀一个..
 地址：
 http://www.1point3acres.com/bbs/forum.php?mod=viewthread&tid=426701&extra=page%
 3D2%26filter%3Ddateline%26orderby%3Ddateline%26sortid%3D311%26sortid%3D311%2
 6orderby%3Ddateline
 */

package facebook.src;

public class Prob27 {

    /**
     * [8, 4, 3] -> [8, 3, 4]
     * [8, 4, 3, 5] -> [8, 3, 5, 4]
     * [8, 4, 1, 3, 5, 6] -> [8, 3, 1, 4, 5, 6] -> [8, 3, 6, 5, 4, 1]
     */

    public static void previousPermutation(int[] nums) {
        if (nums == null || nums.length <= 1) {
            return;
        }
        int r = nums.length - 1;
        while (r > 0 && nums[r - 1] <= nums[r]) {
            r--;
        }
        if (r == 0) {
            reverse(nums, 0, nums.length - 1);
            return;
        }
        int pivot = r - 1;
        r = nums.length - 1;
        while (r > pivot && nums[r] >= nums[pivot]) {
            r--;
        }
        swap(nums, pivot, r);
        reverse(nums, pivot + 1, nums.length - 1);
    }

    private static void reverse(int[] nums, int l, int r) {
        while (l < r) {
            swap(nums, l++, r--);
        }
    }

    private static void swap(int[] nums, int l, int r) {
        int tmp = nums[l];
        nums[l] = nums[r];
        nums[r] = tmp;
    }

    public static void main(String[] args) {
        int[] nums = { 8, 4, 1, 3, 5, 6 };
        previousPermutation(nums);
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }
        System.out.println();
    }
}
