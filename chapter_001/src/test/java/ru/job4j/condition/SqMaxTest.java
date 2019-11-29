package ru.job4j.condition;
import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;
public class SqMaxTest {

    @Test
    public void whatMax () {
        int expected = 77;
        int result = SqMax.max(33,3,77,1);
        assertThat(result, is(expected));
    }


}
