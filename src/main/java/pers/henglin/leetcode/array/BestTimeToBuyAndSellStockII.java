package pers.henglin.leetcode.array;

import pers.henglin.leetcode.Verification;

import java.util.Arrays;

public class BestTimeToBuyAndSellStockII implements Verification<Integer, Integer> {
    private int bestTimeToBuyAndSellStockII(int[] prices){
        int max = 0;
        for(int index=1; index<prices.length; index++) {
            if(prices[index] > prices[index - 1]){
                max += prices[index] - prices[index - 1];
            }
        }
        return max;
    }

    @Override
    public Integer verify(Integer... input) {
        int[] prices = Arrays.stream(input).mapToInt(ele -> ele).toArray();
        return bestTimeToBuyAndSellStockII(prices);
    }
}
