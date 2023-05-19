import javax.swing.*;

public class Car {

    String color;
    String brand;
    int km;



    public static void main(String[]args){

        Car car_1 = new Car();

        car_1.brand = "Mazda";
        car_1.color= "Grey";
        car_1.km = 123456;

        JOptionPane.showMessageDialog(null,"You have a "+car_1.color+" car of the "+car_1.brand+" brand, with "+ car_1.km+" kilometers.");


        Car car_2 = new Car();

        car_2.brand = "Toyota";
        car_2.color= "Red";
        car_2.km = 5887;

        JOptionPane.showMessageDialog(null,"You have a "+car_2.color+" car of the "+car_2.brand+" brand, with "+ car_2.km+" kilometers.");

    }


}
