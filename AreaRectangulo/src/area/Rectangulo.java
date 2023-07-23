package area;

public class Rectangulo {

    int base;

    int lado;
    int resultado;

    public Rectangulo(int base, int lado) {
        this.base = base;
        this.lado = lado;
    }

    public void Respuesta(){
        resultado= base*lado;
    }

    public void showData(){
        Respuesta();
        System.out.println("El resultado es: "+resultado);
    }
}
