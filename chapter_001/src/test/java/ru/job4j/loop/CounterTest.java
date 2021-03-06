package ru.job4j.loop;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
public class CounterTest {
    Counter counter = new Counter();
    @Test
    public void whenSumEvenNumbersFromOneToTenThenThirty() {
        int expected = 30;
        int result = counter.add(0, 10);
        assertThat(result, is(expected));
    }
}
