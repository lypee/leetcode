package medium.s542;

import java.util.LinkedList;
import java.util.Queue;

/**
 * bfs
 */
public class s542 {
    private static boolean[] flag  = new boolean[3];

    public static void main(String[]args)
    {
        int[][] matrix = {{0,0,0},
        {0,1,0},
        {0,0,0}} ;
        int[][] res = updateMatrix(matrix) ;
       for(int i = 0 ; i < 3 ; i ++)
       {
           for(int j = 0 ; j < 3 ; j++)
           {
               System.out.print("\t" + res[i][j]);
           }
           System.out.println();
       }
    }
    public static int[][] updateMatrix(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;

        Queue<int[]> queue = new LinkedList<>();
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (matrix[i][j] == 0) {
                    queue.offer(new int[] {i, j});
                }
                else {
                    matrix[i][j] = Integer.MAX_VALUE;
                }
            }
        }

        int[][] dirs = {{-1, 0}, {1, 0}, {0, -1}, {0, 1}};

        while (!queue.isEmpty()) {
            int[] cell = queue.poll();
            for (int[] d : dirs) {
                int r = cell[0] + d[0];
                int c = cell[1] + d[1];
                if (r < 0 || r >= m || c < 0 || c >= n ||
                        matrix[r][c] <= matrix[cell[0]][cell[1]] + 1) {
                    continue;
                }
                queue.add(new int[] {r, c});
                matrix[r][c] = matrix[cell[0]][cell[1]] + 1;
            }
        }

        return matrix;
    }
}


