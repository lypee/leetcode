package easy.s496;

import java.util.*;

public class s496 {
    public static void main(String[] args) {
        int[] nums1 = {4, 1, 2};
        int[] nums2 = {1, 3, 4, 2};
        for (int n : nexxxt(nums1, nums2)) {
            System.out.println(n);
        }
    }
    public static int[] nexxxt(int[] num1 , int[] num2){
        int[] ans = new int[num1.length] ;
        int nextNumber = -1 ;
        Set<Integer> set = new TreeSet<>();
        for(int i = 0 ; i<num1.length ; i++){
            //将索引后的元素进栈
            for(int j = i ; j < num2.length ; j++){
                set.add(num2[i]);
            }
            while(!set.isEmpty()){
                int number = ((TreeSet<Integer>) set).pollFirst() ;
                if(number > num1[i]){
                    ans[i] = number ;
                    System.out.println(number);
                    break ;
                }
            }
        }
        return ans ;
    }
    public static int[] nextGreaterElement(int[] nums1, int[] nums2) {
        Map<Integer, Integer> map = new HashMap<>(); // map from x to next greater element of x
        Stack<Integer> stack = new Stack<>();
        for (int num : nums2) {
            while (!stack.isEmpty() && stack.peek() < num)
                map.put(stack.pop(), num);
            stack.push(num);
        }
        for (int i = 0; i < nums1.length; i++)
            nums1[i] = map.getOrDefault(nums1[i], -1);
        return nums1;
    }
}
