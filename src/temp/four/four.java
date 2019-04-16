package temp.four;

public class four {
    public static void main(String[] args) {
        int[] a = {-2, 11, -4, 13, -5, -2};
        //保存前n个的最大字段和的值
        int[] dp = new int[6];
        dp[0] = a[0] ;
        int ans = Integer.MAX_VALUE ;
        for(int i = 1 ; i < 6 ; i ++)
        {
            dp[i] = Math.max(a[i] , dp[i-1] + a[i]) ;
            if(ans < dp[i]) {
                ans = dp[i] ;
            }
        }
        for (int i = 0; i < 6; i++)
        {
            System.out.print(dp[i] + "\t");
        }
    }
}
