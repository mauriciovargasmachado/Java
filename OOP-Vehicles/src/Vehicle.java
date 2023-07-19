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
        return ("The brand of your vehicle is: "+brand+"/nThe model of your vehicle is: "+model+"/nThe price of you vehicle is: "+price);
    }
}
