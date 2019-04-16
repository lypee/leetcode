package easy.s645;

public class s645 {
    public static void main(String[] args) {
        int[] nums = {1, 2, 2, 4};

        System.out.println(findErrorNums(nums)[0]);
    }

    public static int[] findErrorNums(int[] nums) {
        int RepNumber = -1;
        int LostNumber = -1;
        int[] ans = new int[2];
        int[] numsCp = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            numsCp[i] = -1;
        }
        for (int i = 0; i < nums.length; i++) {
            numsCp[nums[i] - 1] += 1;
        }
        for (int i = 0; i < nums.length; i++) {
            if (numsCp[i] == -1) LostNumber = i;
            if (numsCp[i] == 1) RepNumber = i;
        }
        ans[0] = RepNumber + 1;
        ans[1] = LostNumber + 1;
        return ans;
    }
}
