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

    @Test
    public void whenX42Y13Z3toX9Y18Z1then33dot43() {
        double expected = 33.43;
        Point a = new Point(42, 13, 3);
        Point b = new Point(9, 18, 1);
        double dist = a.distance3d(b);
        Assert.assertEquals(expected, dist, 0.01);
    }

    @Test
    public void whenX7Y7Z7toX4Y4Z4then5dot19() {
        double expected = 5.19;
        Point a = new Point(7, 7, 7);
        Point b = new Point(4, 4, 4);
        double dist = a.distance3d(b);
        Assert.assertEquals(expected, dist, 0.01);
    }

    @Test
    public void whenX0Y35Z0toX61Y22Z8then62dot88() {
        double expected = 62.88;
        Point a = new Point(0, 35, 0);
        Point b = new Point(61, 22, 8);
        double dist = a.distance3d(b);
        Assert.assertEquals(expected, dist, 0.01);
    }
}