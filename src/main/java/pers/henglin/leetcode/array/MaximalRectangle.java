package pers.henglin.leetcode.array;

import pers.henglin.leetcode.Verification;

import java.util.Map;

public class MaximalRectangle implements Verification<Map, Integer> {
    private static final char ZERO = '0';

    private int maximalRectangle(char[][] matrix){
        int maxArea = 0;
        for(int row=0; row<matrix.length; row++){
            for(int col=0; col<matrix[0].length; col++){
                if(matrix[row][col] == ZERO){
                    continue;
                }
                if(row > 0){
                    matrix[row][col] = (char) (matrix[row - 1][col] + 1);
                }else{
                    matrix[row][col] = ZERO + 1;
                }

                int height = matrix[row][col] - ZERO;
                int area = height;
                for(int index=col-1; index>=0; index--){
                    if(matrix[row][index] == ZERO){
                        break;
                    }
                    height = Math.min(height, matrix[row][index] - ZERO);
                    area = Math.max(area, (col - index + 1) * height);
                }
                maxArea = Math.max(area, maxArea);
            }
        }
        return maxArea;
    }

    @Override
    public Integer verify(Map... input) {
        char[][] matrix = (char[][]) input[0].get("matrix");
        return maximalRectangle(matrix);
    }
}
