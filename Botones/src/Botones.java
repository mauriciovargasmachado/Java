import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Botones extends JFrame implements ActionListener {

    private JButton b1,b2,b3;

    private JLabel l1;

    public Botones(){

        setLayout(null);

        b1 = new JButton("1");
        b1.setBounds(10,100,90,30);
        add(b1);
        b1.addActionListener(this);

        b2 = new JButton("2");
        b2.setBounds(110,100,90,30);
        add(b2);
        b2.addActionListener(this);

        b3 = new JButton("3");
        b3.setBounds(210,100,90,30);
        add(b3);
        b3.addActionListener(this);

        l1 = new JLabel("Waiting.....");
        l1.setBounds(10,10,300,30);
        add(l1);
    }

    public void actionPerformed(ActionEvent click){

        if(click.getSource()==b1){
            l1.setText("You have clicked button No. 1");
        } else if (click.getSource()==b2) {
            l1.setText("You have clicked button No. 2");
        }
        else if (click.getSource()==b3) {
            l1.setText("You have clicked button No. 3");
        }
    }




}
