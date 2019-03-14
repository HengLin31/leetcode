package pers.henglin.leetcode.array;

import pers.henglin.leetcode.Verification;

import java.util.Map;

public class RotateArray implements Verification<Map, int[]> {
    private void rotateArray(int[] nums, int k){
        int length = nums.length;
        if((0 < k) && (k > length)){
            k = k % length;
        }
        reverse(nums,0,length - 1);
        reverse(nums,0,k - 1);
        reverse(nums,k,length - 1);
    }

    private void reverse(int[] nums, int start, int end){
        while(start < end){
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }

    @Override
    public int[] verify(Map... input) {
        int[] nums = (int[]) input[0].get("nums");
        int k = (int) input[0].get("k");
        rotateArray(nums, k);
        return nums;
    }
}
