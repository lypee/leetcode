package mianshi.s4;

import java.util.function.BinaryOperator;

public class s4 {
    public static void main(String[]args)
    {
        int[] a = {1,2,3,4,5} ;
//        for(int i = -1 ; i  <= 5 ; i ++)
//        {
            System.out.println(new test().BinarySearchMax(a ,1 ));
//        }
    }

}
class test{
    int BinarySearchMax(int[] a, int target)

    {
        int left = 0;

        int right = a.length-1;

        while (left < right) {

            int mid = (left + right) / 2;

            if (a[mid] <= target)

            {
                left = mid;
            }

            else

            {
                right = mid - 1;
            }

        }

        if (a[left] == target)

        {
            return left;
        }

        return -1;

    }
}
