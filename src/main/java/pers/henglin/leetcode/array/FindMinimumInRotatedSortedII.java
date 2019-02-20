package pers.henglin.leetcode.array;

import pers.henglin.leetcode.Verification;

import java.util.Arrays;

public class FindMinimumInRotatedSortedII implements Verification<Integer, Integer> {
    private int findMinimumInRotatedSortedII(int[] nums){
        if(1 == nums.length){
            return nums[0];
        }
        int low = 0;
        int high = nums.length - 1;
        if(nums[high] > nums[low]){
            return nums[0];
        }
        while(low < high) {
            int mid = low + (high - low) / 2;
            if(nums[mid] > nums[high]){
                low = mid + 1;
            }else if(nums[mid] < nums[high]){
                high = mid;
            }else{//when num[mid] and num[high] are same
                high--;
            }
        }
        return nums[low];
    }

    @Override
    public Integer verify(Integer... input) {
        int[] nums = Arrays.stream(input).mapToInt(ele -> ele).toArray();
        return findMinimumInRotatedSortedII(nums);
    }
}
