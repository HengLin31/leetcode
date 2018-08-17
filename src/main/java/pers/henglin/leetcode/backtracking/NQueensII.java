package pers.henglin.leetcode.backtracking;

import pers.henglin.leetcode.Verification;

public class NQueensII implements Verification<Integer, Integer> {
    private int count = 0;

    private int nQueensII(int n) {
        int[] queenList = new int[n];
        placeQueen(queenList, 0, n);
        return count;
    }

    private void placeQueen(int[] queenList, int row, int size) {
        if(row == size){
            count++;
        }
        for(int col=0; col<size; col++) {
            if(isValid(queenList, row, col)) {
                queenList[row] = col;
                placeQueen(queenList, row + 1, size);
            }
        }
    }

    private boolean isValid(int[] queenList, int row, int col) {
        for(int index=0; index<row; index++){
            int position = queenList[index];
            if(position == col){//same row
                return false;
            }
            if(position + row - index == col){//right diagonal
                return false;
            }
            if(position - row + index == col){//left diagonal
                return false;
            }
        }
        return true;
    }

    @Override
    public Integer verify(Integer... input) {
        return nQueensII(input[0]);
    }
}
