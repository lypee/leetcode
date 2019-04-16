package medium.s62;

public class s62 {
    static int ans = 0 ;
    public static void main(String[]args)
    {
        System.out.println(uniquePaths(7,3));

    }
    public static int uniquePaths(int m , int n)
    {
//        dfs(0 , 0 , m , n) ;
        return dp(m,n);
//        return ans ;
    }
    public static int dp( int m , int n)
    {
        int[][] array = new int[n][m] ;
        array[0][0] = 1 ;
        for(int i = 0 ; i < n ; i ++)
        {
            for(int j = 0 ; j < m ; j++)
            {
                if(i == 0 || j == 0 )
                {
                    array[i][j] =  1  ;
                }else {
                    array[i][j] = array[i-1][j] + array[i][j-1] ;
                }
            }
        }
        return array[n-1][m-1] ;
    }
    public static void dfs(int x , int y , int m , int n)
    {
        if(x < m && y < n )
        {
            dfs(x+1 , y , m  , n) ;
            dfs(x , y+ 1 , m , n) ;
        }
        if(x == m-1 && y == n-1 )
        {
            ans++ ;
        }
        return ;
    }
}
