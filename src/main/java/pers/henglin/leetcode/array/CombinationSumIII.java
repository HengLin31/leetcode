package pers.henglin.leetcode.array;

import pers.henglin.leetcode.Verification;

import java.util.ArrayList;
import java.util.List;

public class CombinationSumIII implements Verification<Integer, List<List<Integer>>> {
    private List<List<Integer>> combinationSumIII(int k, int n){
        List<List<Integer>> result = new ArrayList<>();
        generate(k, n, 1, 0, new ArrayList<>(), result);
        return result;
    }

    private void generate(int k, int n, int nextInt, int currentSum, List<Integer> current, List<List<Integer>> result){
        if(k == current.size()){
            if(n == currentSum){
                result.add(new ArrayList<>(current));
            }
            return;
        }
        for(int index=nextInt; index<=9; index++){
            if((currentSum + index) > n){
                break;
            }
            current.add(index);
            generate(k, n, index + 1, currentSum + index, current, result);
            current.remove(current.size() - 1);
        }
    }

    @Override
    public List<List<Integer>> verify(Integer... input) {
        return combinationSumIII(input[0], input[1]);
    }
}
