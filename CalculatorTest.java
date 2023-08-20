import org.junit.Test;

import static org.junit.Assert.*;

public class CalculatorTest {
    @Test
    public void add () {
    int result = Addition.add (3,2);
    assertEquals(5,result);
    }
}