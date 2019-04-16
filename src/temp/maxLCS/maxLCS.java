package temp.maxLCS;

public class maxLCS {
    public static void main(String[]args)
    {
        String s = "123fsadcasw";
        String ss = "123fasdcaswss";
maxLCS(s ,ss) ;
    }
    public static int maxLCS(String s1 , String s2)
    {
        int n1 = s1.length() ;
        int n2 = s2.length() ;
        int[][] length = new int[n2][n1];
        for(int i = 0 ; i < n1 ; i++)
        {

        }
        for(int i = 0 ; i < n2 ; i++)
        {
            for(int j = 0 ; j < n1 ; j ++)
            {
                if(j == 0){
                    if(s2.charAt(i) == s1.charAt(0)){
                        length[i][j] = 1 ;
                    }
                }else if(i == 0){
                    if(s1.charAt(0) == s2.charAt(j)){
                        length[j][i] = 1 ;
                    }
                }else{
                    if(s1.charAt(j) == s2.charAt(i))
                    {
                        length[i][j] = length[i-1][j-1] + 1 ;
                    }
                }
            }

        }
        int res = Integer.MIN_VALUE ;
        for(int m = 0 ; m < n2 ; m++ )
        {
            for(int n = 0 ; n < n1 ; n++)
            {
                res = Math.max(length[m][n] ,res) ;
            }
        }
        return res  ;
    }
}
