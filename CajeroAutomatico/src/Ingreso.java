public class Ingreso extends ClasePadre {

    @Override
    public void Transacciones() {

        System.out.print("--------------------------------------");
        System.out.print("Cual es el monto que desea depositar: ");
        System.out.println("------------------------------------");

        Deposito();

        transacciones = getSaldo();

        setSaldo(transacciones+deposito);
        System.out.println("-------------------------------");
        System.out.println("Usted a depositado: " + deposito);
        System.out.println("Su saldo actual es: "+getSaldo());
        System.out.println("-------------------------------");

    }
}
