package medium.s547;

/**
 * @author Lypee
 * 2019/4/6
 */
public class s547 {
    static int n  ;
    static int ans = 1 ;
    public static void main(String[]args){
//        int[][] M = {{1,0,0,1},{0,1,1,0},{0,1,1,1},{1,0,1,1}};
//        int[][] M = {{1,1,0},{1,1,0},{0,0,1}};
        int[][] M = {{1,1,0},{1,1,1},{0,1,1}};
//        findCircleNum(M);
//        System.out.println(ans);
        System.out.println(findCircleNum(M));
    }
   public static int  findCircleNum(int[][] M)
   {
       int[] visited = new int[M.length];
       int count = 0 ;
       for(int i = 0 ; i < M.length ; i++)
       {
           if(visited[i] == 0)
           {
               dfs(M ,visited , i) ;
               count ++ ;
           }
       }
       return count ;
   }

    public static void dfs(int[][] M, int[] visited, int i) {
        for(int j  = 0 ;  j < M.length ; j ++)
        {
            if(M[i][j] == 1 && visited[j] == 0 ){
            visited[j] = 1 ;
            dfs(M , visited , j);
        }
        }
    }
}
