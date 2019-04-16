package medium.s3;

import java.util.HashSet;
import java.util.Set;

public class s3 {
    public static void main(String[] args)
    {

    }
    public static int lengthOfLongestSubString(String s )
    {
        int length = s.length() ;
        int ans = 0 ;
        int start = 0 , end = 0 ;
        Set<Character> set = new HashSet<>() ;
        while(start < length && end < length)
        {
            if(set.contains(s.charAt(end))) set.remove(s.charAt(start++));
            else {
                set.add(s.charAt(end++));
                ans = Math.max(ans  , end - start) ;
            }
        }
        return ans ;
    }
}
