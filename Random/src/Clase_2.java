import java.util.Random;

public class Clase_2 {
    public static void main(String[] args) {

        double number = 0;

        Random r1 = new Random();

        number = (int)(r1.nextDouble()*100);

        System.out.println(number);

    }
}
