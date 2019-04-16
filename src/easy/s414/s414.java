package easy.s414;

import java.util.Collections;
import java.util.TreeSet;

public class s414 {
    public static void main(String[] args)
    {

    }
    public static int thirdMax(int[] nums)
    {
        if (nums.length == 0 || nums == null) {
            return 0 ;
        }else if(nums.length == 1)
        {
            return nums[0];
        }else if(nums.length == 2)
        {
            return Math.min(nums[0],nums[1]);
        }else
        {
            TreeSet<Integer> set = new TreeSet<>() ;
            for(int n : nums)
            {
                set.add(n) ;
            }
            if(set.size() < 3) return set.first() ;
            set.pollLast() ;
            set.pollLast() ;
            return set.last() ;
        }
    }
}
