package easy.s748;

public class s748 {
    public static void main(String[] args) {
        String s = "1s3 PSt";
        String[] words = {"step", "steps", "stripe", "stepple"};
        System.out.println(s.indexOf('9'));
        System.out.println(shortestCompletingWord(s, words));
    }

    public static String shortestCompleting(String licensePlate, String[] words) {
        //桶
        int[] cnt = new int[26];
        //license的有效字母的个数 , 不去重
        int diff = 0;
        licensePlate = licensePlate.toLowerCase();
        for (int i = 0; i < licensePlate.length(); i++) {
            char curr = licensePlate.charAt(i);
            if (curr >= 'a' && curr <= 'z') {
                cnt[curr - 'a']++;
                diff++;
            }
        }
        String result = "";
        for (String word : words) {
            if (isVaild(word, diff, cnt)) {
                if (result.equals("") || (!result.equals("") && word.length() < result.length())) {
                    result = word;
                }
            }
        }
        return result;
    }

    private static boolean isVaild(String word, int diff, int[] cnt) {
        int[] mycnt = new int[26];
        for (int i = 0; i < word.length(); i++) {
            char curr = word.charAt(i);
            if (cnt[curr - 'a'] > mycnt[curr - 'a']) {
                mycnt[curr - 'a']++;
                diff--;
            }
            if (diff == 0) {
                return true;
            }
        }
        return false;
    }

    public static String shortestCompletingWord(String licensePlate, String[] words) {
        StringBuilder licenseBuilder = new StringBuilder();
        //全部转换成小写
        licensePlate = licensePlate.toLowerCase();
        for (int i = 0; i < licensePlate.length(); i++) {
            if (Character.isLetter(licensePlate.charAt(i))) {
                licenseBuilder.append(licensePlate.charAt(i));
            }
        }
        //获得license的String
        String license = licenseBuilder.toString();


        //切分words
        StringBuilder ansBuilder = new StringBuilder();


        for (int i = 0; i < words.length; i++) {
            //标记字符串是否包含license
//            System.out.println(i);
            //默认状态为true
            boolean containLicense = true;
            //对每一个单词进行判断
            //先转换成小写字符串temp ;
            String temp = words[i].toLowerCase();
            //遍历license中的每个char
            for (int j = 0; j < license.length(); j++) {
                //退出情况 ;
                if (containLicense = false) break;

                char c = license.charAt(j);
                //copy
                String licen = license;
                //temp中包含license.charAt(j)


                if (temp.indexOf(c) >= 0) {
                    //因为licen是从j 开始 判断的  ; Licenlenght = license.lenght ;
                    licen = licen.substring(j + 1, licen.length());

                } else {
                    containLicense = false;
                    break;
                }
            }
            //如果都包含
            if (containLicense)
                ansBuilder.append(temp).append(" ");
            else continue;
        }
        System.out.println(ansBuilder);
        return ansBuilder.toString();
    }
}
