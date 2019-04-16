package mianshi.s26;

public class s26 {
    public static void main(String[]args)
    {
        int[] a ={1332802,1177178,1514891,871248,753214,123866,1615405,328656,1540395,968891,1884022,252932,1034406,1455178,821713,486232,860175,1896237,852300,566715,1285209,1845742,883142,259266,520911,1844960,218188,1528217,332380,261485,1111670,16920,1249664,1199799,1959818,1546744,1904944,51047,1176397,190970,48715,349690,673887,1648782,1010556,1165786,937247,986578,798663};
       System.out.println( findKth(a ,a.length  , 24 ));

    }
    public static int findKth(int[] a , int n , int K)
    {
        quickSort(a);
        return a[a.length-K];
    }
    public static void quickSort(int[] arr)
    {
        doQuickSort(arr , 0 , arr.length -1);
    }
    public static void doQuickSort(int[] arr , int startIndex , int endIndex)
    {
        if (startIndex >= endIndex) {
            return ;
        }
        int base = arr[startIndex];
        int pivot = partition(arr, base, startIndex + 1,
                endIndex);
        if (pivot != startIndex) {
            swap(arr, startIndex, pivot);
        }
        doQuickSort(arr, startIndex, pivot - 1);
        doQuickSort(arr, pivot + 1, endIndex);
    }

    private static int partition(int[] arr, int base,
                                 int startIndex, int endIndex) {
        {
            int i = startIndex ;
            int j = endIndex ;
            for (; i <= j; ) {
                if (arr[i] > base) {
                    break ;
                }
                i++;
            }
            if (i == endIndex + 1) {
                return endIndex;
            }
            for (; j >= i + 1; ) {
                if(arr[j] <= base)
                {
                    break ;
                }
                j-- ;
            }
            if (i < j) {
                swap(arr, i, j);
                return partition(arr, base, i + 1, j - 1);
            }else{
                return i -1 ;
            }
        }

    }

    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp ;
    }
}
