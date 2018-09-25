package pers.henglin.leetcode.array;

import pers.henglin.leetcode.Verification;

import java.util.List;

public class MinimumPathSum implements Verification<List<List<Integer>>, Integer> {
    private int minimumPathSum(int[][] grid){
        for(int row=1; row<grid.length; row++){
            grid[row][0] += grid[row - 1][0];
        }
        for(int col=1; col<grid[0].length; col++){
            grid[0][col] += grid[0][col - 1];
        }
        for(int row=1; row<grid.length; row++){
            for(int col=1; col<grid[0].length; col++){
                grid[row][col] = Math.min(grid[row][col - 1], grid[row - 1][col]) + grid[row][col];
            }
        }
        return grid[grid.length - 1][grid[0].length - 1];
    }

    @Override
    public Integer verify(List<List<Integer>>... input) {
        int[][] grid = input[0].stream().map(row -> row.stream().mapToInt(col -> col).toArray()).toArray(int[][]::new);
        return minimumPathSum(grid);
    }
}
