public class Vehicle {

    private String brand;

    private String model;

    private float price;

    public Vehicle(String brand, String model, float price) {
        this.brand = brand;
        this.model = model;
        this.price = price;
    }

    public float getPrice() {
        return price;
    }

    public String showData(){
        return "The Brand of the vehicle is: "+brand+" The Model of the vehicle is: "+model+" The price of the vehicle is: "+price;

    }
}
