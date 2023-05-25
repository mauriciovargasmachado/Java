import javax.swing.*;

public class Main {
    public static void main(String[] args) {

    Square square_1;
    float side_1,side_2;

    side_1= Float.parseFloat(JOptionPane.showInputDialog("Please insert the mesure of the first side of your square: "));

    side_2= Float.parseFloat(JOptionPane.showInputDialog("Please insert the mesure of the second side of your square: "));

        if (side_1==side_2){
            square_1 = new Square(side_1);
            JOptionPane.showMessageDialog(null,"the value of the perimeter is: "+square_1.getPerimeter());
        }
        else{
            square_1 = new Square(side_1,side_2);
            JOptionPane.showMessageDialog(null,"the value of the area is: "+square_1.getArea());
        }





    }
}