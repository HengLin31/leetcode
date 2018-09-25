package pers.henglin.leetcode.string;

import pers.henglin.leetcode.Verification;

public class ValidNumber implements Verification<String, Boolean> {
    private static final char CHAR_ZERO = '0';
    private static final char CHAR_NINE = '9';
    private static final char CHAR_DECIMAL_POINT = '.';
    private static final char CHAR_EXPONENT = 'e';
    private static final char CHAR_POSITIVE = '+';
    private static final char CHAR_NEGATIVE = '-';

    private boolean validNumber(String s){
        boolean hasPoint = false;
        boolean hasExponent = false;
        boolean hasNumber = false;
        s = s.trim();
        for(int index = 0; index<s.length(); index++){
            if(s.charAt(index) >= CHAR_ZERO && s.charAt(index) <= CHAR_NINE){
                hasNumber = true;
            }else if(s.charAt(index) == CHAR_DECIMAL_POINT){
                if(hasExponent || hasPoint){
                    return false;
                }
                hasPoint = true;
            }else if(s.charAt(index) == CHAR_EXPONENT){
                if(hasExponent || !hasNumber){
                    return false;
                }
                hasExponent = true;
                hasNumber = false;
            }else if(s.charAt(index) == CHAR_NEGATIVE || s.charAt(index) == CHAR_POSITIVE){
                if(index != 0 && s.charAt(index - 1) != CHAR_EXPONENT ){
                    return false;
                }
            }else{
                return false;
            }
        }
        return hasNumber;
    }

    @Override
    public Boolean verify(String... input) {
        return validNumber(input[0]);
    }
}
