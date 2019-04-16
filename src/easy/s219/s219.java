package easy.s219;

import java.util.HashMap;
import java.util.concurrent.atomic.LongAccumulator;

public class s219 {
    public static void main(String[] args){
int[] nums = {1,2,3,1,2,3} ;
int k = 2 ;
System.out.println(containsNearbyDuplicate(nums,k));
    }
    public static boolean containsNearbyDuplicate(int[] nums  , int k )
    {
        HashMap<Integer , Integer> hashMap = new HashMap<>();
        for(int index = 0 ; index < nums.length ;index ++){
            if(!hashMap.containsKey(nums[index])){
                //map中不包含key
                hashMap.put(nums[index] , index) ;
            }
            else{
                int LastIndex = hashMap.get(nums[index]);
//                System.out.println(LastIndex +" "+  index);
//                System.out.println(index - LastIndex);
                if(index - LastIndex <= k){
                    return true ;
                }
                else    {
                    hashMap.put(nums[index],index);
                }
            }
        }
        return false ;
    }
}
