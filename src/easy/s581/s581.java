package easy.s581;

public class s581 {
    public static void main(String[] args) {
        int[] nums = {2, 6, 4, 8, 10, 9, 15};
        int[] num = {2, 6, 4, 8, 10, 9, 15};
        System.out.println(findUnSortedSubarray(num));
    }

    public static int findUnSortedSubarray(int[] nums) {
        int n = nums.length, beg = -1, end = -2;
        int min = nums[n - 1], max = nums[0];
        for (int i = 1; i < n; i++) {
            max = Math.max(max, nums[i]);
            min = Math.min(min, nums[n - i - 1]);
            if (nums[i] < max) end = i;
            if (nums[n - i - 1] > min) beg = n - i - 1;
        }
        return end - beg - 1;
    }

    public static int findUnsortedSubarray(int[] nums) {
//        System.out.println(nums[6]);
        int l = 0;
        int r = 0;
        boolean ans = true;
        for (int i = 0; i < nums.length - 1; i++) {
            //构建无序的条件
            if (nums[i] > nums[i + 1]) {
                ans = false;
                break;
            }
        }
        //如果是有序的
        if (ans == true) {
            return 0;
        }
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] < nums[i - 1]) {
                l = i;
            }
        }
//        System.out.println(nums[nums.length -1 ]);
        for (int i = nums.length - 1; i > 0; i--) {
            if (nums[i] > nums[i - 1]) {
                r = i;
            }
        }
//        System.out.println("r: " + r  + " , l: " + l);
        if (r >= l) return 0;
        else {
            return l - r + 1;
        }
    }
}
