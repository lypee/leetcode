package mianshi.s24;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.TreeSet;

public class s24 {
    public static void main(String[]args)throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] s = br.readLine().split(" ") ;
        int n = Integer.parseInt(s[0]);
        int m = Integer.parseInt(s[1]) ;
        TreeSet<Integer> treeSet1 = new TreeSet<>();
        TreeSet<Integer> treeSet2 = new TreeSet<>();
        String[] ss = br.readLine().split(" ");
        String[] sss = br.readLine().split(" ");
        for(int i = 0 ; i < n ; i++)
        {
            treeSet1.add(Integer.parseInt(ss[i]));
        }
        for(int i = 0  ; i< m ; i ++)
        {
            treeSet2.add(Integer.parseInt(sss[i]));
        }
        treeSet1.addAll(treeSet2) ;
        int size = treeSet1.size() ;
      while(!treeSet1.isEmpty())
      {
          if(treeSet1.size() == 1)
          {
              System.out.print(treeSet1.pollFirst());
              break ;
          }
          System.out.print(treeSet1.pollFirst()+" ");
      }
    }
}
