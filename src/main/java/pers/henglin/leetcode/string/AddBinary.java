package pers.henglin.leetcode.string;

import pers.henglin.leetcode.Verification;

public class AddBinary implements Verification<String, String> {
    private static final char CHAR_ZERO = '0';

    private String addBinary(String a, String b){
        StringBuilder result = new StringBuilder();
        int aLength = a.length() - 1;
        int bLength = b.length() - 1;
        int carry = 0;

        while( aLength >= 0 || bLength >= 0){
            if(aLength >= 0){
                carry += a.charAt(aLength--) - CHAR_ZERO;
            }
            if(bLength >= 0){
                carry += b.charAt(bLength--) - CHAR_ZERO;
            }
            result.append(carry % 2);
            carry /= 2;
        }
        if(0 != carry){
            result.append(carry);
        }
        return result.reverse().toString();
    }

    @Override
    public String verify(String... input) {
        return addBinary(input[0], input[1]);
    }
}
