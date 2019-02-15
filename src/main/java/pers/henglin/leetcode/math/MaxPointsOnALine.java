package pers.henglin.leetcode.math;

import pers.henglin.leetcode.Verification;
import pers.henglin.leetcode.bean.Point;

import java.util.HashMap;
import java.util.Map;

public class MaxPointsOnALine implements Verification<Point, Integer> {
    private int maxPointsOnALine(Point[] points){
        if(points.length < 2){
            return points.length;
        }
        int max = 2;
        for(Point point:points){
            Map<Integer, Integer> slopes = new HashMap<>(points.length);
            int localMax = 0;
            for (Point neighborPoint:points) {
                int deltaY = neighborPoint.y - point.y;
                int deltaX = neighborPoint.x - point.x;

                int sign = 1;
                if((deltaY > 0 && deltaX < 0) || (deltaY < 0 && deltaX > 0)){
                    sign = -1;
                }
                deltaY = Math.abs(deltaY);
                deltaX = Math.abs(deltaX);

                int gcd = gcd(deltaY, deltaX);
                deltaY = (0 == gcd) ? deltaY : (deltaY / gcd);
                deltaX = (0 == gcd) ? deltaX : (deltaX / gcd);

                //pi(k1, k2) = 1/2(k1 + k2)(k1 + k2 + 1) + k2
                int slope = sign * (deltaY + deltaX) * (deltaY + deltaX + 1) / 2 + deltaX;
                if(slopes.containsKey(slope)){
                    slopes.put(slope, slopes.get(slope) + 1);
                }else{
                    slopes.put(slope, 1);
                }
                if(0 == slope){
                    continue;
                }
                localMax = Math.max(slopes.get(slope),localMax);
            }
            max = Math.max(max, localMax + slopes.get(0));
        }
        return max;
    }

    private int gcd(int num1, int num2) {
        if(0 == num2){
            return num1;
        }
        return gcd(num2, num1 % num2);
    }

    @Override
    public Integer verify(Point... input) {
        return maxPointsOnALine(input);
    }
}
