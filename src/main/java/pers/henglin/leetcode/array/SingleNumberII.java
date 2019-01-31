package pers.henglin.leetcode.array;

import pers.henglin.leetcode.Verification;

import java.util.Arrays;

public class SingleNumberII implements Verification<Integer, Integer> {
    private int singleNumberII(int[] nums){
        int ones = 0;
        int twos = 0;
        for(int num:nums){
            ones = (ones ^ num) & ~twos;
            twos = (twos ^ num) & ~ones;
        }
        return ones;
    }

    @Override
    public Integer verify(Integer... input) {
        int[] nums = Arrays.stream(input).mapToInt(ele -> ele).toArray();
        return singleNumberII(nums);
    }
}
