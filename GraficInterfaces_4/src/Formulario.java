import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Formulario extends JFrame implements ActionListener {

    JButton b1;
    public Formulario(){
        setLayout(null);
        JButton b1 = new JButton("Click me!!!");
        b1.setBounds(300,250,100,30);
        b1.add(b1);
        b1.addActionListener(this);
    }

    public void actionPerformed(ActionEvent evento){
        if(evento.getSource() == b1){
            System.out.println("Button Clicked!!!");
        }
    }

    public static void main(String[] args) {

        Formulario f1 = new Formulario();
        f1.setBounds(0,0,450,350);
        f1.setLocationRelativeTo(null);
        f1.setVisible(true);
    }
}
