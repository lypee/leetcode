package easy.s643;

public class s643 {
    public static void main(String[]args){

    }
    public static double find(int[] nums, int K)
    {
        if(nums.length < K) return 0 ;
        if(nums.length == K) return sum(nums) * 1.0 /K ;

      long sum = 0 ;
      for(int i = 0 ; i< K ;i++){
          sum += nums[i] ;
      }
      long max = sum ;
      for(int i = K ; i < nums.length ; i++)
      {
          //第一个sum 是0- K-1  .第二个是 1 - K
          sum+= nums[i] - nums[i-K] ;
          max = Math.max(max , sum) ;
      }
      return (max * 1.0 / K ) ;
    }
    public static int sum(int[] nums){
        int ans = 0 ;
        for(int n : nums){
            ans+= n;
        }
        return ans ;
    }
}
