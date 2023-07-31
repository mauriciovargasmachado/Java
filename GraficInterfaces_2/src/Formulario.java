import javax.swing.*;

public class Formulario extends JFrame {

    public Formulario(){

        setLayout(null);
    }

    public static void main(String[] args) {

        Formulario f1 = new Formulario();
        f1.setBounds(200,150,400,200);
        f1.setVisible(true);
        // To set in the center of the screen
        f1.setLocationRelativeTo(null);
        // To resize the window.
        //f1.setResizable(false);


    }

}
