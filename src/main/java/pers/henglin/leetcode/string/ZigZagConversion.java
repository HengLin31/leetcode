package pers.henglin.leetcode.string;

import pers.henglin.leetcode.Verification;

import java.util.Map;

/**
 * Created by linheng on 2018/5/23.
 */
public class ZigZagConversion implements Verification<Map, String> {
    public String convert(String str, int numRows) {
        if (numRows == 1) return str;
        int length = str.length();
        int step = 2 * (numRows - 1);
        int count = 0;
        char[] result = new char[length];
        for (int index=0; index<length; index+=step) {
            result[count++] = str.charAt(index);
        }
        for (int row=1; row<numRows-1; row++) {
            for (int col=row; col<length; col+=step) {
                result[count++] = str.charAt(col);
                if (col + step - 2 * row < length) {
                    result[count++] = str.charAt(col + step - 2 * row);
                }
            }
        }
        for (int index = numRows-1; index < length; index += step) {
            result[count++] = str.charAt(index);
        }
        return new String(result);
    }

    @Override
    public String verify(Map... map) {
        String str = (String) map[0].get("str");
        int numRows = (int) map[0].get("numRows");
        return convert(str, numRows);
    }
}
