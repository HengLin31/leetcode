package pers.henglin.leetcode.array;

import pers.henglin.leetcode.Verification;

import java.util.List;

public class UniquePathsII implements Verification<List<List<Integer>>, Integer> {
    private int uniquePathsII(int[][] obstacleGrid){
        int length = obstacleGrid[0].length;
        int[] dp = new int[length];
        dp[0] = 1;
        for(int[] row:obstacleGrid){
            for(int step = 0; step < length; step++){
                if(1 == row[step]){
                    dp[step] = 0;
                }else if(step > 0){
                    dp[step] += dp[step - 1];
                }
            }
        }

        return dp[length - 1];
    }

    private int uniquePathsII2(int[][] obstacleGrid) {
        int rowLenght = obstacleGrid.length;
        int colLength = obstacleGrid[0].length;

        int dp[][] = new int[rowLenght][colLength];
        for(int row=rowLenght-1; row>=0; row--){
            for(int col=colLength-1; col>=0; col--){
                if((row == rowLenght - 1) && (col == colLength - 1)){
                    dp[row][col] = 1;
                }

                if(obstacleGrid[row][col] == 1) {
                    dp[row][col] = 0;
                    continue;
                }

                if((row < rowLenght - 1) && (0 == obstacleGrid[row+1][col])){
                    dp[row][col] += dp[row + 1][col];
                }

                if((col < colLength - 1) && (0 == obstacleGrid[row][col + 1])){
                    dp[row][col] += dp[row][col + 1];
                }
            }
        }
        return dp[0][0];
    }

    @SafeVarargs
    @Override
    public final Integer verify(List<List<Integer>>... input) {
        int[][] obstacleGrid = input[0].stream().map(row -> row.stream().mapToInt(col -> col).toArray()).toArray(int[][]::new);
        return uniquePathsII(obstacleGrid);
    }
}
