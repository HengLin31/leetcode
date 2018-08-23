package pers.henglin.leetcode.array;

import pers.henglin.leetcode.Verification;

import java.util.*;
import java.util.stream.Collectors;

public class MergeIntervals implements Verification<Map, List<List<Integer>>> {
    private List<Interval> mergeIntervals(List<Interval> intervals){
        sort(intervals);
        LinkedList<Interval> result = new LinkedList<>();
        for (Interval interval:intervals) {
            if(result.isEmpty() || result.getLast().end < interval.start){
                //not overlap
                result.add(interval);
            }else{
                //overlap, so merge
                result.getLast().end = Math.max(result.getLast().end, interval.end);
            }
        }
        return result;
    }

    private void sort(List<Interval> intervals){
        //Collections.sort(intervals, (o1, o2) -> Integer.compare(o1.start, o2.start));
        intervals.sort(Comparator.comparingInt(o -> o.start));
    }

    @Override
    public List<List<Integer>> verify(Map... input) {
        List<List<Integer>> matrix = (List<List<Integer>>) input[0].get("matrix");
        return intervals2matrix(Objects.requireNonNull(mergeIntervals(matrix2intervals(matrix))));
    }

    private List<Interval> matrix2intervals(List<List<Integer>> matrix){
        return matrix.stream().map(ele -> new Interval(ele.get(0), ele.get(1))).collect(Collectors.toList());
    }

    private List<List<Integer>> intervals2matrix(List<Interval> intervals){
        return intervals.stream().map(ele -> Arrays.asList(ele.start, ele.end)).collect(Collectors.toList());
    }

    private class Interval{
        private int start;
        private int end;

        private Interval(int start, int end){
            this.start = start;
            this.end = end;
        }
    }
}
