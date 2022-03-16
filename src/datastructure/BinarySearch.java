package datastructure;

public class BinarySearch {
  public static void main(String[] args) {
    // System.out.println("我爱你");
    //有序数组
    int[] arr = { 1, 3, 7, 8,9,10,19 };
    int value = 9;
    int cat = testBinarySearch(arr, value);
    System.out.println("二分查找：" + cat);
  }
  /*
   * 二分查找的临界条件(low<hight)
   */
  //二分查找针对的是有序数组
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
      int mid=low+(hight-low)/2;

      int flag = arr[mid];
      if (flag==value) {
        return mid;
      }
      else if (flag<value) {
        low = mid + 1;
      }
      else if (flag>value){
        hight = mid - 1;
      }
    }
    // 不在循环结束就返回-1，找不到
    return -1;

  }

}
