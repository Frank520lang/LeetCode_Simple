package simple;

/*
给你一个整数 x ，如果 x 是一个回文整数，返回 true ；否则，返回 false 。
思路：   1，判断数组的正负
         2，将数字的后半部分反转与前半部分比较（临界条件：x<=palindrome）
*/
public class IsPalindrome {
    public static void main(String[] args) {
        System.out.println("123321:" + isPalindrome(123321));
        System.out.println("12321:" + isPalindrome(12321));
        System.out.println("1232:" + isPalindrome(1232));
        System.out.println("03445:" + isPalindrome(03445));
        System.out.println("-123321:" + isPalindrome(-123321));
    }

    public static boolean isPalindrome(int x) {
        if (x < 0) {
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
        // 边界条件
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
