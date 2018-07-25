package pers.henglin.leetcode.string;

import pers.henglin.leetcode.Verification;

import java.util.ArrayList;
import java.util.List;

public class GenerateParentheses implements Verification<Integer, List<String>> {
    private List<String> generateParentheses(int n){
        List<String> result = new ArrayList<>();
        generate(n, new StringBuilder(), result,0,0);
        return result;
    }

    private void generate(int n, StringBuilder sb, List<String> result, int open, int close) {
        if(2 * n == sb.length()) {
            result.add(sb.toString());
            return;
        }

        if(open < n) {
            generate(n, sb.append("("), result, open + 1, close);
            sb.deleteCharAt(sb.length() - 1);
        }
        if(close < open) {
            generate(n, sb.append(")"), result, open, close + 1);
            sb.deleteCharAt(sb.length() - 1);
        }
    }

    @Override
    public List<String> verify(Integer... input) {
        return generateParentheses(input[0]);
    }
}
