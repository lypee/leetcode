package easy.s268;

import java.util.Arrays;

public class s268 {
    public static void main(String[] args){
        int[] nums = {1,2} ;
        System.out.println(missingNumber(nums));
    }
    public static int missingNumber(int[] nums) { //binary search
        Arrays.sort(nums);
    int left = 0, right = nums.length , mid;
        while(left<right){
        mid = (left + right)/2;
        if(nums[mid]>mid) right = mid;
        else left = mid+1;
    }
        return left;
}
}
