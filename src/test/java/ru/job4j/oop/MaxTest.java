package ru.job4j.oop;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class MaxTest {

    @Test
    public void whenMax1To2Then2() {
        int left = 1;
        int right = 2;
        int result = Max.max(left, right);
        int expected = 2;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void whenMax6To4Then6() {
        int left = 6;
        int right = 4;
        int result = Max.max(left, right);
        int expected = 6;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void whenMax6To3To41Then41() {
        int first = 6;
        int second = 3;
        int third = 41;
        int result = Max.max(first, second, third);
        int expected = 41;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void whenMax8To33To4Then33() {
        int first = 8;
        int second = 33;
        int third = 4;
        int result = Max.max(first, second, third);
        int expected = 33;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void whenMax54To11To2To99Then99() {
        int first = 54;
        int second = 11;
        int third = 2;
        int fourth = 99;
        int result = Max.max(first, second, third, fourth);
        int expected = 99;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void whenMax18To18To18To18Then18() {
        int first = 18;
        int second = 18;
        int third = 18;
        int fourth = 18;
        int result = Max.max(first, second, third, fourth);
        int expected = 18;
        assertThat(result).isEqualTo(expected);
    }
}