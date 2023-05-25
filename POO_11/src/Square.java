public class Square {


    // Atributes

    private float side_1;
    private float side_2;

    // constructor
    public Square(float side_1, float side_2) {
        this.side_1 = side_1;
        this.side_2 = side_2;
    }

    public Square(float side_1) {
        this.side_1 = this.side_2 = side_1;
    }

    public float getPerimeter(){
        float perimeter = 2*(side_1+side_2);
        return perimeter;
    }

    public float getArea(){
        float area = side_1*side_2;
        return area;
    }

}
