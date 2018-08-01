package pers.henglin.leetcode.array;

import pers.henglin.leetcode.Verification;

import java.util.Arrays;

public class NextPermutation implements Verification<Integer, int[]> {
    private int[] nextPermutation(int[] nums){
        int index = nums.length - 2;
        //find first decreasing element
        while(index >= 0 && nums[index + 1] <= nums[index]){
            index--;
        }
        if(index >= 0){
            int index2 = nums.length - 1;
            while (index2 >= 0 && nums[index2] <= nums[index]) {
                index2--;
            }
            swap(nums, index, index2);
        }
        reverse(nums, index + 1);
        return nums;
    }

    private void reverse(int[] nums, int start) {
        int left = start;
        int right = nums.length - 1;
        while (left < right) {
            swap(nums, left, right);
            left++;
            right--;
        }
    }

    private void swap(int[] nums, int num1, int num2) {
        int temp = nums[num1];
        nums[num1] = nums[num2];
        nums[num2] = temp;
    }

    @Override
    public int[] verify(Integer... input) {
        int[] nums = Arrays.stream(input).mapToInt(index -> index).toArray();
        return nextPermutation(nums);
    }
}
