package two;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class two {

    static String format = "000";
    static String format_two = "00000" ;
    static DecimalFormat df = new DecimalFormat(format);
    public static void main(String[]args)
    {
        System.out.println((int)'N' -55);
        System.out.println((int)'R' -55);

        System.out.println(splitArray(55));
    }

    /**
     * 切割整数
     * @param n
     * @return
     */
    public static String splitArray(int n)
    {
        StringBuilder stringBuilder = new StringBuilder() ;
        String str = String.valueOf(n);
        int length = str.length() / 3 == 0 ? str.length() / 3 : str.length() / 3 + 1 ;
        length = length == 0 ? 1 : length ;
        String[] arr = new String[length];
        int index = 0;
        for(int i=0; i<arr.length;i++){
            if(index+3 > str.length()){
                arr[i] = str.substring(index);
            }else{
                arr[i] = str.substring(index,(index = index+3));
            }
        }
        //处理最后一个 补零
        if(arr.length > 1 )
        {
            arr[arr.length-1] =df.format(Integer.valueOf(arr[arr.length-1])) ;
        }else {
            arr[0] =df.format(Integer.valueOf(arr[0])) ;
        }
      //整数切割完成
        //十进制转二进制
        for(int i = 0 ; i < length ; i++)
        {
            arr[i] = Integer.toBinaryString(Integer.valueOf(arr[i])) ;
        }
        //切分完成

        DecimalFormat df = new DecimalFormat(format_two) ;
        //处理每一个arr的字串
       for(int i = 0 ; i < arr.length ; i++)
       {
           //先处理arr[0]
            if(arr[i] == null || arr[i].length() == 0 ) {
                continue;
            }
              List<String> stringList = splitString(arr[i] , 5 , arr[i].length() / 5 +1 ) ;

           String[]strings = new String[stringList.size()] ;
           for(int k = stringList.size()-1  ; k >=0; k--)
           {
               if(stringList.get(k) == null || stringList.get(k).length() == 0 ) {
                   continue;
               }
               strings[k] = stringList.get(k) ;
               int num =  Integer.parseInt(strings[k] , 2 ) ;
               if(num <= 10){
                   stringBuilder.append(num) ;
               }
               else {
                   stringBuilder.append( (char)(num + 55) ) ;
               }

           }

       }
        return stringBuilder.reverse().toString() ;
    }





        public static List<String> splitString(String inputString , int length , int size)
        {

            List<String> list = new ArrayList<String>(


            );
            for (int index =inputString.length() / length ; index > 0  ; index--) {
                String childStr = substring(inputString, (index+1 ) * length ,
                        index * length);
                list.add(childStr);
            }
            return list;

        }
    public static String substring(String str, int t, int f) {
        if (f > str.length())
        {
            return null;
        }
        if (t > str.length()) {
            {
                return str.substring(f, str.length());
            }
        } else {
            return str.substring(f, t);
        }
    }
}
