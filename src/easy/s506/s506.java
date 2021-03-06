package easy.s506;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class s506 {
    public static void main(String[]args){

    }
    public static String[] findRelaTiveRanks(int[] nums)
    {
        if(nums == null || nums.length == 0) return new String[0];
        int n = nums.length;
        String[] result = new String[n];
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();

        for(int i = 0; i < n; ++i){
            map.put(nums[i], i);
        }
        Arrays.sort(nums);
        for( int i = 0; i < n/2; ++i ) {
            int temp = nums[i];
            nums[i] = nums[n - i - 1];
            nums[n - i - 1] = temp;
        }

        result[map.get(nums[0])] = "Gold Medal";
        if(1 < n) result[map.get(nums[1])] = "Silver Medal";
        if(2 < n) result[map.get(nums[2])] = "Bronze Medal";
        for(int j = 3; j < n; ++j){
            result[map.get(nums[j])] = String.valueOf(j + 1);
        }
        return result;
    }
}
