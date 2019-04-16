package medium.s332;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
public class s332{
    public static void main(String[]args)
    {

    }
    public static List<String> findItinerary(String[][] tickets )
    {
        ArrayList<String> result  = new ArrayList<>(16) ;
        if(tickets == null || tickets.length == 0 )
        {
            return result ;
        }
        int total = tickets.length + 1 ;
        HashMap<String  , ArrayList<String>> map = new HashMap<>(16) ;
        for(int i = 0 ; i < tickets.length ; i++)
        {
            if(map.containsKey(tickets[i][0])){
                ArrayList<String> tmp = map.get(tickets[i][0]);
                listAdd(tickets[i][1] , tmp) ;
            }else{
                ArrayList<String> tmp = new ArrayList<>();
                tmp.add(tickets[i][1]) ;
                map.put(tickets[i][0] , tmp) ;
            }
        }
        result.add("JFK");
        dfs("JFK", map, result, total, 1);
        return result  ;
    }

    public static boolean dfs(String current, HashMap<String, ArrayList<String>> map, ArrayList<String> result ,  int total, int num) {
        if(num >= total)
        {
            return true ;
        }
        if(!map.containsKey(current) || map.get(current).size() == 0)
        {
            return false ;
        }
        int i = 0 ;
        ArrayList<String> curList = map.get(current);
        while( i   < curList.size() )
        {
            String next = curList.remove(i);
            result.add(next);
            if (dfs(next, map, result, total, num + 1)) {
                return true ;
            }
            result.remove(result.size() - 1);
            listAdd(next, curList);
            i++ ;
        }
        return false ;
    }
    public static void listAdd(String value , ArrayList<String> list)
    {
        if(list.size() == 0 )
        {
            list.add(value) ;
            return ;
        }
        else
        {
            int i = 0 ;
            while(i < list.size())
            {
                if(value.compareTo(list.get(i)) <= 0 )
                {
                    list.add(i, value) ;
                    return ;
                }
            }
            i++ ;

        }
        list.add(value);
        return ;
    }


}












//public class s332{
//
//    public static void main(String[]args)
//    {
//        String[][]tickets = {{"MUC", "LHR"}, {"JFK", "MUC"}, {"SFO", "SJC"}, {"LHR", "SFO"}} ;
//        List<String> userList =  findItinerary(tickets) ;
//        for(String string:userList)
//        {
//            System.out.println(string);
//        }
//    }
//    public static List<String> findItinerary(String[][] tickets)
//    {
//        int[] visited = new int[tickets.length];
//        ArrayList<String> visitedList = new ArrayList<>(8) ;
//        for(int i = 0 ; i < tickets.length ; i ++)
//        {
//            if(visited[i] == 0 && "JFK".equals(tickets[i][0])){
////                visited[i] = 1 ;
//                dfs(i , visited   ,visitedList ,  tickets);
//            }
//        }
//        return visitedList ;
//    }
//    public static void dfs(int x , int[] visited, List<String>visitedList ,String[][] tickets)
//    {
//        for(int i = 0 ; i < tickets.length; i++)
//        {
//            if(i == x ){
//                continue;
//            }
//            //进的 目的地 == 出的 出发地
//            if(tickets[x][1] == tickets[i][0] && visited[x] == 0 )
//            {
//                visited[x] = 1 ;
//                visitedList.add(tickets[x][0]) ;
//                dfs(i , visited , visitedList , tickets) ;
//
//            }
//        }
//    }
//}






















//public class s332 {
//    static List<String> strList = new ArrayList<>(8) ;
//    static List<List<String>> stringList = new ArrayList<>(8) ;
//    public static void main(String[] args) {
//        String[][]tickets = {{"MUC", "LHR"}, {"JFK", "MUC"}, {"SFO", "SJC"}, {"LHR", "SFO"}} ;
//        stringList.add(findIntinerary(tickets));
//    }
//
//
//    public static List<String> findIntinerary(String[][] tickets)
//    {
//        ArrayList<String>strings = new ArrayList<>() ;
//
//        int[] y = new int[tickets.length] ;
//        for(int x = 0 ;  x < tickets.length  ; x++ )
//        {
//            dfs(x , y  , tickets , strings);
//        }
//        return null ;
////        return stringList.get(0) ;
//    }
//    public static ArrayList<String> dfs(int x ,int[] y ,String[][]tickets  , List<String> list  )
//    {
//        if(x == tickets.length -1 || y[x] == 1  )
//        {
//            return null ;
//        }
//
//        if(tickets[x][1] == tickets[x+1][1]){
//
//            y[x+1] =1 ;
//            list.add(tickets[x][1]) ;
//            dfs(x+1 , y , tickets , list);
//        }
//        return null ;
//    }
//
//}
