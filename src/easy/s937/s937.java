package easy.s937;

import java.util.LinkedList;
import java.util.Map;
import java.util.TreeMap;

public class s937 {
    public static void main(String[] args){
        System.out.println((char)57);
    }
    //1
    public String[] reorderLogFiles(String[] logs){
        String[] ans = new String[logs.length] ;
        if(logs.length < 1 || logs == null) return ans ;
        Map<String , String> testList = new TreeMap<>() ;
        LinkedList<String> numberList = new LinkedList<>() ;
        for(int i = 0 ; i < logs.length ; i++){
            String[] splited = logs[i].split(" " ,2 ) ;
            if(splited[1].charAt(0) >= 48 && splited[1].charAt(0) <= 57){
                numberList.addLast(logs[i]);
            }else {
                testList.put(splited[1] , logs[i]) ;
            }
        }
        int ansIndex = 0 ;
        for(Map.Entry<String , String> entry:testList.entrySet()){
            ans[ansIndex] = entry.getValue() ;
            ansIndex ++ ;
        }
        for(String line : numberList){
            ans[ansIndex] = line ;
            ansIndex ++ ;
        }
        return ans ;
    }
}
