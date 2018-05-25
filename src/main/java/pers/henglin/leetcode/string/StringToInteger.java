package pers.henglin.leetcode.string;

import pers.henglin.leetcode.Verification;

/**
 * Created by linheng on 2018/5/25.
 */
public class StringToInteger implements Verification<String, Integer> {
    private int myAtoi(String str){
        if(null == str){
            return 0;
        }
        str = str.trim();
        if(0 == str.length()){
            return 0;
        }
        boolean isNegative = str.charAt(0) == '-';
        if(str.charAt(0) == '-' || str.charAt(0) == '+'){
            str = str.substring(1);
        }
        long max = (long) (Integer.MAX_VALUE);
        long min = (long)(Integer.MIN_VALUE);

        long result = 0L;
        int index = 0;

        while(index < str.length() && Character.isDigit(str.charAt(index))){
            result = result * 10 + (long) Character.getNumericValue(str.charAt(index));
            if(result > max && !isNegative){
                return Integer.MAX_VALUE;
            }
            if((-1 * result) < min && isNegative){
                return Integer.MIN_VALUE;
            }
            index++;
        }

        return isNegative ? (int) (-1 * result) : (int) result;
    }

    @Override
    public Integer verify(String... input) {
        return myAtoi(input[0]);
    }
}
