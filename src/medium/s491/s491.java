package medium.s491;

import java.util.*;


public class s491 {
    public static void main(String[]args)
    {
        int[] a = {4,6,7,7} ;
        findSubsequences(a);
        System.out.println();
    }
    public static List<List<Integer>> findSubsequences(int[] nums) {
        List<List<Integer>> res = new LinkedList<>();
        helper(new LinkedList<Integer>(), 0, nums, res);
        return res;
    }
    private static void helper(LinkedList<Integer> list, int index, int[] nums, List<List<Integer>> res){
        if(list.size()>1) {
            res.add(new LinkedList<Integer>(list));
        }
        Set<Integer> used = new HashSet<>();
        for(int i = index; i<nums.length; i++){
            if(used.contains(nums[i])){
                continue;
            }
            if(list.size()==0 || nums[i]>=list.peekLast()){
                used.add(nums[i]);
                list.add(nums[i]);
                helper(list, i+1, nums, res);
                list.remove(list.size()-1);
            }
        }
    }
}



