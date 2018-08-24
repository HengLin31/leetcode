package pers.henglin.leetcode.array;

import pers.henglin.leetcode.Verification;

import java.util.*;
import java.util.stream.Collectors;

public class InsertInterval implements Verification<Map, List<List<Integer>>> {
    private List<Interval> insertInterval(List<Interval> intervals, Interval newInterval){
        List<Interval> result = new ArrayList<>();
        int index = 0;
        int size = intervals.size();
        while(index < size){
            Interval current = intervals.get(index);
            int start = current.start;
            int end = current.end;
            if(newInterval.start <= start
                    && newInterval.end >= start
                    || newInterval.start >= start
                    && newInterval.start <= end) {
                if(start < newInterval.start){
                    newInterval.start = start;
                }
                if(end > newInterval.end){
                    newInterval.end = end;
                }
            }else{
                if(newInterval.start < start){
                    result.add(newInterval);
                    newInterval = null;
                    break;
                }
                result.add(current);
            }
            index++;
        }
        if(null != newInterval){
            result.add(newInterval);
        }else{
            while(index < size){
                result.add(intervals.get(index));
                index++;
            }
        }
        return result;
    }

    @Override
    public List<List<Integer>> verify(Map... input) {
        List<List<Integer>> matrix = (List<List<Integer>>) input[0].get("matrix");
        List<Integer> newInterval = (List<Integer>) input[0].get("newInterval");
        return intervals2matrix(Objects.requireNonNull(insertInterval(matrix2intervals(matrix), new Interval(newInterval.get(0), newInterval.get(1)))));
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
