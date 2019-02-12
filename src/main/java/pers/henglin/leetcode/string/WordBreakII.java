package pers.henglin.leetcode.string;

import pers.henglin.leetcode.Verification;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class WordBreakII implements Verification<Map, List<String>> {
    private static final String EMPTY = "";
    private static final String SPACE = " ";

    private List<String> wordBreakII(String s, List<String> wordDict) {
        return dfs(s,wordDict,new HashMap<>());
    }

    private List<String> dfs(String str, List<String> wordDict, HashMap<String,List<String>> map){
        if(map.containsKey(str)){
            return map.get(str);
        }
        List<String> result = new ArrayList<>();
        if(str.equals(EMPTY)){
            result.add(EMPTY);
            return result;
        }
        for(String word:wordDict){
            if(str.startsWith(word)){
                List<String> substrings = dfs(str.substring(word.length()), wordDict, map);
                for(String substring:substrings){
                    result.add(word + (substring.equals(EMPTY) ? EMPTY : SPACE) + substring);
                }
            }
        }
        map.put(str, result);
        return result;
    }

    @Override
    public List<String> verify(Map... input) {
        String s = (String) input[0].get("s");
        List<String> wordDict = (List<String>) input[0].get("wordDict");
        return wordBreakII(s, wordDict);
    }
}
