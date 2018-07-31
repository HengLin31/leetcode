package pers.henglin.leetcode.array;

import pers.henglin.leetcode.Verification;

import java.util.Map;

public class RemoveElement implements Verification<Map, Integer> {
    private int removeElement(int[] nums, int val){
        int count = 0;
        for(int index=0; index<nums.length; index++){
            if(nums[index] != val){
                nums[count] = nums[index];
                count++;
            }
        }
        return count;
    }

    @Override
    public Integer verify(Map... input) {
        int[] nums = (int[]) input[0].get("nums");
        int val = (int) input[0].get("val");
        return removeElement(nums, val);
    }
}
