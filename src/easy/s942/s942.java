package easy.s942;

public class s942 {
    public static void main(String[] args) {
        String S = "DDI";
        for (int n : dsStringMatch(S)) {
            System.out.println(n);
        }
    }

    public static int[] dsStringMatch(String S) {
        int n = S.length();
        int k = 0;
        int[] ans = new int[S.length() + 1];
        for (int i = 0; i < S.length(); i++) {
            if (S.charAt(i) == 'I') ans[i] = k++;
            else ans[i] = n--;
        }
        if (S.charAt(S.length() - 1) == 'I') ans[S.length()] = k++;
        else {
            ans[S.length()] = n--;
        }
        return ans;
    }
}
