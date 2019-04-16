package easy.s35;

public class s35 {
    public static void main(String[] args)
    {
        int[] nums = {1, 3, 5, 6};
        int k = 5;
        System.out.println(searchInsert1(nums , k));
    }
    public static int searchInsert(int[] nums  , int target)
    {
        for(int i = 0 ; i < nums.length ; i++)
        {
            if(nums[i] >= target) return i ;
        }
        return nums.length ;
    }
    public static int searchInsert1(int[] nums , int target)
    {
        int hi = nums.length -1 ;
        int lo = 0 ;
        while(lo <= hi)
        {
            int mid = (lo + hi) / 2 ;
            if(nums[mid] == target) return mid ;
            if(nums[mid] < target)
            {
                lo = mid + 1 ;
            }else {
                hi = mid -1 ;
            }
        }
        return lo ;
    }
}
