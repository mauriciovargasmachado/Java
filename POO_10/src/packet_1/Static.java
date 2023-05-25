package packet_1;

public class Static {

    private static String text = "First text line";

    public static int Sumar(int number_1,int number_2){
        int suma = number_1+number_2;
        return suma;
    }

    public static void main(String[] args) {
        Static object_1 = new Static();

        System.out.println(object_1.text);

        Static object_2 = new Static();
        object_2.text = "Second text line";

        System.out.println(object_2.text);

        System.out.println(Static.text);

        System.out.println(Static.Sumar(3,5));
    }



}
