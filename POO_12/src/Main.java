import javax.swing.*;

public class Main {

    public static int CheapCarIndex(Vehicle cars[]){
        float price;
        int index = 0;

        price = cars[0].getPrice();

        for(int i=1;i<cars.length;i++){
            if(cars[i].getPrice()<price){
                price = cars[i].getPrice();
                index=i;
            }
        }
        return index;
    }


    public static void main(String[] args) {

        String brand, model;

        float price;

        int numberOfVehicles;

        numberOfVehicles = Integer.parseInt(JOptionPane.showInputDialog("Please insert the number of vehicles: "));

        Vehicle cars[] = new Vehicle[numberOfVehicles];

        for(int i=0;i<cars.length;i++){

            JOptionPane.showMessageDialog(null,"Please insert the characteristics of vehicle "+(i+1)+".");
            brand = JOptionPane.showInputDialog(null,"Please insert the brand of the vehicle: ");
            model = JOptionPane.showInputDialog(null,"Please insert the model of the vehicle: ");
            price = Float.parseFloat(JOptionPane.showInputDialog(null,"Please insert the price of the vehicle: "));

            cars[i]= new Vehicle(brand,model,price);

        }




    }
}