package easy.s724;

public class s724 {
    public static void main(String[] args) {
        int[] nums = {1, 7, 3, 6, 5, 6};
        int[] num = {1, 2, 3};
        int[] nu = {-1, -1, 1, 1, -1, -1};
        System.out.println(pivotIndex(nu));
    }

    //别人的
    public static int PivotIndex(int[] nums) {
        int sum = 0;
        int left = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
        }
        for (int i = 0; i < nums.length; i++) {
            //left 为索引左侧的和 ;
            if (i != 0) left += nums[i - 1];
            //计算索引右侧的和
            if (sum - left - nums[i] == left) return i;
        }
        return -1;
    }

    //自己写的
    public static int pivotIndex(int[] nums) {
        //先验算 最侧面的数组
        if (nums.length == 0) return -1;
        int[] leftNums = new int[nums.length];
        int[] rightNums = new int[nums.length];
        for (int i = 1; i < nums.length; i++) {
            leftNums[i] = nums[i];
        }
        if (Sum(leftNums) == 0) return 0;
        for (int i = 0; i < nums.length - 1; i++) {
            rightNums[i] = nums[i];
        }
        if (Sum(rightNums) == 0) return nums.length - 1;


        int lo = 0;
        int hi = nums.length;
        while (lo < hi - 1) {
            //新建左右数组
            System.out.println(lo);
            int[] left = new int[lo + 1];
            int[] right = new int[nums.length - lo + 1];
            //构建lo左边的数组
            for (int i = 0; i <= lo; i++) {
                left[i] = nums[i];
            }
            //构建右边的数组
            for (int i = lo + 2, j = 0; i < nums.length; i++, j++) {
                right[j] = nums[i];
            }
            if (Sum(left) == Sum(right)) {
                for (int a : left) {
                    System.out.println("左侧数组: " + a);
                }
                for (int b : right) {
                    System.out.println("右侧数组: " + b);
                }
                System.out.println("lo");
                return lo + 1;
            }
            lo++;
        }
        return -1;
    }

    //数组求和
    public static int Sum(int[] array) {
        int ans = 0;
        for (int i = 0; i < array.length; i++) {
            ans += array[i];
        }
        return ans;
    }

}
