package pers.henglin.leetcode.array;

import pers.henglin.leetcode.Verification;

import java.util.Arrays;

public class SortColors implements Verification<Integer, int[]> {
    private void sortColors(int[] nums){
        int[] flag = new int[3];
        for(int index=0; index<nums.length; index++){
            if(nums[index] == 0) {
                flag[0]++;
            } else if(nums[index] == 1) {
                flag[1]++;
            } else {
                flag[2]++;
            }
        }
        for(int index=0; index<nums.length; index++) {
            if(index < flag[0]) {
                nums[index] = 0;
            } else if(index < flag[0] + flag[1]) {
                nums[index] = 1;
            } else {
                nums[index] = 2;
            }
        }
    }

    @Override
    public int[] verify(Integer... input) {
        int[] nums = Arrays.stream(input).mapToInt(ele -> ele).toArray();
        sortColors(nums);
        return nums;
    }
}
