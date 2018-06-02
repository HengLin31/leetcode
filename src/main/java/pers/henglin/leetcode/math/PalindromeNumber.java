package pers.henglin.leetcode.math;

import pers.henglin.leetcode.Verification;

/**
 * Created by linheng on 2018/6/2.
 */
public class PalindromeNumber implements Verification<Integer, Boolean> {
    private boolean isPalindrome(int x){
        if((x < 0) || ((x != 0) && (x % 10 == 0))){
            return false;
        }
        int result = 0;
        while(x > result){
            result = (result * 10) + (x % 10);
            x = x / 10;
        }
        return ((x == result) || (x == result /10));
    }

    @Override
    public Boolean verify(Integer... input) {
        return isPalindrome(input[0]);
    }
}
