import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner entry = new Scanner(System.in);

        int a[][] = new int[3][3];

        System.out.println("Digite los valores de su matriz: ");

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("Matriz[" + i + "][" + j + "]: ");
                a[i][j] = entry.nextInt();
            }
            System.out.println("");
        }
        System.out.println("");
        System.out.println("Matriz original: ");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(a[i][j]);
            }
            System.out.println("");
        }

        int sumaF,sumaC;
        System.out.println("");
        System.out.println("Suma fila: ");
        for (int i = 0; i < 3; i++) {
            sumaF=0;

            for (int j = 0; j < 3; j++) {
                sumaF+=a[i][j];
            }
            System.out.println("La suma de las filas es: "+sumaF);
        }

        System.out.println("");
        System.out.println("Suma fila: ");
        for (int i = 0; i < 3; i++) {
            sumaC=0;

            for (int j = 0; j < 3; j++) {
                sumaC+=a[j][i];
            }
            System.out.println("La suma de las Columna es: "+sumaC);
        }
    }
}
