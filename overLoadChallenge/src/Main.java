public class Main {
    public static void main(String[] args) {

        System.out.println("5ft, 8in = "+convertoToCentemiters(5,8) + "cm");
        System.out.println("68in = "+convertoToCentemiters(68) + "cm");

    }

    private static double convertoToCentemiters(int inches){
        return inches * 2.54;
    }

    private static double convertoToCentemiters(int feet,int inches){
        return convertoToCentemiters((feet*12)+inches)* 2.54;
    }
}