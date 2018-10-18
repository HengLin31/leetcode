package pers.henglin.leetcode.array;

import pers.henglin.leetcode.Verification;

import java.util.Arrays;

public class RemoveDuplicatesFromSortedArrayII implements Verification<Integer, Integer> {
    private int removeDuplicatesFromSortedArrayII(int[] nums){
        if((null == nums) || (0 == nums.length)){
            return 0;
        }
        int index = 0;
        for(int num:nums){
            if ((index < 2) || (num > nums[index - 2])){
                nums[index] = num;
                index++;
            }
        }
        return index;
    }

    @Override
    public Integer verify(Integer... input) {
        int[] nums = Arrays.stream(input).mapToInt(ele -> ele).toArray();
        return removeDuplicatesFromSortedArrayII(nums);
    }
}
