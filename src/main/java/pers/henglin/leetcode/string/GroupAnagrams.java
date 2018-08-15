package pers.henglin.leetcode.string;

import pers.henglin.leetcode.Verification;

import java.util.*;

public class GroupAnagrams implements Verification<String, List<List<String>>> {
    private List<List<String>> groupAnagrams(String[] strs) {
        if (null == strs || 0 == strs.length){
            return new ArrayList<>();
        }
        Map<String, List<String>> map = new HashMap<>();
        for (String str:strs) {
            char[] chs = str.toCharArray();
            Arrays.sort(chs);
            String key = String.valueOf(chs);
            if (!map.containsKey(key)) map.put(key, new ArrayList<>());
            map.get(key).add(str);
        }
        return new ArrayList<>(map.values());
    }

    @Override
    public List<List<String>> verify(String... input) {
        return groupAnagrams(input);
    }
}
