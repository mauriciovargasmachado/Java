public class Persona {

    // atributos
    String nombre;
    int edad;
    int noIdentificacion;

    // Metodos


    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public Persona(int noIdentificacion) {
        this.noIdentificacion = noIdentificacion;
    }

    public void correr(){
        System.out.println("Mi nombre es "+nombre+" Tengo "+edad+" Estoy corriendo una maraton");
    }

    public void correr(int kilometros){
        System.out.println("He corrido "+kilometros+ " Kilometros");
    }
}
