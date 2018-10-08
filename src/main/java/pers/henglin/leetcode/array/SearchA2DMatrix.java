package pers.henglin.leetcode.array;

import pers.henglin.leetcode.Verification;

import java.util.Map;

public class SearchA2DMatrix implements Verification<Map, Boolean> {
    private boolean searchA2DMatrix(int[][] matrix, int target){
        if(null == matrix || 0 == matrix.length){
            return false;
        }
        int row = 0;
        int col = matrix[0].length-1;
        while((row < matrix.length) && (col >= 0)){
            if(matrix[row][col] > target){
                col--;
            } else if(matrix[row][col] < target){
                row++;
            } else {
                return true;
            }
        }
        return false;
    }

    @Override
    public Boolean verify(Map... input) {
        int[][] matrix = (int[][]) input[0].get("matrix");
        int target = (int) input[0].get("target");
        return searchA2DMatrix(matrix, target);
    }
}
