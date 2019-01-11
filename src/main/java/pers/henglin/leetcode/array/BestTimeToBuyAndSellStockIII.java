package pers.henglin.leetcode.array;

import pers.henglin.leetcode.Verification;

import java.util.Arrays;

public class BestTimeToBuyAndSellStockIII implements Verification<Integer, Integer> {
    private int bestTimeToBuyAndSellStockIII(int[] prices){
        int buy1 = Integer.MAX_VALUE;
        int buy2 = Integer.MAX_VALUE;
        int sell1 = 0;
        int sell2 = 0;

        for(int index=0; index<prices.length; index++){
            buy1 = Math.min(buy1, prices[index]);
            sell1 = Math.max(sell1, prices[index] - buy1);
            buy2 = Math.min(buy2, prices[index] - sell1);
            sell2 = Math.max(sell2, prices[index] - buy2);
        }
        return sell2;
    }

    @Override
    public Integer verify(Integer... input) {
        int[] prices = Arrays.stream(input).mapToInt(ele -> ele).toArray();
        return bestTimeToBuyAndSellStockIII(prices);
    }
}
