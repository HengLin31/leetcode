package pers.henglin.leetcode.array;

import pers.henglin.leetcode.Verification;

public class SpiralMatrixII implements Verification<Integer, int[][]> {
    private int[][] spiralMatrixII(int n){
        int[][] matrix = new int[n][n];

        int rowStart =0;
        int colStart =0;
        int rowEnd = n-1;
        int colEnd = n-1;

        int count = 1 ;
        while (rowStart <= rowEnd && colStart <= colEnd) {
            for(int index=colStart; index<=colEnd; index++){
                matrix[rowStart][index] = count++;
            }
            for(int index=rowStart+1; index<=rowEnd; index++){
                matrix[index][colEnd] = count++;
            }
            if(rowStart < rowEnd && colStart < colEnd){
                for(int index=colEnd-1; index>colStart; index--){
                    matrix[rowEnd][index] = count++;
                }
                for(int index=rowEnd; index>rowStart; index--){
                    matrix[index][colStart] = count++;
                }
            }
            rowStart++;
            colStart++;
            rowEnd--;
            colEnd--;
        }
        return matrix;
    }

    @Override
    public int[][] verify(Integer... input) {
        return spiralMatrixII(input[0]);
    }
}
