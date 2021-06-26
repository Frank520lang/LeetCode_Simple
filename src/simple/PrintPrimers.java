package simple;

/**
 * @author Administrator
 * @date 2020/12/22
 *
1. break可以在if-else中使用直接跳出当前循环。
2. 在多层循环中, 一个break语句只向外跳一层。
3. continue语句的作用是跳过循环体中剩余的语句并到循环末尾而强行执行下一次循环。
4. continue语句只用在for、while、do-while等循环体中, 常与if条件语句一起使用, 用来加速循环。
 */
public class PrintPrimers {

    /**
     * @param args
     */
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        //printPrimers();
        //System.out.println("-------------------------------------------------------------");
        System.out.println("101到200的素数有"+printPrimers()+"个");
    }

    // 统计101到200的素数并将素数打印出来.
    public static int printPrimers() {
        // 统计素数的个数
        int count=0;
        for (int i = 101; i < 200; i++) {
            boolean flag=true;
            for (int j = 2; j < Math.sqrt(i); j++) {
                // 不是素数
                if (i % j == 0) {
                    flag=false;
                    //break;
                }
            }
            if(flag==true) {
                System.out.println(i);
                count++;
            }
        }
        return count;
    }
}
