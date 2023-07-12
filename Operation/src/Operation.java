import javax.swing.*;

public class Operation {

    // atributes

    int number_1;
    int number_2;
    int addition;
    int subtraction;
    int multiplication;
    int division;


    // Methods

    // We create a methods to ask the user to input two numbers.
    public void readNumbers(){
        number_1 = Integer.parseInt(JOptionPane.showInputDialog("Please type a number: "));
        number_2 = Integer.parseInt(JOptionPane.showInputDialog("Please type a number: "));
    }

    public void Addition(){
        addition = number_1+number_2;
    }
    public void Substraction(){
        subtraction = number_1-number_2;
    }
    public void Multiplication(){
        multiplication = number_1*number_2;
    }
    public void Division(){
        division = number_1/number_2;
    }
    public void showResults(){
        System.out.println("The addition is: "+addition);
        System.out.println("The addition is: "+subtraction);
        System.out.println("The addition is: "+multiplication);
        System.out.println("The addition is: "+division);

    }

}
