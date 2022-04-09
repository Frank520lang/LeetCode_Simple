package base;

/**
 * @author : Frank
 * @date : 2022/4/10 2:17
 * S=2+22+222+2222+22222
 */
public class Test22222 {
    public static void main(String[] args) {
        test(2,5);
    }

    private static int test(int p, int q) {
        int sum=0;
        int a=2;
        int n=1;
        int result=0;
        for (int j = 0; j <q ; j++) {
            sum=sum+a*n;
            result=result+sum;
            n= (int) Math.pow(10,j+1);
        }
        return result;
    }
}
