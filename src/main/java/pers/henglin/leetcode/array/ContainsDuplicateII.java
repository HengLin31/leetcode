package pers.henglin.leetcode.array;

import pers.henglin.leetcode.Verification;

import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class ContainsDuplicateII implements Verification<Map, Boolean> {
    private boolean containsDuplicateII(int[] nums, int k){
        Set<Integer> set = new HashSet<>();
        for(int index=0; index<nums.length; index++){
            if(set.contains(nums[index])){
                return true;
            }else{
                set.add(nums[index]);
            }
            if(set.size() > k){
                set.remove(nums[index - k]);
            }
        }
        return false;
    }
    @Override
    public Boolean verify(Map... input) {
        int[] nums = (int[]) input[0].get("nums");
        int k = (int) input[0].get("k");
        return containsDuplicateII(nums, k);
    }
}
