package pers.henglin.leetcode.string;

import pers.henglin.leetcode.Verification;

public class DecodeWays implements Verification<String, Integer> {
    private static final char CHAR_ZERO = '0';
    private static final char CHAR_ONE = '1';
    private static final char CHAR_TWO = '2';
    private static final char CHAR_SIX = '6';

    private int decodeWays(String s){
        if(null == s || 0 == s.length() || CHAR_ZERO == s.charAt(0)) {
            return 0;
        }
        int[] dp = new int[s.length() + 1];
        dp[0] = 1;
        dp[1] = 1;
        for(int index=2; index<=s.length(); index++) {
            int first = s.charAt(index - 2);
            int second = s.charAt(index - 1);
            if(second != CHAR_ZERO){
                dp[index] += dp[index - 1];
            }
            if(first == CHAR_ONE){
                dp[index] += dp[index - 2];
            }
            if(first == CHAR_TWO && second <= CHAR_SIX){
                dp[index] += dp[index - 2];
            }
        }
        return dp[dp.length - 1];
    }

    @Override
    public Integer verify(String... input) {
        return decodeWays(input[0]);
    }
}
