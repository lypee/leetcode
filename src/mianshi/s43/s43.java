package mianshi.s43;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Stack;

/**
 * meituan 11
 */
public class s43 {
    public static void main(String[]args) throws Exception
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String string = br.readLine() ;
        if(string.length() == 0 || string == null)
        {
            System.out.println(0);
            return ;
        }
        System.out.println(getDepth(string));

    }
    public static int getDepth(String string)
    {
        int res = 0 ;
        LinkedList<Character> list = new LinkedList<>();
        for(int i = string.length() -1  ; i >= 0  ; i--)
        {
            list.add(string.charAt(i));
        }
        Stack<Character> stack = new Stack<>() ;
        stack.push(list.pollFirst());
        for(int i = 0 ; i < list.size() ; i++)
        {
            Character character = list.pollFirst() ;
            if(stack.peek().equals(character))
            {
                stack.push(character) ;
            }else{
                res ++ ;
                stack.pop() ;
            }
        }
        if(!stack.isEmpty())
        {
            res += (stack.size()+list.size())/2 ;
        }
        return res ;
    }
}
