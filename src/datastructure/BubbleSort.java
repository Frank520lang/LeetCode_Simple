package datastructure;

import java.util.Arrays;

/**
 * 冒泡排序
 *
 * @author Administrator
 */
public class BubbleSort {

    public static void main(String[] args) {
        int[] arr = {1, 5, 9, 4, 6, 2, 7,};
//        System.out.println(Arrays.toString(arr));
//        testBubbleSort(arr);
//        System.out.println(Arrays.toString(arr));
        HuiBoBubbleSort(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void HuiBoBubbleSort(int [] arr){
        for(int i=0;i<arr.length-1;i++){
            for(int j=0;j<arr.length-1-i;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }

    }
    /**
     * 参数为一个int类型的数组
     */
    public static void testBubbleSort(int[] arr) {
        //需要比较arr.length-1趟
        //随着趟数的增加比较的次数就减少，arr.length-1-趟数


        //i为需要比较的趟数
        for (int i = 0; i < arr.length - 1; i++) {
            //j为比较的次数
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    //暂存变量
                    int temp = arr[j];
                    //交换位置
                    arr[j] = arr[j + 1];
                    //
                    arr[j + 1] = temp;
                }
            }
        }
    }
}
