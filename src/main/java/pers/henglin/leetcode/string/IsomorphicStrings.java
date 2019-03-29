package pers.henglin.leetcode.string;

import pers.henglin.leetcode.Verification;

import java.util.HashMap;
import java.util.Map;

public class IsomorphicStrings implements Verification<String, Boolean> {
    private boolean isomorphicStrings(String s, String t){
        char[] sChars = s.toCharArray();
        char[] tChars = t.toCharArray();
        Map<Character, Character> map= new HashMap<>();
        for(int index=0; index<s.length(); index++){
            if(!map.containsKey(sChars[index])){
                if(map.containsValue(tChars[index])){
                    return false;
                }
                map.put(sChars[index], tChars[index]);
            }else{
                if(map.get(sChars[index]) != tChars[index]){
                    return false;
                }
            }
        }
        return true;
    }

    @Override
    public Boolean verify(String... input) {
        return isomorphicStrings(input[0], input[1]);
    }
}
