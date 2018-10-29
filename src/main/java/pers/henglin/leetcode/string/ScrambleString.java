package pers.henglin.leetcode.string;

import pers.henglin.leetcode.Verification;

public class ScrambleString implements Verification<String, Boolean> {
    private static final char CHAR_A = 'a';

    private boolean scrambleString(String s1, String s2){
        if(s1.equals(s2)){
            return true;
        }

        int[] letters = new int[26];
        for(int index=0; index<s1.length(); index++){
            letters[s1.charAt(index) - CHAR_A]++;
            letters[s2.charAt(index) - CHAR_A]--;
        }
        for(int index=0; index<26; index++){
            if(letters[index]!=0){
                return false;
            }
        }

        for(int index=1; index<s1.length(); index++){
            if(scrambleString(s1.substring(0, index), s2.substring(0, index))
                    && scrambleString(s1.substring(index), s2.substring(index))){
                return true;
            }
            if(scrambleString(s1.substring(0, index), s2.substring(s2.length() - index))
                    && scrambleString(s1.substring(index), s2.substring(0, s2.length() - index))){
                return true;
            }
        }
        return false;
    }

    @Override
    public Boolean verify(String... input) {
        return scrambleString(input[0], input[1]);
    }
}
