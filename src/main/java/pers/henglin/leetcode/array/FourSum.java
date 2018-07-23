package pers.henglin.leetcode.array;

import pers.henglin.leetcode.Verification;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

public class FourSum implements Verification<Map, List<List<Integer>>> {
    @Override
    public List<List<Integer>> verify(Map... input) {
        Map params = input[0];
        int[] nums = (int[]) params.get("nums");
        int target = (int) params.get("target");

        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums);

        if(nums.length < 4){
            return result;
        }
        int max = nums[nums.length - 1];
        int currentIndex = 0;
        while(currentIndex < nums.length){
            int num1 = nums[currentIndex];
            if(num1 + 3 * max < target){
                currentIndex++;
                continue;
            }
            int nextIndex = currentIndex + 1;
            while(nextIndex < nums.length){
                int num2 = nums[nextIndex];
                if(num1 + 3 * num2 > target){
                    break;
                }
                List<List<Integer>> pairs = twoSum(nums, nextIndex + 1, nums.length - 1, target - num1 - num2);
                if(pairs.size() != 0){
                    for(List<Integer> list : pairs){
                        list.add(num1);
                        list.add(num2);
                        result.add(list);
                    }
                }
                while(nextIndex < nums.length && nums[nextIndex] == num2){
                    nextIndex++;
                }
            }
            while(currentIndex < nums.length && nums[currentIndex] == num1){
                currentIndex++;
            }
        }
        return result;
    }

    private List<List<Integer>> twoSum(int[] nums, int startIndex, int endIndex, int target){
        List<List<Integer>> res = new ArrayList<>();
        while(endIndex > startIndex){
            int num1 = nums[startIndex];
            int num2 = nums[endIndex];
            if(num1 + num2 == target){
                List<Integer> pair = new ArrayList<>();
                pair.add(num1);
                pair.add(num2);
                res.add(pair);
                while(endIndex > startIndex && nums[startIndex] == num1 && nums[endIndex] == num2){
                    startIndex++;
                    endIndex--;
                }
            }else if(num1 + num2 < target){
                startIndex++;
            }else{
                endIndex--;
            }
        }
        return res;
    }
}
