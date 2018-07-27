package pers.henglin.leetcode.array;

import pers.henglin.leetcode.Verification;

import java.util.Arrays;

public class RemoveDuplicatesFromSortedArray implements Verification<Integer, Integer> {
    private int removeDuplicatesFromSortedArray(int[] nums){
        if(null == nums || 0 == nums.length) {
            return 0;
        }
        int point = 0;
        for(int index=1; index<nums.length; index++){
            if(nums[point] != nums[index]){
                point++;
                nums[point] = nums[index];
            }
        }
        return point + 1;
    }

    @Override
    public Integer verify(Integer... input) {
        int[] nums = Arrays.stream(input).mapToInt(index -> index).toArray();
        return removeDuplicatesFromSortedArray(nums);
    }
}
