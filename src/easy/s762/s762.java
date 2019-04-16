package easy.s762;

public class s762 {
    public static void main(String [] args) {
//        int n = 11 ;
//        System.out.println(2 & 1  );
//        System.out.println(2>>>1);
//        int count = 0 ;
//       while(n > 0 ){
//          count += n&1 ;
//          n>>>= 1 ;
//       }
//       System.out.println(count);
//    }
        int l = 10 ;
        int r = 15 ;
//        System.out.println(countPrimeSetBits(l ,r));
        System.out.println(countAndJudge(15));
    }
    public static int countPrimeSetBits(int L ,int R){
        int ans = 0 ;
        for(int i = L ; i <= R ; i ++){
            if(countAndJudge(i)){
                System.out.println(i);
                ans++ ;
            }
        }
        return ans ;
    }
    public static boolean countAndJudge(int n ){
        int ans = 0 ;
        while(n > 0){
            ans += n& 1 ;
            n >>>= 1 ;
        }
//        System.out.println(ans);
        if(ans == 1 || ans == 0 ) return false ;
        for(int i = 2 ; i <= Math.sqrt(ans) ; i++){
            if(ans % i == 0 ) return false ;
        }
        return true  ;
    }
}
