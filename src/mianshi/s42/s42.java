package mianshi.s42;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class s42 {
    public static void main(String[]args) throws Exception {
        StringBuilder s1 = new StringBuilder();
        StringBuilder s2 = new StringBuilder();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] strings = br.readLine().split(" ");

            for (int i = 0; i < Integer.parseInt(strings[1]); i++) {
                s1.append(strings[0]);
            }
            for (int i = 0; i < Integer.parseInt(strings[3]); i++) {
                s2.append(strings[2]);
            }
            System.out.println(compare(s1.toString(), s2.toString()));
        }

    public static String compare(String s1 , String s2)
    {
//        Integer n1 = Integer.parseInt(s1);
//        Integer n2 = Integer.parseInt(s2);
//        if(n1.equals(n2)){
//            return "Equal";
//        }
//        if(n1 > n2) {
//            return "Greater" ;
//        }
//        return "Less" ;
        if(s1.length() > s2.length())
        {
            return "Greater";
        }
        if(s2.length() > s1.length())
        {
            return "Less";
        }
        if(s1.equals(s2) )
        {
            return "Equal" ;
        }
        int n = Math.min(s1.length() ,s1.length() ) ;
        for(int i = 0 ; i < n ; i ++)
        {
            if(s1.charAt(i) < s2.charAt(i)){
                return "Less";
            }
        }
       return "Greater" ;

    }
}
