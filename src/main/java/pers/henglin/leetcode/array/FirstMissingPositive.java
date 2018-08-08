package pers.henglin.leetcode.array;

import pers.henglin.leetcode.Verification;

import java.util.Arrays;

public class FirstMissingPositive implements Verification<Integer, Integer> {
    private int firstMissingPositive(int[] nums){
        int length = nums.length;
        for(int index=0; index<nums.length; index++){
            while(nums[index] <= length
                    && nums[index] > 0
                    && nums[index] != nums[nums[index] - 1]){
                swap(index, nums[index] - 1, nums);
            }
        }
        for(int index=0; index<nums.length; index++){
            if(nums[index] != index + 1){
                return index + 1;
            }
        }
        return length + 1;
    }

    private void swap(int num1, int num2, int[] nums){
        int temp = nums[num1];
        nums[num1] = nums[num2];
        nums[num2] = temp;
    }

    @Override
    public Integer verify(Integer... input) {
        int[] nums = Arrays.stream(input).mapToInt(ele -> ele).toArray();
        return firstMissingPositive(nums);
    }
}
