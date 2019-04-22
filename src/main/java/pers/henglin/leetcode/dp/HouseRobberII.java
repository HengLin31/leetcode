package pers.henglin.leetcode.dp;

import pers.henglin.leetcode.Verification;

import java.util.Arrays;

public class HouseRobberII implements Verification<Integer, Integer> {
    private int houseRobberII(int[] nums){
        int length = nums.length;
        if(0 == length){
            return 0;
        }
        if(1 == length){
            return nums[0];
        }

        int[] dp = new int[length + 1];
        dp[0] = 0;
        dp[1] = nums[0];
        for(int index=1; index<length-1; index++){
            dp[index + 1] = Math.max(dp[index], dp[index-1] + nums[index]);
        }
        int max = dp[length - 1];
        dp[0] = 0;
        dp[1] = nums[1];
        if(length > 2){
            for(int index=2; index<length; index++){
                dp[index] = Math.max(dp[index - 1], dp[index - 2] + nums[index]);
            }
        }
        int newMax = dp[length - 1];
        return max > newMax ? max : newMax;
    }

    @Override
    public Integer verify(Integer... input) {
        int[] nums = Arrays.stream(input).mapToInt(ele -> ele).toArray();
        return houseRobberII(nums);
    }
}
