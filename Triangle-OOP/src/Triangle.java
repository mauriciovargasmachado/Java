public class Triangle {

    //Atributes
    double base;
    double side;

    //Methods

    public Triangle(double base, double side) {
        this.base = base;
        this.side = side;
    }

    public double getPerimeter(){
        double perimeter = (2*side)+base;
        return perimeter;
    }

    public double getArea(){
        double area = (base*Math.sqrt((side*side)-((base*base)/4)))/2 ;
        return area;
    }

}
