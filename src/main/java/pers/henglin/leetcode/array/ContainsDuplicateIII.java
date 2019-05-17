package pers.henglin.leetcode.array;

import pers.henglin.leetcode.Verification;

import java.util.Map;
import java.util.TreeSet;

public class ContainsDuplicateIII implements Verification<Map, Boolean> {
    private boolean containsDuplicateIII(int[] nums, int k, int t){
        TreeSet<Integer> set = new TreeSet<>();
        for(int index=0; index<nums.length; index++) {
            Integer bigger = set.ceiling(nums[index]);
            if((null != bigger) && (bigger <= (nums[index] + t))){
                return true;
            }
            Integer smaller = set.floor(nums[index]);
            if((null != smaller) && (nums[index] <= (t + smaller))){
                return true;
            }
            set.add(nums[index]);
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
        int t = (int) input[0].get("t");
        return containsDuplicateIII(nums, k, t);
    }
}
