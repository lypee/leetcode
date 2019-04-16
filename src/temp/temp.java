package temp;

public class temp {
    static int ans = 0 ;
    public static void main(String []args)
    {
        //遇到店5次 9次花 后为0 , 初始为2 ;
        int l = 2 ;
        int shop = 0 , flower = 0 ;

        long start = System.currentTimeMillis() ;
//        hejiu(shop , flower , l );
//        hejiu2(10,10 ,2) ;
        long end = System.currentTimeMillis() ;
        System.out.println(ans);
        System.out.println(end - start );
        System.out.println(start  +" , " + end);


    }

    public static void hejiu(int shop , int flower , int wine){
        if(shop == 5 && flower == 9 && wine == 1) {
            ans++ ;
            return ;
        }else if( shop > 5 || flower> 10 && wine < 0)
        {
            return ;
        }
        else {
            hejiu(shop , flower+1 , wine -1 );
            hejiu(shop +1 , flower , wine*2);
        }
    }
}
