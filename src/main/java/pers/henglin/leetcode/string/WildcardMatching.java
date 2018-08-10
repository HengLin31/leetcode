package pers.henglin.leetcode.string;

import pers.henglin.leetcode.Verification;

public class WildcardMatching implements Verification<String, Boolean> {
    private static final char MATCHES_ANY_SINGLE = '?';
    private static final char MATCHES_ANY_SEQUENCE = '*';

    private boolean wildcardMatching(String s, String p){
        boolean[] dp = new boolean[s.length() + 1];
        dp[0] = true;

        for(int patternIndex=0; patternIndex<p.length(); patternIndex++){
            boolean[] next = new boolean[s.length() + 1];
            if(p.charAt(patternIndex) == MATCHES_ANY_SEQUENCE){
                boolean hasTrue = false;
                for(int strIndex=0; strIndex<=s.length(); strIndex++){
                    hasTrue |= dp[strIndex];
                    next[strIndex] = hasTrue;
                }
            }else{
                for(int strIndex = 0; strIndex<s.length(); strIndex++){
                    if(dp[strIndex] &&
                            (p.charAt(patternIndex) == MATCHES_ANY_SINGLE ||
                                    p.charAt(patternIndex) == s.charAt(strIndex))){
                        next[strIndex + 1] = true;
                    }
                }
            }
            dp = next;
        }
        return dp[s.length()];
    }

    @Override
    public Boolean verify(String... input) {
        return wildcardMatching(input[0], input[1]);
    }
}
