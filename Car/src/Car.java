public class Car {

    private String make = "testla";
    private String model = "Model x";
    private String color = "White";
    private String doors = "two";
    private boolean convertible = true;

    public String getMake(){
        return make;
    }

    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }

    public String getDoors() {
        return doors;
    }

    public boolean isConvertible() {
        return convertible;
    }

    public void CarDescription(){

        System.out.println(doors + " -Door " +
                color +" "+
                make  +" "+
                model +" "+
                        (convertible? " Convertible" : " "));

    }




}
