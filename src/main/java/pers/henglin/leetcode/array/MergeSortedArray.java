package pers.henglin.leetcode.array;

import pers.henglin.leetcode.Verification;

import java.util.Map;

public class MergeSortedArray implements Verification<Map, int[]> {
    private void mergeSortedArray(int[] nums1, int m, int[] nums2, int n){
        int nums1Index = m - 1;
        int nums2Index = n - 1;
        int end = m + n - 1;
        while(nums1Index >= 0 && nums2Index >= 0){
            if(nums1[nums1Index] > nums2[nums2Index]){
                nums1[end--] = nums1[nums1Index--];
            }else{
                nums1[end--] = nums2[nums2Index--];
            }
        }
        while(nums1Index >= 0){
            nums1[end--] = nums1[nums1Index--];
        }
        while(nums2Index >= 0){
            nums1[end--] = nums2[nums2Index--];
        }
    }

    @Override
    public int[] verify(Map... input) {
        int[] nums1 = (int[]) input[0].get("nums1");
        int[] nums2 = (int[]) input[0].get("nums2");
        int m = (int) input[0].get("m");
        int n = (int) input[0].get("n");

        mergeSortedArray(nums1, m, nums2, n);

        return nums1;
    }
}
