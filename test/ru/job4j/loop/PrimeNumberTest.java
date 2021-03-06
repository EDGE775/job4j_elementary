package ru.job4j.loop;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class PrimeNumberTest {

    @Test
    public void when5() {
        int count = PrimeNumber.calc(5);
        assertThat(count, is(3));
    }

    @Test
    public void when11() {
        int count = PrimeNumber.calc(11);
        assertThat(count, is(5));
    }

    @Test
    public void when2() {
        int count = PrimeNumber.calc(2);
        assertThat(count, is(1));
    }

    @Test
    public void when1() {
        int count = PrimeNumber.calc(1);
        assertThat(count, is(0));
    }

    @Test
    public void when12() {
        int count = PrimeNumber.calc(12);
        assertThat(count, is(5));
    }
}