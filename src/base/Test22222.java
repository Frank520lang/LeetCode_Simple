package base;

/**
 * @author : Frank
 * @date : 2022/4/10 2:17
 * S=2+22+222+2222+22222
 */
public class Test22222 {
    public static void main(String[] args) {
        System.out.println(test(2,5));
    }

    private static int test(int p, int q) {
        int an=p;
        int n=0;
        int sum=0;
        for (int j = 0; j <q ; j++) {
            an=an+2*n;
            sum=sum+an;
            n= (int) Math.pow(10,j+1);
        }
        return sum;
    }
}
