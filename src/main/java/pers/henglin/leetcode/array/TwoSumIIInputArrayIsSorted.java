package pers.henglin.leetcode.array;

import pers.henglin.leetcode.Verification;

import java.util.Map;

public class TwoSumIIInputArrayIsSorted implements Verification<Map, int[]> {
    private int[] twoSumIIInputArrayIsSorted(int[] numbers, int target){
        int left = 0;
        int right = numbers.length - 1;
        while(left < right){
            if((numbers[left] + numbers[right]) == target){
                return new int[]{left + 1, right + 1};
            }else if((numbers[left] + numbers[right]) < target){
                left++;
            }else{
                right--;
            }
        }
        return null;
    }

    @Override
    public int[] verify(Map... input) {
        int[] numbers = (int[]) input[0].get("numbers");
        int target = (int) input[0].get("target");
        return twoSumIIInputArrayIsSorted(numbers, target);
    }
}
