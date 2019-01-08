package pers.henglin.leetcode.array;

import pers.henglin.leetcode.Verification;

import java.util.List;

public class Triangle implements Verification<List<List<Integer>>, Integer> {
    private int triangle(List<List<Integer>> triangle){
        int size = triangle.size();
        int[] result = new int[triangle.size()];
        for(int index=size-1; index>=0; index--){
            result[index] = triangle.get(size - 1).get(index);
        }
        for(int level=size-2; level>=0; level--){
            for(int index=0; index<=level; index++){
                result[index] = Math.min(result[index], result[index + 1]) + triangle.get(level).get(index);
            }
        }
        return result[0];
    }

    @Override
    public Integer verify(List<List<Integer>>... input) {
        return triangle(input[0]);
    }
}
