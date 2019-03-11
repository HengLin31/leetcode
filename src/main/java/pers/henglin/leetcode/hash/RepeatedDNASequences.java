package pers.henglin.leetcode.hash;

import pers.henglin.leetcode.Verification;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

public class RepeatedDNASequences implements Verification<String, List<String>> {
    private List<String> repeatedDNASequences(String s){
        List<String> result = new LinkedList<>();
        HashMap<String, Integer> mapping = new HashMap<>();
        int length = s.length();
        if(length <= 10){
            return result;
        }
        for(int index=0; index<=length-10; index++){
            String substring = s.substring(index, index + 10);
            if(mapping.containsKey(substring)){
                if(1 == mapping.get(substring)){
                    mapping.replace(substring, -1);
                    result.add(substring);
                }
            }else{
                mapping.put(substring, 1);
            }
        }
        return result;
    }

    @Override
    public List<String> verify(String... input) {
        return repeatedDNASequences(input[0]);
    }
}
