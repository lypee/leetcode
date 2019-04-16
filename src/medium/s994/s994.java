package medium.s994;

import java.util.LinkedList;
import java.util.Queue;

public class s994 {
    public static void main(String[]args)
    {
            int[][] a = {{2,1,1} , {1,1,0} , {0,1,1}} ;
                System.out.println(orangesRotting(a));
    }
    public static int orangesRotting(int[][] grid)
    {
        if(grid.length == 0 || grid == null)
        {
            return 0 ;
        }
        //rows
        int n = grid.length ;
        //cols
        int m = grid[0].length ;
        Queue<int[]> queue = new LinkedList<>() ;
        for(int i = 0 ; i < n ; i ++)
        {
            for(int j = 0 ; j < m ; j++)
            {
                if(grid[i][j] == 2)
                {
                    queue.offer(new int[]{i, j});
                }
            }
        }
        int res =  0  ;
        int count  = 0 ;
        int[][] dirs = {{-1  , 0 } , {1 , 0} , {0 , -1} ,{0 , 1}} ;
        while(!queue.isEmpty())
        {
            count++ ;
            int[] cell = queue.poll() ;
            for(int[] d:dirs)
            {
                int  r = cell[0] + d[0] ;
                int c = cell[1] + d[1];
                if(r < 0 || r >= n || c < 0 || c >= m || grid[r][c]== 0 ||grid[r][c] ==2 )
                {
                    continue;
                }

                    grid[r][c] = 2 ;
                    queue.offer(new int[]{r,c}) ;

            }
            res = Math.max(count, res);
        }


       for(int i = 0 ; i < n ; i++)
       {
           for(int j = 0 ; j < m ; j ++)
           {
               if(grid[i][j] == 1)
               {
                   return -1 ;
               }
           }
       }
       return res ;
    }
}
