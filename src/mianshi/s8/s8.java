package mianshi.s8;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class s8 {
    public static void main(String[]args) throws  Exception
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] s = br.readLine().split(" ") ;
        int n = Integer.parseInt(s[0]);
        int m = Integer.parseInt(s[1]) ;
        String[] ss = br.readLine().split(" ");
        int[] a = new int[n];
        for(int i = 0 ; i < n ; i ++)
        {
            a[i] = Integer.parseInt(ss[i]) ;
        }
        int[][] nnn = new int[m][2] ;
        for(int i = 0 ; i < m ; i++)
        {
            String[] strings = br.readLine().split(" ");
            nnn[i][0] = Integer.parseInt(strings[0]);
            nnn[i][1] = Integer.parseInt(strings[1]);
        }


    }
}
