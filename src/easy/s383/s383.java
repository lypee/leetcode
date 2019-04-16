package easy.s383;

public class s383 {
    public static void main(String[] args){
String s = "aa" ;
String ss = "aab" ;
System.out.println(canConstruct(s,ss));
    }
    public static boolean canConstruct(String ransomNote , String magazine){
        int[] ans = new int[26] ;
        for(int i = 0 ; i < magazine.length() ; i++){
            ans[magazine.charAt(i) - 'a']++ ;
        }
        for(int i = 0 ;i  < ransomNote.length() ; i++){
            if( -- ans[ransomNote.charAt(i)-'a'] < 0 ) return false ;
        }
        return true ;
    }
}
