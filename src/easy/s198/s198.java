package easy.s198;

public class s198 {
    public static void main(String[] args)
    {
        int[] nums = {1,2,3,1} ;
        System.out.println(rob(nums));
    }
    public static int rob(int[] nums)
    {
        int[] money = new int[nums.length + 2 ] ;
        //边界情况
        if(nums.length == 0 && nums == null) return 0 ;
        else if(nums.length == 1 ) return nums[0] ;
        else if(nums.length == 2) return Math.max(nums[0],nums[1]) ;
        else {
            //初始化数组 默认全部为 0 ;

            money[0] =nums[0] ;
            money[1] = Math.max(nums[0] , nums[1]) ;
            for(int i = 2 ; i < nums.length  ; i++)
            {
                money[i] = Math.max(nums[i] + money[i-2], money[i-1]);
            }
        }
        return money[nums.length  -1] ;
    }
}
