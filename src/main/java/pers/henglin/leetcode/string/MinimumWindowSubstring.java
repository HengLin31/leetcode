package pers.henglin.leetcode.string;

import pers.henglin.leetcode.Verification;

public class MinimumWindowSubstring implements Verification<String, String> {
    private String minimumWindowSubstring(String s, String t){
        int count = t.length();
        int from = 0;
        int min = Integer.MAX_VALUE;
        int leftPoint = 0;
        int[] arr = new int[128];
        for(char ch:t.toCharArray()){
            arr[ch - 'A']++;
        }
        for(int rightPoint=0; rightPoint<s.length(); rightPoint++){
            if(arr[s.charAt(rightPoint) - 'A']-- > 0){
                count--;
            }
            while(0 == count){
                if((rightPoint - leftPoint + 1) < min){
                    min = rightPoint-leftPoint+1;
                    from = leftPoint;
                }
                if(++arr[s.charAt(leftPoint++) - 'A'] > 0){
                    count++;
                }
            }
        }
        return min == Integer.MAX_VALUE ? "" : s.substring(from,from+min);
    }

    @Override
    public String verify(String... input) {
        return minimumWindowSubstring(input[0], input[1]);
    }
}
