package pers.henglin.leetcode.string;

import pers.henglin.leetcode.Verification;

/**
 * Created by linheng on 2018/5/29.
 */
public class IntegerToRoman implements Verification<Integer, String> {
    private String intToRoman(int num){
        if(0 >= num){
            return "";
        }
        int[] nums= {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        String[] symbols = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
        StringBuilder result = new StringBuilder();
        int digit = 0;
        while(0 < num){
            int times = num / nums[digit];
            num -= nums[digit] * times;
            for(; times>0; times--){
                result.append(symbols[digit]);
            }
            digit++;
        }
        return result.toString();
    }

    @Override
    public String verify(Integer... input) {
        return intToRoman(input[0]);
    }
}
