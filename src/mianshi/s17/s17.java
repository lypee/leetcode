package mianshi.s17;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * 数组和
 */
public class s17 {
    public static void main(String[]args) throws  Exception
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] s = br.readLine().split(" ");
        int n = Integer.parseInt(s[0]);
        int m = Integer.parseInt(s[1]) ;
        int[] a = new int[n];
        String[] strings = br.readLine().split(" ") ;
        for(int i = 0 ; i < n ; i ++)
        {
            a[i] = Integer.parseInt(strings[i]) ;
        }
        int[][] dp = new int[1002][1002];
        dp[0][0] =1 ;
        for(int i = 1 ; i <= n ; i++)
        {
            for(int j = 0 ; j <= m ; j++)
            {
                dp[i][j] = dp[i-1][j] ;
                if(j >= a[i-1]){
                    //放入i和不放入i的总和
                    dp[i][j] += dp[i-1][j-a[i-1]] ;
                }
            }
        }
        System.out.println(dp[n][m]);
    }


}
