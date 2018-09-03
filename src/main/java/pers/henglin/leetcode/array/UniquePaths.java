package pers.henglin.leetcode.array;

import pers.henglin.leetcode.Verification;

public class UniquePaths implements Verification<Integer, Integer> {
    private int uniquePaths(int m, int n){
        if(0 == m || 0 == n){
            return 0;
        }
        if(1 == m || 1 == n){
            return 1;
        }
        int[] dp = new int[n];
        for(int initIndex=0; initIndex<n; initIndex++){
            dp[initIndex] = 1;
        }
        for(int count=1; count<m; count++){
            dp[0] = 1;
            for(int step=1; step<n; step++){
                dp[step] = dp[step] + dp[step - 1];
            }
        }
        return dp[n - 1];
    }

    private int uniquePaths2(int m, int n){
        if(0 == m || 0 == n){
            return 0;
        }
        if(1 == m || 1 == n){
            return 1;
        }
        int[][] dp = new int[m][n];
        for(int col=0; col<n; col++){
            dp[0][col] = 1;
        }
        for(int row=0; row<m; row++){
            dp[row][0] = 1;
        }
        for(int row=1; row<m; row++){
            for(int col=1; col<n; col++){
                dp[row][col] = dp[row - 1][col] + dp[row][col - 1];
            }
        }
        return dp[m - 1][n - 1];
    }

    @Override
    public Integer verify(Integer... input) {
        return uniquePaths(input[0], input[1]);
    }
}
