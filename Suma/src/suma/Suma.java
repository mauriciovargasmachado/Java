package suma;

public class Suma {

    //aritbutos
    private int n1;
    private int n2;
    private int resultado;

    // constructor
    public Suma(int n1, int n2) {
        this.n1 = n1;
        this.n2 = n2;
    }

    public void Operacion(){
        resultado = n1+n2;
    }

    public void showData(){
        Operacion();
        System.out.println("El resultado de la suma de los digitos es: "+resultado);
    }
}
