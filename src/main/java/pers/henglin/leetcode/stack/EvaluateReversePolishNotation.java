package pers.henglin.leetcode.stack;

import pers.henglin.leetcode.Verification;

import java.util.Stack;

public class EvaluateReversePolishNotation implements Verification<String, Integer> {
    private static final String ADDITION = "+";
    private static final String SUBTRACTION = "-";
    private static final String MULTIPLICATION = "*";
    private static final String DIVISION = "/";

    private int evaluateReversePolishNotation(String[] tokens){
        Stack<Integer> stack = new Stack<>();
        int num;
        for(String token:tokens){
            switch(token){
                case ADDITION:
                    stack.push(stack.pop() + stack.pop());
                    break;
                case MULTIPLICATION:
                    stack.push(stack.pop() * stack.pop());
                    break;
                case SUBTRACTION:
                    num = stack.pop();
                    stack.push(stack.pop() - num);
                    break;
                case DIVISION:
                    num = stack.pop();
                    stack.push(stack.pop() / num);
                    break;
                default:
                    stack.push(Integer.parseInt(token));
            }
        }
        return stack.pop();
    }

    @Override
    public Integer verify(String... input) {
        return evaluateReversePolishNotation(input);
    }
}
