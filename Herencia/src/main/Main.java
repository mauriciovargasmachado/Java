package main;


import operaciones.ClaseHija_1;
import operaciones.ClaseHija_2;

public class Main {

    public static void main(String[] args) {

        ClaseHija_1 s1 = new ClaseHija_1();

        s1.PedirDatos();
        s1.Sumar();
        s1.MostrarResultado();

        ClaseHija_2 r1 = new ClaseHija_2();

        r1.PedirDatos();
        r1.Restar();
        r1.MostrarResultado();

    }
}
