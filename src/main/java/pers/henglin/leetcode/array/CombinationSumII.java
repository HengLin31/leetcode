package pers.henglin.leetcode.array;

import pers.henglin.leetcode.Verification;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

public class CombinationSumII implements Verification<Map, List<List<Integer>>> {
    private List<List<Integer>> combinationSumII(int[] candidates, int target){
        Arrays.sort(candidates);
        List<List<Integer>> result = new ArrayList<>();
        combination(candidates, target, 0, 0, new ArrayList<>(), result);
        return result;
    }

    private void combination(int[] candidates, int target, int start, int sum, List<Integer> list, List<List<Integer>> result) {
        if(start == candidates.length) {
            return;
        }
        for(int index=start; index<candidates.length; index++){
            if(index > start && candidates[index] == candidates[index - 1]) {
                continue;
            }
            if(sum + candidates[index] > target){
                return;
            }
            List<Integer> temps = new ArrayList<>(list);
            temps.add(candidates[index]);
            if(sum + candidates[index] == target){
                result.add(temps);
            }else{
                combination(candidates, target, index + 1, sum + candidates[index], temps, result);
            }
        }
    }

    @Override
    public List<List<Integer>> verify(Map... input) {
        int[] candidates = (int[]) input[0].get("candidates");
        int target = (int) input[0].get("target");
        return combinationSumII(candidates, target);
    }
}
