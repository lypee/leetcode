package mianshi.s3;

import jdk.internal.util.xml.impl.Input;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.Buffer;

/**
 * 今日头条第三题
 */
public class s3 {
    int res = 0 ;
    public static void main(String[] args) throws  IOException
    {
        Main main = new Main() ;

    main.maxDuplitionChar("ababsdabfaaasfaa") ;
    System.out.println(main.res);
    }
}
class Main{
    int res = 0 ;
    public int test() throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String s = bufferedReader.readLine() ;
        int n = Integer.parseInt(bufferedReader.readLine()) ;
        maxDuplitionChar(s);
        return 0 ;
    }
    public void swapChar(String s)
    {

    }
    public void maxDuplitionChar(String s)
    {
        int ans = 0 ;
        for(int i = 0 ; i < s.length()-1 ; i++)
        {
            if (s.charAt(i) == s.charAt(i + 1)) {
                ans++ ;
            }
        }
        res = Math.max(res , ans) ;
    }
}
