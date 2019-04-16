package mianshi.s21;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class s21 {
    public static void main(String[]args)throws Exception
    {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bufferedReader.readLine());
        int[] a = new int[n];
        String[] strings = bufferedReader.readLine().split(" ");
        for(int i = 0 ; i < n ; i++)
        {
            a[i] = Integer.parseInt(strings[i]);
        }


    }
    public static int sentryNum(int n , int[] h)
    {
        int num = 0 ;
        int k = 0 ;
        int l = 0 ;
        boolean ite = true ;
        for(int i = 0; i < n/2 +1 ;i++)
        {
            if(i< n-2 )
            {
                for(int j = i + 2 ; j < n ; j++)
                {
                    ite = true ;
                    if( i == 0 && j == n-1)
                    {
                        break ;
                    }
                    for(k = i+1 ; k < j ; k++)
                    {
                        if (h[k] > h[i] || h[k] > h[j]) {
                            ite = false ;
                            break ;
                        }
                    }
                    if(ite)
                    {
                        num ++ ;
                        continue;
                    }
                    if(i == 0 )
                    {
                        l = n ;
                    }else {
                        l = i ;
                    }
                    boolean cycle = false ;
                    for(k = j+1 ; ; k++)
                    {
                        if(k >= n)
                        {
                            k -= n ;
                            cycle = true ;
                        }
                        if(k >= l && cycle)
                        {
                            break ;
                        }
                        ite = true ;
                        if(h[k] > h[i] || h[k] > h[j])
                        {
                            ite = false ;
                            break ;
                        }
                    }
                    if(ite)
                    {
                        num++ ;
                    }
                }
            }
        }
        num += n ;
        return num ;
    }
}
