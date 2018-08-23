package pers.henglin.leetcode.array;

import pers.henglin.leetcode.Verification;

import java.util.Arrays;

public class JumpGame implements Verification<Integer, Boolean> {
    private boolean jumpGame(int[] nums){
        int lastPosition = nums.length -1;
        for(int index=nums.length-1; index>=0; index--){
            if(index + nums[index] >= lastPosition){
                lastPosition = index;
            }
        }
        return lastPosition == 0;
    }

    @Override
    public Boolean verify(Integer... input) {
        int[] nums = Arrays.stream(input).mapToInt(ele -> ele).toArray();
        return jumpGame(nums);
    }
}
