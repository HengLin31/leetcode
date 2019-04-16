package pers.henglin.leetcode.graph;

import pers.henglin.leetcode.Verification;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class CourseScheduleII implements Verification<Map, int[]> {
    private static final int TRUE = 1;
    private static final int FALSE = 2;

    private int[] courseScheduleII(int numCourses, int[][] prerequisites){
        List<List<Integer>> graph = new ArrayList<>();
        for(int index=0; index<numCourses; index++){
            graph.add(new ArrayList<>());
        }
        for(int[] arr:prerequisites){
            int course = arr[0];
            int prerequisite = arr[1];
            graph.get(course).add(prerequisite);
        }
        int[] visited = new int[numCourses];
        List<Integer> result = new ArrayList<>();
        for(int index=0; index<numCourses; index++){
            if(dfs(index, graph, visited, result)){
                return new int[0];
            }
        }
        return result.stream().mapToInt(i -> i).toArray();
    }

    private boolean dfs(int current, List<List<Integer>> graph, int[] visited, List<Integer> result) {
        if(TRUE == visited[current]){
            return true;
        }
        if(FALSE == visited[current]){
            return false;
        }
        visited[current] = TRUE;
        for(int next : graph.get(current)){
            if(dfs(next, graph, visited, result)){
                return true;
            }
        }
        visited[current] = FALSE;
        result.add(current);
        return false;
    }

    @Override
    public int[] verify(Map... input) {
        int numCourses = (int) input[0].get("numCourses");
        int[][] prerequisites = (int[][]) input[0].get("prerequisites");
        return courseScheduleII(numCourses, prerequisites);
    }
}
