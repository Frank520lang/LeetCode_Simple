package datastructure;

/**
 * @author Administrator
 */
public class BinarySearch {
    public static void main(String[] args) {
        //有序数组
        int[] arr = {1, 3, 7, 8, 8, 8, 8, 9, 10, 19};
        int value = 8;
        //System.out.println("二分查找：" + testBinarySearch(arr, value));
        //System.out.println("二分查找：" + BoHuiBinarySearch(arr, value));
        //System.out.println("二分查找：" + LeftBinarySearch(arr, value));
        System.out.println("二分查找：" + RightBinarySearch(arr, value));
    }

    /**
     * 搜索右边边界
     */
    public static int RightBinarySearch(int[] arr, int value) {
        int length = arr.length;
        int left = 0;
        int right = length;
        while (left < right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] == value) {
                //关键
                left = mid + 1;
            } else if (arr[mid] > value) {
                right = mid;
            } else if (arr[mid] < value) {
                left = mid + 1;
            }
        }
        return arr[left - 1] == value ? left - 1 : -1;
    }

    /**
     * 搜索左边界
     */
    public static int LeftBinarySearch(int[] arr, int value) {
        int length = arr.length;
        //搜索区间【left，right）
        int left = 0;
        int right = length;
        //终止条件left=right
        while (left < right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] == value) {
                right = mid;
            } else if (arr[mid] > value) {
                right = mid;
            } else if (arr[mid] < value) {
                left = mid + 1;
            }
        }
        return arr[left] == value ? left : -1;
    }

    /**
     * 二分查找的临界条件(low<hight)
     * 二分查找针对的是有序数组
     */

    public static int BoHuiBinarySearch(int[] arr, int value) {
        int length = arr.length;
        int left = 0;
        //确定搜索区间的有边界，可以取到
        int right = length - 1;
        //终止条件是 left == right + 1，写成区间的形式就是 [right + 1, right]，或者带个具体的数字进去 [3, 2]，可见这时候搜索区间为空，
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] < value) {
                left = mid + 1;
            } else if (arr[mid] > value) {
                right = mid - 1;
            } else if (arr[mid] == value) {
                return mid;
            }
        }
        return -1;
    }

    /**
     * 二分查找的临界条件(low<hight)
     * 二分查找针对的是有序数组
     */
    private static int testBinarySearch(int[] arr, int value) {
        int length = arr.length;
        int low = 0;
        int hight = length - 1;
        //当hight=low时结束循环
        //搜索区间【left，right）
        while (low <= hight) {
            //整型溢出
            //int mid = (low + hight) / 2;
            //避免整型溢出
            int mid = low + (hight - low) / 2;

            int flag = arr[mid];
            if (flag == value) {
                return mid;
            } else if (flag < value) {
                low = mid + 1;
            } else if (flag > value) {
                hight = mid - 1;
            }
        }
        // 不在循环结束就返回-1，找不到
        return -1;

    }

}
