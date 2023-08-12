import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Welcome extends JFrame implements ActionListener {

    private JLabel l1,l2,l3,l4;
    private JTextField t1;
    private JButton b1;

    public Welcome (){

        setLayout(null);
        setTitle("Welcome - EOLO Company");
        getContentPane().setBackground(new Color(255,255,255));
        setIconImage(new ImageIcon(getClass().getResource("Images/icon.jpg")).getImage());


        l1 = new JLabel("EOLO");
        l1.setBounds(115,15,300,150);
        l1.setFont(new Font("Andale Mono",1,40));
        l1.setForeground(new Color(0,0,250));
        add(l1);

        l2 = new JLabel("Workers control system.");
        l2.setBounds(65,135,300,30);
        l2.setFont(new Font("Andale Mono",1,18));
        l2.setForeground(new Color(0,0,250));
        add(l2);

        l3 = new JLabel("Ingrese su nombre");
        l3.setBounds(115,212,200,30);
        l3.setFont(new Font("Andale Mono",1,12));
        l3.setForeground(new Color(0,0,250));
        add(l3);

        l4 = new JLabel("***** Eolo company 2023 *****");
        l4.setBounds(95,375,300,30);
        l4.setFont(new Font("Andale Mono",1,12));
        l4.setForeground(new Color(0,0,250));
        add(l4);

        t1 = new JTextField();
        t1.setBounds(45,240,255,25);
        t1.setBackground(new Color(224,224,224));
        t1.setFont(new Font("Andale Mono",1,14));
        t1.setForeground(new Color (0,0,250));
        add(t1);

        b1 = new JButton("Access");
        b1.setBounds(125,280,100,30);
        b1.setBackground(new Color(255,255,255));
        b1.setFont(new Font("Andale Mono",1,14));
        b1.setForeground(new Color (0,0,250));
        b1.addActionListener(this);
        add(b1);


    }

    public void actionPerformed(ActionEvent click){
        if(click.getSource()==b1){

        }
    }

}
