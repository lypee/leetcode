package jianZhiOffer.s232;

public class s232 {
    public static void main(String[]args)
    {
        int[] a = {2, 3, 1, 0, 2, 5, 3};
       for(int i = 0 ; i < a.length ; i++)
       {
           if(a[i] != i){
               swap(a , a[i],a[a[i]]);
               if(a[i] == i){
                   System.out.println("false");
               }
           }
           if(i == a.length -1 )
           {
               System.out.println("true");
           }
       }
    }
    public static void swap(int[] a , int i , int j )
    {
        int temp = a[i];
        a[i] = j  ;
        j = temp ;
    }
}
