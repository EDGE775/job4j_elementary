package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class PointTest {
    @Test
    public void when31to85then6and40() {
        double expected = 6.40;
        int x1 = 3;
        int y1 = 1;
        int x2 = 8;
        int y2 = 5;
        double out = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when132and421to411and7433then7017and54() {
        double expected = 7017.54;
        int x1 = 132;
        int y1 = 421;
        int x2 = 411;
        int y2 = 7433;
        double out = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when00to02then2() {
        int expected = 2;
        int x1 = 0;
        int y1 = 0;
        int x2 = 2;
        int y2 = 0;
        double out = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, out, 0.01);
    }

}