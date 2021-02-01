package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {

        byte newByteValue = 10;
        short newShortValue = 20;
        int newIntValue = 50;
        long newLongTotal = 50000L + 10L * (newByteValue + newShortValue + newIntValue);
        System.out.println("The long value is " + newLongTotal);
    }
}
