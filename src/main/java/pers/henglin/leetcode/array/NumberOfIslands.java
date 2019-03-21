package pers.henglin.leetcode.array;

import pers.henglin.leetcode.Verification;

import java.util.Arrays;

public class NumberOfIslands implements Verification<String, Integer> {
    private static final char LAND = '1';
    private static final char WATER = '0';

    private int numberOfIslands(char[][] grid){
        int islandCount = 0;
        for(int row=0; row<grid.length; row++){
            for(int col=0; col<grid[0].length; col++){
                if(LAND == grid[row][col]){
                    islandCount++;
                    dfs(grid, row, col);
                }
            }
        }
        return islandCount;
    }

    public void dfs(char[][] grid, int row, int col) {
        if((row < 0) ||
                (row >= grid.length) ||
                (col < 0) ||
                (col >= grid[0].length) ||
                (WATER == grid[row][col])){
            return;
        }
        grid[row][col] = WATER;
        dfs(grid, row - 1, col);
        dfs(grid, row + 1, col);
        dfs(grid, row, col - 1);
        dfs(grid, row, col + 1);
    }

    @Override
    public Integer verify(String... input) {
        char[][] grid = Arrays.stream(input).map(ele -> ele.toCharArray()).toArray(char[][]::new);
        return numberOfIslands(grid);
    }
}
