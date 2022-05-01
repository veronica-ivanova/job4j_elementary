package ru.job4j.condition;

import static java.lang.Math.sqrt;
import static java.lang.Math.pow;

public class Point {

//    public static double distance(int x1, int y1, int x2, int y2) {
//        double rsl = Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));
//        return rsl;
//    }
//
//    public static void main(String[] args) {
//        double result = Point.distance(0, 0, 2, 0);
//        System.out.println("result (0, 0) to (2, 0) " + result);
//        result = Point.distance(5, 6, 4, 8);
//        System.out.println("result (5, 6) to (4, 8) " + result);
//        result = Point.distance(-150, 178, 100, 190);
//        System.out.println("result (-150, 178) to (100, 190) " + result);
//    }
    private int x;

    private int y;

    public Point(int first, int second) {
        this.x = first;
        this.y = second;
    }

    public double distance(Point that) {
        return sqrt(pow(this.x - that.x, 2) + pow(this.y - that.y, 2));
    }

    public static void main(String[] args) {
        Point a = new Point(0, 0);
        Point b = new Point(0, 2);
        double dist = a.distance(b);
        System.out.println(dist);
    }
}
