import java.util.Scanner;

public abstract class ClasePadre {

    //Atributos

    protected int transacciones, retiro, deposito;
    private static int saldo;
    Scanner sc = new Scanner(System.in);

    //Metodos

    public void Operaciones(){

        int bandera = 0;
        int seleccion = 0;

        do {
            do {
                System.out.println("Por favor selecione una de las siguientes opciones: ");
                System.out.println("    1. Consulta de saldo.");
                System.out.println("    2. Retiro de efectivo.   ");
                System.out.println("    3. Deposito de efectivo.");
                System.out.println("    4. Salir.");
                seleccion = sc.nextInt();

                if (seleccion >= 1 & seleccion <= 4) {
                    bandera = 1;
                } else {
                    System.out.println("---------------------------------------------------------------------------");
                    System.out.println("Usted ha seleccionado una opcion erronea, por favor seleccione otra opcion.");
                    System.out.println("---------------------------------------------------------------------------");
                }

            } while (bandera == 0);

            if(seleccion ==1){
                ClasePadre o1 = new Consulta();
                o1.Transacciones();
            } else if (seleccion==2) {
                ClasePadre o2 = new Retiro();
                o2.Transacciones();
            }else if (seleccion==3){
                ClasePadre o3 = new Ingreso();
                o3.Transacciones();
            } else if (seleccion==4) {
                System.out.println("------------------------");
                System.out.println("Gracias vuelva pronto!!!");
                System.out.println("------------------------");
                bandera=2;
            }

        }while (bandera !=2);

    }

    //Metodo para solicitar cantidad a retirar

    public void Retiro(){
        retiro = sc.nextInt();
    }

    public void Deposito(){
        deposito = sc.nextInt();
    }

    public abstract void Transacciones();

    public static int getSaldo() {
        return saldo;
    }

    public static void setSaldo(int saldo) {
        ClasePadre.saldo = saldo;
    }
}
