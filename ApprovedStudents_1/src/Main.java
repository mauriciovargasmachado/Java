import javax.swing.*;

public class Main {
    public static void main(String[] args) {

        double nota;

        int contador_aprobados=0, contador_condicionados=0, contador_suspendidos=0;

        for(int i =1; i<6;i++){

            do{
                nota = Double.parseDouble((JOptionPane.showInputDialog("Digite una nota entre 0 y 10: ")));
                JOptionPane.showMessageDialog(null,"Usted ha ingresado "+nota+" como nota.");
            }

            while (nota<0 || nota >10);

            if (nota==4){
                JOptionPane.showMessageDialog(null,"Usted ha sido condicionado");
                contador_condicionados++;
            }
            else if (nota>4 && nota<10){
                JOptionPane.showMessageDialog(null,"Usted ha sido aprobado");
                contador_aprobados++;
            }
            else if (nota<4 && nota>0){
                JOptionPane.showMessageDialog(null,"Usted ha sido suspendido");
                contador_suspendidos++;
            }
            else{
                JOptionPane.showMessageDialog(null,"Usted ha ingresado una nota fuera del rango");
            }
        }
        JOptionPane.showMessageDialog(null,("La cantidad de alumnos aprobados es de: "+contador_aprobados+"\nLa cantidad de alumnos condicionados es de:"+contador_condicionados+"\nLa cantidad de alumnos suspendidos es de:  "+contador_suspendidos));

    }
}