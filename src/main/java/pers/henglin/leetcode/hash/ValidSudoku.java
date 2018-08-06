package pers.henglin.leetcode.hash;

import pers.henglin.leetcode.Verification;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class ValidSudoku implements Verification<String, Boolean> {
    private boolean validSudoku(char[][] board){
        int[] rows = new int[9];
        int[] cols = new int[9];
        int[] squares = new int[9];

        for(int row=0; row<board.length; row++) {
            for(int col=0; col<board[0].length; col++) {
                if(board[row][col] == '.'){
                    continue;
                }
                int value = 1 << (board[row][col] - '1');
                if((rows[row] & value) > 0){
                    return false;
                }
                if((cols[col] & value) > 0){
                    return false;
                }
                if((squares[3 * (row/3) + (col/3)] & value) > 0){
                    return false;
                }
                rows[row] |= value;
                cols[col] |= value;
                squares[3 * (row / 3) + (col / 3)] |= value;
            }
        }
        return true;
    }

    private boolean validSudoku2(char[][] board){
        for(int row=0; row<9; row++){
            Set<Character> rowSet = new HashSet<>();
            Set<Character> colSet = new HashSet<>();
            Set<Character> cubeSet = new HashSet<>();
            for(int col=0; col<9; col++){
                if(board[row][col] != '.' && !rowSet.add(board[row][col])){
                    return false;
                }
                if(board[col][row] != '.' && !colSet.add(board[col][row])){
                    return false;
                }
                int RowIndex = 3 * (row / 3) + col / 3;
                int ColIndex = 3 * (row % 3) + col % 3;
                if(board[RowIndex][ColIndex] != '.'
                        && !cubeSet.add(board[RowIndex][ColIndex])){
                    return false;
                }
            }
        }
        return true;
    }

    @Override
    public Boolean verify(String... input) {
        char[][] board = Arrays.stream(input).map(ele -> ele.toCharArray()).toArray(char[][]::new);
        return validSudoku2(board);
    }
}
