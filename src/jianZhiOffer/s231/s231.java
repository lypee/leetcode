package jianZhiOffer.s231;

public class s231 {
    public static void main(String[] args)
    {
        int[][] a = {{1, 2, 8, 9}, {2, 4, 9, 12}, {4, 7, 10, 13}, {6, 8, 11, 15}};
        int target = 7 ;
//        System.out.println(contain(a, target));
        test("sdasd  a asd as da as dasd a ");
    }
    public static boolean contain(int[][]a, int target)
    {
        int n = a.length ;
        int ans = -1 ;
        //列
        for(int i = n-1 ; i >= 0 ; i--)
        {
            if(a[0][i] > target) {
                continue;
            }
            //行
            for(int j = n-1 ; j >= 0 ; j--)
            {
                if(a[j][i] >  target){
                    continue;
                }
                if(a[j][i] == target )
                {
                    ans = a[j][i];
                    return true ;
                }
            }
        }
        return ans==-1 ? false : true ;

    }
    public static void test(String s)
    {
        Long start = System.currentTimeMillis() ;
        String ss = s.replaceAll("\\s", "%20");
        System.out.println(ss);
        System.out.println(System.currentTimeMillis() - start );
    }

}
