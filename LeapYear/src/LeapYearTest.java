import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class LeapYearTest {

    @Test
    public void yearDivisibleByFourHundredAreLeapYear() {
        int inputValue = 800;
        boolean actualValue = LeapYear.isLeapYear(inputValue);
        assertTrue("If Year IS Dividible By Four Hundred is Leapyear", actualValue);
    }

    @Test
    public void yearDivisibleByHundredButNotByFourHundredAreNotLeapYear() {
        int inputValue = 1700;
        boolean actualValue = LeapYear.isLeapYear(inputValue);
        assertFalse("If year is Divisible Hundred But Not By FourHundred Are Not LeapYear", actualValue);
    }

    @Test
    public void yearDividedByFourButNotByHundredAreLeapYear() {
        int inputValue = 2008;
        boolean actualValue = LeapYear.isLeapYear(inputValue);
        assertTrue("If Year is Divisible by Four But Not Divided By Hundred Are Leapyear", actualValue);
    }

    @Test
    public void yearNotDivisibleByFourAreNotLeapYear() {
        int inputValue = 2017;
        boolean actualValue = LeapYear.isLeapYear(inputValue);
        assertFalse("If Year is not divisible by 4 than it is not a leapyear ", actualValue);
    }
}