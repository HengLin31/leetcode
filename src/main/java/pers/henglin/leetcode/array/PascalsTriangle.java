package pers.henglin.leetcode.array;

import pers.henglin.leetcode.Verification;

import java.util.ArrayList;
import java.util.List;

public class PascalsTriangle implements Verification<Integer, List<List<Integer>>> {
    private List<List<Integer>> pascalsTriangle(int numRows){
        List<List<Integer>> result = new ArrayList<>();
        if(0 >= numRows){
            return result;
        }
        List<Integer> prevLevel = new ArrayList<>();
        //level 1
        prevLevel.add(1);
        result.add(prevLevel);

        for(int level=2; level<=numRows; level++){
            List<Integer> currentLevel = new ArrayList<>();
            currentLevel.add(1);
            for(int index=0; index<prevLevel.size()-1; index++){
                currentLevel.add(prevLevel.get(index) + prevLevel.get(index + 1));
            }
            currentLevel.add(1);
            result.add(currentLevel);
            prevLevel = currentLevel;
        }
        return result;
    }

    @Override
    public List<List<Integer>> verify(Integer... input) {
        return pascalsTriangle(input[0]);
    }
}
