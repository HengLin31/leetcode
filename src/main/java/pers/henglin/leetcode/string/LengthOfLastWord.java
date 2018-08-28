package pers.henglin.leetcode.string;

import pers.henglin.leetcode.Verification;

public class LengthOfLastWord implements Verification<String, Integer> {
    private static final char SPACE = ' ';

    private int lengthOfLastWord(String s){
        if(null == s || 0 == s.length()){
            return 0;
        }
        int count = 0;
        for(int index=0; index<s.length(); index++){
            count++;
            if(s.charAt(index) == SPACE){
                if(index + 1 < s.length() && s.charAt(index + 1) != SPACE){
                    count = 0;
                }else{
                    count--;
                }
            }
        }
        return count;
    }

    @Override
    public Integer verify(String... input) {
        return lengthOfLastWord(input[0]);
    }
}
