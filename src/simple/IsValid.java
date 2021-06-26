 package simple;

import java.util.Stack;

public class IsValid {

   /* 给定一个只包括 '('，')'，'{'，'}'，'['，']' 的字符串，判断字符串是否有效。
    有效字符串需满足：
    左括号必须用相同类型的右括号闭合。
    左括号必须以正确的顺序闭合。
    注意空字符串可被认为是有效字符串。
    */
    public static boolean IsValidTest(String s) {
        if(s.isEmpty())
            return true;
        Stack<Character> stack=new Stack<Character>();
        for(char c:s.toCharArray()){
            if(c=='(')
                stack.push(')');
            else if(c=='{')
                stack.push('}');
            else if(c=='[')
                stack.push(']');
            //这里的empty(0应该是判断将空字符串出栈后为空的情况的
            else if(stack.empty()||c!=stack.pop())
                return false;
        }
        if(stack.empty())
            return true;
        return false;
    }
    public static void main(String[] args) {
        System.out.println(IsValidTest("{{[()]}}"));
        System.out.println(IsValidTest("{{[(]}}"));
        System.out.println(IsValidTest("{}()[]"));
        System.out.println(IsValidTest("{}([])"));
    }
}
