package pers.henglin.leetcode.array;

import pers.henglin.leetcode.Verification;

import java.util.Arrays;

public class PlusOne implements Verification<Integer, int[]> {
    private int[] plusOne(int[] digits){
        for(int index=digits.length-1; index>=0 ; index--){
            if(digits[index] < 9){
                digits[index]++;
                return digits;
            }
            digits[index] = 0;
        }
        //999...9 + 1
        int[] result = new int[digits.length + 1];
        result[0] = 1;
        return result;
    }

    @Override
    public int[] verify(Integer... input) {
        int[] digits = Arrays.stream(input).mapToInt(index -> index).toArray();
        return plusOne(digits);
    }
}
