import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner entry = new Scanner(System.in);

        int a [][] = new int[3][3];

        System.out.println("Digite los valores de su matriz: ");

        for(int i =0;i<3;i++){
            for(int j=0;j<3;j++){
                System.out.print("Matriz["+i+"]["+j+"]: ");
                a[i][j]=entry.nextInt();
            }
        }
        System.out.println("Matriz original: ");
        for(int i =0;i<3;i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(a[i][j]);
            }
            System.out.println("");
        }

        int aux;
        for(int i =0;i<3;i++) {
            for (int j = 0; j < i; j++) {
                aux = a[i][j];
                a[i][j]=a[j][i];
                a[j][i]=aux;
            }

        }
        System.out.println("Matriz transpuesta: ");
        for(int i =0;i<3;i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(a[i][j]);
            }
            System.out.println("");
        }

    }
}