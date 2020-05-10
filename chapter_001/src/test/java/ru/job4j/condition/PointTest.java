package ru.job4j.condition;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class PointTest {
    Point a = new Point(1, 2, 3);
    Point b = new Point(1, 2, 3);

    @Test
    public void whatDistance() {
    double result = a.distance(b);
    assertThat(result, is(0.0));
    }
    @Test
    public void whatDistance3D() {
        double result = a.distance(b);
        assertThat(result, is(0.0));
    }
}
