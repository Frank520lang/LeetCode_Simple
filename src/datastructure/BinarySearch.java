package datastructure;

public class BinarySearch {
  public static void main(String[] args) {
    // System.out.println("我爱你");
    int[] arr = { 1, 9, 3, 7, 3, 8 };
    int value = 3;
    int cat = testBinarySearch(arr, value);
    System.out.println("二分查找：" + cat);
  }
  /*
   * 二分查找的临界条件(low<hight)
   */
  private static int testBinarySearch(int[] arr, int value) {
    int length = arr.length;
    int low = 0;
    int hight = length - 1;
    //当hight>=low时结束循环
    while (low < hight) {
      int mid = (low + hight) / 2;
      int flag = arr[mid];
      if (value == flag)
        return mid;

      if (value < flag)
        hight = flag - 1;
      else
        low = flag + 1;
    }
    // 不在循环结束就返回-1，找不到
    return -1;

  }

}
