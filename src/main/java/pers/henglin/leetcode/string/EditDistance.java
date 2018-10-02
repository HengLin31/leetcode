package pers.henglin.leetcode.string;

import pers.henglin.leetcode.Verification;

import java.util.Arrays;

public class EditDistance implements Verification<String, Integer> {
    private int editDistance(String word1, String word2){
        int dp[][] = new int[word1.length() + 1][word2.length() + 1];
        for(int[] rows:dp){
            Arrays.fill(rows, -1);
        }
        for(int row=0; row<=word1.length(); row++){
            dp[row][0] = row;
        }
        for(int col = 1; col<=word2.length(); col++){
            dp[0][col] = col;
        }
        return distance(dp, word1, word2, word1.length() - 1,word2.length() - 1);
    }

    private int distance(int[][] dp, String word1, String word2, int row, int col){
        if(dp[row + 1][col + 1] != -1){
            return dp[row + 1][col + 1];
        }
        if(word1.charAt(row) == word2.charAt(col)){
            dp[row + 1][col + 1] = distance(dp, word1, word2, row - 1, col - 1);
        }else{
            int insert = distance(dp, word1, word2, row, col - 1);
            int delete = distance(dp, word1, word2, row - 1, col);
            int replace = distance(dp, word1, word2, row - 1, col - 1);
            dp[row + 1][col + 1] = 1 + Math.min(Math.min(insert, delete), replace);
        }
        return dp[row + 1][col + 1];
    }

    @Override
    public Integer verify(String... input) {
        return editDistance(input[0], input[1]);
    }
}
