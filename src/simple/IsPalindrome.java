package simple;


public class IsPalindrome {
    public static void main(String[] args) {
//        System.out.println("123321:" + isPalindrome(123321));
//        System.out.println("12321:" + isPalindrome(12321));
//        System.out.println("1232:" + isPalindrome(1232));
//        System.out.println("03445:" + isPalindrome(03445));
//        System.out.println("-123321:" + isPalindrome(-123321));
//        System.out.println("10:" + isPalindrome(10));
//        System.out.println("0:" + isPalindrome(0));

        String s="aba";
        //boolean flag = isPalindromeString(s);
        //boolean flag = isPalindromeStringByZhiZhen(s);
        boolean flag = isPalindromeStringYuan(s);

        System.out.println(flag);

    }
    /*
    * 给定一个字符串，验证它是否是回文串，只考虑字母和数字字符，可以忽略字母的大小写。
    * */
//    利用api的形式
    public static boolean isPalindromeString(String s){
        //遍历string获取到字母或者数字存储到一个字符中
        //将字符反转与原来的字符比较
        int len = s.length();
        StringBuffer stringBuffer =new StringBuffer();
        for (int i = 0; i < len; i++) {
            char ch = s.charAt(i);
            //
            if (Character.isLetterOrDigit(ch)){
                stringBuffer.append(Character.toLowerCase(ch));
            }
        }
        String fast = stringBuffer.toString();
        String last = stringBuffer.reverse().toString();
        return fast.equals(last);

    }
//    利用双指针的形式判断
    public static boolean isPalindromeStringByZhiZhen(String s){
        int len=s.length();
        StringBuffer stringBuffer = new StringBuffer();
        for (int i = 0; i <len ; i++) {
            char ch = s.charAt(i);
            if (Character.isLetterOrDigit(ch)) {
                stringBuffer.append(Character.toLowerCase(ch));
            }
        }
        int l=stringBuffer.length();
        int left = 0;
        int right = l-1;
        while(left<right){
            if (stringBuffer.charAt(left)!=stringBuffer.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
//    在字符本身判断
    public static boolean isPalindromeStringYuan(String s){
        int len = s.length();
        int left = 0;
        int right = len-1;
        while(left<right){
            while(left<right && !Character.isLetterOrDigit(s.charAt(left))){
                left++;
            }
            while(left<right && !Character.isLetterOrDigit(s.charAt(right))){
                right--;
            }
            //判断收尾的字符是否相同
            if (Character.toLowerCase(s.charAt(left)) != Character.toLowerCase(s.charAt(right))) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
    /*
    *给你一个整数 x ，如果 x 是一个回文整数，返回 true ；否则，返回 false 。
    *思路：   1，判断数组的正负
    *    2，将数字的后半部分反转与前半部分比较（临界条件：x<=palindrome）
    */
    public static boolean isPalindrome(int x) {
        if (x == 0) {
            return true;
        }
        if (x < 0 || x % 10 == 0) {
            return false;
        }
        int palindrome = 0;
        /*
         * x palindrome
         * 1233321 0
         * 12332 1
         * 1233 12
         * 123 123
         */
        // 边界条件,循环条件
        while (x > palindrome) {
            // palindrome与x的关系
            palindrome = palindrome * 10 + x % 10;
            // 循环控制条件
            x /= 10;
        }
        // 判断回文数
        return x == palindrome || x == palindrome / 10;
    }

}
