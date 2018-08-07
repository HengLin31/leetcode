package pers.henglin.leetcode.array;

import pers.henglin.leetcode.Verification;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class CombinationSum implements Verification<Map, List<List<Integer>>> {
    private List<List<Integer>> combinationSum(int[] candidates, int target){
        List<List<Integer>> result = new ArrayList<>();
        combination(candidates, result, 0, target, new ArrayList<>());
        return result;
    }

    private void combination(int[] nums, List<List<Integer>> result, int start, int target, List<Integer> items){
        if(0 == target){
            result.add(new ArrayList<>(items));
            return;
        }
        if(target > 0){
            for(int index=start; index<nums.length; index++){
                items.add(nums[index]);
                combination(nums, result, index, target - nums[index], items);
                items.remove(items.size() - 1);
            }
        }
    }

    @Override
    public List<List<Integer>> verify(Map... input) {
        int[] candidates = (int[]) input[0].get("candidates");
        int target = (int) input[0].get("target");
        return combinationSum(candidates, target);
    }
}
