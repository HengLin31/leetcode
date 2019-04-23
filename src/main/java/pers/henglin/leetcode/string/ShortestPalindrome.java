package pers.henglin.leetcode.string;

import pers.henglin.leetcode.Verification;

public class ShortestPalindrome implements Verification<String, String> {
    private String shortestPalindrome(String s){
        int length = s.length();
        if(1 >= length){
            return s;
        }
        int mid = (length - 1) / 2;
        String result = "";
        for(int index=mid; index>=0; index--){
            if(s.charAt(index) == s.charAt(index + 1)){
                if(null != (result = check(s, index, index + 1))){
                    return result;
                }
            }
            if(null != (result = check(s, index, index))){
                return result;
            }
        }
        return result;
    }

    private String check(String s, int left, int right) {
        int index = 1;
        for(; ((left-index)>=0) && ((right+index)<s.length()); index++){
            if(s.charAt(left - index) != s.charAt(right + index)){
                break;
            }
        }
        if((left - index) >= 0){
            return null;
        }
        StringBuilder str = new StringBuilder(s.substring(right + index));
        str.reverse();
        return str + s;
    }

    @Override
    public String verify(String... input) {
        return shortestPalindrome(input[0]);
    }
}
