package pers.henglin.leetcode.string;

import pers.henglin.leetcode.Verification;

public class InterleavingString implements Verification<String, Boolean> {
    private boolean interleavingString(String s1, String s2, String s3){
        int length1 = s1.length();
        int length2 = s2.length();
        int length3 = s3.length();

        if((length1 + length2) != length3){
            return false;
        }

        boolean[][] dp = new boolean[length1 + 1][length2 + 1];
        //if s1 is not empty, s2 is empty, compare s1 and s3
        for(int row= 0; row<=length1; row++){
            dp[row][0] = s1.substring(0, row).equals(s3.substring(0, row)) ? true : false;
        }
        //if s2 is not empty, s1 is empty
        for(int col=0; col<=length2; col++){
            dp[0][col] = s2.substring(0, col).equals(s3.substring(0, col)) ? true : false;
        }
        //if s1 and s2 are not empty
        for(int row=1; row<=length1; row++){
            for(int col=1; col<=length2; col++){
                dp[row][col] = (dp[row - 1][col] && s1.charAt(row - 1) == s3.charAt(row + col - 1)) ||
                        (dp[row][col - 1] && s2.charAt(col - 1) == s3.charAt(row + col - 1));
            }
        }
        return dp[s1.length()][s2.length()];
    }

    @Override
    public Boolean verify(String... input) {
        return interleavingString(input[0], input[1], input[2]);
    }
}
