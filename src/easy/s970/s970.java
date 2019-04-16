package easy.s970;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

public class s970 {
    public static void main(String[] args){
        int x = 5;
        int y = 3 ;
        int bound = 15 ;
        System.out.println(powerfulIntegers(x,y,bound));
    }
    public static List<Integer> powerfulIntegers(int x , int y , int bound){
//        Long curTime1 = System.currentTimeMillis() ;
//        Long curTime2 = System.currentTimeMillis() ;
//        System.out.println(curTime2-curTime1);
        HashSet<Integer> hashSet = new HashSet<>() ;
        for(int i= 0 ; i <= bound ; i++){
            if(isPowerfulIntegers(x,y,i)){
                hashSet.add(i) ;
            }
        }
        List<Integer> arrayList = new ArrayList<>() ;
        Iterator iterator = hashSet.iterator() ;
        while(iterator.hasNext()){
            arrayList.add((int)iterator.next()) ;
        }
        return  arrayList;
    }
    public static boolean isPowerfulIntegers(int x , int y ,int n){
        for(int i = 0 ; i  < n ; i++){
            for(int j = 0 ; j < n ; j++){
                if((double )n == (Math.pow(x,i)+Math.pow(y,j)) || (double)n == (Math.pow(x,j) + Math.pow(y,i))){
                    System.out.println(i+ " , " + j);
                    return true ;
                }
            }
        }
        return false ;
    }
}
