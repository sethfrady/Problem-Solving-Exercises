public class NumberPalindrome {

    public static boolean isPalindrome(int number) {

        int reverse = 0;
        int start = number;

        while (number != 0) {
            int lastDigit = number % 10;
            reverse = (reverse * 10) + lastDigit;
            number = number / 10;

        }

        return start == reverse;

    }
}
