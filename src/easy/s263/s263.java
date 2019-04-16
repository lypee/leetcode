package easy.s263;

public class s263 {
    public static void main(String[] args){
        System.out.println(isugly(10));
    }
    public static boolean isugly(int num){
        if(num == 1) return true ;
        else if(num == 0) return false ;
        else {
            while(num != 1){
                if(num % 2 == 0) num /= 2;
                else if(num % 3 == 0 ) num /=3 ;
                else if(num % 5 == 0) num /= 5 ;
                else return false ;
            }
        }
        return true ;
    }
    public static boolean isUgly(int num){
        if(num == 2 || num ==3 || num == 5 ) return true ;
        boolean ans = false  ;
        int[] number = {2,3,5} ;
        int count = num / 2 ;
        for(int i = 0 ; i < 3 ; i++){

            if(num == 1 ) {
                ans = true ;
                break ;
            }
            if(num % number[i] == 0 ){
                num = num/number[i] ;
                i = -1  ;
//                System.out.println(num);

            }
        }
            return ans ;
    }
    public static boolean isPrime(int n){
        if(n == 2 || n == 5 || n == 3) return true ;
        for(int i = 2 ; i <= Math.sqrt(n) ; i++){
            if(n % i == 0) return false ;
        }
        return true ;
    }
}
