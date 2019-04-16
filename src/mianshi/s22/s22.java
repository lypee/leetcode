package mianshi.s22;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/**
 * jd 2 进制均值
 */
public class s22 {
    static int ans = 0 ;
    public static void main(String[]args) throws  Exception
    {
        int sum = 0 ;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        for(int i = 2 ; i < n ; i++)
        {
            sum += sum(n , i) ;
        }

        System.out.println(sum/gcd(sum , ans) + "/" + ans/gcd(sum , ans) );
    }
    public static int gcd(int x, int y){ // 这个是运用辗转相除法求 两个数的 最大公约数 看不懂可以百度 // 下
        if(y == 0)
        {
            return x;
        }
        else
        {
            return gcd(y,x%y);
        }
    }
    public static Long sum(int number , int radix)
    {
        Long res = 0L ;
        ArrayList<Integer> list = new ArrayList<>() ;
        while(number >= radix)
        {
            list.add(number % radix);
            number /= radix ;
        }
        list.add(number) ;
        for(int i = 0 ; i < list.size() ; i++)
        {
            res += list.get(i);
        }
        ans++ ;
        return res ;

    }
}
