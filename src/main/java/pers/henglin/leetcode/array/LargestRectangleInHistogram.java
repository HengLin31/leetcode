package pers.henglin.leetcode.array;

import pers.henglin.leetcode.Verification;

import java.util.Arrays;

public class LargestRectangleInHistogram implements Verification<Integer, Integer> {
    private int largestRectangleInHistogram(int[] heights){
        int length = heights.length;
        if(0 == length){
            return 0;
        }
        if(1 == length){
            return heights[0];
        }

        int[] lessFromLeft = new int[length];
        int[] lessFromRight = new int[length];
        lessFromLeft[0] = -1;
        lessFromRight[length - 1] = length;

        for(int index=1; index<length; index++){
            int pre = index - 1;
            while((pre >= 0) && (heights[pre] >= heights[index])){
                pre = lessFromLeft[pre];
            }
            lessFromLeft[index] = pre;
        }

        for(int index=length-2; index>=0;index--){
            int pre = index + 1;
            while((pre < length) && (heights[pre] >= heights[index])){
                pre = lessFromRight[pre];
            }
            lessFromRight[index] = pre;
        }
        int maxArea=0;
        for(int index=0; index<length; index++){
            maxArea = Math.max(maxArea, heights[index] * (lessFromRight[index] - lessFromLeft[index] - 1));
        }
        return maxArea;
    }

    @Override
    public Integer verify(Integer... input) {
        int[] heights = Arrays.stream(input).mapToInt(ele -> ele).toArray();
        return largestRectangleInHistogram(heights);
    }
}
