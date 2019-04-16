package temp.two;

/**
 * 最长公共字串问题
 * @author Lypee
 * Create on 2019/4/6
 */
public class two {
    public static void main(String[] args) {
        String s1 = "ABCBDAB";
        String s2 = "BDCABA";
        int[][] a = DP(s1, s2);
        for(int i = 0 ; i < a.length ; i ++)
        {
            for(int j = 0 ; j < a[0].length ; j++)
            {
                System.out.print("\t" + a[i][j]);
            }
            System.out.println();
        }
    }

    public static int[][] DP(String s1, String s2)
    {
        int n = s1.length() ;
        int m = s2.length() ;
        int[][] ans = new int[m][n] ;
        for(int i =0 ; i < n ; i ++)
        {
            if(s1.charAt(i) == s2.charAt(0)){
                ans[0][i] = 1 ;
            }
        }
        for(int i = 0 ; i < m ; i++)
        {
            if(s2.charAt(i) == s1.charAt(0)){
                ans[i][0] = 1 ;
            }
        }
        for(int i = 1 ; i < m ; i++)
        {
            for (int j = 1; j < n; j++) {


                if(s1.charAt(j ) == s2.charAt(i - 1)){
                    if(i == 2 && j == 5 ) {
                        System.out.println(s1.charAt(i-1) + " " + i +" " + j+ " , " + s2.charAt(j-1));
                    }
                    ans[i][j] = ans[i-1][j-1] + 1 ;
                }
            }
        }
        return ans ;
    }
}
