package mianshi.s39;

public class s39 {
    public static void main(String[]args)
    {}
    public static int countArea(int[] A , int n)
    {
        int length = A.length ;
        int res = 0 ;
        int len = A.length ;
        for(int i = 0 ; i < len ; i++)
        {
            int minHeight = A[i];
            for(int j = i+1 ; j < len  ; j ++)
            {
                minHeight = Math.min(minHeight, A[j]);
                res = Math.max(res, (j - i + 1) * minHeight);
            }
        }
        return res ;
    }
}
