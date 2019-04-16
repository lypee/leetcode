package easy.s349;

import java.util.HashMap;
import java.util.Set;
import java.util.TreeSet;

public class s349 {
    public static void main(String[]args)
    {
        int[] a = {4,3,9,3,1,9,7,6,9,7};
        int[] b = {5,0,8};
        int[] ab = intersection(a, b);
        ;
    }

    public static int[] intersection(int[] nums1, int[] nums2) {
        int[] res = new int[0] ;
        if(nums1.length == 0 || nums2.length == 0 )
        {
            return new int[0] ;
        }
        HashMap<Integer, Integer> hashMap = new HashMap<>(16);
        HashMap<Integer, Integer> hashMap2 = new HashMap<>(16);
        TreeSet<Integer> numberSet = new TreeSet<Integer>();
        for (int number : nums1) {
            hashMap.put(number , 1 ) ;
        }
        for(int number : nums2)
        {
            if(hashMap.containsKey(number))
            {
                numberSet.add(number) ;
            }
        }

        int[] ans = new int[numberSet.size()];
        if(numberSet.size() == 0 )
        {
            return ans ;
        }
        for(int i = 0 ; i <= numberSet.size() ; i++)
        {
            ans[i] = numberSet.pollFirst() ;
        }
        return ans ;
    }
}
