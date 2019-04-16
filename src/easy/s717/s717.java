package easy.s717;

public class s717 {
    public static void main(String[] args) {
        int[] nums = {1, 0, 0};
        System.out.println(isOneBitCharacter(nums));
    }

    public static boolean isOneBitCharacter(int[] bits) {
        if (bits.length == 1) {
            if (bits[0] == 0) return true;
            else return false;
        }
        int i = 0;
        while (i < bits.length - 1) {
            i += (bits[i] + 1);
        }
        return i == bits.length - 1;
    }
}
