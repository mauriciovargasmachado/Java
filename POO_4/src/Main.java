import javax.swing.*;

public class Main {
    public static void main(String[] args) {

        int n1 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero: "));
        int n2 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero: "));

        Operaciones op = new Operaciones();

        int suma = op.sumar(n1,n2);
        int resta  = op.restar(n1,n2);
        int multiplicacion = op.multiplicar(n1,n2);
        double division = op.dividir(n1,n2);

        System.out.println(" ");
        // other option is:
        System.out.println(" ");


        System.out.println("The adition of the numbers is: "+op.sumar(n1,n2));
        System.out.println("The adition of the numbers is: "+op.restar(n1,n2));
        System.out.println("The adition of the numbers is: "+op.multiplicar(n1,n2));
        System.out.println("The adition of the numbers is: "+op.dividir(n1,n2));

        op.mostrarResultados(suma, resta, multiplicacion,division);

    }
}