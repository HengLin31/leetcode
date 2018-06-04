package pers.henglin.leetcode.string;

import pers.henglin.leetcode.Verification;

/**
 * Created by linheng on 2018/6/4.
 */
public class LongestCommonPrefix implements Verification<String, String> {
    private String longestCommonPrefix(String[] strs){
        if (strs.length == 0) {
            return "";
        }
        String prefix = strs[0];
        for(int index = 1; index < strs.length; index++){
            while(strs[index].indexOf(prefix) != 0) {
                prefix = prefix.substring(0, prefix.length() - 1);
                if (prefix.isEmpty()) {
                    return "";
                }
            }
        }
        return prefix;
    }

    @Override
    public String verify(String... input) {
        return longestCommonPrefix(input);
    }
}
