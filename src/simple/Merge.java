package simple;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * @author Administrator
 * Frank_2022.3.18
 */
public class Merge {
    public static void main(String[] args) {
        int[] nums1 = {1, 2, 3, 0, 0, 0};
        int[] nums2 = {2, 5, 6};
        int m = 3;
        int n = 3;
        //利用數組的排序算法
        //int[] result1 = testMerge1(nums1, m, nums2, n);
        //利用雙指針，合併兩個有序數組
        int[] result2 = testMerge2(nums1, m, nums2, n);
        System.out.println(Arrays.toString(result2));

    }

    private static int[] testMerge2(int[] nums1, int m, int[] nums2, int n) {
        int p1 = 0;
        int p2 = 0;
        int cur;
        //中間數組
        int[] temp = new int[m + n];
        //若运算符左边为true，则不再对运算符右侧进行运算
        while (p1 < m || p2 < n) {
            if (p1 == m) {
                cur=nums2[p2];
                p2++;
            }else if (p2 == n) {
                cur=nums1[p1];
                p1++;
            }else if (nums1[p1] < nums2[p2]) {
                cur=nums1[p1];
                p1++;
            }else{
                cur=nums2[p2];
                p2++;
            }
            temp[p1+p2-1]=cur;
        }
        for (int i = 0; i <temp.length ; i++) {
            nums1[i]=temp[i];
        }
        return nums1;
    }

    /**
     * 给你两个按 非递减顺序 排列的整数数组 nums1 和 nums2，另有两个整数 m 和 n ，分别表示 nums1 和 nums2 中的元素数目。
     * 请你 合并 nums2 到 nums1 中，使合并后的数组同样按 非递减顺序 排列。
     * 最终，合并后数组不应由函数返回，而是存储在数组 nums1 中。为了应对这种情况，nums1 的初始长度为 m + n，其中前 m 个元素表示应合并的元素，后 n 个元素为 0 ，应忽略。nums2 的长度为 n 。
     *
     * @return
     */
    private static int[] testMerge1(int[] nums1, int m, int[] nums2, int n) {
        for (int i = 0; i < n; i++) {
            nums1[m + i] = nums2[i];
        }
        Arrays.sort(nums1);
        return nums1;

    }
}
