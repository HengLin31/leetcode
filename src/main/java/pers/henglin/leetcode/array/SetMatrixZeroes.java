package pers.henglin.leetcode.array;

import pers.henglin.leetcode.Verification;

import java.util.List;

public class SetMatrixZeroes implements Verification<List<List<Integer>>, int[][]> {
    private int[][] setMatrixZeroes(int[][] matrix){
        if (matrix.length == 0) {
            return matrix;
        }

        int rowLength = matrix.length;
        int colLength = matrix[0].length;
        int[] rows = new int[rowLength];
        int[] cols = new int[colLength];

        for(int index=0; index<rowLength; index++){
            rows[index] = 0;
        }

        for(int index=0; index<colLength; index++){
            cols[index] = 0;
        }

        for(int row=0; row<rowLength; row++){
            for(int col=0; col<colLength; col++){
                if (matrix[row][col] == 0) {
                    rows[row] = 1;
                    cols[col] = 1;
                }
            }
        }

        for (int row=0; row<rowLength; row++) {
            for (int col=0; col<colLength; col++) {
                if (rows[row] == 1 || cols[col] == 1) {
                    matrix[row][col] = 0;
                }
            }
        }
        return matrix;
    }

    @Override
    public int[][] verify(List<List<Integer>>... input) {
        int[][] matrix = input[0].stream().map(row -> row.stream().mapToInt(col -> col).toArray()).toArray(int[][]::new);
        return setMatrixZeroes(matrix);
    }
}
