package mianshi.s12;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;

public class s12 {
    public static void main(String[]args)
    {
        char[][] path = {{'a', 'b', 't', 'g'}, {'c', 'f', 'c', 's'}, {'j', 'd', 'e', 'h'}};
        boolean[][] visited = new boolean[path[0].length][path.length] ;
        int pathLength = 0 ;
//        ExecutorService executorService = new ThreadPoolExecutor(0 ,)
    }

    public static boolean hasPath(char matrix, int rows, int cols, String string) {
        if (rows < 1 || cols < 1 || string == null) {
            return false ;
        }
        return false ;
    }
}
