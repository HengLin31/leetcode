package pers.henglin.leetcode.string;

import pers.henglin.leetcode.Verification;

public class DistinctSubsequences implements Verification<String, Integer> {
    private int distinctSubsequences(String s, String t){
        int sLength = s.length();
        int tLength = t.length();
        int[][] dp = new int[sLength + 1][tLength + 1];
        for(int row=0; row<=sLength; row++){
            dp[row][0] = 1;
        }
        for(int col=1; col<=tLength; col++){
            dp[0][col] = 0;
        }
        for(int row=1; row<=sLength; row++){
            for(int col=1; col<=tLength; col++){
                if(s.charAt(row - 1) == t.charAt(col - 1)){
                    dp[row][col] = dp[row - 1][col - 1] + dp[row - 1][col];
                }else {
                    dp[row][col] = dp[row - 1][col];
                }
            }
        }
        return dp[sLength][tLength];
    }

    @Override
    public Integer verify(String... input) {
        return distinctSubsequences(input[0], input[1]);
    }
}
