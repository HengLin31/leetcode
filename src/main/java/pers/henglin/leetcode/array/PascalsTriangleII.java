package pers.henglin.leetcode.array;

import pers.henglin.leetcode.Verification;

import java.util.ArrayList;
import java.util.List;

public class PascalsTriangleII implements Verification<Integer, List<Integer>> {
    private List<Integer> pascalsTriangleII(int rowIndex){
        List<Integer> result = new ArrayList<>();
        result.add(1);
        for(int level=1; level<rowIndex+1; level++){
            List<Integer> currentLevel = new ArrayList<>();
            currentLevel.add(1);
            for(int index=1; index<level; index++){
                currentLevel.add(result.get(index - 1) + result.get(index));
            }
            currentLevel.add(1);
            result = currentLevel;
        }
        return result;
    }

    @Override
    public List<Integer> verify(Integer... input) {
        return pascalsTriangleII(input[0]);
    }
}
