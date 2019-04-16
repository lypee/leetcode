package medium.s851;

        import java.util.ArrayList;
        import java.util.Arrays;
        import java.util.HashMap;
        import java.util.List;

/**
 * @author  Lypee
 */
public class s851 {
    static  HashMap<Integer, List<Integer>> richer2 = new HashMap<>();
    static int res[];
    public static void main(String[]args)
    {
       int n = 0 ;
      for(int i = 2019 ; i != 0; i = i & (i-1))
      {
            n++ ;
      }
      System.out.println(n);
    }
    public static  int[] loudAndRich(int[][] richer, int[] quiet) {
        int n = quiet.length;
        for (int i = 0; i < n; ++i) {
            richer2.put(i, new ArrayList<Integer>());
        }
        for (int[] v : richer) {
            richer2.get(v[1]).add(v[0]);
        }
        res = new int[n];
        Arrays.fill(res, -1);
        for (int i = 0; i < n; i++) {
            dfs(i, quiet);
        }
        return res;
    }

    static int dfs(int i, int[] quiet) {
        if (res[i] >= 0) {
            return res[i];
        }
        res[i] = i;
        for (int j : richer2.get(i)) {
            if (quiet[res[i]] > quiet[dfs(j, quiet)]) {
                res[i] = res[j];
            }
        }
        return res[i];
    }
}
class two{
    final static char[] digits = { '0', '1', '2', '3', '4', '5', '6', '7', '8',
            '9', 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L',
            'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y',
            'Z' };
    public static long toDecimalism(String str, int base) {
        char[] buf = new char[str.length()];
        str.getChars(0, str.length(), buf, 0);
        long num = 0;
        for (int i = 0; i < buf.length; i++) {
            for (int j = 0; j < digits.length; j++) {
                if (digits[j] == buf[i]) {
                    num += j * Math.pow(base, buf.length - i - 1);
                    break;
                }
            }
        }
        return num;
    }

}