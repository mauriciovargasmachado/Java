public class Cuadrilatero {

    //atributes
    private float side_1;

    private float side_2;

    //Methods

    //first constructor
    public Cuadrilatero(float side_1, float side_2) {
        this.side_1 = side_1;
        this.side_2 = side_2;
    }

    public Cuadrilatero(float side_1) {
        this.side_1 =this.side_2= side_1;
    }

    public float getPerimeter(){
        float perimeter = side_1+side_2;
        return perimeter;
    }

    public float getArea(){
        float area = side_1*side_2;
        return area;
    }




}
