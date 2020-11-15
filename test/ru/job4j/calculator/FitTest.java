package ru.job4j.calculator;

import org.junit.Assert;
import org.junit.Test;

public class FitTest {

    @Test
    public void whenMan180Then92() {
        short in = 180;
        double expected = 92;
        double out = Fit.manWeight(in);
        Assert.assertEquals("Тест не пройден!", expected, out, 0.01);
    }

    @Test
    public void whenWoman187Then88and55() {
        short in = 187;
        double expected = 88.55;
        double out = Fit.womanWeight(in);
        Assert.assertEquals("Тест не пройден!", expected, out, 0.01);
    }
}