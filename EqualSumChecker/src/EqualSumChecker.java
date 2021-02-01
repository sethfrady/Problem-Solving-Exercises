public class EqualSumChecker {

    public static boolean hasEqualSum(int value, int value2, int value3) {

        int sum = value + value2;

        if (sum == value3) {
            return true;
        }

        return false;
    }
}
