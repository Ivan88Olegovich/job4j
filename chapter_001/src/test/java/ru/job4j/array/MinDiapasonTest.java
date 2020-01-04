package ru.job4j.array;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;


public class MinDiapasonTest {
    @Test
    public void whenFirstMin(){
        int [] input = new int[]{-1, 0, 5, 10};
        int start = 1;
        int finish = 3;
        int result = MinDiapason.findMin(input,start,finish);
        int expected = 0;
        assertThat(result, is(expected));
    }
    @Test
    public void whenMiddleMin(){
        int [] input = new int[]{10, 2, 5, 1};
        int start = 0;
        int finish = 2;
        int result = MinDiapason.findMin(input,start,finish);
        int expected = 2;
        assertThat(result, is(expected));
    }
    @Test
    public void whenLastMin(){
        int [] input = new int[]{10, 5, 3, 1};
        int start = 1;
        int finish = 3;
        int result = MinDiapason.findMin(input,start,finish);
        int expected = 3;
        assertThat(result, is(expected));
    }
}
