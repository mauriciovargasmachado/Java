public class Retiro extends ClasePadre{

    @Override
    public void Transacciones() {

        System.out.print("Cuanto deseas retirar: ");
        Retiro();
        if(retiro<=getSaldo()){
            transacciones =getSaldo();
            setSaldo(transacciones-retiro);
            System.out.println("-----------------------------");
            System.out.println("Su retiro fue de: "+ retiro);
            System.out.println("Su nuevo saldo es: "+getSaldo());
            System.out.println("-----------------------------");
        }
        else{
            System.out.println("---------------------------------------------------------------------");
            System.out.println("Su saldo es inferior al monto solicitado por favor intente nuevamente");
            System.out.println("---------------------------------------------------------------------");
        }
    }
}
