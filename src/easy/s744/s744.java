package easy.s744;

public class s744 {
    public static void main(String[] args) {
        char[] letters = {'e', 'e', 'e', 'e', 'e', 'e', 'n', 'n', 'n', 'n'};
        char letter = 'a';
        System.out.println(nextGreatestLetter(letters, letter));
    }

    public static char nextGreatestLetter(char[] letters, char letter) {
        int lo = 0;
        int hi = letters.length - 1;
        char ans = letters[0];
        while (lo <= hi) {
            int m = (lo + hi) / 2;
            if (letters[m] > letter) {
                hi = m - 1;
                ans = letters[m];
            } else {
                lo = m + 1;
            }
        }
        return ans;
    }
}
