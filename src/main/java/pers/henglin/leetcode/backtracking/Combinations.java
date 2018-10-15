package pers.henglin.leetcode.backtracking;

import pers.henglin.leetcode.Verification;

import java.util.ArrayList;
import java.util.List;

public class Combinations implements Verification<Integer, List<List<Integer>>> {
    private List<List<Integer>> combinations(int n, int k){
        List<List<Integer>> result = new ArrayList<>();
        if((0 == n) || (0 == k) || (k > n)) {
            return result;
        }
        List<Integer> list = new ArrayList<>();
        dfs(result, list, n, k,1);
        return result;
    }

    private void dfs(List<List<Integer>> result, List<Integer> list, int n, int k, int start){
        if(0 == k){
            result.add(new ArrayList<>(list));
            return;
        }
        for(int index=start; index<=n-k+1; index++) {
            list.add(index);
            dfs(result,list,n,k - 1,index + 1);
            list.remove(list.size() -1);
        }
    }

    @Override
    public List<List<Integer>> verify(Integer... input) {
        return combinations(input[0], input[1]);
    }
}
