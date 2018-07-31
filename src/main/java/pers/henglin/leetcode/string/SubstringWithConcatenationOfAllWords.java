package pers.henglin.leetcode.string;

import pers.henglin.leetcode.Verification;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SubstringWithConcatenationOfAllWords implements Verification<Map, List<Integer>> {
    private List<Integer> substringWithConcatenationOfAllWords(String s, String[] words){
        List<Integer> result = new ArrayList<>();
        if(null == words || 0 == words.length){
            return result;
        }
        Map<String,Integer> wordMap = new HashMap<>();
        for(int index=0; index<words.length; index++) {
            wordMap.put(words[index], wordMap.getOrDefault(words[index], 0) + 1);
        }
        int row = words.length;
        int col = words[0].length();
        int totalLength = row * col;
        for(int start=0; start<col; start++){
            find(result, s, wordMap, row, col, totalLength, start);
        }
        return result;
    }

    private void find(List<Integer> result, String s, Map<String,Integer> wordMap, int row, int col, int totalLength, int start){
        for(int subStrStartIndex=start; subStrStartIndex+totalLength<=s.length(); subStrStartIndex+=col) {
            String subStr = s.substring(subStrStartIndex, subStrStartIndex + totalLength);
            HashMap<String,Integer> temp = new HashMap<>();
            for(int wordSize=row-1; wordSize>=0; wordSize--) {
                String str = subStr.substring(wordSize * col, (wordSize + 1) * col);
                int current = temp.getOrDefault(str,0) + 1;
                if(current > wordMap.getOrDefault(str,0)){
                    subStrStartIndex = subStrStartIndex + wordSize * col;
                    break;
                }
                temp.put(str, current);
                if(0 == wordSize){//find all
                    result.add(subStrStartIndex);
                }
            }
        }
    }

    @Override
    public List<Integer> verify(Map... input) {
        String s = (String) input[0].get("s");
        String words[] = ((List<String>) input[0].get("words")).stream().toArray(String[]::new);
        return substringWithConcatenationOfAllWords(s, words);
    }
}
