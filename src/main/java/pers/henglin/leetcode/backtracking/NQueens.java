package pers.henglin.leetcode.backtracking;

import com.google.gson.Gson;
import pers.henglin.leetcode.Verification;

import java.util.ArrayList;
import java.util.List;

public class NQueens implements Verification<Integer, List<List<String>>> {
    private static final String QUEEN = "Q";
    private static final String SPACE = ".";

    private List<List<String>> nQueens(int n) {
        List<List<String>> result = new ArrayList<>();
        int[] queenList = new int[n];
        placeQueen(queenList, 0, n, result);
        return result;
    }

    private void placeQueen(int[] queenList, int row, int size, List<List<String>> result) {
        if(row == size){
            saveResult(queenList, size, result);
        }
        for(int col=0; col<size; col++) {
            if(isValid(queenList, row, col)) {
                queenList[row] = col;
                placeQueen(queenList, row + 1, size, result);
            }
        }
    }

    private void saveResult(int[] queenList, int size, List<List<String>> result){
        ArrayList<String> list = new ArrayList<>();
        for(int index=0; index<size; index++){
            StringBuilder sb = new StringBuilder();
            for(int col=0; col<size; col++){
                if(queenList[index] == col){
                    sb.append(QUEEN);
                }else{
                    sb.append(SPACE);
                }
            }
            list.add(sb.toString());
        }
        result.add(list);
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
    public List<List<String>> verify(Integer... input) {
        return nQueens(input[0]);
    }
}
