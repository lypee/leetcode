package easy.s475;

import java.util.Arrays;

public class s475 {
    public static void main(String[] args){

            int[] houses = {1,2,3,4} ;
            int[] heaters = {1,4} ;
            System.out.println(findRadius(houses , heaters));
    }
    public static int findRadius(int[] houses , int[] heaters){
        Arrays.sort(heaters);
        int res = -1 ;
        for(int house : houses){
            int index = Arrays.binarySearch(heaters  , house) ;
            System.out.println("index: "+index);
            if(index < 0 ){
                index = -(index + 1 ) ;
            }
            //index  = -2 -1 0 1
            int distL = index -1 >= 0 ? house-heaters[index-1] : Integer.MAX_VALUE ;
            int distR = index < heaters.length ? heaters[index] -house: Integer.MAX_VALUE ;
            res = Math.max(res , Math.min(distL , distR)) ;
        }
        return res ;
    }
}
