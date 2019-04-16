package easy.s342;

public class s342 {
    public static void main(String[]args)
    {
        System.out.println(5 & 2 );
    }
    public static boolean isPowerOfFour(int num)
    {
        return num> 0 &&( num&(num-1) )== 0 && (num & 0x55555555 )!= 0  ;
    }
}
