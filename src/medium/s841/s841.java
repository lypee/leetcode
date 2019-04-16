package medium.s841;

import java.util.ArrayList;
import java.util.List;

public class s841 {
    public static void main(String[]args)
    {
        int[][] a = {{1}, {2},{3} ,{}};
        List<List<Integer>> rooms = new ArrayList<>() ;
        List<Integer> room1 = new ArrayList<>();
        room1.add(1);

        List<Integer> room2= new ArrayList<>();
        room2.add(2);
        List<Integer> room3 = new ArrayList<>();
        room3.add(3);
        List<Integer> room4 = new ArrayList<>();
        rooms.add(room1) ;
        rooms.add(room2) ;
        rooms.add(room3) ;
        rooms.add(room4);
        System.out.println(canVisitAllRooms(rooms));
    }

    public static boolean canVisitAllRooms(List<List<Integer>> rooms) {
        boolean[] hasCome = new boolean[rooms.size()] ;
        hasCome[0] = true ;
        bfs(rooms,  hasCome , rooms.get(0));
        for(Boolean b : hasCome)
        {
            if(!b)
            {
                return false ;
            }
        }
        return true ;
    }
    public static void bfs(List<List<Integer>> rooms ,
                    boolean[] hasCome , List<Integer>key)
    {
        for(int i = 0 ; i < rooms.size() ; i++)
        {
            if(hasCome[key.get(i)] != true)
            {
                hasCome[key.get(i)] = true ;
                bfs(rooms, hasCome, rooms.get(key.get(i)));
            }
        }
    }
}
