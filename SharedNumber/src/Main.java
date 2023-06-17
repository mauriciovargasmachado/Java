public class Main {
    public static void main(String [] args) {

        System.out.println(hasSharedDigit (12.23));

    }

    public static boolean hasSharedDigit(double fNumber, double sNumber) {

        if(fNumber >= 10 && fNumber <= 99 && sNumber >= 10 && sNumber >=10 && sNumber <=99 || fNumber / 10 == sNumber / 10 || fNumber %  10 = sNumber / 10){

            return true;

        }
        return false;
    }


}
