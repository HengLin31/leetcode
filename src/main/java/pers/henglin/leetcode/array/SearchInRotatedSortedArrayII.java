package pers.henglin.leetcode.array;

import pers.henglin.leetcode.Verification;

import java.util.Map;

public class SearchInRotatedSortedArrayII implements Verification<Map, Boolean> {
    private boolean searchInRotatedSortedArrayII(int[] nums, int target){
        int left = 0;
        int right = nums.length - 1;

        while(left <= right){
            int mid = (left + right) / 2;
            if(nums[mid] == target){
                return true;
            }
            if(nums[left] < nums[mid]){
                if((nums[left] <= target) && (target < nums[mid])){
                    right = mid - 1;
                }else{
                    left = mid + 1;
                }
            }else if(nums[left] > nums[mid]){
                if((nums[mid] < target) && (target <= nums[right])){
                    left = mid + 1;
                }else{
                    right = mid - 1;
                }
            }else{
                left++;
            }
        }
        return false;
    }

    @Override
    public Boolean verify(Map... input) {
        int[] nums = (int[]) input[0].get("nums");
        int target = (int) input[0].get("target");
        return searchInRotatedSortedArrayII(nums, target);
    }
}
