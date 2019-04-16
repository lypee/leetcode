package easy.s500;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class s500 {
    public static void main(String[] args){
        String[] str ={"Hello", "Alaska", "Dad", "Peace"} ;
        for(String string : findWords(str)){
            System.out.println(string);
        }
    }
    public static String[] findWords(String[] words)
    {
        String[] strs = {"QWERTYUIOP","ASDFGHJKL","ZXCVBNM"} ;
        Map<Character , Integer> map = new HashMap<>() ;
        for(int i = 0 ; i< strs.length ; i++)
        {
            for(char c:strs[i].toCharArray()){
                map.put(c,i) ;
            }
        }
        List<String> res = new LinkedList<>() ;
        for(String s :words){
            if(s.equals("")) continue;
            //获得传入字符串的首字母 在map中的value ;
            int index = map.get(s.toUpperCase().charAt(0)) ;
            for(char c :s.toUpperCase().toCharArray()){
                //循环判断 如果该字符串中 存在char 不在同一个value中
                //则该字符串不符合题意
                if(map.get(c) != index){
                    index  = -1 ;
                    break ;
                }
            }
            //如果index != -1 , 该字符串符合题意 .
            if(index  != -1) res.add(s) ;
        }
        return res.toArray(new String[0]) ;
    }
}
