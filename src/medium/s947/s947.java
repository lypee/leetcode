package medium.s947;

public class s947 {
    static int ans = 0 ;
    public static void main(String[]args)
    {
        int[][] stones = {{0,0},{0,1},{1,0},{1,2},{2,1},{2,2}} ;

        System.out.println(removeStones(stones));
    }
    public static   int removeStones(int[][] stones)
    {
        int n = stones.length ;
        int[] visited = new int[n] ;
        for(int i = 0 ; i < n ; i ++)
        {
            dfs(i , stones , visited) ;
        }
        return ans ;
    }
    public static void dfs(int i , int[][] stones , int[] visited)
    {
        if(visited[i] == 1 ){
            return  ;
        }
        for(int j = 0 ; j < stones.length ; j ++)
        {
            if(j == i )
            {
                continue;
            }
            if(stones[i][1] == stones[j][0]){
                visited[j] = 1 ;
                dfs(j , stones , visited) ;
            }
        }
        ans ++ ;

    }
}
