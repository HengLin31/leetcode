package pers.henglin.leetcode.string;

import pers.henglin.leetcode.Verification;

public class ValidPalindrome implements Verification<String, Boolean> {
    private boolean validPalindrome(String s){
        int length = s.length();
        if(0 == length){
            return true;
        }
        int left = 0;
        int right = length - 1;
        while(left < right){
            char leftChar = s.charAt(left);
            char rightChar = s.charAt(right);
            if(Character.isLetterOrDigit(leftChar) && Character.isLetterOrDigit(rightChar)){
                if(Character.toLowerCase(leftChar) != Character.toLowerCase(rightChar)){
                    return false;
                }
                left++;
                right--;
            }
            if(!Character.isLetterOrDigit(leftChar)){
                left++;
            }
            if(!Character.isLetterOrDigit(rightChar)){
                right--;
            }
        }
        return true;
    }

    @Override
    public Boolean verify(String... input) {
        return validPalindrome(input[0]);
    }
}
