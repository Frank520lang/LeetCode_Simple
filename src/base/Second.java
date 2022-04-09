package base;

/**
 * @author : Frank
 * @date : 2022/4/10 0:11
 */
class First{
    public First(){
        method();
    }

    void method(){
        System.out.println("First");
    }
}

/**
 * @author Administrator
 */
public class Second extends First{
    public Second(){
        method();
    }

    @Override
    void method(){
        System.out.println("Second");
    }

    public static void main(String [] args){
        new Second();
    }
}
