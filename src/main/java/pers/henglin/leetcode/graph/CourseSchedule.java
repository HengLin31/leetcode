package pers.henglin.leetcode.graph;

import pers.henglin.leetcode.Verification;

import java.util.*;

public class CourseSchedule implements Verification<Map, Boolean> {
    private boolean courseSchedule(int numCourses, int[][] prerequisites){
        Map<Integer, List<Integer>> map = new HashMap<>();
        int[] inDegree = new int[numCourses];
        for(int index=0; index<numCourses; index++){
            map.put(index, new ArrayList<>());
        }
        for(int[] prerequisite : prerequisites){
            map.get(prerequisite[1]).add(prerequisite[0]);
            inDegree[prerequisite[0]] += 1;
        }
        int count = 0;
        Queue<Integer> queue = new LinkedList<>();
        for(int index=0; index<inDegree.length; index++){
            if(0 == inDegree[index]){
                count += 1;
                queue.add(index);
            }
        }
        while(!queue.isEmpty()){
            int temp = queue.poll();
            for(int index=0; index<map.get(temp).size(); index++){
                int visit = map.get(temp).get(index);
                inDegree[visit] -= 1;
                if(0 == inDegree[visit]){
                    queue.add(visit);
                    count += 1;
                }
            }
        }
        return count == numCourses;
    }

    @Override
    public Boolean verify(Map... input) {
        int numCourses = (int) input[0].get("numCourses");
        int[][] prerequisites = (int[][]) input[0].get("prerequisites");
        return courseSchedule(numCourses, prerequisites);
    }
}
