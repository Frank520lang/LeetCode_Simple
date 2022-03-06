package simple;

public class AddBinary {
    public static void main(String[] args) {
        String a2="11";
        String a1="1111111111";
        String s =testAddBinary(a1,a2);
        System.out.println(s);
        String test=test(a1,a2);
        System.out.println(test);
    }

    private static String test(String a1, String a2) {
                //判断两个字符串的长度大小
                //a1的长度大于a2的长度
                //等于时的边界值没有影响
                if (a1.length()>a2.length()){
                    //获取到a1和a2的长度用于遍历
                    int length1=a1.length()-1;
                    int length2=a2.length()-1;
                    //定义运算的进位
                    int carry=0;
                    //新建一个可变化的字符暂存字符
                    StringBuilder stringBuilder =new StringBuilder();
                    //字符从后往前遍历做运算
                    while(length2>=0){
                        //将字符变数字
                        int sum = carry+(a2.charAt(length2)-'0'+a1.charAt(length1)-'0');
                        //位的值
                        int zhi=sum%2;
                        stringBuilder.append(zhi);
                        //进位
                        carry=sum/2;
                        length1--;
                        length2--;
                    }
                    while(length1>=0){
                        int sum=carry+(a1.charAt(length1)-'0');
                        int zhi=sum%2;
                        stringBuilder.append(zhi);
                        carry=sum/2;
                        length1--;
                    }
                    //如果carry还有进位
                    if (carry==1){
                        //最后一位进一
                        stringBuilder.append(1);
                    }
                    return stringBuilder.reverse().toString();
                }
                //获取到字符串的每一位字符，将字符转换成整数类型
                //做相应的运算
                return test(a2,a1);
            }
//    给你两个二进制字符串，返回它们的和（用二进制表示）。
//    输入为 非空 字符串且只包含数字 1 和 0。

    //思路：
    //模拟二进制运算
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
