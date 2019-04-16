package mianshi.s11;

public class s11 {
    public static void main(String[]args)
    {
        int[] a = {3,4,5,1,2} ;

        int lo = 0 ;
        int hi = a.length- 1 ;
        int ans = -1 ;
        while (lo <= hi) {
         int mid = (lo + hi) /2 ;
         if(a[lo] < a[mid] ){
             lo = mid + 1 ;
         }
         hi = mid -1 ;
        }
        System.out.println(lo);
    }
}
