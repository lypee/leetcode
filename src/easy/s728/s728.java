package easy.s728;

import java.util.ArrayList;
import java.util.List;

public class s728 {
    public static void main(String[] args) {
//        System.out.println(isDividingNumbers(22));
        System.out.println(selfDividingNumbers(1, 22));
    }

    public static List<Integer> selfDividingNumbers(int left, int right) {
        List ans = new ArrayList();
        for (int i = left; i <= right; i++) {
//            System.out.println(i);
            if (isDividingNumbers(i)) {
                System.out.println(i);
                ans.add(i);
            }
        }
        return ans;
    }

    public static boolean isDividingNumbers(int number) {
        int numbers = number;
        while (number > 0) {
//            System.out.println(numbers);
            int num = number % 10;
//            System.out.println(num);
            if (num == 0) return false;
            else if (numbers % num != 0) return false;
            number /= 10;
        }
        return true;
    }
}
