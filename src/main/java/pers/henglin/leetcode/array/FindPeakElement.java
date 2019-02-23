package pers.henglin.leetcode.array;

import pers.henglin.leetcode.Verification;

import java.util.Arrays;

public class FindPeakElement implements Verification<Integer, Integer> {
    private int findPeakElement(int[] nums){
        if((null == nums) || (nums.length <= 1)){
            return 0;
        }
        int low = 0;
        int high = nums.length - 1;
        while((low + 1) < high){
            int mid = low + (high - low) / 2;
            if(nums[mid] < nums[mid + 1]){
                low = mid;
            }else{
                high = mid;
            }
        }
        if(nums[low] > nums[high]){
            return low;
        }else{
            return high;
        }
    }

    @Override
    public Integer verify(Integer... input) {
        int[] nums = Arrays.stream(input).mapToInt(ele -> ele).toArray();
        return findPeakElement(nums);
    }
}
