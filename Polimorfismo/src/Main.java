public class Main {
    public static void main(String[] args) {

        Vehiculo vehiculos[] = new Vehiculo[4];

        vehiculos[0] = new Vehiculo("CPS971","Toyota","Corolla");
        vehiculos[1] = new VehiculoTurismo(4,"PPZ826","Tesla","Model S");
        vehiculos[2] = new VehiculoDeportivo(8000,"HHR778","Suzuki","core");
        vehiculos[3] = new VehiculoPersonal(5000,"RRE555","Toyota","corolla");

        for(int i=0;i<vehiculos.length;i++){
            System.out.println(vehiculos[i].showData());
        }

    }
}