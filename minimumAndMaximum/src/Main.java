import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double max = 0;
        double min = 0;
        int count =0;

        while (true){
            System.out.println("Enter a number o a character to exit.");
            String newEntry = sc.nextLine();
            try{
                Double.parseDouble(newEntry);
            }
            catch (NumberFormatException nfe){
                break;
            }
        }


    }
}