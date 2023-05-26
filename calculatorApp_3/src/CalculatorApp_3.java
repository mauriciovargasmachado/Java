import java.util.Scanner;

public class CalculatorApp_3 {

    public static void main(String[] args) {

        Scanner entry = new Scanner(System.in);

        while (true) {

            System.out.println("*****Calculator App*****");

            showMenu();

            try {

                var operation = entry.nextInt();

                if (operation > 0 && operation < 5) {
                    operationsExecution(operation, entry);
                }

                else if (operation == 5) {
                    System.out.println("End of the program!!!");
                    break;

                } else {
                    System.out.println("Option out of range");
                }

                System.out.println("*****End of operation*****");
            }
            catch(Exception e){
                System.out.println("Error please select again. "+ e.getMessage());
                break;
            }


        }
    }

    private static void showMenu(){

        System.out.println("Please select one of the following options: \n 1. additions. \n 2. substraction. \n 3. multiplication. \n 4. division. \n 5. Salir.");

    }

    private static void operationsExecution(int operation, Scanner entry) {


            System.out.print("Insert your first number: ");
            System.out.println("");
            var number_1 = entry.nextDouble();

            System.out.print("Insert your first number: ");
            System.out.println("");
            var number_2 = entry.nextDouble();

            double result;

            switch (operation) {
                case 1 -> {
                    result = number_2 + number_1;
                    System.out.println("Your result is = " + result);
                }
                case 2 -> {
                    result = number_2 - number_1;
                    System.out.println("Your result is = " + result);
                }
                case 3 -> {
                    result = number_2 * number_1;
                    System.out.println("Your result is = " + result);
                }
                case 4 -> {
                    result = number_2 / number_1;
                    System.out.println("Your result is = " + result);
                }
                default -> {
                    System.out.println("Error");
                }

            }


    }


}
