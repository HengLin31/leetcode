package pers.henglin.leetcode.string;

import pers.henglin.leetcode.Verification;

import java.util.Stack;

public class SimplifyPath implements Verification<String, String> {
    private static final String DIR_SLASH = "/";
    private static final String DIR_CUR = ".";
    private static final String DIR_PRE = "..";

    private String simplifyPath(String path){
        Stack<String> stack = new Stack<>();
        String[] dirs = path.split(DIR_SLASH);
        for(String dir:dirs){
            if(dir.equals(DIR_PRE)){
                if(!stack.isEmpty()){
                    stack.pop();
                }
            } else if(!dir.isEmpty() && !dir.equals(DIR_CUR)){
                stack.push(dir);
            }
        }
        return DIR_SLASH + String.join(DIR_SLASH, stack);
    }

    @Override
    public String verify(String... input) {
        return simplifyPath(input[0]);
    }
}
