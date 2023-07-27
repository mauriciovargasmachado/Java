package Clases;

public class Main {
    public static void main(String[] args) {

    Proceso_1 p1 = new Proceso_1();
    Thread p2 = new Thread(new Proceso_2());

    p1.start();
    p2.start();


    }
}
