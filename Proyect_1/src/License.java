import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class License extends JFrame implements ChangeListener, ActionListener {

    private JLabel l1, l2;
    private JCheckBox c1;
    private JButton b1,b2;
    private JScrollPane sp1;
    private JTextArea a1;

    public License(){

        setLayout(null);
        setTitle("License of use");
        getContentPane().setBackground(new Color(255,255,255));
        setIconImage(new ImageIcon(getClass().getResource("Images/icon.jpg")).getImage());

        l1 = new JLabel("Terms and conditions");
        l1.setBounds(215,5,200,30);
        l1.setFont(new Font("Andale Mono",1,14));
        l1.setForeground(new Color(0,0,0));
        add(l1);

        a1 = new JTextArea();
        a1.setEditable(false);
        a1.setFont(new Font("Andale Mono",0,9));
        a1.setText("Terms and conditions");
        sp1 = new JScrollPane(a1);
        sp1.setBounds(10,40,575,200);
        add(sp1);

        c1 = new JCheckBox("I accept.");
        c1.setBounds(10,250,300,30);
        c1. addChangeListener(this);
        c1.setBackground(new Color(255,255,255));
        add(c1);

        b1 = new JButton("Dont Accept!");
        b1.setBounds(10,290,100,30);
        b1.addActionListener(this);
        b1.setEnabled(true);
        add(b1);

        b2 = new JButton("Accept!");
        b2.setBounds(120,290,100,30);
        b2.addActionListener(this);
        b2.setEnabled(false);
        add(b2);

        l2 = new JLabel("EOLO");
        l2.setBounds(415,135,300,300);
        l2.setFont(new Font("Andale Mono",1,50));
        l2.setForeground(new Color(0,0,255));
        add(l2);

    }

    public void stateChanged(ChangeEvent click){

    }

    public void actionPerformed(ActionEvent click){
        if(click.getSource()==b1){

        }
    }



}
