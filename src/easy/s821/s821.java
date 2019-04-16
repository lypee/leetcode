package easy.s821;

import java.util.ArrayList;
import java.util.List;

public class s821 {
    public static void main(String[] args) {
        String S = "loveleetcode";

//        for(int n: shortestToChar(S,'e')){
//            System.out.println(n);
//        }
    }

    public static int[] shortestToChar(String S, char C) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < S.length(); i++) {
            if (S.charAt(i) == C) list.add(i);
        }
        //存储到目标字符的最短距离的数组
        int[] ans = new int[S.length()];
        for (int i = 0; i < S.length(); i++) {
            if (S.charAt(i) == C) {
                ans[i] = 0;
            } else {
                int min = Integer.MAX_VALUE;
                //在索引链表寻找到目标最短的距离
                for (int t : list) {
                    //寻找t - i 最短的距离
                    int temp = Math.abs(t - i);
                    if (temp < min) {
                        min = temp;
                    }
                }
                ans[i] = min;
            }
        }
        return ans;
    }
}
