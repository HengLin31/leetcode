package pers.henglin.leetcode.array;

import pers.henglin.leetcode.Verification;

import java.util.Arrays;
import java.util.Map;
/**
 * Created by linheng on 2018/7/18.
 */
public class ThreeSumClosest implements Verification<Map<String, Object>, Integer> {

    @Override
    public Integer verify(Map<String, Object>... input) {
        int[] nums = (int[]) input[0].get("nums");
        int target = (int) input[0].get("target");
        int min = Integer.MAX_VALUE;
        int result = 0;
        Arrays.sort(nums);
        for(int index=0; index<nums.length; index++) {
            int left = index + 1;
            int right = nums.length - 1;
            while(left < right) {
                int sum = nums[index] + nums[left] + nums[right];
                int diff = Math.abs(sum - target);

                if(diff == 0){
                    return sum;
                }
                if(diff < min) {
                    min = diff;
                    result = sum;
                }
                if(sum <= target) {
                    left++;
                }else{
                    right--;
                }
            }
        }
        return result;
    }
}
