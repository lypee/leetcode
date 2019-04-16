package mianshi.s40;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class s40 {
    public static void main(String[]args) throws Exception
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] s = br.readLine().split(" ") ;
        int W = Integer.parseInt(s[0]);
        int Y = Integer.parseInt(s[1]);
        Double X = Double.parseDouble(s[2]);
        int N = Integer.parseInt(s[3]);
        System.out.println((int)Math.floor(getAverageAge(W, Y, X, N)));
    }
    public static Double getAverageAge(int W , int Y , Double X , int N)
    {

        if(N==1)
        {
            return ((1-X)*W*Y+(X)*W*21)/W;
        }
        else {

            return (getAverageAge(W, (int)Math.ceil((((1.0 - X) * W * Y + (X) * W * 21 + W) / W)) , X , N - 1));
        }
    }
}

