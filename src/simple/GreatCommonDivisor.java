package simple;

public class GreatCommonDivisor {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        int GreatCommonDrivisor = greatCommonDivisor(12, 30);
        System.out.println("最大公约数为:" + GreatCommonDrivisor);
        System.out.println();
        int GreatCommonMultiple = greatCommonMultiple(12, 30);
        System.out.println("最小公倍数为:" + GreatCommonMultiple);
    }

    //求最小公倍数
    private static int greatCommonMultiple(int i, int j) {
        // TODO Auto-generated method stub
        int a = i;
        int b = j;
        int GCD = greatCommonDivisor(a, b);
        int GCM = a * b / GCD;
        return GCM;
    }

    //求最大公约数(欧几里得算法也叫辗转相除法)
    //当余数为零的时候除数为最大公约数
    private static int greatCommonDivisor(int n, int m) {
        // TODO Auto-generated method stub
        int r = n % m;
        while (r != 0) {
            n = m;
            m = r;
            r = n % m;
        }
        return m;
    }

}
