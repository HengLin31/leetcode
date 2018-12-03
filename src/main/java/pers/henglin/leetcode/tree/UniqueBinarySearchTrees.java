package pers.henglin.leetcode.tree;

import pers.henglin.leetcode.Verification;

public class UniqueBinarySearchTrees implements Verification<Integer, Integer> {
    private int uniqueBinarySearchTrees(int n){
        int[] dp = new int[n + 1];
        dp[0] = 1;
        dp[1] = 1;
        for(int root=2; root<=n; root++){
            for(int index=1; index<=root; index++){
                //          left            right
                dp[root] += dp[index - 1] * dp[root - index];
            }
        }
        return dp[n];
    }

    @Override
    public Integer verify(Integer... input) {
        return uniqueBinarySearchTrees(input[0]);
    }
}
