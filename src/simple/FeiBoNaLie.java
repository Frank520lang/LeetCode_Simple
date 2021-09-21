package simple;

/**
 * @author Administrator
 * @date 2021/06/13
 */
public class FeiBoNaLie {

    public static void main(String[] args) {

        printFeiBO(10);
        printPrime(100);

    }

    /**
     * @param i
     */
    private static void printPrime(int i) {
        // TODO Auto-generated method stub
        int count = 0;
        for (int j = 2; j <= i; j++) {
            boolean flag = Prime(j);
            if (!flag) {
                System.out.print(j + " , ");
                count++;
            }

        }
        System.out.println();
        System.out.println(i + "以内的素数个数为：" + count);
    }

    /**
     * @param
     */
    private static boolean Prime(int num) {
        // TODO Auto-generated method stub
        for (int i = 2; i < num; i++) {
            //
            if (num % i == 0) {
                return true;
            }

        }
        return false;

    }

    // 递归的方法实现斐波那契数列
    public static int FeiBo(int n) {

        if (n < 0) {
            return -1;
        } else if (n == 0) {
            return 0;
        } else if (n == 1 || n == 2) {
            return 1;
        } else {
            return FeiBo(n - 1) + FeiBo(n - 2);
        }

    }

    // 打印斐波那契数列
    public static void printFeiBO(int num) {
        System.out.println("斐波那契数列的前：" + num + " 项");
        for (int i = 0; i < num; i++) {
            System.out.print(FeiBo(i) + " , ");
        }
        System.out.println();
        System.out.println();


    }
}
