package easy.s599;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

public class s599 {
    public static void main(String[] args)
    {
        String[] list1 = {"Shogun","Tapioca Express","Burger King","KFC"};
        String[] list2 = {"KFC","Burger King","Tapioca Express","Shogun"};
        for(String string : findRestaurant(list1 , list2) )
        {
            System.out.println(string);
        }
    }
    public static String[] findRestaurant(String [] list1 , String [] list2)
    {
        HashMap<String , Integer> hashMap = new HashMap<>() ;
        List<String> ans = new LinkedList<>() ;
        Integer minSum = Integer.MAX_VALUE ;
        for(int i = 0 ; i < list1.length ; i++)
        {
            hashMap.put(list1[i],i);
        }
        for(int i = 0 ; i < list2.length ; i++)
        {
            Integer index = hashMap.get(i) ;
            if(index != null && i + index <= minSum){
                if(i + index < minSum ) {
                    minSum = i + index ;
                    ans.clear();
                }
                ans.add(list2[i]) ;
            }
        }
        String[] res = new String[ans.size()] ;
        for(int i = 0 ; i < res.length ; i++)
        {
            res[i] = ans.get(i) ;
        }
        return res ;
    }
}
