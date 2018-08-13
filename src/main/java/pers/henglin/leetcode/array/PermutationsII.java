package pers.henglin.leetcode.array;

import pers.henglin.leetcode.Verification;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PermutationsII implements Verification<Integer, List<List<Integer>>> {
    private List<List<Integer>> permutationsII(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        boolean[] visited = new boolean[nums.length];
        Arrays.sort(nums);
        dfs(nums, visited, new ArrayList<>(), result);
        return result;
    }

    private void dfs(int[] nums, boolean[] visited, List<Integer> list, List<List<Integer>> result) {
        if(list.size() == nums.length) {
            result.add(new ArrayList<>(list));
            return;
        }
        for(int index=0;index<nums.length;index++) {
            if(visited[index] ||
                    index > 0 &&
                            nums[index] == nums[index - 1] &&
                            !visited[index - 1]){
                continue;
            }
            visited[index] = true;
            list.add(nums[index]);
            dfs(nums, visited, list, result);
            list.remove(list.size() - 1);
            visited[index] = false;
        }
    }

    @Override
    public List<List<Integer>> verify(Integer... input) {
        int[] nums = Arrays.stream(input).mapToInt(ele -> ele).toArray();
        return permutationsII(nums);
    }
}
