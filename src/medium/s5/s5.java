package medium.s5;

class Solution {
    public String longestPalindrome(String s) {
        if(s == null || s.length() < 1)
            return "";
        if(s.length() == 1) return s ;
        String str = dealWithS(s);  // 处理一下s,即将给字符串s的中间加上特殊字符，这样无论对于奇数字符还是偶数字符可以做同样的处理

        int[] res = new int[str.length()];
        int R = 0; // 当前所能扩展的半径
        int C = 0; // C位置的半径为R
        int maxC= 0; // 最长的半径的位置
        res[0] = 0;
        for(int i = 1; i < str.length(); i++)
        {
            int j = 2 * C - i;  // i点的对称点
            if(j >= 0 && res[j] < R - i)  // 对称点存在且对称点的回文半径在C的回文中
            {
                res[i] = res[j];
            }
            else  // 否则，需要根据i点一点一点的计算
            {
                int k = 1;
                while(R + k < str.length() && 2 * i - R - k >= 0)
                {
                    if(str.charAt(R + k) == str.charAt(2 * i - R - k))
                        k ++;
                    else
                        break;
                }
                res[i] = R -i + k - 1;
                if(res[i] + i > R)
                {
                    R = res[i] + i;
                    C = i;
                }
            }

            maxC = res[maxC] > res[i] ? maxC : i;  // maxC保存的是回文半径最大的那个点的位置
        }
        String subStr = str.substring(maxC - res[maxC], maxC + res[maxC] + 1);
        StringBuffer sb = new StringBuffer();
        for(int i = 0; i < subStr.length(); i++)
        {
            if(subStr.charAt(i) != '#')
                sb.append(subStr.charAt(i));
        }
        return sb.toString();
    }
    public  String dealWithS(String s)  // 将原字符串进行处理
    {
        StringBuffer sb = new StringBuffer();
        sb.append("#");
        for(int i = 0; i < s.length (); i++)
        {
            sb.append(s.charAt(i));
            sb.append("#");
        }
        return sb.toString();
    }
}