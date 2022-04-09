package base;

/**
 * @author Administrator
 */
public class TestString {

    public static void main(String[] args) {
        //testEquals();
        testIndexOf();
    }

    private static void testIndexOf() {
        String s1 = "aaascacb";
        System.out.println(s1.indexOf('c'));
    }

    private static void testEquals() {
        String s1 = "s1";
        StringBuffer s2 = new StringBuffer("s2");
        StringBuilder s3 = new StringBuilder("s3");
        System.out.println(s1.equals(s2));
        System.out.println(s1.equals(s3));
        System.out.println(s2.equals(s3));
    }
}
