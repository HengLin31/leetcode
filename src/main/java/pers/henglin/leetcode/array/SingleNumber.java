package pers.henglin.leetcode.array;

import pers.henglin.leetcode.Verification;

import java.util.Arrays;
import java.util.HashSet;

public class SingleNumber implements Verification<Integer, Integer> {
   private int singleNumber(int[] nums){
       HashSet<Integer> numSet = new HashSet<>();
       int result = 0;
       for(int num:nums){
           if(numSet.add(num)){
               result += num;
           }else{
               result -= num;
           }
       }
       return result;
   }

    private int singleNumber2(int[] nums) {
        int xor = 0;
        for(int num:nums){
            xor ^= num;
        }
        return xor;
    }

    @Override
    public Integer verify(Integer... input) {
       int[] nums = Arrays.stream(input).mapToInt(ele -> ele).toArray();
       return singleNumber(nums);
    }
}
