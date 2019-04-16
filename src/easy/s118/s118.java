package easy.s118;

import java.util.ArrayList;
import java.util.List;

public class s118 {
    public static void main(String []args)
    {
            for(List<Integer> n : generate(5)){
                System.out.println(n);
            }
    }
    public static List<List<Integer>> generate(int numRows)
    {
        List<List<Integer>> ansRows = new ArrayList<List<Integer>>() ;
        ArrayList<Integer> row = new ArrayList<>() ;
        for(int i = 0 ; i < numRows ; i++)
        {
            row.add(0,1) ;
            for(int j = 1 ; j < row.size() -1  ; j++)
            {
                row.set(j , row.get(j) + row.get(j+1)) ;
            }
            ansRows.add(new ArrayList<Integer>(row)) ;
        }
        return ansRows ;
    }
}
