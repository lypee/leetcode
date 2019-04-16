package mianshi.s2;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;
import java.util.TreeSet;

/**
 * 字节跳动第二题
 */
public class s2 {
    public static void main(String[]args)
    {
        Main main = new Main() ;
        main.Main() ;
    }
}
class Main{
    public int Main(){
        Scanner scanner = new Scanner(System.in);
        int n  =scanner.nextInt() ;
        int m = scanner.nextInt() ;
        int c = scanner.nextInt() ;
        ArrayList<Integer> resList = new ArrayList<>() ;
        int[][] number =  new int[n][c] ;
        for(int i = 0 ; i <n ; i ++)
        {
            int num_i = scanner.nextInt() ;
            for(int j = 0 ; j < num_i ; j++)
            {
                number[i][j] = scanner.nextInt() ;
            }
        }
        TreeSet<Integer> treeSet = new TreeSet<Integer>() ;
        for(int i = 0 ; i < n- 1; i ++)
        {
            for(int j = 0 ; j < number[i].length ; j++)
            {
                for(int  k = 0 ; k < number[i+1].length ; k++)
                {
                    if(number[i][j] == number[i+1][k]){
                        treeSet.add(number[i][j]);
                    }
                }
            }
        }
        for(int i =0 ; i < number[0].length ; i++)
        {
            for(int j = 0 ; j < number[number.length-1].length ; j++)
            {
                if(number[0][i] == number[number.length-1][j]){
                    treeSet.add(number[0][i]);
                }
            }
        }
        System.out.println();
        return treeSet.size() -1;
    }

}
