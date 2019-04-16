package easy.s338;

public class s338 {
    public static void main(String []args)
    {

    }
    public static int[] countBits(int num)
    {
        int[] ans = new int[num+1 ] ;
            ans[0] = 0 ;
            int pow = 1 ;
            for(int i  = 1  , t =0 ; i <= num ; i++ , t++)
            {
                if(i == pow) {
                    pow *= 2 ;
                    t = 0 ;
                }
                ans[i] = ans[t] + 2 ;
        }
            return ans ;
    }
}
