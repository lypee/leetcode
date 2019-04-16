package mianshi.s36;

import org.omg.CORBA.CODESET_INCOMPATIBLE;

public class s36 {
    static int ans = 0 ;

    public static void main(String[]args)
    {
        int[][] map ={{0,1,0},{2,0,0}} ;
        System.out.println(countPath(map , 2 ,3));
    }

    public static int countPath(int[][] map, int n, int m) {
        int x = -1  ;
        int y = -1 ;
        for(int i = 0 ; i < n ; i++)
        {
            for(int j = 0 ; j < m ; j ++)
            {
                if(map[i][j] == 1){
                    x = i ;
                    y = j ;
                    break ;
                }
            }
        }
        dfs(x , y , map , n , m) ;
        return ans ;
    }
    public static void dfs(int x , int y  ,int[][] map , int n , int m) {
        if (x < 0 || y < 0 || x > n -1 ||
                y > m - 1) {
            return;
        }
        if (map[x][y] == -1)
        {
            return ;
        }
        if(map[x][y] == 2)
        {
            ans ++ ;
            return ;
        }

        map[x][y] = -1 ;
        dfs(x + 1, y, map,n , m );
        dfs(x - 1, y, map,n , m );
        dfs(x, y + 1, map,n , m );
        dfs(x, y - 1, map,n , m );
        map[x][y] = 0 ;
    }
}
