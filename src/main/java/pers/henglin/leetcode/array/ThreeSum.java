package pers.henglin.leetcode.array;

import com.google.gson.Gson;
import pers.henglin.leetcode.Verification;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by linheng on 2018/7/17.
 */
public class ThreeSum implements Verification<Integer[], List<List<Integer>>> {

    @Override
    public List<List<Integer>> verify(Integer[]... input) {
        int[] nums = Arrays.asList(input[0]).stream().mapToInt(index -> index).toArray();
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums);
        for(int index=0; index<nums.length-1; index++) {
            if(0 == index || nums[index] != nums[index - 1]) {
                int left = index + 1;
                int right = nums.length - 1;
                while(left < right) {
                    if(0 == nums[index] + nums[left] + nums[right]) {
                        result.add(Arrays.asList(nums[index], nums[left], nums[right]));
                        while(left < right && nums[left] == nums[left+1]){
                            left++;
                        }
                        while(left < right && nums[right] == nums[right-1]){
                            right--;
                        }
                        left++;
                        right--;
                    }else if(nums[index] + nums[left] + nums[right] < 0){
                        left++;
                    }else{
                        right--;
                    }
                }
            }
        }
        return result;
    }
}
