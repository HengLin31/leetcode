package pers.henglin.leetcode.array;

import pers.henglin.leetcode.Verification;

/**
 * Created by linheng on 2018/5/28.
 */
public class ContainerWithMostWater implements Verification<Integer, Integer> {
    public int maxArea(Integer[] height){
        int maxarea = 0;
        int left = 0;
        int right = height.length - 1;
        while(left < right){
            int currentHeight = Math.min(height[left], height[right]);
            int currentWidth = right - left;
            int currentArea = currentHeight * currentWidth;
            maxarea = Math.max(maxarea, currentArea);
            //find next height
            if (height[left] < height[right]){
                left++;
            }else{
                right--;
            }
        }
        return maxarea;
    }
    @Override
    public Integer verify(Integer... input) {
        return maxArea(input);
    }
}
