import java.util.Scanner;

public class Main {

    public static void main(String [] args) {

        Scanner entry = new Scanner(System.in);

        int number = entry.nextInt();

        System.out.println("It is "+isPalindrome(number));

    }

    public static boolean isPalindrome(int number){

        int reverse = 0;
        int originalNumber = number;

        while (number !=0){
            int lastDigit = number % 10;
            reverse = (reverse * 10) + lastDigit;
            number /= 10;
        }

        return originalNumber == reverse;

    }
}