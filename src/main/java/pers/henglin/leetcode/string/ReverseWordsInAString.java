package pers.henglin.leetcode.string;

import pers.henglin.leetcode.Verification;

public class ReverseWordsInAString implements Verification<String, String> {
    private static final String SPACE = " ";
    private static final String EMPTY = "";

    private String reverseWordsInAString(String s){
        if((null == s) || (0 == s.length())){
            return EMPTY;
        }
        String[] words = s.split(SPACE);
        StringBuilder sentence = new StringBuilder();
        for(int index=words.length-1; index>=0; --index){
            if(!words[index].equals(EMPTY)){
                sentence.append(words[index]).append(SPACE);
            }
        }
        return (0 == sentence.length()) ? EMPTY : sentence.substring(0, sentence.length() - 1);
    }

    @Override
    public String verify(String... input) {
        return reverseWordsInAString(input[0]);
    }
}
