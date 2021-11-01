package datastructure;

public class TestInsertSort {
    public static void main(String[] args) {
        insertSort();
    }

    //插入排序
    private static void insertSort() {
        int testArr[] = {23, 28, 98, 57, 26, 11, 30, 73};
        //wrongSort(testArr);
        trueSort(testArr);
        printTestArr(testArr);
    }

    //思路：
    //确定有序区域和无序区域
    //假定数组的第一个数为有序，其他的区域为无序区域
    //需要解决的问题：
//                    1.如何构造有序区域
//                    2.如何查找插入记录的插入位置
    private static void trueSort(int[] testArr) {
        int i;
        int j;
        //查找需要排序的元素
        //默认数组的第一个元素为有序区域，以后的区域为无序区域
        for (i = 1; i < testArr.length; i++) {
            //暂存需要插叙的元素,哨兵保证不会出现数组索引越界
            testArr[0] = testArr[i];
            //从有序去从前往后的去查找待排元素的插入位置
            //当无序区的数存在比有序去最小的数还小，就会出现数组索引越界，因此需要设置一个testArr[0]的哨兵，保证不会出现索引越界
            //如无序区遍历到11的时候就会出现索引越界
            for (j = i - 1; testArr[0] < testArr[j]; j--) {
                //记录往后移
                testArr[j + 1] = testArr[j];
            }
            //当testArr[0]>=testArr[j]的时候插入
            testArr[j + 1] = testArr[0];

        }
    }

    private static void printTestArr(int[] testArr) {
        for (int i : testArr) {
            System.out.println(i);
        }
//        for (int i = 0; i < testArr.length; i++) {
//            System.out.println(testArr[i]);
//        }
    }

    private static void wrongSort(int[] testArr) {
        int i;
        int j;
        //查找需要排序的元素
        //默认数组的第一个元素为有序区域，以后的区域为无序区域
        for (i = 1; i < testArr.length; i++) {
            //暂存需要插叙的元素
            int temp = testArr[i];
            //从有序去从前往后的去查找待排元素的插入位置
            //当无序区的数存在比有序去最小的数还小，就会出现数组索引越界，因此需要设置一个testArr[0]的哨兵，保证不会出现索引越界
            for (j = i - 1; temp < testArr[j]; j--) {
                //记录往后移
                testArr[j + 1] = testArr[j];
            }
            //当testArr[0]>=testArr[j]的时候插入
            testArr[j + 1] = temp;

        }

    }
}
