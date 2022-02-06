package simple;

public class SearchInsert {
    public static void main(String[] args) {
        /*
        *给定一个排序数组和一个目标值，在数组中找到目标值，并返回其索引。如果目标值不存在于数组中，返回它将会被按顺序插入的位置。
        *请必须使用时间复杂度为 O(log n) 的算法。
        */
        int [] nums ={1,3,5,6};
        int target=5;
        int flag;
        //暴力解法
        //flag=testSearchInsert(nums,target);
        //二分查找
        flag=testBinarySearch(nums,target);
        System.out.println(flag);
        //java除法默认向下取整
        //System.out.println(9/2);
    }
    //二分查找
    private static int testBinarySearch(int[] nums, int target) {
        int len=nums.length;
        int left=0;
        int right=len-1;
        //單獨處理最後一個元素
        if (nums[len - 1] < target) {
            return len;
        }
        //當left等於right終止循環
        //将数组元素遍历完
        //找到第一个大于target的下标
        while(left<right){//作闭右开区间[left,right)当left=right区间无效
            //int middle=(left+right)/2;
            int middle=left+(right-left)/2;
            //int middle=left+(right-left)>>2;
            //最後一個target大於nums[middle]
            if (nums[middle]<target){
                left=middle+1;//下一次的搜索範圍[middle+1,right]
            }else{//nums[middle]>=target
                right=middle;//下一次的搜索範圍[left,middle]
            }
        }
        return left;
    }

    //暴力解法
    private static int testSearchInsert(int[] nums, int target) {
        int len=nums.length;
        int i=0;
        //找到第一个大于target的下标
        for (; i < len; i++) {
            if (nums[i]<target) {
                continue;
                //target比後面的一個元素
            }else if (nums[i]>=target){
                return i;
            }
        }
        return i;
    }
}
