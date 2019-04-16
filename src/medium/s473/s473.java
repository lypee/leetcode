package medium.s473;

import java.util.concurrent.locks.ReentrantLock;

public class s473 {
    public static void main(String[] args)
    {
        makesquare(new int[]{1,1,2,2,2});
    }
    public static boolean makesquare(int[] nums)
    {
        if(nums.length == 0 || nums == null)
        {
            return false ;
        }
        int sum = sum(nums);
        if(sum % 4  != 0){
            return false ;
        }
        int edge = sum / 4 ;
        dfs(0, 0, nums, edge);
        System.out.println();
        return false ;
    }
    public static void dfs(int i ,int length , int[] nums , int edge)
    {

        if(length == edge)
        {
            return ;
        }
        for(int index = 0 ; index < nums.length ; index++)
        {
            if(length == edge)
            {
               continue;
            }
            int temp = nums[index];
            nums[index] = 0;
            dfs(index+1, length + nums[index], nums, edge);
            nums[index] = temp ;
        }
    }
    public static int sum(int[]a)
    {
        int ans = 0 ;
         for(int i = 0 ; i < a.length ; i++)
         {
             ans += a[i];
         }
         return ans ;
    }
}
