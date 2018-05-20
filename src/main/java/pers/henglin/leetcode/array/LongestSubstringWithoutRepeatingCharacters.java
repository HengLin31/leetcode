package pers.henglin.leetcode.array;

import pers.henglin.leetcode.Verification;

/**
 * Created by linheng on 2018/5/20.
 */
public class LongestSubstringWithoutRepeatingCharacters implements Verification<String, Integer> {
    private int longestSubstringWithoutRepeatingCharacters(String str){
        int result = 0;
        int[] hash = new int[128];//ASCII hash
        for(int end=0, begin=0; end<str.length(); end++){
            begin = Math.max(hash[str.charAt(end)], begin);//update begin point
            result = Math.max(result, end - begin + 1);//update max substring
            /*
                ex:
                    hash     -> [... a, b, c, ...]
                    "abbbcb" -> [... 1, 6, 5, ...]
             */
            hash[str.charAt(end)] = end + 1;
        }
        return result;
    }

    @Override
    public Integer verify(String... input) {
        return longestSubstringWithoutRepeatingCharacters(input[0]);
    }
}
