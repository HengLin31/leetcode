package pers.henglin.leetcode.bit;

import pers.henglin.leetcode.Verification;

public class BitwiseANDOfNumbersRange implements Verification<Integer, Integer> {
    private int bitwiseANDOfNumbersRange(int m, int n){
        if(0 == m){
            return 0;
        }
        int move = 1;
        while(m != n){
            m >>= 1;
            n >>= 1;
            move <<= 1;
        }
        return m * move;
    }

    @Override
    public Integer verify(Integer... input) {
        return bitwiseANDOfNumbersRange(input[0], input[1]);
    }
}
