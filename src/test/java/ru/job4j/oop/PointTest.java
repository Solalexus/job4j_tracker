package ru.job4j.oop;

import org.junit.Assert;
import org.junit.Test;

public class PointTest {
    @Test
    public void when00to20then2() {
        double expected = 2;
        Point a = new Point(0, 0);
        Point b = new Point(0, 2);
        double dist = a.distance(b);
        Assert.assertEquals(expected, dist, 0.01);
    }

    @Test
    public void when73to1226then23dot54() {
        double expected = 23.54;
        Point a = new Point(7, 3);
        Point b = new Point(12, 26);
        double dist = a.distance(b);
        Assert.assertEquals(expected, dist, 0.01);
    }

    @Test
    public void when3083to49121then42dot49() {
        double expected = 42.49;
        Point a = new Point(30, 83);
        Point b = new Point(49, 121);
        double dist = a.distance(b);
        Assert.assertEquals(expected, dist, 0.01);
    }

    @Test
    public void when261to7419then51dot26() {
        double expected = 51.26;
        Point a = new Point(26, 1);
        Point b = new Point(74, 19);
        double dist = a.distance(b);
        Assert.assertEquals(expected, dist, 0.01);
    }
}