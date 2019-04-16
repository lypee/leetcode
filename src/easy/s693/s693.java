package easy.s693;

public class s693 {
    public static void main(String[] args) {
//       System.out.println(hasAlternatingBits(11));
//       System.out.println(Integer.toBinaryString(11));
        System.out.println(hasAlternatingBits(11));
    }

    public static boolean hasAlternatingBits(int n) {
        String binaryString = Integer.toBinaryString(n);
        System.out.println(binaryString);
//        System.out.println(binaryString.length());
        for (int i = 1; i < binaryString.length(); i++) {
            if (binaryString.charAt(i) == binaryString.charAt(i - 1)) {
                return false;
            }
            //奇数位的charAt 都应该为 0 ; 偶数位的charAt 都应该为 0 ;
            //因为转换成binaryString 后 的第一位一定为 1  , 所以直接从第二位开始判断  ;
//          if( i % 2 == 1 ){
//              // 判断奇数位
//              System.out.println("判断奇数位");
//              System.out.println(binaryString.charAt(i));
//              if((int)binaryString.charAt(i) != 0)
//              {
//                  return false ;
//              }
//          }else if ( i % 2 == 0 ){
//              //判断偶数位 : 都应该为 1
//              System.out.println("判断偶数位");
//              if((int)binaryString.charAt(i) != 1 ) {
//                  return false ;
//              }
//          }

        }
        return true;
    }
}
