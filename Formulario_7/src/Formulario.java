import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Formulario extends JFrame implements ActionListener {

    private JLabel l1,l2,l3;

    private JButton b1;

    private JTextField t1,t2;

    public int v1=0,v2=0,v3=0;


    public Formulario(){

        setLayout(null);

        l1 = new JLabel("Insert the first value: ");
        l1.setBounds(50,5,150,30);
        add(l1);

        l2 = new JLabel("Insert the second value: ");
        l2.setBounds(50,35,150,30);
        add(l2);

        l3 = new JLabel("The result is: ");
        l3.setBounds(220,80,100,30);
        add(l3);

        t1 = new JTextField();
        t1.setBounds(220,10,150,20);
        add(t1);

        t2 = new JTextField();
        t2.setBounds(220,40,150,20);
        add(t2);

        b1 = new JButton("Add");
        b1.setBounds(50,80,150,30);
        add(b1);
        b1.addActionListener(this);



    }

    public void actionPerformed(ActionEvent click){
        if(click.getSource()== b1){
            v1 = Integer.parseInt(t1.getText());
            v2 = Integer.parseInt(t2.getText());
            v3 = v1+v2;
            l3.setText("The result is: "+v3);
        }
    }



}
