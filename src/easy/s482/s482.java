package easy.s482;



public class s482 {
    public static void main(String[] args)
    {
        String s = "5F3Z-2e-9-w" ;
        int k = 4 ;
        System.out.println(licenseKeyFormatting(s,k));
    }
    public static String licenseKeyFormatting(String S ,int K)
    {
        String S1 = S.replace("-","");
        S1 = S1.toUpperCase();

        // Making stringBuilder
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<S1.length();i++) {
            sb.append(S1.charAt(i));
        }
        System.out.println(sb.toString());
        int len = sb.toString().length();
        // Inserting '-' from back at every K position
        for(int i=K; i < len; i=i+K) {
            sb.insert(len-i,'-');
        }
        return sb.toString();
    }

}
