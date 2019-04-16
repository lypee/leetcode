package mianshi.s31;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * 凑硬币
 */
public class s31 {
    static int[] money = {1, 5 ,10 ,20 ,50,100} ;
    static int[] dpArray = new int[10001] ;
    static int length = 6 ;
    static int res = 0 ;
    public static void main(String[]args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        dpArray[0] = 0;
        int cost;
        for (int i = 1; i <= n; i++) {
            cost = Integer.MAX_VALUE;
            for (int j = 0; j < 6; j++) {
                if (i - money[j] >= 0) {
                    cost = Math.min(cost, dpArray[i - money[j]] + 1);
                }
                dpArray[i] = cost ;
            }
//            if(i - 1 >= 0)
//            {
//                cost = Math.min(cost , dpArray[i-1] +1 ) ;
//            }if(i - 5 >= 0)
//        {
//            cost = Math.min(cost , dpArray[i-5]+ 1) ;
//        }
//            if(i = 10 )
//        }
        }
        for(int i = 1 ; i <= n ; i++)
        {
            dpArray[i] = dpArray[i-1] + dpArray[i];
        }
        System.out.println(dpArray[n]);
    }
    public static void dfs(int n)
    {
        if(n == 0 )
        {
            dpArray[n] = res ;
            res++ ;
        }
        if(n < 0)
        {
            return  ;
        }
        dfs(n - 1);
        dfs(n - 5);
        dfs(n - 10);
        dfs(n - 20);
        dfs(n - 50);
        dfs(n - 100);
    }
    public static void dp(int n , int num)
    {
        if(n == 0 )
        {
            dpArray[n] = 0 ;
            dp(1, num);
        }else{
            int MIN = 9999 ;
            for(int j = 0 ; j < 6 ; j++)
            {
                if(n >= money[j])
                {
                    MIN = Math.min(dpArray[n - money[j]] + 1, MIN);
                }
            }
            dpArray[n] = MIN ;
            if( n == num )
            {
                return;
            }else{
                dp(n + 1, num);
            }
        }
    }
    public static void dp(int n )
    {

    }
}
