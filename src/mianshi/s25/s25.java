package mianshi.s25;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class s25 {
    public static void main(String[]args) throws Exception
    {
        int ans = 0 ;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine()) ;
        for(int i = 1 ; i <= n ; i++)
        {
            if(f(i) == g(i)){
                ans++ ;
            }
        }
        System.out.print(ans);
    }
    public static int f(int n)
    {
        int res = 0 ;
        while(n != 0)
        {
            res += n % 10 ;
            n /= 10 ;
        }
        return res ;
    }
    public static int g(int n){
        String s = Integer.toBinaryString(n);
        int res = 0 ;

        for(int i = 0 ; i < s.length() ; i++)
        {
            res = res+ (int)s.charAt(i) - 48 ;
        }
        return res ;
    }
}
