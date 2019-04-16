package easy.s686;

public class s686 {
    public static void main(String[] args) {
        String A = "abc";
        String B = "cabcabca";
        System.out.println(repeatedStringMatch(A, B));
    }

    public static int repeatedStringMatch(String A, String B) {
        int numbers = 0;
        String c = A;
        int count = B.length() / A.length() + 1;
        while (numbers <= count) {
//            System.out.println(numbers);
            numbers++;
            if (A.contains(B)) {
                return numbers;
            } else {
                A += c;
            }
        }
        return -1;
    }

}
