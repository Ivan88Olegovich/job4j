package condition;

import org.junit.Assert;
import org.junit.Test;
import ru.job4j.condition.Point;

public class PointTest {
    @Test
    public void distence() {
        int in = 0;
        int in2 = 0;
        int in3 = 2;
        int in4 = 0;
      double expected = 2;
       double out = Point.distence(in, in2, in3, in4);
        Assert.assertEquals(expected, out, 0.01);
    }
}

