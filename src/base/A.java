package base;

/**
 * @author : Frank
 * @date : 2022/4/10 0:16
 */
public class A {



    static{
        System.out.println("ClassA的静态代码块");
    }
    public static A classa = new A();
    public A(){
        System.out.println("ClassA的构造方法");
    }

    {
        System.out.println("ClassA的构造代码块");
    }

}
class ClassB extends A {


    static{
        System.out.println("ClassB的静态代码块");
    }

    public ClassB(){
        System.out.println("ClassB的构造方法");
    }

    {
        System.out.println("ClassB的构造代码块");
    }

    public static  ClassC classc = new ClassC();

    public void excute(){
        System.out.println("执行方法");
    }

}
class ClassC {

    public ClassC(){
        System.out.println("ClassC的构造方法");
    }

}

class Test{
    static{
        System.out.println("Test的静态代码块");
    }

    public static void main(String[] args) {
        System.out.println("执行main方法");
        ClassB b = new ClassB();
        b.excute();
    }
}

