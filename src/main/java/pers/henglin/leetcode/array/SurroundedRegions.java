package pers.henglin.leetcode.array;

import pers.henglin.leetcode.Verification;

import java.util.ArrayList;
import java.util.List;

public class SurroundedRegions implements Verification<String, List<String>> {
    private static final char O = 'O';
    private static final char X = 'X';
    private static final char MARK = '#';
    private static final int[][] DIRS = {{0, 1}, {0, -1}, {1, 0}, {-1, 0}};

    private void surroundedRegions(char[][] board){
        int rowLength = board.length;
        if(0 == rowLength){
            return;
        }
        int colLength = board[0].length;

        for(int row=0; row<rowLength; row++){
            for(int col=0; col<colLength; col++){
                if((0 == row) || (row == rowLength - 1) || (0 == col) || (col == colLength- 1)){
                    if(O == board[row][col]){
                        dfs(board, row, col);
                    }
                }
            }
        }
        for(int row=0; row<rowLength; row++){
            for(int col=0; col<colLength; col++){
                if(O == board[row][col]){
                    board[row][col] = X;
                }
                if(MARK == board[row][col]){
                    board[row][col] = O;
                }
            }
        }
    }

    private void dfs(char[][] board, int row, int col){
        int rowLength = board.length;
        int colLength = board[0].length;

        if((0 > row) || (row >= rowLength) || (0 > col) || (col >= colLength)){
            return;
        }
        if(O != board[row][col]){
            return;
        }
        board[row][col] = MARK;
        for(int[] dir:DIRS){
            dfs(board, row + dir[0], col + dir[1]);
        }
    }

    @Override
    public List<String> verify(String... input) {
        char[][] board = new char[input.length][];
        for(int row=0; row<input.length; row++){
            board[row] = input[row].toCharArray();
        }
        surroundedRegions(board);
        List<String> result = new ArrayList<>();
        for(char[] record:board) {
            result.add(String.valueOf(record));
        }
        return result;
    }
}
