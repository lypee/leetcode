package mianshi.s5;

/**
 * 斐波那契数列
 */
public class s5 {
    public static void main(String[] args) {
        int a = 1 ;
        int b =  0;
        int n =  0 ;
    for(int i = 0 ; i< 10 ; i++)
    {
        n = a+ b ;
        b = a ;
        a = n ;
    }
        System.out.println(a+ " " + b);
    }
}

