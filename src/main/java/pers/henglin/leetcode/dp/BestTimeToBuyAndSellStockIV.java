package pers.henglin.leetcode.dp;

import pers.henglin.leetcode.Verification;

import java.util.Map;

public class BestTimeToBuyAndSellStockIV implements Verification<Map, Integer> {
    private int bestTimeToBuyAndSellStockIV(int k, int[] prices){
        if(0 == prices.length){
            return 0;
        }
        if(k >= (prices.length / 2)){
            return getMaxProfit(prices);
        }
        int[][] dp = new int[k + 1][prices.length];
        for(int count=1; count<=k; count++){
            int maxProfit = Integer.MIN_VALUE;
            for(int priceIndex=1; priceIndex<prices.length; priceIndex++){
                maxProfit = Math.max(maxProfit, dp[count - 1][priceIndex - 1] - prices[priceIndex - 1]);
                dp[count][priceIndex] = Math.max(dp[count][priceIndex - 1], maxProfit + prices[priceIndex]);
            }
        }
        return dp[k][prices.length - 1];
    }

    private int getMaxProfit(int[] prices) {
        int maxProfit = 0;
        for(int index=1; index<prices.length; index++){
            if(prices[index] > prices[index - 1]){
                maxProfit += (prices[index] - prices[index - 1]);
            }
        }
        return maxProfit;
    }

    @Override
    public Integer verify(Map... input) {
        int k = (int) input[0].get("k");
        int[] prices = (int[]) input[0].get("prices");
        return bestTimeToBuyAndSellStockIV(k, prices);
    }
}
