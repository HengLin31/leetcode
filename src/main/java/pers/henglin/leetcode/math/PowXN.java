package pers.henglin.leetcode.math;

import pers.henglin.leetcode.Verification;

import java.util.Map;

public class PowXN implements Verification<Map, Double> {
    private double powXN(double x, int n) {
        if(0 == n) {
            return 1;
        }
        double result = 1;
        long abs = Math.abs((long) n);
        while(abs > 0){
            if(abs % 2 != 0){
                result *= x;
            }
            x *= x;
            abs /= 2;
        }
        if(n < 0){
            return 1.0 / result;
        }
        return result;
    }

    @Override
    public Double verify(Map... input) {
        double x = (double) input[0].get("x");
        int n = (int) input[0].get("n");
        return powXN(x, n);
    }
}
