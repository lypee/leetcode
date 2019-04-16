package easy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class s697 {
    public static void main(String[] args) {

    }

    public static int findShortestSubArray(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int n : nums)
            map.put(n, map.getOrDefault(n, 0) + 1);

        int degree = Integer.MIN_VALUE;
        for (Integer key : map.keySet()) {
            if (degree < map.get(key))
                degree = map.get(key);
        }

        List<Integer> elements = new ArrayList<>();
        for (Integer key : map.keySet()) {
            if (map.get(key) == degree)
                elements.add(key);
        }

        int min = Integer.MAX_VALUE;
        for (Integer element : elements) {
            int start = -1;
            int end = 0;
            for (int i = 0; i < nums.length; i++) {
                if (element == nums[i]) {
                    if (start == -1)
                        start = i;
                    if (start != -1 || i == nums.length - 1)
                        end = i;
                }
            }

            if (min > end - start + 1)
                min = end - start + 1;
        }

        return min;
    }
}
