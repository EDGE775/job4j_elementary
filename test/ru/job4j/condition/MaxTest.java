package ru.job4j.condition;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class MaxTest {

    @Test
    public void whenMax1To2Then2() {
        int result = Max.max(1, 2);
        assertThat(result, is(2));
    }

    @Test
    public void whenMax2To1Then2() {
        int result = Max.max(2, 1);
        assertThat(result, is(2));
    }

    @Test
    public void whenMax5To5Then5() {
        int result = Max.max(5, 5);
        assertThat(result, is(5));
    }

    @Test
    public void whenMax5To6To1Then6() {
        int result = Max.max(5, 6, 1);
        assertThat(result, is(6));
    }

    @Test
    public void whenMax67To55To12To67Then67() {
        int result = Max.max(67, 55, 12, 67);
        assertThat(result, is(67));
    }
}