package simple;

public class convertToTitle {
    public static void main(String[] args) {
        int columnNumber=701;
        String name = testConvertToTitle(columnNumber);
        System.out.println(name);
    }
//    给一个整数的columnNuber返回Excel对应的列名
//    分析：1-26 对应A-Z
//    27：AA 28:AB
    private static String testConvertToTitle(int columnNumber){
        StringBuffer sb =new StringBuffer();
        while(columnNumber>0){
            //排除columnNumber为1的情况
            columnNumber--;
            //取模，得尾数
            sb.append((char) ('A'+columnNumber%26));
            //取整，得尾数之外的尾数
            columnNumber/=26;
        }
        return sb.reverse().toString();
    }
}
