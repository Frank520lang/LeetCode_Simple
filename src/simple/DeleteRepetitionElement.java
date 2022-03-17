package simple;

//题目:原地删除排序数组中的重复项
public class DeleteRepetitionElement {
    public static void main(String[] args) {
        int [] arr = {1,1,2,2,2,3,4,5,5,6,7,7,8,9,10};
        int flag = deleteRepetitionElement(arr);
        System.out.println(flag);
    }
    public static int deleteRepetitionElement(int[] arr) {
        // 判断数组是否为空
        if (arr.length == 0) {
            return 0;
        }
        // 定义一个快指针,一个慢指针
        int i = 0;
        for (int j = 1; j < arr.length; j++) {
            //判断前指针和后指针是否相等
            if (arr[i] != arr[j]) {
                //i的变化
                i++;
                arr[i] = arr[j];
            }
            //arr[i] == arr[j]和arr[i] != arr[j]都需要j++
            //j++在这里
        }
        return i + 1;

        /* if (nums.length == 0) return 0;
        int i = 0;
        for (int j = 1; j < nums.length; j++) {
            if (nums[j] != nums[i]) {
                i++;
                nums[i] = nums[j];
            }
        }
        return i + 1;*/

    }

}
