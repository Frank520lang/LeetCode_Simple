package base;

public class TestString {
    public static void main(String[] args) {
        test();
    }
    private static void test(){
        String s1 =new String("s1");
        StringBuffer s2 =new StringBuffer("s2");
        StringBuilder s3 =new StringBuilder("s3");

        System.out.println(s1.equals(s2));
        System.out.println(s1.equals(s3));
        System.out.println(s2.equals(s3));
    }
}
