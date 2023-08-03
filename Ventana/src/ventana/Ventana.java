package ventana;

import javax.swing.*;
import java.awt.*;

public class Ventana extends JFrame {

    public JPanel p1;


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

        Paneles();
        //Etiquetas();
        Botones();

        RadioBotones();

    }

    private void Paneles(){

        p1 = new JPanel();
        p1.setLayout(null);
        this.getContentPane().add(p1);
        //p1.setBackground(Color.green);

    }

    private void Etiquetas(){

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

    private void Botones(){
        JButton b1 = new JButton("Button_1");
        b1.setMnemonic('a'); // alt plus the chart allow keyboard interaction
        b1.setBounds(30,30,120,30);
        b1.setForeground(Color.white);
        b1.setBackground(Color.BLUE);
        p1.add(b1);

        JButton b2 = new JButton("Button_2");
        b2.setMnemonic('s'); // alt plus the chart allow keyboard interaction
        b2.setBounds(250,30,120,30);
        b2.setForeground(Color.white);
        b2.setBackground(Color.RED);
        p1.add(b2);

    }

    private void RadioBotones(){
        JRadioButton r1 = new JRadioButton("Opcion 1");
        r1.setMnemonic('d'); // alt plus the chart allow keyboard interaction
        r1.setBounds(150,80,120,30);
        r1.setForeground(Color.white);
        r1.setBackground(Color.black);
        p1.add(r1);

        JRadioButton r2 = new JRadioButton("Opcion 2");
        r2.setMnemonic('d'); // alt plus the chart allow keyboard interaction
        r2.setBounds(150,140,120,30);
        r2.setForeground(Color.white);
        r2.setBackground(Color.black);
        p1.add(r2);

        JRadioButton r3 = new JRadioButton("Opcion 3");
        r3.setMnemonic('d'); // alt plus the chart allow keyboard interaction
        r3.setBounds(150,200,120,30);
        r3.setForeground(Color.white);
        r3.setBackground(Color.black);
        p1.add(r3);

        ButtonGroup g1 = new ButtonGroup();
        g1.add(r1);
        g1.add(r2);
        g1.add(r3);


    }
}
