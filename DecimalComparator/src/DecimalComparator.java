public class DecimalComparator {

    public static boolean areEqualByThreeDecimalPlaces(double value, double value2) {

        value = value * 1000;
        value2 = value2 * 1000;

        if ((int) value == (int) value2) {
            return true;
        }

        return false;
    }
}
