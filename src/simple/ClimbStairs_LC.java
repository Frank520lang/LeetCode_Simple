package simple;

public class ClimbStairs_LC {

    // 假设你正在爬楼梯。需要 n 阶你才能到达楼顶。
    // 每次你可以爬 1 或 2 个台阶。你有多少种不同的方法可以爬到楼顶呢？
    // 注意：给定 n 是一个正整数。

    // 第一级台阶：1种
    // 第一级台阶：2种
    // 第一级台阶：3种
    // 第一级台阶：5种
    // 第一级台阶：8种
    // f(x)=f(x-1)+f(x-2)

    public static int climbStairs(int n) {
        // return diGui(n);
        return gunDongArray(n);
    }

    // 滚动数组
    private static int gunDongArray(int n) {
        int p = 0, q = 0, l = 1;
        for (int i = 1; i <= n; i++) {
            p = q;
            q = l;
            l = p + q;
        }
        return l;
    }

    // 递归
    private static int diGui(int n) {
        if (n == 1) {
            return 1;
        } else if (n == 2) {
            return 2;
        } else {
            return climbStairs(n - 1) + climbStairs(n - 2);
        }
    }

    public static void main(String[] args) {
        int parameter = 5;
        int value = climbStairs(parameter);
        System.out.println("爬上第" + parameter + "级楼梯的方法有：" + value + "种");
    }
}
