package easy.s20;

import java.util.Stack;

public class s20 {
    public static boolean isValid(String s)
    {
        Stack<Character> stack = new Stack<>() ;
        for(char c : s.toCharArray())
        {
            if(c == '(')
            {
                stack.push(')') ;
            }else if(c == '{') stack.push('}');
            else if (c == '[') stack.push(']') ;
            else if (stack.isEmpty() || stack.pop() != c)
                return false ;
        }
        return stack.isEmpty() ;
    }
}
