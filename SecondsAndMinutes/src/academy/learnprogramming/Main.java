package academy.learnprogramming;

public class Main {

    private static final String INVALID_VALUE_MESSAGE = "Invalid value";


    public static void main(String[] args) {

        String test = getDurationString(59, 22);
        System.out.println(test);

        String test2 = getDurationString(20111);
        System.out.println(test2);

        String test3 = getDurationString(-41);
        System.out.println(test3);

        String test4 = getDurationString(65, 9);
        System.out.println(test4);

        String test5 = getDurationString(75, 59);
        System.out.println(test5);


    }

    public static String getDurationString(int minutes, int seconds) {

        if ((minutes >= 0) && (seconds >= 0 && seconds <= 59)) {
            int hours = minutes / 60;
            int remainingMinutes = minutes % 60;

            String hoursString = hours + "h";
            if (hours < 10) {
                hoursString = "0" + hoursString;
            }

            String minutesString = remainingMinutes + "m";
            if (remainingMinutes < 10) {
                minutesString = "0" + minutesString;
            }

            String secondsString = seconds + "s";
            if (seconds < 10) {
                secondsString = "0" + secondsString;
            }

            return hoursString + " " + minutesString + " " + secondsString + " ";
        }

        return INVALID_VALUE_MESSAGE;
    }

    public static String getDurationString(int seconds) {

        if (seconds >= 0) {
            int minutes = seconds / 60;
            int remainingSeconds = seconds % 60;
            return getDurationString(minutes, remainingSeconds);
        }

        return INVALID_VALUE_MESSAGE;
    }
}
