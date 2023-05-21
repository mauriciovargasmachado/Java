import javax.swing.*;

public class Operaciones {

    // Atributes
    int suma,resta,multiplicacion;
    double division;


    //Methods

    public void sumar(int numero_1,int numero_2){
        suma = numero_1+numero_2;
    }

    public void restar(int numero_1, int numero_2){
        resta = numero_1-numero_2;
    }

    public void multiplicar(int numero_1, int numero_2){
        multiplicacion=numero_1*numero_2;
    }

    public void dividir(double numero_1, double numero_2){
        division = numero_1/numero_2;
    }

    public void mostrarResultados(){

        System.out.println("La suma de los numeros es: "+suma);
        System.out.println("La resta de los numeros es: "+resta);
        System.out.println("La multiplicacion de los numeros es: "+multiplicacion);
        System.out.println("La division de los numeros es: "+division);
    }

}
