import java.util.Scanner;

public class ConConstructor {

    public ConConstructor(){
        Scanner sc = new Scanner(System.in);
        String name;

        System.out.println("What is your name?: ");
        name=sc.nextLine();
        System.out.println(("Your name is: "+name));

    }

}
