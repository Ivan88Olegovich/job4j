package condition;

import org.junit.Assert;
import org.junit.Test;
import ru.job4j.condition.SqArea;

public class SqAreaTest {

    @Test
    public void square(){
        int in_p = 6;
        int in_k = 2;
        double expected = 2;
        double out = SqArea.square(in_p, in_k);
        Assert.assertEquals(expected, out, 0.001);

    }

}
