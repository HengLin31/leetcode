package pers.henglin.leetcode.math;

import pers.henglin.leetcode.Verification;

public class CountPrimes implements Verification<Integer, Integer> {
    private int countPrimes(int n){
        if(1 >= n){
            return 0;
        }
        boolean[] notPrimes = new boolean[n];
        notPrimes[0] = true;
        notPrimes[1] = true;
        for(int index=2; (index*index)<n; index++){
            if(!notPrimes[index]){
                for(int multiple=(2*index); multiple<n; multiple+=index){
                    notPrimes[multiple] = true;
                }
            }
        }
        int result = 0;
        for(boolean notPrime:notPrimes){
            if(!notPrime){
                result++;
            }
        }
        return result;
    }

    @Override
    public Integer verify(Integer... input) {
        return countPrimes(input[0]);
    }
}
