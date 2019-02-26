package pers.henglin.leetcode.math;

import pers.henglin.leetcode.Verification;

import java.util.HashMap;
import java.util.Map;

public class FractionToRecurringDecimal implements Verification<Integer, String> {
    private static final String ZERO = "0";
    private static final String NEGATIVE = "-";
    private static final String DOT = ".";
    private static final String LEFT_PARENTHESES = "(";
    private static final String RIGHT_PARENTHESES = ")";

    private String fractionToRecurringDecimal(int numerator, int denominator){
        if(0 == denominator){
            return ZERO;
        }
        StringBuilder result = new StringBuilder();

        if(!((numerator >= 0 && denominator > 0) || (numerator <= 0 && denominator < 0))){
            result.append(NEGATIVE);
        }
        long num = Math.abs((long) numerator);
        long den = Math.abs((long) denominator);

        result.append(num / den);
        num = num % den;
        if (num == 0) {
            return result.toString();
        }

        result.append(DOT);
        Map<Long, Integer> hash = new HashMap<>();
        hash.put(num, result.length());
        while(num != 0){
            num *= 10;
            long digit = num / den;
            result.append(digit);
            num = num % den;
            if(hash.containsKey(num)){
                int index = hash.get(num);
                result.insert(index, LEFT_PARENTHESES);
                result.append(RIGHT_PARENTHESES);
                break;
            }else{
                hash.put(num, result.length());
            }

        }
        return result.toString();
    }

    @Override
    public String verify(Integer... input) {
        return fractionToRecurringDecimal(input[0], input[1]);
    }
}
