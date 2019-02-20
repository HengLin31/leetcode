package pers.henglin.leetcode.array;

import pers.henglin.leetcode.Verification;

import java.util.Arrays;

public class FindMinimumInRotatedSorted implements Verification<Integer, Integer> {
    private int findMinimumInRotatedSorted(int[] nums){
        if(1 == nums.length){
            return nums[0];
        }
        int low = 0;
        int high = nums.length - 1;
        if(nums[high] > nums[low]){
            return nums[0];
        }
        while(low <= high){
            int mid = low + (high - low) / 2;
            if(nums[mid] > nums[mid + 1]){
                return nums[mid + 1];
            }
            if(nums[mid] < nums[mid - 1]){
                return nums[mid];
            }
            if(nums[mid] > nums[low]){
                low = mid + 1;
            }else{
                high = mid - 1;
            }
        }

        return -1;
    }

    @Override
    public Integer verify(Integer... input) {
        int[] nums = Arrays.stream(input).mapToInt(ele -> ele).toArray();
        return findMinimumInRotatedSorted(nums);
    }
}
