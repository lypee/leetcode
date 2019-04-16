package easy.s303;

public class s303 {
    int[] nums ;
    public static void main(String[] args)
    {

    }
    public int sumRange(int i , int j)
    {
        if( i == 0 )return nums[j] ;
        return nums[j] - nums[i-1] ;
    }
    public  int  NumArray(int[] nums)
    {
        for(int i = 1 ; i< nums.length ; i++)
        {
            nums[i] += nums[i-1] ;
        }
        this.nums = nums ;
        return 0 ;
    }
}
