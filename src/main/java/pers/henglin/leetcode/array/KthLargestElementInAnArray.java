package pers.henglin.leetcode.array;

import pers.henglin.leetcode.Verification;

import java.util.Map;

public class KthLargestElementInAnArray implements Verification<Map, Integer> {
    private int kthLargestElementInAnArray(int[] nums, int k){
        int startIndex = 0;
        int endIndex = nums.length - 1;
        int rank = divide(nums, startIndex, endIndex);
        while((k - 1) != rank){
            if((k - 1) < rank){
                endIndex = rank - 1;
            }else{
                startIndex = rank + 1;
            }
            rank = divide(nums, startIndex, endIndex);
        }
        return nums[rank];
    }

    private int divide(int[] nums, int startIndex, int endIndex) {
        int middle = (endIndex + startIndex) / 2;
        int pivot = nums[middle];
        swap(nums, startIndex, middle);
        int index = startIndex + 1;
        while(index <= endIndex){
            if(nums[index] > pivot){
                nums[index - 1] = nums[index];
                index++;
            }else{
                swap(nums, index, endIndex);
                endIndex--;
            }
        }
        nums[index - 1] = pivot;
        return index - 1;
    }

    private void swap(int[] nums, int num1, int num2) {
        int temp = nums[num2];
        nums[num2] = nums[num1];
        nums[num1] =  temp;
    }

    @Override
    public Integer verify(Map... input) {
        int[] nums = (int[]) input[0].get("nums");
        int k = (int) input[0].get("k");
        return kthLargestElementInAnArray(nums, k);
    }
}
