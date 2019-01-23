package pers.henglin.leetcode.string;

import pers.henglin.leetcode.Verification;

public class PalindromePartitioningII implements Verification<String, Integer> {
    private int palindromePartitioningII(String s){
        int length = s.length();
        if(0 >= length){
            return 0;
        }
        char[] chars = s.toCharArray();
        int[] nums = new int[length];
        boolean[][] isValid = new boolean[length][length];
        nums[0] = 0;
        for(int index=0; index<length; index++){
            isValid[index][index] = true;
        }
        for(int index=1; index<chars.length; index++){
            nums[index] = nums[index - 1] + 1;
            for(int scan=0; scan<index; scan++){
                if(chars[index] == chars[scan]){
                    if((index == (scan + 1)) || isValid[scan + 1][index - 1]){
                        isValid[scan][index] = true;
                    }
                }
                if(isValid[scan][index]){
                    if(0 == scan){
                        nums[index] = 0;
                    }else{
                        nums[index] = Math.min(nums[index], nums[scan - 1] + 1);
                    }
                }
            }
        }
        return nums[chars.length - 1];
    }

    @Override
    public Integer verify(String... input) {
        return palindromePartitioningII(input[0]);
    }
}
