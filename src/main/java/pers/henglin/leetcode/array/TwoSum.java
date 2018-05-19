package pers.henglin.leetcode.array;

import pers.henglin.leetcode.Verification;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by linheng on 2018/5/18.
 */
public class TwoSum implements Verification<Map, Integer[]> {
    private Integer[] twoSum(Integer[] nums, int target){
        Integer[] result = new Integer[2];
        //Map<firstVal, firstValIndex>
        Map<Integer, Integer> firstValAndFirstValIndexMapping = new HashMap<>();
        for(int index=0; index<nums.length; index++){
            //first value = target - second value
            int firstVal = target - nums[index];
            //remainder equal first value
            if(firstValAndFirstValIndexMapping.containsKey(firstVal)){
                //so get first value index
                result[0] = firstValAndFirstValIndexMapping.get(firstVal);
                result[1] = index;//set second value index
            }
            //Map<firstVal, firstValIndex>
            firstValAndFirstValIndexMapping.put(nums[index], index);
        }
        return result;
    }

    @Override
    public Integer[] verify(Map... map) {
        Integer[] nums = (Integer[]) map[0].get("nums");
        Integer target = (Integer) map[0].get("target");
        return twoSum(nums, target);
    }
}
