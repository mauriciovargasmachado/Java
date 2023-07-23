package area;

import java.util.Scanner;

public class RectanguloMain {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese el valor de la base del rectangulo: ");
        int base = sc.nextInt();

        System.out.println("Ingrese el valor de del lado del rectangulo: ");
        int lado = sc.nextInt();

        Rectangulo r1 = new Rectangulo(base,lado);

        r1.showData();

    }
}
