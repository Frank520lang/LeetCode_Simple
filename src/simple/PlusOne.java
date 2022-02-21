package simple;

public class PlusOne {
    public static void main(String[] args) {
        int [] digits={8,9,9,9};
        //int cat[]=testPlusOne(digits);
        int []cat=testPlusOneByFrank(digits);
        for (int i = 0; i <cat.length ; i++) {
            System.out.print(cat[i]+",");
        }
    }
//    给定一个由 整数 组成的 非空 数组所表示的非负整数，在该数的基础上加一。
//    最高位数字存放在数组的首位， 数组中每个元素只存储单个数字。
//    你可以假设除了整数 0 之外，这个整数不会以零开头。
//    提示：
//            1 <= digits.length <= 100
//            0 <= digits[i] <= 9

    private static int[] testPlusOne(int[] digits) {
        int n = digits.length;
        //反向遍历
        for (int i = n - 1; i >= 0; i--) {
            //如果位数为9，置0
            if (digits[i] == 9) {
                digits[i] = 0;
                //如果不为9，加1，返回
            } else {
                digits[i] += 1;
                return digits;
            }
        }
        //全为9的时候跳出循环，新建一个比digits长1的数组，将首位置1
        int[] ans = new int[n + 1];
        ans[0] = 1;
        return ans;
    }
    //LeetCode官方題解
    private static int[] testPlusOneByFrank(int [] digits){
        int len = digits.length;
        //反向遍历数组
        for (int i = len-1; i >= 0; i--) {
            //找到第一個不為9的元素
            if (digits[i]!=9){
                ++digits[i];
                //將該元素的後面的位數置為0
                for (int j = i+1; j <len ; j++) {
                    digits[j]=0;
                }
                return digits;
            }

        }
        int []temp=new int[len+1];
        temp [0]=1;
        return temp;
    }
}
