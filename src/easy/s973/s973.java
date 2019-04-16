package easy.s973;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

public class s973 {
    public static void main(String[] args) {
        int[][] points = {{3, 3}, {5, -1}, {-2, 4}};
        int k = 2;
        System.out.println(kCloset(points, k)[1][1]);
    }

    public static int[][] kCloset(int[][] points, int K) {
//        for(int  n : points[1]){
//            System.out.println(n);
//        }
        ArrayList<Double> arrayList = new ArrayList<>();
        double[] distance = new double[points.length + 1];
        HashMap<Double, Integer> hashMap = new HashMap<>();
        for (int i = 0; i < points.length; i++) {
            Double dis = Math.sqrt(points[i][0] * points[i][0] + points[i][1] * points[i][1]);
            hashMap.put(dis, i);
            arrayList.add(dis);
        }
        Collections.sort(arrayList);
//        Collections.reverse(arrayList);
        System.out.println(arrayList);
        int[][] ans = new int[K][2];
        for (int i = 0; i < K; i++) {
            double dis = arrayList.get(i);
            int index = -1;
            for (double key : hashMap.keySet()) {
                if (dis == key) {
                    index = hashMap.get(key);
                    break;
                }
            }
            ans[i][0] = points[index][0];
            ans[i][1] = points[index][1];
        }
        return ans;
    }
}
