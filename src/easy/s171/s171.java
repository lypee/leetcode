package easy.s171;

public class s171 {
    public static void main(String[] args) {
        String s = "A";
        System.out.println(titleToNumber(s));
    }

    public static int titleToNumber(String s) {
        int ans = 0;
        for (int i = 0; i < s.length(); i++) {
            ans = ans * 26 + (s.charAt(i) - 'A' + 1);
        }
        return ans;
    }
}
