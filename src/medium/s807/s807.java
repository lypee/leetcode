package medium.s807;

public class s807 {
    public static void main(String[] args)
    {

    }
    public static int maxIncreaseKeepingSkyLine(int[][] grid)
    {
        int length = grid.length ;
        int[] col = new int[length] ;
        int[] row = new int[length] ;
        for(int i = 0 ; i < length  ; i ++)
        {
            for(int j = 0 ; j < length ; j ++)
            {
                row[i] = Math.max(row[i] , grid[i][j]);
                col[j] = Math.max(col[j] , grid[i][j]);
            }
        }
        int ans = 0 ;
        for(int i = 0 ; i  < length ; i++) {
            for (int j = 0; j < length; j++)
            {
                ans += Math.min(col[j] , row[i]) - grid[i][j] ;
            }
        }
        return ans ;
    }
}
