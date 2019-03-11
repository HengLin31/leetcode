package pers.henglin.leetcode.array;

import pers.henglin.leetcode.Verification;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class LargestNumber implements Verification<Integer, String> {
    private static final String EMPTY = "";
    private static final String ZERO = "0";
    private static final char CHAR_ZERO = '0';

    private String largestNumber(int[] nums){
        if((null == nums) || (0 == nums.length)){
            return EMPTY;
        }
        List<String> list = new ArrayList<>();
        for(int num:nums){
            list.add(String.valueOf(num));
        }
        Collections.sort(list, (str1, str2) -> {
            String combine1 = str1 + str2;
            String combine2 = str2 + str1;
            return combine2.compareTo(combine1);
        });
        StringBuilder result = new StringBuilder();
        for(String str:list) {
            result.append(str);
        }
        if(CHAR_ZERO == result.charAt(0)){
            return ZERO;
        }
        return result.toString();
    }

    @Override
    public String verify(Integer... input) {
        int[] nums = Arrays.stream(input).mapToInt(ele -> ele).toArray();
        return largestNumber(nums);
    }
}
