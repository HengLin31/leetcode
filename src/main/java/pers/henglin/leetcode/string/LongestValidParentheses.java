package pers.henglin.leetcode.string;

import pers.henglin.leetcode.Verification;

import java.util.Stack;

public class LongestValidParentheses implements Verification<String, Integer> {
    private static final char OPEN = '(';
    private static final char CLOSE = ')';

    private int longestValidParentheses(String s){
        int result = 0;
        int dp[] = new int[s.length()];
        for(int index=1; index<s.length(); index++) {
            if(s.charAt(index) == CLOSE){
                if (s.charAt(index - 1) == OPEN){
                    dp[index] = (index > 1 ? dp[index - 2] : 0) + 2;
                }else if(index - dp[index - 1] > 0
                        && s.charAt(index - dp[index - 1] - 1) == OPEN){
                    dp[index] = dp[index - 1] + ((index - dp[index - 1]) > 1 ? dp[index - dp[index - 1] - 2] : 0) + 2;
                }
                result = Math.max(result, dp[index]);
            }
        }
        return result;
    }

    private int longestValidParentheses2(String s){
        if(null == s || s.length() < 1){
            return 0;
        }
        Stack<Integer> stack = new Stack<>();
        int max = 0;
        int left = -1;
        for(int index=0; index<s.length(); index++){
            //if find '(' push to stack
            if (s.charAt(index) == OPEN){
                stack.push(index);
            }else{
                if(!stack.isEmpty()) {
                    stack.pop();
                    if(!stack.isEmpty()){
                        max = Math.max(max, index - stack.peek());
                    }else{
                        max = Math.max(max, index - left);
                    }
                }else{
                    //if stack if empty, we need set new left
                    left = index;
                }
            }
        }
        return max;
    }

    @Override
    public Integer verify(String... input) {
        return longestValidParentheses(input[0]);
    }
}
