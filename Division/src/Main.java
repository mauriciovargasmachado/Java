import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        try{
            Scanner sc = new Scanner(System.in);

            int valor_1,valor_2,resultado;

            System.out.println("Por favor ingrese el primer valor: ");
            valor_1 = sc.nextInt();

            System.out.println("Por favor ingrese el segundo valor: ");
            valor_2 = sc.nextInt();

            resultado = valor_1/valor_2;

            System.out.println("La division es: "+resultado);

        }catch (Exception e){
            System.out.println("Error!!!"+e);
        }finally {
            System.out.println("Operacion concluida!!!");
        }

    }
}