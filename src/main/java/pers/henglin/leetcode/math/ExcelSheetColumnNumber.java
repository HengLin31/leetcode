package pers.henglin.leetcode.math;

import pers.henglin.leetcode.Verification;

public class ExcelSheetColumnNumber implements Verification<String, Integer> {
    private static final char CHAR_A = 'A';

    private int excelSheetColumnNumber(String s){
        if((null == s) || (0 == s.length())){
            return 0;
        }
        int result = 0;
        for(char ch:s.toCharArray()){
            result = 26 * result + (ch - CHAR_A + 1);
        }
        return result;
    }

    @Override
    public Integer verify(String... input) {
        return excelSheetColumnNumber(input[0]);
    }
}
