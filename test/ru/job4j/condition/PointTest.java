package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;

import static org.junit.Assert.*;

public class PointTest {
    @Test
    public void when31to85then6and40() {
        double expected = 6.40;
        Point p1 = new Point(3, 1);
        Point p2 = new Point(8, 5);
        double out = p1.distance(p2);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when132and421to411and7433then7017and54() {
        double expected = 7017.54;
        Point p1 = new Point(132, 421);
        Point p2 = new Point(411, 7433);
        double out = p1.distance(p2);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when00to02then2() {
        int expected = 2;
        Point p1 = new Point(0, 0);
        Point p2 = new Point(2, 0);
        double out = p1.distance(p2);
        Assert.assertEquals(expected, out, 0.01);
    }

}