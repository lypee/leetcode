package easy.s504;

import java.util.Collections;

public class s504 {
    public static void main(String[]args)
    {

//System.out.println(converToBast7(n));
    }
    public static String converToBast7(int num)
    {
        boolean flag = false ;
        if(num < 0 ) flag = true ;
        num = Math.abs(num) ;
        StringBuilder stringBuilder = new StringBuilder( );
        while (num != 0)
        {
            int n = num % 7 ;
            num /= 7 ;
            stringBuilder.append(n) ;
        }
//        String ans = stringBuilder.toString() ;
        if(flag) stringBuilder.append("-1") ;
        return stringBuilder.reverse().toString() ;
    }
}
