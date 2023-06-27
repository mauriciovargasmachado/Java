import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int count = 1;
        int sum = 0;

        while(count<=10){
            System.out.println("Please enter the # "+count+ " :");
            String nextNumber = sc.nextLine();
            try {
                int number = Integer.parseInt(nextNumber);
                count++;
                sum += number;
            }
            catch (NumberFormatException nfe){
                System.out.println("invalid Number!!!");
            }
        }
        System.out.println("You have inserted : "+(count-1)+" numbers!!!.");
        System.out.println("The sum of the given numbers is: "+sum);
    }
}