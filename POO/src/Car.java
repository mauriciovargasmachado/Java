public class Car {

    String color;
    String brand;
    int Kilometers;

    // Method


    public static void main(String[] args) {

        Car car_1 = new Car();
        Car car_2 = new Car();
        Car car_3 = new Car();
        Car car_4 = new Car();


        car_1.brand = "Toyota";
        car_1.color = "White";
        car_1.Kilometers = 15000;

        System.out.println("The color of car_1 is : " + car_1.color);
        System.out.println("The brand of car_1 is : " + car_1.brand);
        System.out.println("The kilometers of car_1 are: "+car_1.Kilometers);
        System.out.println("*******");

        car_2.brand = "Lamborgini";
        car_2.color = "Red";
        car_2.Kilometers = 20000;

        System.out.println("The color of car_2 is : " + car_2.color);
        System.out.println("The brand of car_2 is : " + car_2.brand);
        System.out.println("The kilometers of car_2 are: "+car_2.Kilometers);
        System.out.println("*******");

        car_3.brand = "Tesla";
        car_3.color = "Black";
        car_3.Kilometers = 56000;

        System.out.println("The color of car_2 is : " + car_3.color);
        System.out.println("The brand of car_2 is : " + car_3.brand);
        System.out.println("The kilometers of car_2 are: "+car_3.Kilometers);
        System.out.println("*******");

        car_4.brand = "Mazda";
        car_4.color = "Green";
        car_4.Kilometers = 68000;

        System.out.println("The color of car_2 is : " + car_4.color);
        System.out.println("The brand of car_2 is : " + car_4.brand);
        System.out.println("The kilometers of car_2 are: "+car_4.Kilometers);
        System.out.println("*******");

    }





}
