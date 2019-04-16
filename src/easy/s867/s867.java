package easy.s867;

public class s867 {
    public static void main(String[] args) {
        int[][] A = {{1, 2, 3}, {4, 5, 6}};
        System.out.println(transpose(A));
    }

    public static int[][] transpose(int[][] A) {
        int j = A.length;
        int k = A[0].length;

        //构造返回数组
        int[][] ans = new int[k][j];
        for (int m = 0; m < k; m++) {
            for (int n = 0; n < j; n++) {
                ans[m][n] = A[n][m];
            }
        }
//       System.out.println(k); 3
//       System.out.println(j); 2
//       System.out.println(ans.length); 2
//       System.out.println(ans[0].length);3
        return ans;
    }
}

