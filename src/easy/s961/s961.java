package easy.s961;

import java.util.HashMap;
import java.util.Iterator;

public class s961 {
    public static void main(String[]args)
    {
        int[] A = {1, 2, 3, 3};
        System.out.println(repeatedNTimes(A));
    }
    public static int repeatedNTimes(int[]A)
    {
        HashMap<Integer, Integer> hashMap = new HashMap<>(16);
        for(int i = 0 ; i < A.length ; i++)
        {
            hashMap.put(A[i] , hashMap.getOrDefault(A[i],0) +1 );
        }
        int ans = Integer.MIN_VALUE ;
        int number = Integer.MIN_VALUE ;
        int res  = 1 ;
        for(Integer key : hashMap.keySet())
        {
            number =  hashMap.get(key) ;
            ans = Math.max(ans , hashMap.get(key));
            if(number == ans ) {
                res = key ;
            }
        }
        return res ;
    }
}
