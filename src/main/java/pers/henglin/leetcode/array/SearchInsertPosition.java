package pers.henglin.leetcode.array;

import pers.henglin.leetcode.Verification;

import java.util.Map;

public class SearchInsertPosition implements Verification<Map, Integer> {
    private int searchInsertPosition(int[] nums, int target){
        int low = 0;
        int high = nums.length - 1;
        while(low <= high){
            int mid = (low + high) / 2;
            if(nums[mid] == target){
                return mid;
            }else if(nums[mid] > target){
                high = mid - 1;
            }else{
                low = mid + 1;
            }
        }
        return low;
    }

    @Override
    public Integer verify(Map... input) {
        int[] nums = (int[]) input[0].get("nums");
        int target = (int) input[0].get("target");
        return searchInsertPosition(nums, target);
    }
}
