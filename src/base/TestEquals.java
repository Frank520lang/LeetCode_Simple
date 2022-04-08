package base;

public class TestEquals {
    public static void main(String[] args) {
        test();
    }

    private static void test() {
        String s1 = new String("ss");
        String s2 = new String("ss");
        System.out.println(s1 == s2);
        System.out.println(s1.equals(s2));
        System.out.println("------------------");
        Integer i1 = 1;
        Integer i2 = 1;
        System.out.println(i1 == i2);
        System.out.println(i1.equals(i2));
    }
}
