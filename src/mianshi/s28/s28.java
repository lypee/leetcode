package mianshi.s28;

import org.omg.PortableInterceptor.SYSTEM_EXCEPTION;

public class s28 {
    public static void main(String[]args)
    {
        System.out.println((int)Math.ceil(calcDistance(100,90 ,80, 70)));
//        System.out.println(dfs(100));
    }

    public static double calcDistance(int A, int B,
                                   int C, int D) {
       return dfs(A) + dfs(B) + dfs(C) + dfs(D) + A + B +C+D ;
    }
    public static double dfs(double n)
    {
        if(n > 0.0001 )
        {
            return n + dfs(n/2) ;
        }else if(n <= 1 )
        {
            return 0 ;
        }
        return 0 ;
    }
}
