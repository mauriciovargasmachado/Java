import java.util.Scanner;

public class Main {

    public static double biggerArea(Triangle triangles[]){
        double area;

        area = triangles[0].getArea();
        for (int i=1;i<triangles.length;i++){
            if(triangles[i].getArea()>area){
                area = triangles[i].getArea();
            }
        }
        return area;
    }



    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double base,side;

        int numberOfTriangles;

        System.out.println("Please insert the number of triangles to create: ");
        numberOfTriangles = sc.nextInt();

        Triangle triangles[] = new Triangle[numberOfTriangles];

        for(int i=0; i<numberOfTriangles;i++){
            System.out.println("Ingrese los valores del triangulo No "+(i+1)+":");
            System.out.println("Ingrese los valores de la base:");
            base = sc.nextDouble();
            System.out.println("Ingrese los valores del lado:");
            side = sc.nextDouble();

            triangles[i]= new Triangle(base,side);

            System.out.println("El Perimetro del triangulo es: "+triangles[i].getPerimeter());
            System.out.println("El Area del triangulo es: "+triangles[i].getArea());
        }
        System.out.println("/nThe triangle with the biggest area typed was: "+ biggerArea(triangles));
    }
}