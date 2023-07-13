import javax.swing.*;

public class Main {

    public static void main(String[] args) {

        int n1 = Integer.parseInt(JOptionPane.showInputDialog("Please Insert your first number"));
        int n2 = Integer.parseInt(JOptionPane.showInputDialog("Please Insert your first number"));

        Operation_3 op = new Operation_3();

        int add = op.Addition(n1,n2);
        int subs = op.Substraction(n1,n2);
        int mult = op.Multiplication(n1,n2);
        int div = op.Division(n1,n2);

        op.showResults(add,subs,mult,div);

    }

}
