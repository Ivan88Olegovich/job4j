package ru.job4j.condition;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class MaxTest {
    @Test
    public void whenMax1To2Then2() {
        int result = Max.max(1, 2);
        assertThat(result, is(2));
    }
    @Test
    public void whenMaxTo3Then3() {
        int result = Max.max(1, 2, 3);
        assertThat(result, is(3));
    }
    @Test
    public void whenMaxTo4Then4() {
        int result = Max.max(1, 7, 3, 4);
        assertThat(result, is(7));
    }

}
