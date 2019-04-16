package easy.s771;

import java.util.HashSet;
import java.util.Set;

public class s771 {
    public static void main(String []args){

    }
    public static int num(String J ,String S)
    {
        int ans = 0 ;
        HashSet hashSet = new HashSet() ;
        for(char j : J.toCharArray()){
            hashSet.add(j);
        }
        for(char s:S.toCharArray()){
            if(hashSet.contains(s)){
                ans++ ;
            }
        }
        return ans ;
    }
}
