package pers.henglin.leetcode.string;

import pers.henglin.leetcode.Verification;

import java.util.ArrayList;
import java.util.List;

public class PalindromePartitioning implements Verification<String, List<List<String>>> {
    private List<List<String>> palindromePartitioning(String s){
        List<List<String>> result = new ArrayList<>();
        dfs(s, 0, new ArrayList<>(), result);
        return result;
    }

    private void dfs(String str, int current, List<String> currentPartition, List<List<String>> results) {
        if(current == str.length()){
            results.add(new ArrayList<>(currentPartition));
            return;
        }
        for(int index=current; index<str.length(); index++){
            if(isPalindrome(str, current, index)){
                String prefix = str.substring(current, index + 1);
                currentPartition.add(prefix);
                dfs(str, index + 1, currentPartition, results);
                currentPartition.remove(currentPartition.size() - 1);
            }
        }
    }

    private boolean isPalindrome(String s, int low, int high) {
        while(low < high){
            if(s.charAt(low++) != s.charAt(high--)){
                return false;
            }
        }
        return true;
    }

    @Override
    public List<List<String>> verify(String... input) {
        return palindromePartitioning(input[0]);
    }
}
