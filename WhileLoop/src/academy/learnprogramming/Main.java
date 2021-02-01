package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
        int count = 6;
//        while (count != 6) {
//            System.out.println("Count value is " + count);
//            count++;
//        }
//
////        count = 1;
////        while (true) {
////            if (count == 6) {
////                break;
////            }
////
////            System.out.println("Count value is " + count);
////            count++;
////        }

//        count = 1;
//        do {
//            System.out.println("Count value was " + count);
//            count++;
//
//            if (count > 100) {
//                break;
//            }
//        } while (count != 6);

        boolean test = isEvenNumber(2);
        System.out.println(test);

        int number = 4;
        int finishNumber = 20;
        int found = 0;

        while (number <= finishNumber) {
            number++;
            if (!isEvenNumber(number)) {
                continue;
            }

            System.out.println("Even number " + number);
            found++;
            if (found >= 5) {
                break;
            }
        }

        System.out.println("Found " + found + " even numbers");


    }

    public static boolean isEvenNumber(int number) {
        if (number % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }
}
