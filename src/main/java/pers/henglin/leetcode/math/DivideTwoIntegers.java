package pers.henglin.leetcode.math;

import pers.henglin.leetcode.Verification;

public class DivideTwoIntegers implements Verification<Integer, Integer> {
    private int divideTwoIntegers(int dividend, int divisor){
        if(0 == divisor){
            return dividend >= 0 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
        }

        if(0 == dividend){
            return 0;
        }

        if (dividend == Integer.MIN_VALUE && -1 == divisor) {
            return Integer.MAX_VALUE;
        }

        boolean isNegative = (dividend < 0 && divisor > 0) || (dividend > 0 && divisor < 0);

        long dividendL = Math.abs(dividend);
        long divisorL = Math.abs(divisor);
        int result = 0;
        while(dividendL >= divisorL){
            int shift = 0;
            while(dividendL >= (divisorL << shift)){
                shift++;
            }
            dividendL -= divisorL << (shift - 1);
            result += 1 << (shift - 1);
        }
        return isNegative ? -result : result;
    }

    @Override
    public Integer verify(Integer... input) {
        return divideTwoIntegers(input[0], input[1]);
    }
}
