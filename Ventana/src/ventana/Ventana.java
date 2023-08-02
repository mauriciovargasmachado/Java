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
        l1.setBounds(10,10,190,30);
        l1.setHorizontalAlignment(SwingConstants.CENTER);
        l1.setForeground(Color.white);
        l1.setBackground(Color.black);
        l1.setOpaque(true);
        l1.setFont(new Font("chiller",Font.PLAIN,20));
        p1.add(l1);

        ImageIcon imagen_1 = new ImageIcon("pizza.jpg");
        JLabel i1 = new JLabel(imagen_1);
        i1.setBounds(10,80,458,458) ;
        i1.setIcon(new ImageIcon(imagen_1.getImage().getScaledInstance(400,400,Image.SCALE_SMOOTH)));
        p1.add(i1);

    }

}
