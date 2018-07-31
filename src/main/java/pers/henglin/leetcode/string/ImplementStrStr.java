package pers.henglin.leetcode.string;

import pers.henglin.leetcode.Verification;

public class ImplementStrStr implements Verification<String, Integer> {
    private int implementStrStr(String haystack, String needle){
        if(needle.isEmpty() || haystack.equals(needle)){
            return 0;
        }
        int startIndex = 0;
        int endIndex = needle.length();
        while(endIndex <= haystack.length()) {
            if(haystack.substring(startIndex, endIndex).equals(needle)){
                return startIndex;
            }
            startIndex++;
            endIndex++;
        }
        return -1;
    }

    @Override
    public Integer verify(String... input) {
        return implementStrStr(input[0], input[1]);
    }
}
