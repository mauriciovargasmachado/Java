import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Formulario extends JFrame implements ActionListener implements ChangeListener {

    public Checkbox c1;

    public JButton b1;

    public JLabel l1;



    public Formulario(){

        setLayout(null);

        l1 = new JLabel("Accept terms and conditions");
        l1.setBounds(20,20,400,30);
        add(l1);

        c1 = new Checkbox("Accept");
        c1.setBounds(20,80,400,30);
        add(c1);
        c1.addChangeListener(this);


        b1 = new JButton("Submit");
        b1.setBounds(20,130,400,30);
        add(b1);
        b1.addActionListener(this);


    }

    public void stateChange(ChangeEvent chick){
        if (c1.isSelected()==true){
            b1.setEnabled(true);
        }else{
            b1.setEnabled(false);
        }
    }

    public void actionPerformed(ActionEvent click){
        if(click.getSource()== b1){
            System.exit(0);
        }
    }




}
