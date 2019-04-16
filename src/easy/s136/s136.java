package easy.s136;

public class s136 {
    public static void main(String[] args) {
        int[] nums = {1, 2, 2, 3, 3, 4, 1};
        System.out.println(singleNumber(nums));
    }

    public static int singleNumber(int[] nums) {
        int ans = nums[0];
        for (int i = 1; i <= nums.length - 1; i++) {
            ans ^= nums[i];
        }
        return ans;
    }
}
