package pers.henglin.leetcode.array;

import pers.henglin.leetcode.Verification;

import java.util.List;

public class RotateImage implements Verification<List<List<Integer>>, int[][]> {
    private void rotateImage(int[][] matrix) {
        for(int row=0; row<matrix.length; row++){
            for(int col=0; col<row; col++){
                int temp = matrix[row][col];
                matrix[row][col] = matrix[col][row];
                matrix[col][row] = temp;
            }
        }
        for(int row=0; row<matrix.length; row++){
            for(int col=0; col<matrix.length/2; col++){
                int temp = matrix[row][col];
                matrix[row][col] = matrix[row][matrix.length -1 - col];
                matrix[row][matrix.length - 1 - col] = temp;
            }
        }
    }

    @Override
    public int[][] verify(List<List<Integer>>... input) {
        int[][] matrix = input[0].stream().map(row -> row.stream().mapToInt(col -> col). toArray()).toArray(int[][]::new);
        rotateImage(matrix);
        return matrix;
    }
}
