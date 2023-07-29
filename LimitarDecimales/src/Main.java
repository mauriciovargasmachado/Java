import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double number;

        double raiz;

        System.out.println("Por favor ingrese un numero: ");
        number = sc.nextDouble();

        raiz = Math.sqrt(number);


        System.out.println("La raiz cuadrada es: "+String.format("%.4f",raiz));

        System.out.println("La raiz cuadrada es: "+(double)Math.round(raiz*10000d)/10000);
    }
}