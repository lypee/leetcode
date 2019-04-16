package easy.s217;

import java.util.HashMap;
import java.util.HashSet;

public class s217 {
    public static void main(String []args){

    }
    public static boolean containDuplicate(int[] nums)
    {
        HashMap<Integer , Integer> hashMap = new HashMap<>() ;
        for(int n : nums)
        {
            if(hashMap.containsKey(n)) return false ;
            else {
                hashMap.put(n , 1) ;
            }
        }
        return true ;
    }
}
