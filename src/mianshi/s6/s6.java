package mianshi.s6;

/**
 * 青蛙跳台阶
 */
public class s6 {
   public static void main(String[]args)
   {
       int a = 1 ;
       int b = 2 ;
       int n = 1 ;
       for(int i = 3 ; i < 10 ; i++)
       {
           n = a + b ;
           a = b;
           b = n ;
       }
       System.out.println(n);
   }

}
