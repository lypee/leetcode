package easy.s709;

public class s709 {
    public static void main(String[] args) {
        String que = "Hello";
        System.out.println(toLowerCase(que));
    }

    public static String toLowerCase(String str) {
        StringBuilder ans = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            if (Character.isUpperCase(str.charAt(i))) {
                ans.append(Character.toLowerCase(str.charAt(i)));
            } else {
                ans.append(str.charAt(i));
            }
        }
        return ans.toString();
    }
}
