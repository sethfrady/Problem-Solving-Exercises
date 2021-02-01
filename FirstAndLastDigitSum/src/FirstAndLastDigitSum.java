public class FirstAndLastDigitSum {

    public static int sumFirstAndLastDigit(int number) {

        if (number >= 0) {
            int remainder = number % 10;

            while (number >= 10) {
                number /= 10;
            }

            return remainder + number;
        }

        return -1;
    }
}