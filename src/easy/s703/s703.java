package easy.s703;

import java.util.*;

public class s703 {
    public static void main(String[] args) {
        int[] nums = {4, 5, 8, 2};
        int k = 3;
        KthLargest(k, nums);
        ;
    }

    private static int k = 0;
    private static PriorityQueue<Integer> pq = null;

    public static void KthLargest(int k, int[] nums) {
        pq = new PriorityQueue<Integer>(k + 1);

    }

    public static int add(int val) {
        return 0;
    }
}

class KthLargest {

}
