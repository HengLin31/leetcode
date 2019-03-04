package pers.henglin.leetcode.math;

import pers.henglin.leetcode.Verification;

public class ExcelSheetColumnTitle implements Verification<Integer, String> {
    private static final char CHAR_A = 'A';

    private String excelSheetColumnTitle(int n){
        if(n <= 0){
            return "";
        }
        StringBuilder result = new StringBuilder();
        while(0 != n){
            n--;
            result.insert(0, (char) (CHAR_A + (n % 26)));
            n /= 26;
        }
        return result.toString();
    }

    @Override
    public String verify(Integer... input) {
        return excelSheetColumnTitle(input[0]);
    }
}
