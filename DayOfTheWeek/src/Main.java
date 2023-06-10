import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int i = 0;
        while (i<7) {

            Scanner entry = new Scanner(System.in);
            System.out.println("Please type a number for the day of the week: ");
            printDayOfTheWeek(entry.nextInt());
            i++;
        }
    }

    public static void printDayOfTheWeek(int day){

        String dayOfTheWeek = switch (day){
            case 0 ->{ yield "Sunday";}
            case 1 -> "Monday";
            case 2 -> "Tuesday";
            case 3 -> "Wednesday";
            case 4 -> "Thursday";
            case 5 -> "Friday";
            case 6 -> "Saturday";
            default -> "Invalid Input!!!";
        };

        System.out.println("The " + dayOfTheWeek+ " is the "+day+ " of the week");

    }
}