package StringCal;

public class StringCalculator {

    public int add(String String_value) {
        int sum = 0;
        String_value = String_value.replaceAll(" ", ""); // Removing Space
        String_value = String_value.replaceAll("\n", ","); // Replacing \n with ,

        if (String_value.equals("")) {
            return 0;
        } else if (String_value.length() >= 1) {
            String[] arr = String_value.split(",");
            for (int i = 0; i < arr.length; i++) {
                int num = Integer.parseInt(arr[i]);
                sum = sum + num;
            }
            return sum;
        } else if()
        return 1;
    }
}
