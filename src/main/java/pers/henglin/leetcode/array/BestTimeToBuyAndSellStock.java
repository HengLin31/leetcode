package pers.henglin.leetcode.array;

import pers.henglin.leetcode.Verification;

import java.util.Arrays;

public class BestTimeToBuyAndSellStock implements Verification<Integer, Integer> {
    private int bestTimeToBuyAndSellStock(int[] prices){
        if(0 == prices.length){
            return 0;
        }
        int result = 0;
        int small = prices[0];
        for(int index=1; index<prices.length; index++) {
            if((prices[index] - small) > result){
                result = prices[index] - small;
            }
            if(prices[index] < small){
                small = prices[index];
            }
        }
        return result;
    }

    @Override
    public Integer verify(Integer... input) {
        int[] prices = Arrays.stream(input).mapToInt(ele -> ele).toArray();
        return bestTimeToBuyAndSellStock(prices);
    }
}
