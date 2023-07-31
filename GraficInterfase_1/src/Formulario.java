import javax.swing.*;

public class Formulario extends JFrame {

    public Formulario() {
        JLabel l1 = new JLabel("Saludos!!!");
        l1.setBounds(150, 50, 50, 50);
        add(l1);
    }

    public static void main(String[] args) {
        Formulario f1 = new Formulario();
        f1.setBounds(0,0,200,150);
        f1.setVisible(true);
        f1.setLocationRelativeTo(null);
    }
}
