package medium.bag ;

import com.sun.org.apache.xml.internal.resolver.readers.ExtendedXMLCatalogReader;
import org.omg.PortableInterceptor.INACTIVE;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class bag{
    public static void main(String []args) throws  Exception
    {
//        one one = new one() ;
//        int n = 5 ;
//        int[] a = {5,3,3,2,2,2};
//        System.out.println(one.test(n ,a));

        two two = new two() ;
        System.out.println(two.test());
    }
}
class one{
   public int test(int n , int[] array) throws  Exception
   {
       BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
//        n = bufferedReader.read() ;
//        array = new int[n + 1];
       HashMap<Integer, Integer> hashMap = new HashMap<>(16) ;

       for(int i = 0 ; i < n ; i++)
       {
//           array[i] = bufferedReader.read() ;
           if(hashMap.containsKey(array[i])){
               int number = hashMap.get(array[i]) ;
               hashMap.put(array[i] , ++number) ;
           }else{
               hashMap.put(array[i] ,1 );
           }
       }
       int count = 0 ;
       int res = 0 ;
       Iterator iterator = hashMap.entrySet().iterator() ;
       while (iterator.hasNext()) {
           Map.Entry entry = (Map.Entry) iterator.next() ;
           int value   =(Integer) entry.getValue() ;
           int key  =  (Integer)entry.getKey() ;
           if(value % key != 0 ){
               return -1 ;
           }
           res += (value / key ) ;
       }
       return res ;



   }
}
class two {
    public int test()throws Exception
    {
//        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
//        int n = bufferedReader.read() ;
//        int[] array = new int[n] ;
//        for (int i = 0; i < n; i++) {
//        array[i] = bufferedReader.read() ;
//        }
//        int v = bufferedReader.read() ;
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt() ;
        int[]array = new int[n] ;
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt() ;
        }
        int v = scanner.nextInt() ;

        int ans = 0 ;
//       ArrayList<Integer> timeList = new ArrayList<>(n + 1 ) ;
        //标识当前已经经过的时间
        int time = 0 ;
       ans += 150 / v ;
       time += ans ;
       for(int i = 0; i < n ; i++)
       {
           int n2 = ans / time ;
           if(judge(n2)){
               //是奇数 ; 继续等待到绿灯 ;
               ans += ( array[i] - time % array[i]) ;
               time += (array[i] - time % array[i])  ;
           }
           ans += 150 / v ;
           time += array[i]  +  150 / v ;
       }
       ans -= 150 / v ;
       return ans  ;




    }

    /**
     * 判断奇偶
     * @param n
     * @return
     */
    public boolean judge(int n )
    {
        return n % 2 == 0 ;
    }
}