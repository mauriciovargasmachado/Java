package operaciones;

import java.util.Scanner;

public class ClasePadre {

    Scanner sc = new Scanner(System.in);

    protected int valor_1,valor_2,resultado;

    public void PedirDatos(){
        System.out.println("Por favor ingrese el primer valor: ");
        valor_1 = sc.nextInt();
        System.out.println("Por favor ingrese el segundo valor: ");
        valor_2 = sc.nextInt();
    }

    public void MostrarResultado(){
        System.out.println("El resultado es: "+resultado);
    }

}
