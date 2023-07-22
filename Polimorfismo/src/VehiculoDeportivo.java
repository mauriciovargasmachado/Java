public class VehiculoDeportivo extends Vehiculo {

    //atributos
    int cilindrada;

    //constructor con herencia
    public VehiculoDeportivo(int cilindrada,String matricula,String marca,String modelo){
        super (matricula,marca,modelo);
        this.cilindrada = cilindrada;
    }

    public int getCilindrada() {
        return cilindrada;
    }
    @Override
    public String showData(){
        return "La marca es: "+ marca+"\n El modelo es: "+modelo+"\n La matricula es: "+matricula+"\n La cilindrada es: "+cilindrada;
    }
}