package FizzBuzz;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class FizzBuzzTest {

    @Test
    public void ExchangeFizzWithThree() {
        int inputValue = 3;
        String expectedValue = "Fizz";
        String actualValue = FizzBuzz.getFizzBuzz(inputValue);

        assertEquals("If No. is multipale of 3 Than print Fizz", expectedValue, actualValue);
    }

    @Test
    public void ExchangeBuzzWithFive() {
        int inputValue = 10;
        String expectedValue = "Buzz";
        String actualValue = FizzBuzz.getFizzBuzz(inputValue);
        assertEquals("If No. is Multiple of 5 than exchange with Buzz ", expectedValue, actualValue);
    }

    @Test
    public void ExchangeFizzBuzzWithMultipleOfThreeAndFive() {
        int inputvalue = 30;
        String expectedValue = "FizzBuzz";
        String actualValue = FizzBuzz.getFizzBuzz(inputvalue);
        assertEquals("If No. i Multiple of 3 & 5 Than Exchange with FizzBuzz", expectedValue, actualValue);
    }
}
