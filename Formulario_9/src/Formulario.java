import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Formulario extends JFrame implements ActionListener {

    private JLabel l1,l2,l3;

    private JButton b1;

    private JComboBox c1,c2,c3;

    public Formulario(){

        setLayout(null);

        l1 = new JLabel("Red");
        l1.setBounds(100,10,100,30);
        add(l1);

        c1 = new JComboBox();
        c1.setBounds(200,10,50,30);
        for(int i = 0; i<=256;i++) {
            c1.addItem(String.valueOf(i));
        }
        add(c1);


        l2 = new JLabel("Green");
        l2.setBounds(100,50,100,30);
        add(l2);

        c2 = new JComboBox();
        c2.setBounds(200,50,50,30);
        for(int i = 0; i<=256;i++) {
            c2.addItem(String.valueOf(i));
        }
        add(c2);

        l3 = new JLabel("Blue");
        l3.setBounds(100,90,100,30);
        add(l3);

        c3 = new JComboBox();
        c3.setBounds(200,90,50,30);
        for(int i = 0; i<=256;i++) {
            c3.addItem(String.valueOf(i));
        }
        add(c3);


        b1 = new JButton("Select Color");
        b1.setBounds(150,130,100,30);
        add(b1);
        b1.addActionListener(this);

    }

    public void actionPerformed(ActionEvent click){
        if(click.getSource()==b1){

            String v1 = String.valueOf(c1.getSelectedIndex());
            String v2 = String.valueOf(c2.getSelectedIndex());
            String v3 = String.valueOf(c3.getSelectedIndex());

            int Red = Integer.parseInt(v1);
            int Green = Integer.parseInt(v2);
            int Blue = Integer.parseInt(v3);

            Color color_1 = new Color(Red,Green,Blue);
            b1.setBackground(color_1);

        }
    }

}
