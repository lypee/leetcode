package mianshi.s38;

public class s38 {
    public static void main(String[]args){
        int[] A = {0, 5,2,1,0,4};
        int n = A.length ;
        System.out.println(getDis(A , n));
    }
    public static int getDis(int[] A , int n)
    {
        int res = 0 ;
        int[][] dis = new int[n][n] ;
        for(int i = 0 ; i < n ; i++)
        {
            for(int j = i ; j < n ; j ++)
            {
                dis[i][j] = A[j] -A[i] ;
                res = Math.max(dis[i][j], res);
            }
        }
        return res ;
    }
}
