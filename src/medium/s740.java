package medium;

import java.util.*;

public class s740 {
    public static void main(String[]args)
    {
        int[] a = {1,6,3,3,8,4,8,10,1,3} ;
        int b = deleteAndEarn(a);

        System.out.println(b);

    }
    public static int deleteAndEarn(int[] nums)
    {
        if(nums .length == 0 || nums == null){
            return 0 ;
        }


        Arrays.sort(nums);
        int ans = 0 ;
        //取出dp[i] 比dp[i]小的最大收益 ,
        TreeSet<Integer> numsSet = new TreeSet<>() ;
        for(Integer integer : nums)
        {
            numsSet.add(integer) ;
        }
        if(numsSet.size() == 1 ){
            return nums[0] * nums.length ;
        }
        //value 表示key出现的次数
        TreeMap<Integer , Integer> hashMap = new TreeMap<Integer , Integer>() ;
        for(int i = 0 ; i < nums.length ; i++)
        {
            if(hashMap.containsKey(nums[i]) )
            {
                int number = hashMap.get(nums[i]) ;
                hashMap.put(nums[i] , ++number) ;
            }else{
                hashMap.put(nums[i] , 1) ;
            }
        }
        int[] dp = new int[hashMap.size()] ;
//        dp[0] = hashMap.get(nums[0]) * nums[0] ;
//        dp[1] = hashMap.get(nums[1]) * nums[1] ;
        int m = 0 ;
        for(Integer integer : hashMap.keySet())
        {
            if(m ==2 ) {
                break ;
            }
            dp[m] = hashMap.get(integer) * integer ;
            m++ ;
            numsSet.pollFirst() ;
        }
        dp[1] = Math.max(dp[0] , dp[1]) ;
        if(nums.length == 2 )
        {
            if(nums[1] - nums[0] > 1 ) {
                return nums[1] * hashMap.get(nums[1]) + nums[0] * hashMap.get(nums[0]);
            }else {
                return nums[1] * hashMap.get(nums[1]) ;
            }
        }


        for(int i = 2 ; i < hashMap.size() ; i ++)
        {
            int number = numsSet.pollFirst() ;
            dp[i] = Math.max(dp[i-1] , dp[i-2] + hashMap.get(number) * number) ;

        }

        int res = Integer.MIN_VALUE ;
        for(int i = 0 ; i < dp.length ; i++)
        {
            res = Math.max(dp[i] , res) ;
        }
        return res ;
    }

}
