package pers.henglin.leetcode.backtracking;

import pers.henglin.leetcode.Verification;

import java.util.ArrayList;
import java.util.List;

public class GrayCode implements Verification<Integer, List<Integer>> {
    private List<Integer> grayCode(int n){
        List<Integer> grayCodes = new ArrayList<>();
        grayCodes.add(0);
        for(int index=0; index<n; index++) {
            int currentSize = grayCodes.size();
            for(int scan=currentSize-1; scan>=0; scan--) {
                grayCodes.add(grayCodes.get(scan) | 1 << index);
            }
        }
        return grayCodes;
    }

    @Override
    public List<Integer> verify(Integer... input) {
        return grayCode(input[0]);
    }
}
