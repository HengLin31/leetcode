package pers.henglin.leetcode.dp;

import pers.henglin.leetcode.Verification;

import java.util.Arrays;

public class HouseRobber implements Verification<Integer, Integer> {
    private int houseRobber(int[] nums){
        int robber = 0;
        int notRobber = 0;
        for(int num:nums){
            int temp = robber;
            robber = notRobber + num;
            notRobber = Math.max(temp, notRobber);
        }
        return Math.max(robber, notRobber);
    }

    @Override
    public Integer verify(Integer... input) {
        int[] nums = Arrays.stream(input).mapToInt(ele -> ele).toArray();
        return houseRobber(nums);
    }
}
