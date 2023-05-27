
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner entry = new Scanner(System.in);

        List<Person> listOfPeople = new ArrayList<>();

        while (true) {

            showMenu();

            try {
                execution(entry, listOfPeople);
                break;
            }
            catch(Exception e){
                System.out.println("Error: "+ e.getMessage());
            }
        }
    }
    private static void showMenu(){
        System.out.println("""
               ***** List of people App *****
               1. Show list.
               2. Add to the list.
               3. Exit.
               """);
            System.out.println(" Please select one option");
        }

        private static void execution(Scaner entry,list<Person> listOfPeople){
            var option = entry.nextInteger();
            brake;
        }

}