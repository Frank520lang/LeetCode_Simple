package base;

/**
 * @author : Frank
 * @date : 2022/4/10 0:52
 */
public class ReverseString {
    /**给出一个字符串，写出一个算法将该字符串反向输出，并将大小写转换，比如输入"aBcD" 输出"dCbA"
     *
     * @param args
     */
    public static void main(String [] args ){
        String s="aBcD";
        String str =reverse(s);
        System.out.println(str);
    }
    private static String reverse(String s){
        char [] ch = s.toCharArray();
        for (int i = 0; i <ch.length ; i++) {
            if (Character.isLowerCase(ch[i])) {
                ch[i]=Character.toUpperCase(ch[i]);
            }else if (Character.isUpperCase(ch[i])){
                ch[i]=Character.toLowerCase(ch[i]);
            }
        }
        StringBuffer stringBuffer =new StringBuffer(new String(ch)).reverse();
        //return new String(stringBuffer);
        return stringBuffer.toString();
    }

}
