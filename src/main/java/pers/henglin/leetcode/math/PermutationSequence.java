package pers.henglin.leetcode.math;

import pers.henglin.leetcode.Verification;

import java.util.ArrayList;

public class PermutationSequence implements Verification<Integer, String> {
    private String permutationSequence(int n, int k){
        StringBuilder result = new StringBuilder(n);
        ArrayList<Integer> nums = new ArrayList<>();
        int factorial = 1;
        for(int count=1; count<=n; count++){
            nums.add(count);
            factorial *= count;
        }
        k--;
        for(int index=n; index>1; index--) {
            factorial = factorial / index;
            int temp = k / factorial;
            k = k - temp * factorial;
            result.append(nums.get(temp));
            nums.remove(temp);
        }
        result.append(nums.get(0));
        return result.toString();
    }

    @Override
    public String verify(Integer... input) {
        return permutationSequence(input[0], input[1]);
    }
}
