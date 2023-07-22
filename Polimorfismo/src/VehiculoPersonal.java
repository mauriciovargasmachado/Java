public class VehiculoPersonal extends Vehiculo{
 //atributos
    int carga;

    //constructor con herencia
    public VehiculoPersonal(int carga,String matricula,String marca,String modelo){
        super (matricula,marca,modelo);
        this.carga = carga;
    }

    public int getCarga() {
        return carga;
    }
    @Override
    public String showData(){
        return "La marca es: "+ marca+"\n El modelo es: "+modelo+"\n La matricula es: "+matricula+"\n La carga es: "+carga;
    }
}
