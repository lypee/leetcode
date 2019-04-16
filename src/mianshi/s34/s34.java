package mianshi.s34;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class s34 {
    static int[] values = {1, 5, 10, 20, 50, 100};
    public static void main(String[]args) throws Exception
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        System.out.println(solution(n));
    }
    public static int combine(int n)
    {
        n++ ;
        int[][] dp = new int[values.length][n];
        for(int i = 0 ; i < n ; i ++)
        {
            dp[0][i] = 1 ;
        }
        for(int i = 1 ; i <  values.length ; i++)
        {
            for(int j = 0 ; j <  n ; j++)
            {
                int k = j / values[i] ;
                while (k >= 0)
                {
                    dp[i][j] += dp[i - 1][j - k * values[i]];
                    k-- ;
                }
            }
        }
        return dp[values.length - 1][n - 1];
    }
    public static long solution(int n)
    {
        int[] coins = {1, 5, 10, 20, 50, 100};
        int h = coins.length ;
        long dp[][] = new long[h][n + 1];
        Arrays.fill(dp[0], 1);
        for(int i = 1 ; i < h ; i++)
        {
            for(int j =1 ; j<= n ; j++)
            {
                int m = j / coins[i];
                for(int k = 0 ; k <= m ; k++)
                {
                    dp[i][j] += dp[i-1][j-k*coins[i]];
                }
            }
        }
        return dp[h-1][n] ;
    }
}
