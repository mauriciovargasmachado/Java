import javax.swing.*;

public class Main {

    public static void main(String[] args) {

        int n1 = Integer.parseInt(JOptionPane.showInputDialog("Please Insert your first number"));
        int n2 = Integer.parseInt(JOptionPane.showInputDialog("Please Insert your first number"));

        Operation_2 op = new Operation_2();

        op.Addition(n1,n2);
        op.Substraction(n1,n2);
        op.Multiplication(n1,n2);
        op.Division(n1,n2);

        op.showResults();

    }

}
