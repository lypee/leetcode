package easy.s849;

public class s849 {
    public static void main(String[]args){
            int[] nums =  {0,0,1,0,1,0,0,0} ;
            System.out.println(maxDistToClosest(nums));
    }
    public static int maxDistToClosest(int[] seats){
        int n = seats.length ;
        int max= 0 ;
        //人数
        int i = 0 ;
        while(i < n){
            while ( i < n && seats[i] == 1){
                i++ ;
            }
            //j copy number
            int j = i ;
            while( i< n && seats[i] == 0){
                i++ ;
            }
            System.out.println("i : " + i + " , " + j);
            if(j == 0 || i == n){
                max = Math.max(max , i-j) ;
            }
            else {
                max = Math.max(max,(i-j+1)/2) ;
            }
        }
        return max ;
    }
}
