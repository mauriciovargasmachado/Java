public class VehiculoTurismo extends Vehiculo{
    //atributos
    int puertas;

    //constructor con herencia
    public VehiculoTurismo(int puertas,String matricula,String marca,String modelo){
        super (matricula,marca,modelo);
        this.puertas = puertas;
    }

        public int getPuertas() {
        return puertas;
    }

    @Override
    public String showData(){
        return "La marca es: "+ marca+"\n El modelo es: "+modelo+"\n La matricula es: "+matricula+"\n El numero de puertas es: "+puertas;
    }
}
