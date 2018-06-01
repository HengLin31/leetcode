package pers.henglin.leetcode.string;

import pers.henglin.leetcode.Verification;

/**
 * Created by linheng on 2018/5/24.
 */
public class ReverseInteger implements Verification<Integer, Integer> {
    private Integer reverse(Integer x){
        int result = 0;
        while(0 != x){//util x to zero
            int tail = x % 10;//get the last one digital
            int newResult = result * 10 + tail;
            if(result != (newResult - tail) / 10){//overflow
                return 0;
            }
            result = newResult;
            x = x / 10;//shift digital
        }
        return result;
    }

    @Override
    public Integer verify(Integer... input) {
        return reverse(input[0]);
    }
}
