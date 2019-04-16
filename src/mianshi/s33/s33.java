package mianshi.s33;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class s33 {
    public static void main(String[]args) throws Exception
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s1 =  br.readLine() ;
        String s2 = br.readLine() ;
//        String s1 = "abcde";
//        String s2 = "abgde" ;
       System.out.println( getLongestStr(s1 ,s2));

    }

    public static int getLongestStr(String s1, String s2) {
        int res = 0 ;
        int n = s1.length() ;
        int m = s2.length() ;
        int[][] a = new int[m][n] ;
        for(int i = 0 ; i < n ; i++)
        {
            if (s2.charAt(0) == s1.charAt(i)) {
                {
                    a[0][i] = 1 ;
                }
            }
        }
        for(int i = 0 ; i < m ; i++)
        {
            if (s1.charAt(0) == s2.charAt(i)) {
                a[i][0] = 1 ;
            }
        }
        res = Math.max(a[0][0] , res) ;
        for(int i = 1 ; i < m ; i++)
        {
            for(int j = 1; j < n   ; j++)
            {
                if (s1.charAt(j) == s2.charAt(i)) {
                    a[i][j] = a[i-1][j-1] + 1 ;
                    if(a[i][j] > res){
                        res = a[i][j] ;
                    }
                }
            }
        }
        return res ;
    }
}
