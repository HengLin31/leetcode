package pers.henglin.leetcode.array;

import pers.henglin.leetcode.Verification;

import java.util.Arrays;

public class MaximumSubarray implements Verification<Integer, Integer> {
    private int maximumSubarray(int[] nums){
        int maxSum = nums[0];
        int currentMax = nums[0];
        for(int index=1; index<nums.length; index++){
            if (currentMax < 0 && nums[index] > currentMax) {
                currentMax = nums[index];
            } else {
                currentMax += nums[index];
            }
            maxSum = Math.max(maxSum, currentMax);
        }
        return maxSum;
    }

    @Override
    public Integer verify(Integer... input) {
        int[] nums = Arrays.stream(input).mapToInt(ele -> ele).toArray();
        return maximumSubarray(nums);
    }
}
