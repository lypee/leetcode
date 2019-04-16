package mianshi.s44;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class s44 {
    public static void main(String[]args) throws  Exception
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] strings = br.readLine().split(" ") ;
        int n1 = Integer.parseInt(strings[0]) ;
        int n2 = Integer.parseInt(strings[1]) ;
        int ans = 0 ;

        for(int i = 1 ; i <= n1 ; i ++ )
        {
            for(int j = 1 ; j <= n2  ; j++)
            {
                    if(judge(i , j)){

                        ans++ ;
                    }
            }
        }
        System.out.println(ans);
    }
    public static boolean judge(int n1 , int n2)
    {
       double ssr = Math.pow( Math.sqrt(n1) + Math.sqrt(n2) ,2 );
       double ssrr = ssr % 1 ;
        if(Math.abs(ssrr) < 0.001 || Math.abs(ssrr) > 0.999999998)
        {
            return true ;
        }
        return false ;
    }
}
