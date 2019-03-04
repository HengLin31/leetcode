package pers.henglin.leetcode.array;

import pers.henglin.leetcode.Verification;

import java.util.Arrays;

public class MajorityElement implements Verification<Integer, Integer> {
    private int majorityElement(int[] nums){
        if(nums.length < 3){
            return nums[0];
        }
        int majority = nums[0];
        int count = 1;
        for(int index=1; index<nums.length; index++){
            if(0 == count){
                majority = nums[index];
                count++;
            }else if(nums[index] == majority) {
                count++;
            }else{
                count--;
            }
        }
        return majority;
    }

    @Override
    public Integer verify(Integer... input) {
        int[] nums = Arrays.stream(input).mapToInt(ele -> ele).toArray();
        return majorityElement(nums);
    }
}
