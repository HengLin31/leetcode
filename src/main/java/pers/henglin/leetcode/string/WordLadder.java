package pers.henglin.leetcode.string;

import pers.henglin.leetcode.Verification;

import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class WordLadder implements Verification<Map, Integer> {
    private static final char A_CHAR = 'a';
    private static final char Z_CHAR = 'z';

    private int wordLadder(String beginWord, String endWord, List<String> wordList){
        if((null == beginWord) || (null == endWord) || (null == wordList) || (0 == wordList.size())){
            return 0;
        }
        Set<String> wordSet = new HashSet<>(wordList);
        if(!wordSet.contains(endWord)){
            return 0;
        }
        Set<String> starts = new HashSet<>();
        Set<String> ends = new HashSet<>();
        starts.add(beginWord);
        ends.add(endWord);
        return bfs(starts, ends, wordSet, 1);
    }

    private int bfs(Set<String> starts, Set<String> ends, Set<String> wordSet, int step) {
        if((0 == starts.size()) || (0 == ends.size())){
            return 0;
        }
        if(starts.size() > ends.size()){
            return bfs(ends, starts, wordSet, step);
        }
        wordSet.removeAll(starts);
        wordSet.removeAll(ends);

        Set<String> set = new HashSet<>();
        for(String start:starts){
            char[] chs = start.toCharArray();
            for(int index=0; index<chs.length; index++){
                char currentChar = chs[index];
                for(char ch=A_CHAR; ch<=Z_CHAR; ch++){
                    if(ch != currentChar){
                        chs[index] = ch;
                    }
                    String temp = String.valueOf(chs);
                    if(ends.contains(temp)){
                        return step + 1;
                    }
                    if(wordSet.contains(temp)){
                        set.add(temp);
                    }
                }
                chs[index] = currentChar;
            }
        }
        return bfs(ends, set, wordSet, step + 1);
    }

    @Override
    public Integer verify(Map... input) {
        String beginWord = input[0].get("beginWord").toString();
        String endWord = input[0].get("endWord").toString();
        List<String> wordList = (List<String>) input[0].get("wordList");
        return wordLadder(beginWord, endWord, wordList);
    }
}
