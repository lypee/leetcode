package easy.s53;

public class s53 {
    public static void main(String [] args)
    {
        int[] array = {-2,1,-3,4,-1,2,1,-5,4} ;
        System.out.println(maxSubArray(array));
    }
    public static int maxSubArray(int[] nums)
    {
        if(nums == null && nums.length == 0) return 0 ;
        int sum = 0 ;
        int max = Integer.MIN_VALUE ;
        for(int i = 0 ; i < nums.length ; i++)
        {
            //如果sum表示 i之前的最大的和
            //如果sum + nums[i] 比 sum还小 说明可以不要nums[i]

            sum =Math.max(nums[i]  , sum + nums[i]) ;
            max = Math.max(sum  , max) ;
        }
         return max ;
    }
}
