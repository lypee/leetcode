package mianshi.s37;

public class s37 {
    public static void main(String [] args)
    {

    }
    public static int countArea(int [] A  , int n)
    {
        int length = A.length ;
        int res = 0 ;
        for(int i = 0 ; i < length ; i++)
        {
            int minHeight = A[i];
            for(int j = i+1 ; j < length ; j++)
            {
                minHeight = Math.min(minHeight, A[i]);
                res = Math.max(res , (j-i+1) * minHeight) ;
            }
        }
        return res ;
    }
}
