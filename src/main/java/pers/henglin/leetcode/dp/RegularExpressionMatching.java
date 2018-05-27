package pers.henglin.leetcode.dp;

import pers.henglin.leetcode.Verification;

/**
 * Created by linheng on 2018/5/27.
 */
public class RegularExpressionMatching implements Verification<String, Boolean> {
    private boolean isMatch(String text, String pattern){
        boolean[][] dp = new boolean[text.length() + 1][pattern.length() + 1];
        dp[text.length()][pattern.length()] = true;
        for (int textIndex=text.length(); textIndex>=0; textIndex--){
            for (int patternIndex=pattern.length()-1; patternIndex>=0; patternIndex--){
                boolean first_match = (textIndex < text.length() &&
                        (pattern.charAt(patternIndex) == text.charAt(textIndex) || pattern.charAt(patternIndex) == '.'));
                if (patternIndex + 1 < pattern.length() && pattern.charAt(patternIndex + 1) == '*'){
                    dp[textIndex][patternIndex] = dp[textIndex][patternIndex + 2] || first_match && dp[textIndex + 1][patternIndex];
                }else{
                    dp[textIndex][patternIndex] = first_match && dp[textIndex + 1][patternIndex + 1];
                }
            }
        }
        return dp[0][0];
    }

    @Override
    public Boolean verify(String... input) {
        return isMatch(input[0], input[1]);
    }
}
