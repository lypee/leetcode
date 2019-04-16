package easy.s405;

public class s405 {
    public static void main(String[] args)

    {
     System.out.println(-1 >>> 4  );
//            System.out.println(toHex(-1));
    }
    public static String toHex(int num)
    {
        if(num == 0) return "0" ;
        char[] map = {'0','1','2','3','4','5','6','7','8','9','a','b','c','d','e','f'};
        StringBuilder stringBuilder = new StringBuilder() ;
        while(num !=  0)
        {
        stringBuilder.append(map[num & 15]);
        num = num >>> 4 ;
        }
        stringBuilder.reverse() ;
        return stringBuilder.toString() ;
    }
}
