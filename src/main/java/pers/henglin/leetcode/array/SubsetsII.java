package pers.henglin.leetcode.array;

import pers.henglin.leetcode.Verification;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SubsetsII implements Verification<Integer, List<List<Integer>>> {
    private List<List<Integer>> subsetsII(int[] nums){
        Arrays.sort(nums);
        List<List<Integer>> subsets = new ArrayList<>();
        dfs(subsets, new ArrayList<>(), nums, 0);
        return subsets;
    }

    private void dfs(List<List<Integer>> subsets, List<Integer> currentSubset, int[] nums, int currentIndex) {
        subsets.add(new ArrayList<>(currentSubset));
        for(int index=currentIndex; index<nums.length; index++){
            if((index != currentIndex) && (nums[index] == nums[index - 1])){
                continue;
            }
            currentSubset.add(nums[index]);
            dfs(subsets, currentSubset, nums, index + 1);
            currentSubset.remove(currentSubset.size() - 1);
        }
    }

    @Override
    public List<List<Integer>> verify(Integer... input) {
        int[] nums = Arrays.stream(input).mapToInt(ele -> ele).toArray();
        return subsetsII(nums);
    }
}
