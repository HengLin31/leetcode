package pers.henglin.leetcode.array;

import pers.henglin.leetcode.Verification;

import java.util.Arrays;

public class JumpGameII implements Verification<Integer, Integer> {
    private int jumpGameII(int[] nums){
        int furthest = 0;
        int jumps = 0;
        int currentEnd = 0;
        for(int index=0; index<nums.length-1; index++){
            furthest = Math.max(furthest, index + nums[index]);
            if(index == currentEnd){
                jumps++;
                currentEnd = furthest;
            }
        }
        return jumps;
    }

    @Override
    public Integer verify(Integer... input) {
        int[] nums = Arrays.stream(input).mapToInt(ele -> ele).toArray();
        return jumpGameII(nums);
    }
}
