package pers.henglin.leetcode.bit;

import pers.henglin.leetcode.Verification;

public class ReverseBits implements Verification<Integer, Integer> {
    private int reverseBits(int n){
        if(0 == n){
            return 0;
        }
        int result = 0;
        for(int index=0; index<32; index++){
            result <<= 1;
            if(1 == (n & 1)){
                result++;
            }
            n >>= 1;
        }
        return result;
    }

    @Override
    public Integer verify(Integer... input) {
        return reverseBits(input[0]);
    }
}
