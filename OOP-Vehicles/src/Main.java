import java.util.Scanner;

public class Main {

    public static int cheapVehicleIndex(Vehicle vehiculos[]){
        float price;
        int index=0;

        price = vehiculos[0].getPrice();
        for(int i=1; i<vehiculos.length;i++){

            if (vehiculos[i].getPrice()<price){
                price = vehiculos[i].getPrice();
                index =i;
            }

        }
        return index;
    }

    public static void main(String[] args) {

        String brand, model;
        float price;
        int vehiclesNumber;

        Scanner sc = new Scanner(System.in);

        System.out.println("Please insert the amount of vehicles: ");
        vehiclesNumber = sc.nextInt();


        // We create the objects for the vehicles.

        Vehicle vehiculos[] = new Vehicle[vehiclesNumber];

        for(int i=0; i<vehiculos.length;i++){

            System.out.println("Please type the characteristic of vehicule No. "+(i+1)+": ");
            System.out.println("Please insert the brand of your vehicle: ");
            brand = sc.nextLine();
            System.out.println("Please insert the model of your vehicle: ");
            model = sc.nextLine();
            System.out.println("Please insert the price of your vehicle: ");
            price = sc.nextFloat();

            vehiculos[i]= new Vehicle(brand,model,price);
        }



    }
}