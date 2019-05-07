package pers.henglin.leetcode.array;

import pers.henglin.leetcode.Verification;

import java.util.Arrays;

public class ContainsDuplicate implements Verification<Integer, Boolean> {
    private boolean containsDuplicate(int[] nums){
        Arrays.sort(nums);
        for(int index=0; index<nums.length-1; index++){
            if(nums[index] == nums[index + 1]){
                return true;
            }
        }
        return false;
    }

    @Override
    public Boolean verify(Integer... input) {
        int[] nums = Arrays.stream(input).mapToInt(ele -> ele).toArray();
        return containsDuplicate(nums);
    }
}
