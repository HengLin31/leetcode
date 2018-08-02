package pers.henglin.leetcode.array;

import pers.henglin.leetcode.Verification;

import java.util.Map;

public class SearchInRotatedSortedArray implements Verification<Map, Integer> {
    private int searchInRotatedSortedArray(int[] nums, int target){
        if(null == nums || nums.length == 0){
            return -1;
        }
        int left = 0;
        int right = nums.length - 1;
        while(left + 1 < right) {
            int mid = left + (right - left) / 2;
            if(nums[mid] == target){
                return mid;
            }
            if(nums[mid] > nums[left]){
                if(nums[left] <= target && nums[mid] > target) {
                    right = mid - 1;
                }else{
                    left = mid + 1;
                }
            }else{
                if(nums[right] >= target && nums[mid] < target) {
                    left = mid + 1;
                }else{
                    right = mid - 1;
                }
            }
        }

        if(nums[left] == target){
            return left;
        }

        if(nums[right] == target){
            return right;
        }
        return -1;
    }

    @Override
    public Integer verify(Map... input) {
        int[] nums = (int[]) input[0].get("nums");
        int target = (int) input[0].get("target");
        return searchInRotatedSortedArray(nums, target);
    }
}
