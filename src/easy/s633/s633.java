package easy.s633;

public class s633 {
    public static void main(String[] args) {
        System.out.println(judgeSquareSum(3));
    }

    public static boolean judgeSquareSum(int c) {
        if (Math.sqrt(c) == (int) Math.sqrt(c))
            return true;
        int number = 0;
        for (int i = 1; i < Math.sqrt(c); i++) {
            //令number 等于 第二个数的阶乘需要达到的数 ;
            number = c - i * i;
            //判断number 是不是 可以被整数开方 ;
            if (Math.sqrt(number) == (int) Math.sqrt(number)) {
                return true;
            }
        }
        return false;
    }
}
