package easy.s409;

public class s409 {
    public static void main(String[] args) {
        String s = "abccccdd";
        System.out.println(longestPalindrome(s));
    }

    public static int longestPalindrome(String s) {
        boolean[] ans = new boolean[128];
        int len = 0;
        for (char c : s.toCharArray()) {
            //出现奇数次 为true ; 再出现一次 -->偶数次 则为false
            ans[c] = !ans[c];
            //出现的次数为奇数次 , 那么 此时 可以组成一个
            //对称的回文串
            if (!ans[c]) len += 2;
        }
        //如果len的长度小于s.lenght ; 则 可以从中取出一个单个字符
        //作为最中间的字符
        if (len < s.length()) len++;
        return len;
    }
}
