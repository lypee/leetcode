package easy.s70;

public class s70 {
    static int ans = 0 ;



    public static void main(String[] args)
    {
        System.out.println(climbStairs(45));
    }
    public static int climbStairs(int n)
    {
       int[] stairs = new int[10001] ;
        for(int i = 0 ; i< stairs.length ; i++)
        {
            stairs[i] = 0 ;
        }
        stairs[1] = 1 ;
        stairs[2] = 2 ;
        return dp(n ,stairs) ;
    }
    public static int dp(int n , int [] stairs)
    {
        int i = 3 ;
        for(i = 3 ; i <= n ; i++)
        {
            stairs[i] = stairs[i-1] + stairs[i-2] ;
        }
        return stairs[n] ;
    }
}
