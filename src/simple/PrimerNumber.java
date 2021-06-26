package simple;

import java.util.Scanner;

/**
 * @author Administrator
 * @date 2020/12/19
 */

/*
 * 素数的定义:素数只有两个因子1和本身
 * 判断素数的几种方法
 * */
public class PrimerNumber {
    public static void main(String[] args) {
        while (true) {
            System.out.println("输入一个正整数,判断是否是素数");
            Scanner scanner = new Scanner(System.in);
            int num = Integer.parseInt(scanner.nextLine());
            long startTime = System.currentTimeMillis();
            // IsPrimerDemo1(num);
            // IsprimerDemo2(num);
            // IsPrimerDemo3(num);
            long endTime = System.currentTimeMillis();
            System.out.println("执行消耗的时间" + (endTime - startTime));
        }
        // scanner.close();
    }

    // 暴力解法,遍历2到num判断是否可以整除
    public static boolean IsPrimerDemo1(int num) {
        boolean index = false;
        if (num == 1) {
            System.out.println(num + "不是素数");
        }
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                index = true;
            }
        }
        if (index == true) {
            System.out.println(num + "不是素数");
        } else {
            System.out.println(num + "是素数");
        }

        return index;
    }

    // 一个合数一定有一个小于它平方根的因子,判断素数,只需找到一个除了1和本身的因子就可以啦
    public static boolean IsprimerDemo2(int num) {
        boolean index = false;
        if (num == 1) {
            // System.out.println(num + "不是素数");
            index = false;
        }
        for (int i = 2; i < Math.sqrt(num); i++) {
            if (num % i == 0) {
                index = true;
            }
        }
        if (index == true) {
            System.out.println(num + "不是素数");
        } else {
            System.out.println(num + "是素数");
        }

        return index;
    }

    // 小于5的素数2,3
    // 大于5的素数一定在6的两侧
    // 在6两侧的数不一定是素数
    public static boolean IsPrimerDemo3(int num) {
        boolean index = false;
        // 小于5的素数
        if (num <= 5) {
            if (num == 2 || num == 3) {
                index = true;
            }
        } else {
            // 大于5不在6两侧的数一定不是素数
            if (num % 6 != 1 && num % 6 != 5) {
                index = false;
            }
            // 在6倍数的两侧也不一定是素数
            // 排除6倍数两侧不是素数的数
            // 判断6倍数相邻的两个数是否是num的因子
            else {
                for (int i = 5; i < Math.sqrt(num); i += 6) {
                    if (num % i == 0 || num % (i + 2) == 0) {
                        index = false;
                    }
                }
                index = true;
            }
        }

        if (index) {
            System.out.println(num + "是素数");
        } else {
            System.out.println(num + "不是素数");
        }
        return index;
    }

}
