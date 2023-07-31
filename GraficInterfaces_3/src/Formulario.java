import javax.swing.*;

public class Formulario extends JFrame {

    public Formulario(){

        setLayout(null);

        JLabel j1 = new JLabel("This is the first label!!!");
        j1.setBounds(100,50,300,20);
        add(j1);
        JLabel j2 = new JLabel("This is the second label!!!");
        j2.setBounds(100,100,100,20);
        add(j2);


    }

    public static void main(String[] args) {

        Formulario f1 = new Formulario();
        f1.setBounds(50,50 ,500, 200);
        f1.setLocationRelativeTo(null);
        f1.setVisible(true);

    }

}
