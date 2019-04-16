package easy.s704;

public class s704 {
    public static void main(String[] args) {
        int[] nums = {-1, 0, 3, 5, 9, 12};
        int[] num = {-1, 0, 3, 5, 9, 12};
        System.out.println(search(nums, 2));
    }

    public static int search(int[] nums, int target) {
        int lo = 0;
        int hi = nums.length - 1;
        while (lo <= hi) {
            int mid = (lo + hi) / 2;
            if (nums[mid] == target) return mid;
            else if (nums[mid] < target) lo = mid + 1;
            else hi = mid - 1;
//            System.out.println(lo+ " , "  + hi);
//            System.out.println(mid);
        }
        return -1;
    }
}
