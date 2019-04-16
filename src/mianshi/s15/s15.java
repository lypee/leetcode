package mianshi.s15;

import java.util.Scanner;

/**
 * 末尾阶乘0
 */
public class s15 {
    public static  void main(String[]args)
    {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt() ;
        int[] b = new int[(int) Math.sqrt(n) + 1 ];
        int i = 1 ;
        while(n >= 5)
        {
            b[i] = n /5 ;
            n /= 5 ;
            i++ ;
        }
        int res = 0 ;
        for(int j = 1 ; j < i ; j++)
        {
            res += b[j] ;
        }
        System.out.println(res);
    }
}
