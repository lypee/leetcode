package temp.one;

/**
 * 数字三角形问题
 * @author Lypee
 * @Create On 2019/4/6
 */
public class one {
    public static void main(String[]args)
    {
        Long start = System.currentTimeMillis() ;
        int[][] array = {{7,0,0,0,0} , {3,8,0,0,0} ,
                {8,1,0,0,0} , {2,7,4,4,0} ,{4,5,2,6,5}} ;
        for(int i = 1 ; i < 5 ; i++)
        {
            for(int j = 0 ; j < 5 ; j ++)
            {
                if(j == 0)
                {
                    array[i][j] += array[i - 1][j];
                }
                if(j != 0 )
                {
                    array[i][j] =   Math.max(array[i-1][j] ,array[i-1][j-1])+ array[i][j] ;
                }
            }
        }
        int ans = Integer.MIN_VALUE ;
        for(int i = 0 ; i < 5 ; i++)
        {
            if(array[4][i] > ans) {
                ans = array[4][i] ;
            }
        }
        System.out.println(ans + (System.currentTimeMillis() - start));

    }


}
