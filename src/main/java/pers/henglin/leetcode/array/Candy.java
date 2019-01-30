package pers.henglin.leetcode.array;

import pers.henglin.leetcode.Verification;

import java.util.Arrays;

public class Candy implements Verification<Integer, Integer> {
    private int candy(int[] ratings){
        if((null == ratings) || (0 == ratings.length)){
            return 0;
        }
        int dp[] = new int[ratings.length];
        Arrays.fill(dp, 1);
        for(int index=1; index<ratings.length; index++) {
            if(ratings[index] > ratings[index - 1]){
                dp[index] = dp[index - 1] + 1;
            }
        }
        int sum = dp[ratings.length - 1];
        for(int index=ratings.length-2; index>=0; index--){
            if(ratings[index] > ratings[index + 1]){
                dp[index] = Math.max(dp[index], dp[index + 1] + 1);
            }
            sum += dp[index];
        }
        return sum;
    }

    @Override
    public Integer verify(Integer... input) {
        int[] ratings = Arrays.stream(input).mapToInt(ele -> ele).toArray();
        return candy(ratings);
    }
}
