package pers.henglin.leetcode.string;

import pers.henglin.leetcode.Verification;

import java.util.List;
import java.util.Map;

public class WordBreak implements Verification<Map, Boolean> {
    private boolean wordBreak(String s, List<String> wordDict){
        int length = s.length();
        boolean[] dp = new boolean[length + 1];
        dp[0] = true;
        for(int charIndex=1; charIndex<=length; charIndex++){
            for(int checkIndex=0; checkIndex<charIndex; checkIndex++){
                if(dp[checkIndex] && wordDict.contains(s.substring(checkIndex, charIndex))){
                    dp[charIndex] = true;
                    break;
                }
            }
        }
        return dp[length];
    }

    @Override
    public Boolean verify(Map... input) {
        String s = (String) input[0].get("s");
        List<String> wordDict = (List<String>) input[0].get("wordDict");
        return wordBreak(s, wordDict);
    }
}
