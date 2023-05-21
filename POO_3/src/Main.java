import javax.swing.*;

public class Main {
    public static void main(String[] args) {

        int n1 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero: "));
        int n2 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero: "));

        Operaciones op = new Operaciones();

        op.sumar(n1,n2);
        op.restar(n1,n2);
        op.multiplicar(n1,n2);
        op.dividir(n1,n2);

        op.mostrarResultados();

    }
}