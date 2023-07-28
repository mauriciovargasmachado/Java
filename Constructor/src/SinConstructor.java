import java.util.Scanner;

public class SinConstructor {

    private Scanner sc = new Scanner(System.in);
    String name;

    public void AskData(){
        System.out.println("Please write your name: ");
        name = sc.nextLine();
    }

    public void showData(){
        System.out.println("Su nombre es: "+name);
    }

}
