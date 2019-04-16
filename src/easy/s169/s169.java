package easy.s169;

import java.util.HashMap;

public class s169 {
    public static void main(String[] args){
//        HashMap<Integer , Integer> hashMap = new HashMap<>() ;
//        hashMap.put(1,3) ;
//        System.out.println(hashMap.get(1));
//        hashMap.getOrDefault(2 , 56) ;
//        System.out.println(hashMap.get(1));
//        hashMap.put(2,hashMap.getOrDefault(2,1)+1)  ;
//        System.out.println(hashMap.get(2));
        int[] nums = {3,4,3} ;
        System.out.println(majorityElement(nums));
    }
    public static int majorityElement(int[] nums){
        HashMap<Integer , Integer> hashMap = new HashMap<>() ;
        for(int i = 0  ; i< nums.length ; i++){
            if(!hashMap.containsKey(nums[i])){
                hashMap.put(nums[i] , 1);
            }else{
                hashMap.put(nums[i] , hashMap.getOrDefault(nums[i] ,0) +1 ) ;
            }
        }
        int count = -1 ;
        int ansNumber = Integer.MIN_VALUE ;
        for(Integer n : hashMap.keySet()){
            if(hashMap.get(n) > count ){
               count = hashMap.get(n) ;
                ansNumber = n ;
            }
        }
        return ansNumber ;
    }
}
