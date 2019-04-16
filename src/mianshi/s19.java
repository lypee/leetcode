package mianshi;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * 混合颜料
 */
public class s19 {
    public static void main(String[]args)throws  Exception
    {

        Scanner scanner = new Scanner(System.in);
        Long start = System.currentTimeMillis() ;
        int ans = 0 ;
        int n  =  scanner.nextInt() ;
        for(int i = 0 ; i  < n; i++)
        {
            if(judge(i)){
                ans++ ;
            }
        }
        System.out.println(ans );
    }
    public static boolean judge(int n)
    {
        ArrayList<Integer> arrayList = new ArrayList<>(4);
        arrayList.add(8) ;
        arrayList.add(1) ;
        arrayList.add(0) ;
        arrayList.add(2) ;
        ArrayList<Integer> list = new ArrayList<>() ;
        int i = 0 ;
        while(n != 0)
        {
            int number = n % 10 ;
            if(number == 2 || number == 0 || number == 1 || number == 8){
                list.add(number) ;
            }
            n /= 10 ;
        }
        if(list.size() < 4 ){
            return false ;
        }
        if(list.containsAll(arrayList)) {
            return true ;
        }
        return false ;
//        for(int j = 0 ; j < list.size() ; j++)
//        {
//            if(list.get(j) == 8 ) {
//                for (int k = j; k < list.size(); k++)
//                {
//                    if(list.get(k) == 1)
//                    {
//                        for(int m = k ; m <list.size() ; m++)
//                        {
//                            if(list.get(m) == 0)
//                            {
//                                for(int z = m ; z  < list.size() ; z++)
//                                {
//                                    if(list.get(z) == 2 ) {
//                                        return true ;
//                                    }
//                                }
//                            }
//                        }
//                    }
//                }
//            }
//        }

    }

}
