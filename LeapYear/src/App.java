import java.util.*;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter year To check whether it is leap year or not:");
        int year = sc.nextInt();

        boolean ans = LeapYear.isLeapYear(year);
        if (ans == true) {
            System.out.println("Yes " + year + " Is LeapYear");
        } else {
            System.out.println(year + " Is Not LeapYear");
        }
        sc.close();
    }
}