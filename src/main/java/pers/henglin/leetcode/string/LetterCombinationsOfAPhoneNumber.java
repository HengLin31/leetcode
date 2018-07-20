package pers.henglin.leetcode.string;

import pers.henglin.leetcode.Verification;

import java.util.ArrayList;
import java.util.List;

public class LetterCombinationsOfAPhoneNumber implements Verification<String, List<String>> {
    private static final String[] LETTERS = new String[]{"", "", "abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
    @Override
    public List<String> verify(String... input) {
        String digits = input[0];
        List<String> result = new ArrayList<>();
        dfs(result, "", digits, 0);
        return result;
    }

    private void dfs(List<String> result, String sub, String digits, int index){
        if(digits.length() == 0){
            return;
        }
        if(sub.length() == digits.length()){
            result.add(sub);
            return;
        }
        int currentDigit = digits.charAt(index) - '0';
        String currentLetters = LETTERS[currentDigit];
        for(int letterIndex=0; letterIndex<currentLetters.length(); letterIndex++){
            dfs(result, sub + currentLetters.charAt(letterIndex), digits, index + 1);
        }
    }
}
