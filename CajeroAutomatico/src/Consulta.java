public class Consulta extends ClasePadre{

    @Override
    public void Transacciones() {
        System.out.println("-------------------------------");
        System.out.println("Su saldo actual es: "+getSaldo());
        System.out.println("-------------------------------");
    }
}
