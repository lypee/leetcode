package mianshi.s35;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class s35 {
    public static void main(String[]args)
    {


    }

    public int getDis(int[] A, int n) {
        int length = A.length ;
        int[][] dis = new int[n][n];
        for(int i = 0 ; i < n ; i++)
        {
            for(int j = i ; j < n ; j ++)
            {
                dis[i][j] = A[j] - A[i] ;
            }
        }
        int res = Integer.MIN_VALUE;
        for(int i = 0 ; i < n ; i++)
        {
            for(int j = i ; j  < n ; j++)
            {
                res =  Math.max(dis[i][j] , res) ;
            }
        }
        return res  ;
    }

}
