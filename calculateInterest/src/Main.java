public class Main {
    public static void main(String[] args) {

        for(double rate = 1.0; rate < 10.0; rate++){
            double interstAmount = calculateInterest(10000,rate);
            System.out.println("$10.000 at "+rate+" % interest are: $"+interstAmount);
        }
    }

    public static double calculateInterest(double amount, double intersRate){

        return (amount*(intersRate/100));
    }
}