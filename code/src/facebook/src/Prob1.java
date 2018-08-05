package facebook.src;

/**
 * Created by yangxu on 8/4/18.
 * <p>
 * 判断是否为numeronym，⽐比如
 * isNumeronym("f6k", "facebook") -> true
 * isNumeronym("f2e3k", "facebook") -> true
 * isNumeronym("f2e", "facebook") -> false
 * 思路路：
 * ● 构建模型，扫描左侧字符串串，进⾏行行⽐比较，碰到数字则跳过右侧对应的个数。
 * 考点：
 * ● 能否想到数字代表跳过
 * ● 注意⻓长度超过1 的数字
 * ● 如何处理理数字0
 * Follow up
 * 如果左右两侧都能够有数字缩写怎么办？
 * 可以使⽤用特殊的符号表示跳过
 * 如果左右两侧同时出现超⼤大数字怎么办？
 * 不不能进⾏行行遍历，需要计算diff
 * 给你⼀一套规则，针对⼀一个单词构建numeronym？
 * 使⽤用构建模型进⾏行行判断。
 * 给⼀一个array of points [[1,3], [2,5], [3,3], [1,0], [1,1], [5,5]], target = k，求 k nearest
 * neighbors for (0, 0)
 * 思路路
 * ● 每个点到原点是sqrt(a^2+b^2)，可以⽤用heap 进⾏行行计算。
 * 考点：
 * ● 能否想通虽然是(x,y)，从距离来看，依然是⼀一个数字
 * ● 能否逐步从排序的O(N*logN)，优化到O(N*logK)
 * ● 能否注意到可能的数字越界
 * Follow up
 * 如何针对任何⼀一个点进⾏行行距离排序？
 * ⼀一回事
 * 如何只选择第k ⼩小的？
 * Quick-select
 * 如果N 特别⼤大呢？
 * 可以⾸首先选择第k ⼩小的，然后对前k 个排序，因此是O(n+K*logK)
 */
public class Prob1 {
    private static int randomPivot(int l, int r) {
        return l + (int) Math.floor(Math.random() * (r - l + 1));
    }

    public static int selectIterative(int[] array, int n) {
        return iterative(array, 0, array.length - 1, n);
    }

    private static int iterative(int[] array, int l, int r, int n) {
        if (l == r) {
            return array[l];
        }
        for (; ; ) {
            int pivotInd = randomPivot(l, r);
            pivotInd = partition(array, l, r, pivotInd);
            if (n == pivotInd) {
                return array[n];
            } else if (n < pivotInd) {
                r = pivotInd - 1;
            } else {
                l = pivotInd + 1;
            }
        }
    }

    public static int selectRecursive(int[] array, int n) {
        return recursive(array, 0, array.length - 1, n);
    }

    private static int recursive(int[] array, int l, int r, int n) {
        if (l == r) {
            return array[l];
        }
        int pivotInd = randomPivot(l, r);
        pivotInd = partition(array, l, r, pivotInd);
        if (pivotInd == n) {
            return array[n];
        } else if (n < pivotInd) {
            return recursive(array, l, pivotInd - 1, n);
        } else {
            return recursive(array, pivotInd + 1, r, n);
        }
    }

    private static int partition(int[] array, int l, int r, int pivotInd) {
        int pivotVal = array[pivotInd];
        swap(array, pivotInd, r);
        int storeInd = l;
        for (int i = l; i < r; i++) {
            if (array[i] < pivotVal) {
                swap(array, storeInd, i);
                storeInd++;
            }
        }
        swap(array, r, storeInd);
        return storeInd;
    }

    public static void quickSort(int[] array) {
        quickSort(array, 0, array.length - 1);
    }

    public static void quickSort(int[] array, int l, int r) {
        if (l >= r) {
            return;
        }
        int pivotInd = randomPivot(l, r);
        pivotInd = partition(array, l, r, pivotInd);
        quickSort(array, l, pivotInd - 1);
        quickSort(array, pivotInd + 1, r);
    }

    private static void swap(int[] array, int l, int r) {
        int tmp = array[l];
        array[l] = array[r];
        array[r] = tmp;
    }

    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] array = { 9, 8, 7, 6, 5, 1, 2, 3, 4 };
        System.out.println(selectIterative(array, 3));
        printArray(array);
        array = new int[] { 9, 8, 7, 6, 5, 1, 2, 3, 4 };
        quickSort(array);
        printArray(array);
    }

}
