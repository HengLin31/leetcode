package pers.henglin.leetcode.hash;

import pers.henglin.leetcode.Verification;

import java.util.Arrays;

public class SudokuSolver implements Verification<String, String[]> {
    private static final char SPACE = '.';
    private static final char DIGITAL_ONE = '1';
    private static final char DIGITAL_NINE = '9';

    private void sudokuSolver(char[][] board){
        solver(board);
    }

    private boolean solver(char[][] board){
        for(int row=0; row<9; row++){
            for(int col=0; col<9; col++){
                if(board[row][col] == SPACE){
                    for(char digital=DIGITAL_ONE; digital<=DIGITAL_NINE; digital++){
                        board[row][col] = digital;
                        if(isValid(board, row, col) && solver(board)){
                            return true;
                        }
                        board[row][col] = SPACE;
                    }
                    return false;
                }
            }
        }
        return true;
    }

    private boolean isValid(char[][] board,int checkRow,int checkCol){
        for(int col=0;col<9; col++){
            if(col !=checkCol && board[checkRow][col] == board[checkRow][checkCol]){
                return false;
            }
        }
        for(int row=0; row<9; row++){
            if(row != checkRow && board[row][checkCol] == board[checkRow][checkCol]){
                return false;
            }
        }
        int beginRow = 3 * ( checkRow / 3 );
        int beginCol = 3 * ( checkCol / 3 );
        for(int row=beginRow; row<beginRow+3; row++){
            for(int col=beginCol; col<beginCol+3; col++){
                if(row !=checkRow
                        && col!=checkCol
                        && board[row][col] == board[checkRow][checkCol]){
                    return false;
                }
            }
        }
        return true;
    }

    @Override
    public String[] verify(String... input) {
        char[][] board = Arrays.stream(input).map(ele -> ele.toCharArray()).toArray(char[][]::new);
        sudokuSolver(board);
        return Arrays.stream(board).map(ele -> new String(ele)).toArray(String[]::new);
    }
}
