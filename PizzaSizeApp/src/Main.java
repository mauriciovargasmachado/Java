import javax.swing.*;

public class Main {
    public static void main(String[] args) {

        double smallPizza = 10;

        double mediumPizza = 12;

        double largePizza = 13.5;

        double extraLargePizza = 16;

        double area;

        while (true) {

            int selection = Integer.parseInt(JOptionPane.showInputDialog("***** Wellcome to the pizza size app!!! *****\nPlease select the size of your pizza: \n1 . Small. \n2 . Medium. \n 3 . Large. \n 4 . Extra Large.\n 5 . Exit"));


            switch (selection) {
                case 1 -> {
                    int quantity = Integer.parseInt(JOptionPane.showInputDialog("How many pizzas do you like to order: "));
                    area = quantity*(3.1416 * (smallPizza * smallPizza));
                    JOptionPane.showMessageDialog(null, quantity+" Pizzas have an area of: " + area);
                }
                case 2 -> {
                    int quantity = Integer.parseInt(JOptionPane.showInputDialog("How many pizzas do you like to order: "));
                    area = quantity*(3.1416 * (mediumPizza*mediumPizza));
                    JOptionPane.showMessageDialog(null, quantity+" Pizzas have an area of: " + area);
                }
                case 3 -> {
                    int quantity = Integer.parseInt(JOptionPane.showInputDialog("How many pizzas do you like to order: "));
                    area = quantity*(3.1416 * (largePizza*largePizza));
                    JOptionPane.showMessageDialog(null, quantity+" Pizzas have an area of: " + area);
                }
                case 4 -> {
                    int quantity = Integer.parseInt(JOptionPane.showInputDialog("How many pizzas do you like to order: "));
                    area = quantity*(3.1416 * (extraLargePizza*extraLargePizza));
                    JOptionPane.showMessageDialog(null, quantity+" Pizzas have an area of: " + area);
                }
                case 5->{
                    JOptionPane.showMessageDialog(null,"***** Program Finished *****\nThanks for using the app!!!");
                    break;
                }
            }


        }

    }
}