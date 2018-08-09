package pers.henglin.leetcode.array;

import pers.henglin.leetcode.Verification;

import java.util.Arrays;

public class TrappingRainWater implements Verification<Integer, Integer> {
    private int trappingRainWater(int[] height){
        int leftBound = 0;
        int rightBound = height.length-1;
        int result = 0;
        while(leftBound < rightBound && height[leftBound] < height[leftBound + 1]){
            leftBound++;
        }
        while(leftBound < rightBound && height[rightBound] < height[rightBound - 1]) {
            rightBound--;
        }
        while(leftBound < rightBound){
            int left = height[leftBound];
            int right = height[rightBound];
            if(left <= right){
                while(leftBound < rightBound && height[++leftBound] < left){
                    result += left - height[leftBound];
                }
            } else {
                while(leftBound < rightBound && height[--rightBound] < right) {
                    result += right - height[rightBound];
                }
            }
        }
        return result;
    }

    private int trappingRainWater2(int[] height){
        if(height == null || height.length == 0){
            return 0;
        }
        int[] maxLeft = new int[height.length];
        int max = height[0];
        for(int index=0; index<height.length; index++){
            max = Math.max(height[index], max);
            maxLeft[index] = max;
        }
        max = height[height.length - 1];
        int area = 0;
        for(int index=height.length - 1; index>= 0; index--) {
            // now max is maxRight
            max = Math.max(height[index], max);
            area += Math.min(max, maxLeft[index]) - height[index];
        }
        return area;
    }

    @Override
    public Integer verify(Integer... input) {
        int[] height = Arrays.stream(input).mapToInt(ele -> ele).toArray();
        return trappingRainWater(height);
    }
}
