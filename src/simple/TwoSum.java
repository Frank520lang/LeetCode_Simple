package simple;

/**
 * @author Administrator
 * @date 2021/01/07
 */
public class TwoSum {

    /**
     * 给定一个整数数组 nums 和一个整数目标值 target，请你在该数组中找出 和为目标值 的那 两个 整数，并返回它们的数组下标。
     */
    public TwoSum() {
        // TODO Auto-generated constructor stub
    }

    /**
     * @param args
     */
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        int[] nums = {3, 3};
        int[] test = twoSum(nums, 6);
        System.out.print("[ ");
        for (int i = 0; i < test.length; i++) {
            int j = test[i];
            System.out.print(+j + " ");
        }
        System.out.print("]");
    }

    //
    public static int[] twoSum(int[] nums, int target) {
        int index1 = 0;
        int index2 = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    index1 = i;
                    index2 = j;
                }

            }

        }
        int[] index = {index1, index2};
        return index;
    }
}
