package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class PointTest {

//    @Test
//    public void when00to20then2() {
//        double expected = 2;
//        int x1 = 0;
//        int y1 = 0;
//        int x2 = 2;
//        int y2 = 0;
//        double out = Point.distance(x1, y1, x2, y2);
//        Assert.assertEquals(expected, out, 0.01);
//    }
//
//    @Test
//    public void when56to48then2dot23() {
//        double expected = 2.23;
//        int x1 = 5;
//        int y1 = 6;
//        int x2 = 4;
//        int y2 = 8;
//        double out = Point.distance(x1, y1, x2, y2);
//        Assert.assertEquals(expected, out, 0.01);
//    }
//
//    @Test
//    public void when150178to100190then250dot29() {
//        double expected = 250.29;
//        int x1 = -150;
//        int y1 = 178;
//        int x2 = 100;
//        int y2 = 190;
//        double out = Point.distance(x1, y1, x2, y2);
//        Assert.assertEquals(expected, out, 0.01);
//    }

    @Test
    public void when150178to100190then250dot29() {
        double expected = 250.29;
        Point a = new Point(-150, 178);
        Point b = new Point(100, 190);
        double out = a.distance(b);
        Assert.assertEquals(expected, out, 0.01);

    }

    @Test
    public void when000to1111then1dot73() {
        double expected = 1.73;
        Point a = new Point(0, 0, 0);
        Point b = new Point(1, 1, 1);
        double out = a.distance3d(b);
        Assert.assertEquals(expected, out, 0.01);

    }
}