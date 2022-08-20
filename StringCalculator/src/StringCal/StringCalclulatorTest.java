package StringCal;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class StringCalclulatorTest {
    StringCalculator sc;

    @Before
    public void initializeResouces() {
        sc = new StringCalculator();
    }

    @Test
    public void returnZeroIfStringIsEmpty() {
        int expectedValue = 0;
        assertEquals(expectedValue, sc.add(""));
    }

    @Test
    public void returnZeroIfStringIsWithEmptySpace() {
        int expectedValue = 0;
        assertEquals(expectedValue, sc.add(" "));
    }

    @Test
    public void returnSumIfStringIsNotEmpty() {
        assertEquals(6, sc.add("1,2,3"));
    }

    @Test
    public void returnSumIfStringIsHasSlaceN() {
        assertEquals(6, sc.add("1 \n 2,3"));
    }
}
