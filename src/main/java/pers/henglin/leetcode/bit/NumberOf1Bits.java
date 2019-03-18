package pers.henglin.leetcode.bit;

import pers.henglin.leetcode.Verification;

public class NumberOf1Bits implements Verification<Integer, Integer> {
    private int numberOf1Bits(int n){
        int count = 0;
        while(0 != n){
            count += (n & 1);
            n >>= 1;
        }
        return count;
    }

    @Override
    public Integer verify(Integer... input) {
        return numberOf1Bits(input[0]);
    }
}
