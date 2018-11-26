package pers.henglin.leetcode.string;

import pers.henglin.leetcode.Verification;

import java.util.ArrayList;
import java.util.List;

public class RestoreIPAddresses implements Verification<String, List<String>> {
    private static final int MAX = 255;
    private static final char CHAR_ZERO = '0';
    private static final String POINT = ".";


    private List<String> restoreIPAddresses(String s){
        List<String> result = new ArrayList<>();
        if((null == s) || (0 == s.length())){
            return result;
        }
        dfs(s, 0, 0, "", result);
        return result;
    }

    private void dfs(String s, int start, int count, String path, List<String> result){
        if(4 == count) {
            if(start == s.length()){
                result.add(new String(path.substring(1)));
            }
            return;
        }
        for(int end=start; end<s.length()&&end<start+3; end++){
            String sub = s.substring(start, end + 1);
            if((CHAR_ZERO == sub.charAt(0))
                    && (sub.length() > 1)
                    || Integer.parseInt(sub) > MAX){
                continue;
            }
            dfs(s, end + 1, count + 1, path + POINT + sub, result);
        }
    }

    @Override
    public List<String> verify(String... input) {
        return restoreIPAddresses(input[0]);
    }
}
