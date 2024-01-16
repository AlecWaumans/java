package g58399.dev2.td04;

import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author alecw
 */
public class NumbersTest {

    public NumbersTest() {
    }

    @Test
    public void testSum_allStrictlyPositives() {
        Numbers instance = new Numbers();
        instance.add(4);
        instance.add(12);
        instance.add(52);
        Integer expResult = 68;
        Integer result = instance.sum();
        assertEquals(expResult, result);
    }

    @Test
    public void testDeleteMinEtMax() {
        Numbers list = new Numbers();
        Numbers expected = new Numbers();
        list.add(1);
        list.add(4);
        list.add(2);
        list.add(0);
        expected.add(1);
        expected.add(2);
        list.removeMinAndMax();
        assertEquals(list, expected);
    }
}
