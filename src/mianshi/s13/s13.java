package mianshi.s13;

import java.util.Scanner;

/**
 * N阶乘末尾的0个数
 */
public class s13 {
    public static void main(String[]args)
    {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt() ;
        int ans = 0 ;
        int[] b = new int[(int)Math.sqrt(n)] ;
        int i  = 1 ;
        while(n > 5 )
        {
            b[i] = n / 5 ;
            n = n / 5 ;
            i++ ;
        }
        for(int j = 1 ; j < i ; j++)
        {
            ans += b[j] ;
        }
        System.out.println(ans);

    }
    public static int nZero(int n )
    {
        int res = 0;
        while(n != 0)
        {
            if(n  % 10 == 0)
            {
                res++ ;
            }else {
                break ;
            }
            n /= 10 ;
        }
        return res ;
    }
}
