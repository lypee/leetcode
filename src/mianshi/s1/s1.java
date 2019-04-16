package mianshi.s1;

import java.util.HashMap;
import java.util.Scanner;

/**
 * 字节跳动 第一题
 * create on 2019/4/8
 */
public class s1 {
    public static void main(String[]args)
    {
        //key :用户编号 value : 对应编号喜欢的数值
        HashMap<Integer ,Integer> hashMap = new HashMap<>();
        Scanner scanner = new Scanner(System.in);
        int n =  scanner.nextInt() ;
        int[] a = new int[n];
        for(int i = 0 ; i < n ; i++)
        {
            a[i] = scanner.nextInt() ;
        }
        int q = scanner.nextInt() ;
        //返回数组
        int[] ans = new int[q] ;
        int[][] b = new int[q][3] ;
        for(int i = 0 ; i < q ; i++)
        {
            for(int j = 0 ; j < 3 ; j ++)
            {
                b[i][j] = scanner.nextInt() ;
            }
        }
       for(int i = 0 ; i < n ; i++)
       {
           hashMap.put(a[i] , hashMap.getOrDefault(a[i] , 0) +1 ) ;
       }
       for(int i = 0 ; i < q ; i++) {
           for (int j = b[i][0]; j <= b[i][1]; j++) {
               if (b[i][2] == a[j - 1]) {
                   ans[i]++;
               }
           }
       }
       System.out.println();
    }
}
class Main{
    public int[] test(){
        //key :用户编号 value : 对应编号喜欢的数值
        HashMap<Integer ,Integer> hashMap = new HashMap<>();
        Scanner scanner = new Scanner(System.in);
        int n =  scanner.nextInt() ;
        int[] a = new int[n];
        for(int i = 0 ; i < n ; i++)
        {
            a[i] = scanner.nextInt() ;
        }
        int q = scanner.nextInt() ;
        //返回数组
        int[] ans = new int[q] ;
        int[][] b = new int[q][3] ;
        for(int i = 0 ; i < q ; i++)
        {
            for(int j = 0 ; j < 3 ; j ++)
            {
                b[i][j] = scanner.nextInt() ;
            }
        }
        for(int i = 0 ; i < n ; i++)
        {
            hashMap.put(a[i] , hashMap.getOrDefault(a[i] , 0) +1 ) ;
        }
        for(int i = 0 ; i < q ; i++) {
            for (int j = b[i][0]; j <= b[i][1]; j++) {
                if (b[i][2] == a[j - 1]) {
                    ans[i]++;
                }
            }
        }
        return ans ;
    }

}