package ru.job4j.loop;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class FactorialTest {
    @Test
    public void whenCalculateFactorialForFiveThenOneHundreedTwenty() {
        int rsl = Factorial.calc(5);
        assertThat(rsl, is(120));
    }

    @Test
    public void whenCalculateFactorialForZeroThenOne() {
        int rsl = Factorial.calc(0);
        assertThat(rsl, is(1));
    }

    @Test
    public void whenCalculateFactorialForOneThenOne() {
        int rsl = Factorial.calc(1);
        assertThat(rsl, is(1));
    }
}