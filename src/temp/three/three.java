package temp.three;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashMap;

public class three {
    public static void main(String[]args)
    {
        s2 s2 = new s2() ;
        int ans = 0 ;
        for(int i = 101 ; i <= 999 ; i++)
        {
           if(s2.test(i)) {
                ans++ ;
            }
        }
        System.out.println(ans);
    }

}

class test{
    public boolean test(int n )
    {
        int[] a = new int[4] ;
       for(int i = 0 ; i < 4 ; i++)
       {
           a[i] = n % 10 ;
           n /= 10 ;
       }
        HashMap<Integer , Integer >hashMap = new HashMap<>() ;
       for(int i = 0 ; i < 4 ; i++)
       {
           hashMap.put(a[i] , hashMap.getOrDefault(a[i],0)+1);
       }
       if(hashMap.size() == 3 ) {
           return true ;
       }
       return false ;
    }
}
class s1{
    public int test(int n )
    {
       int ans = 7 ;

       for(int i = 0 ; i < 2014 ; i++)
       {
            ans *= 7 ;
            ans = ans % 100 ;
       }
        System.out.println(ans);
return 0 ;
    }
}

/**
 * 最长递增子序列
 */
 class max {
    public static void max()
    {
        int[] a = {1, 7, 3, 5, 8, 4, 8};
        int b[][]  = test(a) ;
        for(int i = 0 ; i < a.length ; i++)
        {
            for(int j = 0 ; j < a.length ; j++)
            {
                System.out.print(  "\t" + b[i][j]);
            }
            System.out.println();
        }
    }

    public static int[][] test(int[] a) {
        int[] b = a.clone() ;
        int n = a.length ;
        int[][] ans = new int[n+1][n+1] ;
        for(int i = 0 ; i < n ; i++)
        {
            if(a[i] > b[0]){
                ans[0][i] = 1 ;
                ans[i][0] = 1 ;
            }
        }
        for(int i = 1 ; i < n ; i++)
        {
            for(int j = 1 ; j < n ; j++)
            {
                if(a[j] > b[i])
                {
                    ans[i][j] = ans[i-1][j-1] + 1 ;
                }
            }
        }
        return ans ;
    }
}
class s2 {
     public boolean test(int n)
     {
         int[] a = new int[3] ;
         for(int i = 0 ; i< 3 ; i++)
         {
             a[i] = n % 10 ;
             n /= 10 ;
         }
         Arrays.sort(a);
         if( !(a[0] +a[1] > a[2] && a[0] + a[2] > a[1] &&
         a[1] + a[2] > a[0] )){
             return false ;
         }
         HashMap<Integer, Integer> hashMap = new HashMap<>(16) ;
         for(int i = 0 ; i < 3 ; i++)
         {
             hashMap.put(a[i] , hashMap.getOrDefault(a[i],0)+1 ) ;
         }
         if(hashMap.size() <= 2 && hashMap.size() > 0) {
             return true ;
         }
         return false ;

     }
}
