package mianshi.s14;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.nio.Buffer;

/**
 * 最大连续子数组
 */
public class s14 {
    public static void main(String[]args) throws  Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String[] s = br.readLine().split(" ");
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = Integer.parseInt(s[i]);
        }
        int curNum = 0;
        int res = -1;
        for (int i = 0; i < n; i++)
        {
            if(curNum  < 0 )
            {
                curNum = a[i];
            }else {
                curNum += a[i] ;
            }
            if(curNum > res )
            {
                res = curNum ;
            }
        }
        System.out.println(res);
    }
}
