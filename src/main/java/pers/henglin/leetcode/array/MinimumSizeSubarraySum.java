package pers.henglin.leetcode.array;

import pers.henglin.leetcode.Verification;

import java.util.Map;

public class MinimumSizeSubarraySum implements Verification<Map, Integer> {
    private int minimumSizeSubarraySum(int s, int[] nums){
        if(0 == nums.length){
            return 0;
        }
        int left = 0;
        int right = 0;
        int sum = nums[0];
        int minCount = nums.length + 1;
        while((left <= right) && (left < nums.length) && (right < nums.length)){
            if(sum >= s){
                minCount = Math.min(minCount, right - left + 1);
                sum -= nums[left];
                left++;
            }else{
                right++;
                if(right < nums.length){
                    sum += nums[right];
                }
            }
        }
        return (minCount == nums.length + 1) ? 0 : minCount;
    }

    @Override
    public Integer verify(Map... input) {
        int s = (int) input[0].get("s");
        int[] nums = (int[]) input[0].get("nums");
        return minimumSizeSubarraySum(s, nums);
    }
}
