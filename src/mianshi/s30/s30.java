package mianshi.s30;

public class s30 {
    public static void main(String[]args)
    {
            System.out.println(getInitial(2));
    }
    public static int getInitial(int n )
    {
        //假定最后是0个苹果
        return (dfs(2 , 1, 1)) ;

    }
    //n   当前熊数量 和 苹果的个数 .假定从最后一个开始算
    public static int dfs(int n ,int number, int m )
    {
       m = m*(number-1) + 1 ;
        if (number == n+1) {
            return  m;
        }
        return dfs(n, number + 1, m);

    }
}
