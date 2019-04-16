package mianshi.s29;

import javax.annotation.processing.SupportedSourceVersion;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class s29 {
    static int ans = 0 ;
    public static void main(String[]args) throws Exception
    {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        dfs(n);
        System.out.println(ans);
    }
    public static void dfs(int n )
    {
        if(n == 0 )
        {
            ans++ ;
        }
        if(n < 0 )
        {
            return ;
        }
        dfs(n - 1);
        dfs(n - 2);
        dfs(n - 3);
        dfs(n - 4);
        dfs(n - 5);
        dfs(n - 6);

    }
}
