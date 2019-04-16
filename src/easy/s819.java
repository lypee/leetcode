package easy;

import java.util.Arrays;
import java.util.HashMap;

public class s819 {
    public static void main(String[] args) {
//        String S = "abc" ;
//        String s = "abc" ;
//        System.out.println(S == s);
//        HashMap<String , Integer> map = new HashMap<>() ;
////        map.put("123" ,13) ;
////        if(map.containsKey("123")){
////            int number  = map.get("123") + 1 ;
////            map.put("123",number) ;
////        }
////        System.out.println(map.get("123"));
        String paragraph = "a,a,a,a,b,b,b,c,c";
        String[] banned = {"a"};
        String s = "hit,";
//        System.out.println(s.charAt(s.length()-1) == ',');
        System.out.println(mostCommonWord(paragraph, banned));
    }

    public static String MostCommonWord(String paragraph, String[] banned) {
        String[] words = paragraph.toLowerCase().split("[ !?',;.]+");
        HashMap<String, Integer> hashmap = new HashMap<>();
        for (String word : words) hashmap.put(word, hashmap.getOrDefault(word, 0) + 1);
        for (String word : banned) if (hashmap.containsKey(word)) hashmap.remove(word);
        String res = null;
        for (String word : hashmap.keySet())
            if (res == null || hashmap.get(word) > hashmap.get(res))
                res = word;
        return res;
    }

    public static String mostCommonWord(String paragraph, String[] banned) {
        paragraph = paragraph.toLowerCase();
        StringBuilder stringBuilder = new StringBuilder();
        //禁止列表小写
        String[] ban = new String[banned.length];
        for (int i = 0; i < banned.length; i++) {
            ban[i] = banned[i].toLowerCase();
        }

        String[] paragraphs = paragraph.split(" ");
        //
        System.out.println(paragraph);
        HashMap<String, Integer> hashMap = new HashMap<>();
        //将String 和 出现的次数 存入map中
        for (int i = 0; i < paragraphs.length; i++) {
            //如果该单词在 banned中 跳过循环
            String word = paragraphs[i];
//                System.out.println(word+"   " + word.charAt(word.length() -1 ));
            if (word.charAt(word.length() - 1) == ',' || word.charAt(word.length() - 1) == '.' || word.charAt(word.length() - 1) == '!') {
                word = word.substring(0, word.length() - 1);
            }
//                System.out.println(word);

            boolean flag = Arrays.asList(ban).contains(word);
            System.out.println("flag : " + flag);
            if (flag) continue;

            //如果map中不包含key:String
            if (!hashMap.containsKey(word)) {
                hashMap.put(word, 1);
            } else {
                //包含key
                int number = hashMap.get(word) + 1;
                hashMap.put(word, number);
            }
        } //end
        int count = 0;
        String ans = "";
        boolean changed = false;
        for (String str : hashMap.keySet()) {
            count = Math.max(count, hashMap.get(str));
            if (count == hashMap.get(str)) {
                ans = str;
            }
        }

        return ans;
    }
}


