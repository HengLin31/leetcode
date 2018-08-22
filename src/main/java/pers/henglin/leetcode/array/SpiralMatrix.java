package pers.henglin.leetcode.array;

import pers.henglin.leetcode.Verification;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class SpiralMatrix implements Verification<Map, List<Integer>> {
    private List<Integer> spiralMatrix(int[][] matrix){
        List<Integer> result = new ArrayList<>();
        if( 0 == matrix.length || 0 == matrix[0].length){
            return result;
        }
        int rowLength = matrix.length;
        int colLength = matrix[0].length;

        int rowStart = 0;
        int colStart = 0;
        int rowEnd = rowLength - 1;
        int colEnd = colLength - 1;
        while(rowEnd >= rowStart && colEnd >= colStart) {
            for(int colIndex=colStart; colIndex<=colEnd; colIndex++) {
                result.add(matrix[rowStart][colIndex]);
            }
            for(int rowIndex=rowStart+1; rowIndex<=rowEnd; rowIndex++) {
                result.add(matrix[rowIndex][colEnd]);
            }
            for(int colIndex=colEnd-1; colIndex>=colStart&&rowEnd>rowStart; colIndex--) {
                result.add(matrix[rowEnd][colIndex]);
            }
            for(int rowIndex=rowEnd-1; rowIndex>=rowStart+1&&colEnd>colStart; rowIndex--) {
                result.add(matrix[rowIndex][colStart]);
            }
            rowStart++;
            colStart++;
            rowEnd--;
            colEnd--;
        }
        return result;
    }

    @Override
    public List<Integer> verify(Map... input) {
        int[][] matrix = ((List<List<Integer>>) input[0].get("matrix")).stream().map(row -> row.stream().mapToInt(col -> col).toArray()).toArray(int[][]::new);
        return spiralMatrix(matrix);
    }
}
