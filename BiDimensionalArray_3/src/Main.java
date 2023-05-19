import javax.swing.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner entry = new Scanner(System.in);

        int matrix[][],rows,columns;

        rows = Integer.parseInt(JOptionPane.showInputDialog("Please insert the number of rows of your array"));

        columns = Integer.parseInt(JOptionPane.showInputDialog("Please insert the number of columns of your array"));

        matrix = new int[rows][columns];

        System.out.println("Please insert a array: ");
        for (int i =0; i<rows; i++) {
            for (int j = 0; j < rows; j++) {
                System.out.println("Matrix[" + i + "][" + j + "]: ");
                matrix[i][j] = entry.nextInt();
            }
        }
        if (rows==columns){
            JOptionPane.showMessageDialog(null,"The Array is simetric!.");
        }
        else {
            JOptionPane.showMessageDialog(null,"The Array is not simetric!.");
        }

    }
}