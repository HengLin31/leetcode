package pers.henglin.leetcode.dp;

import pers.henglin.leetcode.Verification;

import java.util.Map;

public class MaximalSquare implements Verification<Map, Integer> {
    private static final char AREA = '1';

    private int maximalSquare(char[][] matrix){
        if((0 == matrix.length) || (0 == matrix[0].length)){
            return 0;
        }
        int rowLength = matrix.length;
        int colLength = matrix[0].length;
        int length = 0;
        int[][] dp = new int[rowLength + 1][colLength + 1];
        for(int row=1; row<=rowLength; row++){
            for(int col=1; col<=colLength; col++){
                if(matrix[row - 1][col - 1] == AREA){
                    dp[row][col] = Math.min(dp[row - 1][col - 1], Math.min(dp[row][col - 1], dp[row - 1][col])) + 1;
                    if(dp[row][col] > length){
                        length = dp[row][col];
                    }
                }
            }
        }
        return length * length;
    }

    @Override
    public Integer verify(Map... input) {
        char[][] matrix = (char[][]) input[0].get("matrix");
        return maximalSquare(matrix);
    }
}
