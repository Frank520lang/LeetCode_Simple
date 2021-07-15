package simple;

//给定一个整数数组 nums ，找到一个具有最大和的连续子数组（子数组最少包含一个元素），返回其最大和。

//输入：nums = [-2,1,-3,4,-1,2,1,-5,4]
//        输出：6
//        解释：连续子数组 [4,-1,2,1] 的和最大，为 6 。

public class MaxSubArray {

    //暴力解题
    public static int baoLiMaxSubArray(int[] nums) {
        //先假定他的最大值是 int数的最小值
        int max = Integer.MIN_VALUE;
        //第一层for循环设置起始位置
        for (int i = 0; i < nums.length; i++) {
            //设置序列和的初始值
            int sum = 0;
            //每一个子序列都遍历出来了
            for (int j = i; j < nums.length; j++) {
                sum += nums[j];
                if (sum > max) {
                    max = sum;
                }
            }
        }
        //第二个额for循环遍历数组寻找最大值
        return max;
    }

    public static void main(String[] args) {
        test1();

    }

    private static void test1() {
        int nums[] = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        System.out.println("最大子序列和为："+baoLiMaxSubArray(nums));
    }
}
