package pers.henglin.leetcode.array;

import pers.henglin.leetcode.Verification;

import java.util.*;

public class TheSkylineProblem implements Verification<List<List<Integer>>, List<List<Integer>>> {
    private List<List<Integer>> theSkylineProblem(int[][] buildings){
        if((null == buildings) || (0 == buildings.length)){
            return new ArrayList<>();
        }
        return merge(buildings, 0, buildings.length - 1);
    }

    private LinkedList<List<Integer>> merge(int[][] buildings, int low, int high) {
        LinkedList<List<Integer>> result = new LinkedList<>();
        if(low > high){
            return result;
        }
        if(low == high){
            List<Integer> topLeft = Arrays.asList(buildings[low][0], buildings[low][2]);
            List<Integer> bottomRight = Arrays.asList(buildings[low][1], 0);
            result.add(topLeft);
            result.add(bottomRight);
            return result;
        }
        int middle = low + (high - low) / 2;
        LinkedList<List<Integer>> left = merge(buildings, low, middle);
        LinkedList<List<Integer>> right = merge(buildings, middle + 1, high);
        int leftY = 0;
        int rightY = 0;
        while(!left.isEmpty() && !right.isEmpty()) {
            Integer x1 = Objects.requireNonNull(left.peek()).get(0);
            Integer x2 = Objects.requireNonNull(right.peek()).get(0);
            if(x1 < x2){
                leftY = Objects.requireNonNull(left.poll()).get(1);
            }else if(x2 < x1) {
                rightY = Objects.requireNonNull(right.poll()).get(1);
            }else{
                leftY = Objects.requireNonNull(left.poll()).get(1);
                rightY = Objects.requireNonNull(right.poll()).get(1);
            }
            int y = Math.max(leftY, rightY);
            if(result.isEmpty() || (result.peekLast().get(1) != y)){
                result.add(Arrays.asList(Math.min(x1, x2), y));
            }
        }
        result.addAll(left);
        result.addAll(right);
        return result;
    }

    @Override
    public List<List<Integer>> verify(List<List<Integer>>... input) {
        int[][] buildings = input[0].stream().map(row -> row.stream().mapToInt(col -> col).toArray()).toArray(int[][]::new);
        return theSkylineProblem(buildings);
    }
}
