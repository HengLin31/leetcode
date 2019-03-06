package pers.henglin.leetcode.math;

import pers.henglin.leetcode.Verification;

public class FactorialTrailingZeroes implements Verification<Integer, Integer> {
    private int factorialTrailingZeroes(int n){
        int result = 0;
        while(n > 0){
            result += (n / 5);
            n /= 5;
        }
        return result;
    }

    @Override
    public Integer verify(Integer... input) {
        return factorialTrailingZeroes(input[0]);
    }
}
