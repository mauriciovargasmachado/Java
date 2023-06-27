import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

    }

    public static void inputThenPrintSumAndAverage() {

        Scanner scanner = new Scanner(System.in);

        int sum = 0;
        int counter = 0;
        long average = 0;

        while (true) {

            boolean isAnInt = scanner.hasNextInt();

            if (isAnInt) {
                int num = scanner.nextInt();
                counter++;
                sum += num;
                average = Math.round((double) sum / counter);
            } else {
                break;
            }

            scanner.nextLine();// handles input keyboard
        }
        System.out.println("SUM = " + sum + " AVG = " + average);
        scanner.close();
    }
}