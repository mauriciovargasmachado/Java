import javax.swing.*;

public class Main {
    public static void main(String[] args) {

       double smallPizza = 10;

        double mediumPizza = 12;

        double largePizza =13.5;

        double extraLargePizza =16;

        double area;

        int selection = Integer.parseInt(JOptionPane.showInputDialog("Please select the size of your pizza: \n1 . Small. \n2 . Medium. \n 3 . Large. \n 4 . Extra Large."));

        switch (selection){
            case 1->{
                area = 3.1416*(smallPizza*smallPizza);
                JOptionPane.showMessageDialog(null,"The area of your pizza is: "+area);
            }
            case 2->{
                area = 3.1416*(mediumPizza*mediumPizza);
                JOptionPane.showMessageDialog(null,"The area of your pizza is: "+area);
            }
            case 3->{
                area = 3.1416*(largePizza*largePizza);
                JOptionPane.showMessageDialog(null,"The area of your pizza is: "+area);
            }
            case 4->{
                area = 3.1416*(extraLargePizza*extraLargePizza);
                JOptionPane.showMessageDialog(null,"The area of your pizza is: "+area);
            }
        }
    }
}