package pers.henglin.leetcode.dp;

import pers.henglin.leetcode.Verification;

public class ClimbingStairs implements Verification<Integer, Integer> {
    private int climbingStairs(int n){
        int[] dp = new int[n + 1];
        dp[0] = 1;
        dp[1] = 1;
        for(int index=2; index<n+1; index++){
            dp[index] = dp[index - 1] + dp[index - 2];
        }
        return dp[n];
    }

    @Override
    public Integer verify(Integer... input) {
        return climbingStairs(input[0]);
    }
}
