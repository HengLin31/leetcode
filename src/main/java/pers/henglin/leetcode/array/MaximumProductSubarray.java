package pers.henglin.leetcode.array;

import pers.henglin.leetcode.Verification;

import java.util.Arrays;

public class MaximumProductSubarray implements Verification<Integer, Integer> {
    private int maximumProductSubarray(int[] nums){
        if(0 == nums.length){
            return 0;
        }
        int maxGlobal = nums[0];
        int maxLocal = nums[0];
        int minLocal = nums[0];
        for(int index=1; index<nums.length; index++) {
            int maxTemp = Math.max(maxLocal * nums[index], minLocal * nums[index]);
            int minTemp = Math.min(maxLocal * nums[index], minLocal * nums[index]);
            maxLocal = Math.max(maxTemp, nums[index]);
            minLocal = Math.min(minTemp, nums[index]);
            maxGlobal = Math.max(maxGlobal, maxLocal);
        }
        return maxGlobal;
    }

    @Override
    public Integer verify(Integer... input) {
        int[] nums = Arrays.stream(input).mapToInt(ele -> ele).toArray();
        return maximumProductSubarray(nums);
    }
}
