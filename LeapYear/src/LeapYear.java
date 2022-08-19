class LeapYear {

    public static boolean isLeapYear(int no) {
        if (no % 4 != 0) {
            return false;
        } else if (no % 4 == 0 && no % 100 != 0) {
            return true;
        } else if (no % 100 == 0 && no % 400 != 0) {
            return false;
        } else if (no % 400 == 0) {
            return true;
        } else
            return false;
    }
}
