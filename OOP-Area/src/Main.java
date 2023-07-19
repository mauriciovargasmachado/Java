import javax.swing.*;

public class Main {
    public static void main(String[] args) {

    Cuadrilatero C1;

    float side_1;
    float side_2;

    side_1 = Float.parseFloat(JOptionPane.showInputDialog("Insert your first side: "));
    side_2 = Float.parseFloat(JOptionPane.showInputDialog("Insert your second side: "));

    if (side_1 == side_2){
        C1=new Cuadrilatero(side_1);
    }
    else {
        C1 = new Cuadrilatero(side_1,side_2);
    }

    System.out.println("The perimeter is: "+C1.getPerimeter());
    System.out.println("The area is: "+C1.getArea());


    }
}