package pers.henglin.leetcode.math;

import pers.henglin.leetcode.Verification;

import java.util.HashSet;
import java.util.Set;

public class HappyNumber implements Verification<Integer, Boolean> {
    private boolean happyNumber(int n){
        Set<Integer> track = new HashSet<>();
        while(track.add(n)){
            if(1 == n){
                return true;
            }
            n = computation(n);
        }
        return false;
    }

    private int computation(int n){
        int remain;
        int result = 0;
        while(0 < n){
            remain = n % 10;
            result += remain * remain;
            n /= 10;
        }
        return result;
    }

    @Override
    public Boolean verify(Integer... input) {
        return happyNumber(input[0]);
    }
}
