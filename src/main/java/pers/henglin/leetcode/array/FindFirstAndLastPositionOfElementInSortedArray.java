package pers.henglin.leetcode.array;

import pers.henglin.leetcode.Verification;

import java.util.Map;

public class FindFirstAndLastPositionOfElementInSortedArray implements Verification<Map,int[]> {
    private int[] findFirstAndLastPositionOfElementInSortedArray(int[] nums, int target){
        if (nums == null || nums.length == 0) {
            return new int[] {-1, -1};
        }
        int first = findFirst(nums, target);
        int last = findLast(nums, target);
        return new int[] {first, last};
    }

    private int findFirst(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        while(left + 1 < right){
            int mid = left + (right - left) / 2;
            if(nums[mid] < target){
                left = mid;
            }else{
                right = mid;
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

    private int findLast(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        while(left + 1 < right){
            int mid = left + (right - left) / 2;
            if(nums[mid] <= target){
                left = mid;
            }else{
                right = mid;
            }
        }
        if(nums[right] == target){
            return right;
        }
        if(nums[left] == target){
            return left;
        }
        return -1;
    }

    @Override
    public int[] verify(Map... input) {
        int[] nums = (int[]) input[0].get("nums");
        int target = (int) input[0].get("target");
        return findFirstAndLastPositionOfElementInSortedArray(nums, target);
    }
}
