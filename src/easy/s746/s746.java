package easy.s746;

public class s746 {
    public static void main(String[] args) {
        int[] nums = {10, 15, 20};
        System.out.println(minCostClimbingStairs(nums));
    }

    public static int minCostClimbingStairs(int[] cost) {
        if (cost.length == 1) return cost[0];
        else if (cost.length == 2) return Math.min(cost[1], cost[0]);
        else {
            int[] ans = new int[cost.length + 2];
            ans[0] = 0;
            ans[1] = 0;
            for (int i = 2; i <= cost.length; i++) {
                ans[i] = Math.min(ans[i - 1] + cost[i - 1], ans[i - 2] + cost[i - 2]);
            }
            return ans[cost.length];
        }
    }
}
