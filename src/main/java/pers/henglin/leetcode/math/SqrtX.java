package pers.henglin.leetcode.math;

import pers.henglin.leetcode.Verification;

public class SqrtX implements Verification<Integer, Integer> {
    private int sqrtX(int x){
        if(0 == x || 1 == x){
            return x;
        }
        int low = 1;
        int high = x;
        while(low <= high){
            int mid = (low + high) / 2;
            if((x / mid) == mid){
                return mid;
            }
            if((x / mid) > mid){
                low = mid + 1;
            }else{
                high = mid - 1;
            }
        }
        return high;
    }

    @Override
    public Integer verify(Integer... input) {
        return sqrtX(input[0]);
    }
}
