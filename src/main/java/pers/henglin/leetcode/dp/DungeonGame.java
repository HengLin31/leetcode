package pers.henglin.leetcode.dp;

import pers.henglin.leetcode.Verification;

public class DungeonGame implements Verification<int[][], Integer> {
    private int dungeonGame(int[][] dungeon){
        int rowLength = dungeon.length;
        int colLength = dungeon[0].length;
        dungeon[rowLength - 1][colLength - 1] = Math.max(1 - dungeon[rowLength - 1][colLength - 1], 1);
        for(int col=colLength-2; col>=0; col--){
            dungeon[rowLength - 1][col] = Math.max(dungeon[rowLength - 1][col + 1] - dungeon[rowLength - 1][col], 1);
        }
        for(int row=rowLength-2; row>=0; row--){
            dungeon[row][colLength - 1] = Math.max(dungeon[row + 1][colLength - 1] - dungeon[row][colLength - 1], 1);
        }
        for(int row=rowLength-2; row>=0; row--){
            for(int col=colLength-2; col>=0; col--){
                dungeon[row][col] = Math.max(Math.min(dungeon[row + 1][col], dungeon[row][col + 1]) - dungeon[row][col], 1);
            }
        }
        return dungeon[0][0];
    }

    @Override
    public Integer verify(int[][]... input) {
        return dungeonGame(input[0]);
    }
}
