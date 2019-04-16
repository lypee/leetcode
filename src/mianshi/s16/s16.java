package mianshi.s16;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * 滴滴5 进制转换
 */
public class s16 {
    public static void main(String[]args)throws  Exception
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] s = br.readLine().split(" ") ;
        int n = Integer.parseInt(s[0]);
        int m = Integer.parseInt(s[1]) ;
        System.out.println(trans(n ,m));
    }
    public static String trans(int n , int m)
    {
        boolean minus = false ;
        StringBuilder stringBuilder = new StringBuilder() ;
        if(n < 0)
        {
            minus = true ;
            n = Math.abs(n);
        }
        while(n >= m )
        {
            int number =  n % m ;
            if(number > 9 )
            {
                stringBuilder.append((char)(number+55)) ;
            }else
            {
                stringBuilder.append(number) ;
            }
            n /= m ;
        }
        if(n > 9 )
        {
            stringBuilder.append((char)(n+55)) ;
        }else
        {
            stringBuilder.append(n) ;
        }
        if(minus){
            stringBuilder.append("-") ;
        }
        return stringBuilder.reverse().toString() ;

    }
}
