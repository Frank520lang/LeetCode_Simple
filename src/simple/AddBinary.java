package simple;

public class AddBinary {
    public static void main(String[] args) {
        String a1="11";
        String a2="1111111111";
        String s =testAddBinary(a1,a2);
        System.out.println(s);
    }
//    给你两个二进制字符串，返回它们的和（用二进制表示）。
//    输入为 非空 字符串且只包含数字 1 和 0。

    //思路：
    //模拟运算
    private static String testAddBinary(String a,String b){
        //判断两个字符的长度
        if(a.length()<=b.length()){
            //暂存的字符
            StringBuilder ans=new StringBuilder();
            //两个字符的长度
            //一个进位变量
            int i=a.length()-1,j=b.length()-1,carry=0;
            //
            while(i>=0){
                int sum=carry+(a.charAt(i)-'0')+(b.charAt(j)-'0');
                ans.append(sum%2);
                carry=sum/2;
                i--;
                j--;
            }
            //a没有位数了，剩下b与进位的运算
            while(j>=0){
                int sum=carry+(b.charAt(j)-'0');
                ans.append(sum%2);
                carry=sum/2;
                j--;
            }
            //a与b运算完，carry还有值
            if(carry==1){ans.append(1);}
            //将暂存字符反转
            return ans.reverse().toString();
        }
        return testAddBinary(b,a);
    }
}
