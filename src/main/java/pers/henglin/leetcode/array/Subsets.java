package pers.henglin.leetcode.array;

import pers.henglin.leetcode.Verification;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Subsets implements Verification<Integer, List<List<Integer>>> {
    private List<List<Integer>> subsets(int[] nums){
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        dfs(result, list, nums, 0);
        return result;
    }

    private void dfs(List<List<Integer>> res, List<Integer> list, int[] nums, int start){
        res.add(new ArrayList<>(list));
        for(int index=start; index<nums.length; index++) {
            list.add(nums[index]);
            dfs(res, list, nums, index + 1);
            list.remove(list.size() - 1);
        }
    }

    @Override
    public List<List<Integer>> verify(Integer... input) {
        int[] nums = Arrays.stream(input).mapToInt(ele -> ele).toArray();
        return subsets(nums);
    }
}
