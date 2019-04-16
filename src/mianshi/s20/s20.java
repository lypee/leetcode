package mianshi.s20;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;

public class s20 {
    public static void main(String[]args) throws IOException
    {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bufferedReader.readLine());
        int[] a = new int[n];
        String[] s = bufferedReader.readLine().split(" ");
        for(int i = 0 ; i < n ; i++)
        {
            a[i] = Integer.parseInt(s[i]);
        }
        System.out.println(dfs(a ,0,0,1));
    }
    public static int dfs(int[] nums , int index , long sum ,
                          long multi)
    {
        int count = 0 ;
        for(int i = index ; i < nums.length; i++)
        {
            sum += nums[i];
            multi *= nums[i];
            if(sum > multi)
            {
                count += 1 + dfs(nums, i + 1, sum, multi);
            }else if(nums[i] == 1)
            {
                count += dfs(nums, i + 1, sum, multi);
            }else{
                break;
            }
            sum -= nums[i];
            multi /= nums[i];
            while (i < nums.length - 1 && nums[i] == nums[i + 1]) {
                i++ ;
            }
        }
        return count ;
    }
    public static boolean isLucky(int[] a)
    {
        int n = a.length ;
        Long sum = 0L ;
        Long column = 1L ;
        Arrays.sort(a);

        for(int i = 0 ; i < n ; i++)
        {
            sum += a[i];
        }
        for(int i = 0 ; i < n ; i ++)
        {
            if(column > sum)
            {
                return false ;
            }
            column *= a[i] ;
        }
            return true ;
    }
}
