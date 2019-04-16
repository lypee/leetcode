package mianshi.s9 ;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;

public class s9{
    static int n ,m,maxRemainEnergy = 0 ;
    static int[][] map ;
    static boolean flag = false ;
    static String path = "";
    static LinkedList<String> linkedList = new LinkedList<>();
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt() ;
        m = scanner.nextInt()  ;
        int p = scanner.nextInt() ;
        map = new int[n][m];
        for(int i = 0 ; i < n ; i++)
        {
            for(int j = 0 ; j < m ; j++)
            {
                map[i][j] = scanner.nextInt() ;
            }
        }
        runMap(0, 0, p);

    }

    public static synchronized void runMap(int x, int y, int p) {
        if(p < 0 || x < 0 || y < 0 || x>= n || y>= m || map[x][y] != 1 ) {
            return ;
        }else{
            linkedList.offer("[" + x + "," + y + "]");
            map[x][y] = 0 ;
            if( x == 0 && y == m -1 )
            {
                if(p >= maxRemainEnergy )
                {
                    maxRemainEnergy = p;
                    updataPath() ;
                }
                map[x][y] = 1 ;
                linkedList.removeLast() ;
                flag = true ;
                return ;
            }
            runMap(x , y+1 , p-1);
            runMap(x , y-1 , p-1);
            runMap(x+1 , y , p);
            runMap(x-1 , y , p-3);
            map[x][y] =1  ;
            linkedList.removeLast() ;
        }
    }
    public static void updataPath(){
        StringBuilder stringBuilder = new StringBuilder() ;
        Iterator<String> iterator = linkedList.iterator() ;
        while(iterator.hasNext())
        {
            stringBuilder.append(iterator.next() + ",");
        }
        if(stringBuilder.length() > 0 )
        {
            stringBuilder.deleteCharAt(stringBuilder.length() -1 ) ;
        }
        path = stringBuilder.toString() ;
    }
}