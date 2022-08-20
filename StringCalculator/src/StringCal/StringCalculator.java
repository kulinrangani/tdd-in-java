package StringCal;

public class StringCalculator {

    public static int add(String String_value) {
        int sum = 0;
        String_value = String_value.replaceAll(" ", ""); // Removing Space
        String_value = String_value.replaceAll("\n", ","); //

        if (String_value.equals("")) {
            return 0;
        }
        if (String_value.length() >= 1) {
            String[] arr = String_value.split(",");
            for (int i = 0; i < arr.length; i++) {
                int num = Integer.parseInt(arr[i]);
                sum = sum + num;
            }
            return sum;
        }
        return 1;
    }
}
