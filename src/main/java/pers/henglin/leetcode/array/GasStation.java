package pers.henglin.leetcode.array;

import pers.henglin.leetcode.Verification;

public class GasStation implements Verification<int[], Integer> {
    private int gasStation(int[] gas, int[] cost){
        int length = gas.length;
        int sum = 0;
        int minSum = Integer.MAX_VALUE;
        int point = 0;
        for(int index=0; index<length; index++){
            sum += gas[index] - cost[index];
            if(sum < minSum){
                minSum = sum;
                point = index;
            }
        }
        if(sum < 0){
            return -1;
        }else{
            return (point == (length - 1)) ? 0 : (point + 1);
        }
    }

    @Override
    public Integer verify(int[]... input) {
        return gasStation(input[0], input[1]);
    }
}
