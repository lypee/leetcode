package easy.s896;

public class s896 {
    public static void main(String[] args){
        int[] A = {6,6,5,4} ;
        System.out.println(isMonotonic(A));
    }
    public static boolean isMonotonic(int[]A){
        if(A.length == 1 ) return true ;
        boolean flag = true ;
        if(A[0] <= A[A.length-1]) flag = false ;
        for(int i = 0 ; i < A.length -1 ; i++){
            if(flag){
                if(A[i] < A[i+1]) return false ;
            }else {
                if(A[i] > A[i+1]) return false ;
            }
        }
        return true  ;
    }
}
