package easy.s202;

import java.util.Stack;

public class s202 {
    public static void main(String[] args) {
        System.out.println(isHappy(19));
    }

    public static boolean isHappy(int n) {
        int count = 0;
        while (count < 999) {
            if (Count(n) == 1) return true;
            n = Count(n);
            count++;
        }
        return false;
    }

    //计算每个位数的平方和
    public static int Count(int n) {
        int ans = 0;
        Stack<Integer> stack = new Stack();
        while (n > 0) {
            int number = n % 10;
            n /= 10;
            stack.push(number);
        }

        //栈 非空
        while (!stack.isEmpty()) {
            int number = stack.pop();
            ans += number * number;
        }
        return ans;
    }
}
