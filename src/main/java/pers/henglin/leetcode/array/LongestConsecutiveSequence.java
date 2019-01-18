package pers.henglin.leetcode.array;

import pers.henglin.leetcode.Verification;

import java.util.Arrays;

public class LongestConsecutiveSequence implements Verification<Integer, Integer> {
    private int longestConsecutiveSequence(int[] nums){
        if((null == nums) || (0 == nums.length)){
            return 0;
        }
        Arrays.sort(nums);
        int maxCount = 1;
        int count = 1;
        for(int index=1; index<nums.length; index++){
            if(nums[index] - nums[index - 1] == 1){
                count++;
            }else if((nums[index] != nums[index - 1]) && ((nums[index] - nums[index - 1]) > 1)){
                maxCount = Math.max(count, maxCount);
                count = 1;
            }
        }
        return Math.max(count, maxCount);
    }

    @Override
    public Integer verify(Integer... input) {
        int[] nums = Arrays.stream(input).mapToInt(ele -> ele).toArray();
        return longestConsecutiveSequence(nums);
    }
}
