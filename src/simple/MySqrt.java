package simple;

public class MySqrt {
    public static void main(String[] args) {
        int count =4;
        testMySqrt(count);
        System.out.println(testMySqrt(count));
    }

//    给你一个非负整数 x ，计算并返回 x 的 算术平方根 。
//    由于返回类型是整数，结果只保留 整数部分 ，小数部分将被 舍去 。
    private static int testMySqrt(int x) {
        //二分查找的形式找到对应的根
        int left=0;
        int right=x;
        int ans=-1;
        //搜索区间【left,right】
        //终止条件left>right
        while(left<=right){
            int mid=left+(right-left)/2;
            if ((long)mid*mid<=x){
                ans=mid;
                left=mid+1;
            }else{
                right=mid-1;
            }
        }
        return ans;
    }
}
