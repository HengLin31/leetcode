package pers.henglin.leetcode.string;

import pers.henglin.leetcode.Verification;

import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class ValidParentheses implements Verification<String, Boolean> {
    private static final List<Character> OPEN = Arrays.asList('(', '{', '[');
    private static final List<Character> CLOSE = Arrays.asList(')', '}', ']');

    private boolean validParentheses(String s){
        Stack<Character> stack = new Stack<>();
        for(char ch:s.toCharArray()){
            if(OPEN.contains(ch)){
                stack.push(ch);
            }else if(stack.isEmpty() || stack.pop() != OPEN.get(CLOSE.indexOf(ch))){
                return false;
            }
        }
        return stack.empty();
    }

    @Override
    public Boolean verify(String... input) {
        return validParentheses(input[0]);
    }
}
