package pers.henglin.leetcode.string;

import pers.henglin.leetcode.Verification;

/**
 * Created by linheng on 2018/5/31.
 */
public class RomanToInteger implements Verification<String, Integer> {
    private int romanToInt(String s){
        int result = 0;
        int prev = 0;
        for(int index = s.length() -1; index > - 1; index--){
            int temp = value(s.charAt(index));
            if (temp >= prev){
                result = result + temp;
            }else{
                result = result - temp;
            }
            prev = temp;
        }
        return result;
    }

    private int value(char a) {
        switch(a) {
            case 'I': return 1;
            case 'V': return 5;
            case 'X': return 10;
            case 'L': return 50;
            case 'C': return 100;
            case 'D': return 500;
            case 'M': return 1000;
            default: return 0;
        }
    }

    @Override
    public Integer verify(String... input) {
        return romanToInt(input[0]);
    }
}
