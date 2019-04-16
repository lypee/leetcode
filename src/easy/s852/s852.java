package easy.s852;

public class s852 {
    public static void main(String[] args) {
        int[] nums = {0, 2, 1, 0};
        System.out.println(peakIndexMountainArray(nums));
    }

    public static int peakIndexMountainArray(int[] A) {
        for (int i = 0; i < A.length - 1; i++) {
            if (A[i] > A[i + 1]) return i;
        }
        return -1;
    }
}
