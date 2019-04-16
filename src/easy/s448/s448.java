package easy.s448;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class s448 {
    public static void main(String[] args)
    {
            int[] nums = {4,3,2,7,8,2,3,1};
            for(int n : findDisNum(nums))
            {
                System.out.println(n);
            }
    }
    public static List<Integer> findDisNumber(int[] nums)
    {
        List<Integer> ansList = new ArrayList<>() ;
        for(int i = 0 ; i < nums.length ; i++)
        {
            int val = Math.abs(nums[i] ) -1 ;
            if(nums[val] > 0 ) nums[val] = -nums[val] ;
        }
        for(int i  = 0 ; i< nums.length ; i++){
            if(nums[i] < 0 ) ansList.add(i+1) ;
        }
        return ansList ;
    }
    public static List<Integer> findDisNum(int[] nums)
    {
        HashMap<Integer , Integer> hashMap = new HashMap<>() ;
        List<Integer> ansList = new ArrayList<>() ;
        int min = Integer.MAX_VALUE ;
        for(int n : nums)
        {
            min = Math.min(min , n) ;
            hashMap.put(n,1) ;
        }
        for(int i = min  ; i < min+ nums.length ; i ++)
        {
            if(!hashMap.containsKey(i)) ansList.add(i) ;
        }
        return ansList ;
    }
}
