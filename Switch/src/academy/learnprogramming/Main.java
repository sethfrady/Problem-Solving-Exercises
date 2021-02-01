package academy.learnprogramming;

import java.util.Locale;

public class Main {

    public static void main(String[] args) {

        int value = 3;

        if (value == 1) {
            System.out.println("Value was 1");
        } else if (value == 2) {
            System.out.println("Value was 2");
        } else {
            System.out.println("Was not 1 or 2");
        }

        int switchValue = 4;

        switch (switchValue) {
            case 1:
                System.out.println("Value was 1");
                break;

            case 2:
                System.out.println("Value was 2");
                break;

            case 3: case 4: case 5:
                System.out.println("Was 3, or 4, or 5");
                System.out.println("Actually it was a switch " + switchValue);
                break;

            default:
                System.out.println("Was not 1 or 2");
                break;
        }

        // Challenge

        char character = 'G';

        switch (character) {
            case 'A':
                System.out.println("Found A");
                break;
            case 'B':
                System.out.println("Found B");
                break;
            case 'C':
                System.out.println("Found C");
                break;
            case 'D':
                System.out.println("Found D");
                break;
            case 'E':
                System.out.println("Found E");
                break;

            default:
                System.out.println("None found");
                break;
        }

        String month = "January";
        switch(month.toLowerCase()) {
            case "january":
                System.out.println("Jan");
                break;
            case "June":
                System.out.println("Jun");
                break;

            default:
                System.out.println("Not sure");
        }
    }
}
