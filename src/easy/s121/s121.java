package easy.s121;

public class s121 {
    public static void main(String[] args)
    {

    }
    public int axProfit(int[] prices)
    {
        int ans = 0 ;
        for(int i =  0 ; i < prices.length -1  ; i++)
        {
            for(int j = i+ 1 ; j < prices.length ;j++)
            {
                if(prices[j] - prices[i] > ans){
                    ans = prices[j] - prices[i] ;
                }
            }
        }
        return ans ;
    }
}
