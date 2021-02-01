package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
        int newScore = calculateScore("Tim", 500);
        System.out.println("New score is " + newScore);
        calculateScore(75);
        calculateScore();

        double test = calcFeetAndInchesToCentimeters(6, 0);
        System.out.println(test);

        double test2 = calcFeetAndInchesToCentimeters(157);
        System.out.println(test2);
    }

    // Challenge
     public static double calcFeetAndInchesToCentimeters(double feet, double inches) {
        if (feet >= 0 || inches >= 0 && inches <= 12) {
            double centimeters = feet * 30.48;
            centimeters += inches * 2.54;
            System.out.println(feet + " ft " + inches + " in = " + centimeters + " cm");
            return centimeters;
        } else {
            return -1;
        }
     }

     public static double calcFeetAndInchesToCentimeters(double inches) {
        if (inches >= 0) {
            double feet = (int) inches / 12;
            double remainingInches = (int) inches % 12;
            System.out.println(inches + "in = " + feet + " ft and " + remainingInches + " in");
            return calcFeetAndInchesToCentimeters(feet, remainingInches);
        } else {
            return -1;
        }
     }



    public static int calculateScore(String playerName, int score) {
        System.out.println("Player " + playerName + " scored " + score + " points");
        return score * 100;
    }

    public static int calculateScore(int score) {
        System.out.println("Unnamed player scored " + score + " points");
        return score * 100;
    }

    public static int calculateScore() {
        System.out.println("No player name, no player score");
        return 0;
    }


}
