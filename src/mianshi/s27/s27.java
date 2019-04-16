package mianshi.s27;

public class s27 {
    static int ans = 0 ;
    static int res = 0 ;
    public static void main(String[]args)
    {
        int[][] board = {{138,457,411,440,433,149},{203,288,318,597,246,686},{442,105,424,544,406,532},{172,592,626,410,511,636},{394,596,644,454,343,389},{573,460,307,221,325,104}};
        getMost(board) ;
        System.out.println(ans + " " + res);
    }
    public static int getMost(int[][] board)
    {
        dfs(0 , 0 , board , 0 );
        return res ;
    }
    public static void dfs(int x ,int y ,int[][] board , int money)
    {
        if (x < 0 || y < 0 || x > board.length- 1 || y > board.length - 1 ||
                board[x][y] < 1 ) {
            return ;
        }
        money += board[x][y] ;
        if(x == board.length-1 && y == board.length -1)
        {
            ans++ ;
            res = Math.max(res , money) ;
        }
        int temp = board[x][y] ;
        board[x][y] = 0 ;
        dfs(x+1 , y , board , money);
        dfs(x, y + 1, board, money);
       board[x][y] = temp ;
    }
}
