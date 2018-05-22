package pers.henglin.leetcode.string;

import pers.henglin.leetcode.Verification;

/**
 * Created by linheng on 2018/5/22.
 */
public class LongestPalindromicSubstring implements Verification<String, String> {
    private String longestPalindromicSubstring(String str){
        String[] result = new String[]{""};
        for (int index=0; index<str.length(); index++){
            //odd center, ex: aba -> b
            findLongestPalindromicLengthFromCenter(str, index, index, result);
            //even center, ex: abba -> bb
            findLongestPalindromicLengthFromCenter(str, index, index + 1, result);
        }
        return result[0];//str.substring(start, end + 1);
    }

    private void findLongestPalindromicLengthFromCenter(String str, int initLeft, int initRight, String[] result) {
        int left = initLeft;
        int right = initRight;
        while (left >= 0 && right < str.length() //boundary
                && str.charAt(left) == str.charAt(right)) {//find longest palindromic
            left--;
            right++;
        }
        String currentResult = str.substring(left + 1, right);
        if(currentResult.length() > result[0].length()){
            result[0] = currentResult;//update result, if find longer palindromic
        }
    }

    @Override
    public String verify(String... input) {
        return longestPalindromicSubstring(input[0]);
    }
}
