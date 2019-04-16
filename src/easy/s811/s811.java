package easy.s811;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class s811 {
    public static void main(String[] args) {
        String[] str = {"900 google.mail.com", "50 yahoo.com", "1 intel.mail.com", "5 wiki.org"};
        for (String s : subdomainVisits(str)) {
            System.out.println(s);
        }
    }

    public static List<String> subdomainVisits(String[] cpdomains) {
        List<String> ansList = new ArrayList<>();
        Map<String, Integer> map = new HashMap<>();
        //先根据空格切分字符串 按照 键值对存入Map
        for (String s : cpdomains) {
            //将字符串分割成 访问次数 域名 的 形式
            String[] parts = s.split(" ");
            //获得该域名对应的访问次数
            int visit = Integer.parseInt(parts[0]);
            map.put(parts[1], map.getOrDefault(parts[1], 0) + visit);
            //根据 . 号 分割 子字符串  . ..
            String[] subdomains = parts[1].split("\\.");
            String str = subdomains[subdomains.length - 1];
            map.put(str, map.getOrDefault(str, 0) + visit);
            //如果该域名在其它子域名中也出现过
            if (subdomains.length > 2) {
                String key = subdomains[1] + "." + subdomains[2];
                map.put(key, map.getOrDefault(key, 0) + visit);
            }
        }
        //在Map的键中选择
        for (String s : map.keySet()) {
            ansList.add(map.get(s) + " " + s);
        }
        return ansList;
    }
}
