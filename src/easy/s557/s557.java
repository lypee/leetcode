package easy.s557;

public class s557 {
    public static void main(String[] args){
        String s = "Let's take LeetCode contest" ;
        System.out.println(reverseWords(s).substring(0,reverseWords(s).length()-1));
    }
    public static String reverseWords(String s){
        String[] words = s.split(" ") ;
        StringBuilder ans = new StringBuilder() ;
        for(int i = 0 ; i < words.length ; i++){
            for(int j = words[i].length()-1; j >= 0 ; j--){
                    ans.append(words[i].charAt(j));
            }
            ans.append(" ") ;
        }
        return ans.toString().substring(0,ans.toString().length()-1) ;
    }
}
