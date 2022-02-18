package simple;

import java.util.ArrayList;
import java.util.List;

//给你一个字符串 s，由若干单词组成，单词前后用一些空格字符隔开。返回字符串中最后一个单词的长度。
//是指仅由字母组成、不包含任何空格字符的最大子字符串
public class LengthOfLastWord {
    public static void main(String[] args) {
        String s="a";
        //int i = testLengthOfLastWordBySplit(s);
        int j = testLengthOfLastWordBySubString(s);
        System.out.println(j);
    }

    private static int testLengthOfLastWordBySubString(String s) {
        int index=s.length()-1;
        //排除排除空字符
        while(s.charAt(index)==' '){
            index--;
        }
        int flag=0;
        //反向遍历字符串
        for (int i = index; i >=0 ; i--) {
            if (s.charAt(i)!=' '){
                flag++;
            }else{
                //跳出循环体
                break;
            }
        }

        return flag;
    }

    //将字符串根据空格拆分成单个字符串，
    //拿到最后一个字符并返回它的长度
    private static int testLengthOfLastWordBySplit(String s) {
        String [] st= s.split(" ");
        String strings = st[st.length-1];
        int i=strings.length();
        return i;
    }
}
