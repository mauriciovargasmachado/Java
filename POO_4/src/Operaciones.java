public class Operaciones {

    //Methods

    public int sumar(int numero_1,int numero_2){
        int suma = numero_1+numero_2;
        return suma;
    }

    public int restar(int numero_1, int numero_2){
        int resta = numero_1-numero_2;
        return resta;
    }

    public int multiplicar(int numero_1, int numero_2){
        int multiplicacion = numero_1*numero_2;
        return multiplicacion;
    }

    public double dividir(double numero_1, double numero_2){
        double division = numero_1/numero_2;
        return division;
    }

    public void mostrarResultados(int suma, int resta, int multiplicacion,double division){

        System.out.println("La suma de los numeros es: "+suma);
        System.out.println("La resta de los numeros es: "+resta);
        System.out.println("La multiplicacion de los numeros es: "+multiplicacion);
        System.out.println("La division de los numeros es: "+division);
    }

}
