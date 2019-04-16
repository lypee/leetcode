package easy.s122;

public class s122 {
    public int maxProfit(int[] prices)
    {
        int ans = 0 ;
        for(int i = 0 ;  i< prices.length -1 ; i++)
        {
            int n = prices[i+1] - prices[i] ;
            if(n > 0) ans += n ;
        }
        return ans ;
    }
}
