package FizzBuzz;

public class FizzBuzz {
    public static String getFizzBuzz(int no) {
        if (no % 3 == 0 && no % 5 == 0) {
            return "FizzBuzz";
        }
        if (no % 3 == 0) {
            return "Fizz";
        }
        if (no % 5 == 0) {
            return "Buzz";
        }
        return String.valueOf(no);
    }
}
