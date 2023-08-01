package ventana;

import javax.swing.*;
import java.awt.*;

public class Ventana extends JFrame {

    public Ventana(){
        //this.setSize(500,300);
        //this.setLocation(550,300);
        this.setBounds(550,300,500,300);
        this.setLocationRelativeTo(null);
        setMinimumSize(new Dimension(200,200));
        //this.getContentPane().setBackground(Color.BLUE);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        InicioComponentes();

        setTitle("This is the title");


    }

    private void InicioComponentes(){

        JPanel p1 = new JPanel();
        p1.setLayout(null);
        this.getContentPane().add(p1);
        //p1.setBackground(Color.green);

        JLabel l1 = new JLabel("This is the first label");
        l1.setBounds(10,10,40,60);
        this.getContentPane().add(l1);



    }

}
