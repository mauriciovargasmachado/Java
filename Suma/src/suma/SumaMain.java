package suma;

import java.util.Scanner;

public class SumaMain {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Por favor digite el primer valor: ");
        int n1 = scanner.nextInt();

        System.out.println("Por favor digite el segundo valor: ");
        int n2 = scanner.nextInt();

        Suma s1 = new Suma(n1,n2);

        s1.showData();

    }
}
