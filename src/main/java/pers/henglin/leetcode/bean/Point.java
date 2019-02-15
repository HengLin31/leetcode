package pers.henglin.leetcode.bean;

public class Point {
    public int x;
    public int y;

    public Point(){
        this.x = 0;
        this.y = 0;
    }

    public Point(int x, int y){
        this.x = x;
        this.y = y;
    }

    public static Point initPoint(int[] arr) throws Exception {
        if(arr.length < 2){
            throw new Exception("array.length < 2");
        }
        return new Point(arr[0], arr[1]);
    }

    public static Point[] initPoints(int[][] matrix) throws Exception {
        Point[] points = new Point[matrix.length];
        for(int index=0; index<matrix.length; index++){
            points[index] = initPoint(matrix[index]);
        }
        return points;
    }
}
