package medium.s78;



import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class s78 {
    public static void main(String[]args)
    {
        Long start = System.currentTimeMillis() ;
        int[] a = {1 ,2 ,3 } ;
        int[][] ans  = test(a) ;
        List<List<Integer>> list = subsets(a);
//        for(int i = 0 ; i < list.size() ; i++)
//        {
//            for(int j = 0 ; j <list.get(i).size() ; j++)
//            {
//                System.out.print("\t"+list.get(i).get(j));
//            }
//            System.out.println();
//        }
System.out.println(System.currentTimeMillis() - start);
    }
    public static  List<List<Integer>> subsets (int[] nums)
    {
        List<List<Integer>> list = new ArrayList<>() ;
        Arrays.sort(nums);
        backtrack(list, new ArrayList<>(), nums, 0);
        return list ;
    }

    private static void backtrack(List<List<Integer>> list,
                                  List<Integer> tempList, int[] nums, int start) {
        list.add(new ArrayList<>(tempList));
        for(int i = start ; i < nums.length ; i++)
        {
            tempList.add(nums[i]);
            backtrack(list , tempList , nums , i +1 );
            tempList.remove(tempList.size() -1 ) ;
        }
    }






    public static int[][] test(int[] array)
    {
        char[]ss = array.toString().toCharArray() ;
        int length = (int)Math.pow(2 , array.length) + 2 ;
        int[][] ans = new int[length][];
        for(int i = 0 ; i < length ; i++)
        {
            ans[i] = judge(ss, 0) ;
        }
        return ans  ;


    }
    public static int[] judge(char[] ss , int i )
    {
        if(i == ss.length)
        {
            return strToArray(ss) ;
        }
        for(int j = i ; j < ss.length ; j ++)
        {
            char temp = ss[j];
            ss[j] = ss[i];
            ss[i] = temp  ;
            judge(ss, i + 1);
            temp = ss[j];
            ss[j] = ss[i];
            ss[i] = temp ;
        }
        return null  ;
    }
    public static int[] strToArray(char[] ss)
    {
        int[] res = new int[ss.length] ;
        for(int i =  0 ; i < ss.length ; i++)
        {
            res[i] = (int) (ss[i] - 48)  ;
        }
    return res ;
    }
}
