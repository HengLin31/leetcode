package pers.henglin.leetcode.string;

import pers.henglin.leetcode.Verification;

/**
 * Created by linheng on 2018/5/22.
 */
public class LongestPalindromicSubstring implements Verification<String, String> {
    private String longestPalindromicSubstring(String s){
        int start = 0, end = 0;
        for (int index = 0; index < s.length(); index++) {
            int len1 = expandAroundCenter(s, index, index);
            int len2 = expandAroundCenter(s, index, index + 1);
            int len = Math.max(len1, len2);
            if (len > end - start) {
                start = index - (len - 1) / 2;
                end = index + len / 2;
            }
        }
        return s.substring(start, end + 1);
    }

    private int expandAroundCenter(String s, int left, int right) {
        int L = left, R = right;
        while (L >= 0 && R < s.length() && s.charAt(L) == s.charAt(R)) {
            L--;
            R++;
        }
        return R - L - 1;
    }

    @Override
    public String verify(String... input) {
        return longestPalindromicSubstring(input[0]);
    }
}
