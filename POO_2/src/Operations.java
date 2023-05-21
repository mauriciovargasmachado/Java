import javax.swing.*;

public class Operations {

    // Atributes
    int numero_1,numero_2,suma,resta,multiplicacion,division;


    //Methods

    public void readNumber(){

        numero_1 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero: "));
        numero_2 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero: "));
    }

    public void sumar(){
        suma = numero_1+numero_2;
    }

    public void restar(){
        resta = numero_1-numero_2;
    }

    public void multiplicar(){
        multiplicacion = numero_1*numero_2;
    }

    public void dividir(){
        division = numero_1/numero_2;
    }

    public void mostrarResultados(){
        System.out.println("El primer numero es: "+numero_1);
        System.out.println("El segundo numero es: "+numero_2);
        System.out.println("La suma de los numeros es: "+suma);
        System.out.println("La resta de los numeros es: "+resta);
        System.out.println("La multiplicacion de los numeros es: "+multiplicacion);
        System.out.println("La division de los numeros es: "+division);
    }

}
