package ru.job4j.array;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class MinTest {
    @Test
    public void whenFirstMin() {
        int[] input = new int[]{0, 5, 10};
        int result = Min.findMin(input);
        int expected = 0;
        assertThat(result, is(expected));
    }
    @Test
    public void whenLastMin() {
        int[] input = new int[]{10, 5, 3};
        int result = Min.findMin(input);
        int expected = 3;
        assertThat(result, is(expected));
    }
    @Test
    public void whenMiddleMin() {
        int[] input = new int[]{10, 2, 5};
        int result = Min.findMin(input);
        int expected = 2;
        assertThat(result, is(expected));
    }
}
