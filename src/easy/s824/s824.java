package easy.s824;

public class s824 {
    public static void main(String[] args) {
        String str = "I speak Goat Latin";
        System.out.println(toGoatLatin(str));
//        System.out.println("the");
    }

    public static String toGoatLatin(String S) {
        String[] str = S.split(" ");
        StringBuilder ans = new StringBuilder();
        for (int i = 0; i < str.length; i++) {
            //判断首字母是否为元音 ;
            StringBuilder word = new StringBuilder();
            word.append(str[i]);
            //首字母
            String firstLetter = word.substring(0, 1);
            //首字母不包含元音字母
            if (!"aeiou".contains(firstLetter.toLowerCase())) {
                //删除首字母并添加到末尾
                word.deleteCharAt(0).append(firstLetter);
            }
            word.append("ma");
            for (int j = 0; j < i + 1; j++) {
                word.append("a");
            }
            ans.append(word).append(" ");
        }
        ans.deleteCharAt(ans.length() - 1);
        return ans.toString();
    }
}
