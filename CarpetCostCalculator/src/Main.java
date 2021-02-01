public class Main {

    public static void main(String[] args) {

        Floor floor = new Floor(2.75,4.0);
        Carpet carpet = new Carpet(3.5);
        Calculator calc = new Calculator(floor, carpet);
        System.out.println("Total = " + calc.getTotalCost());
    }
}
