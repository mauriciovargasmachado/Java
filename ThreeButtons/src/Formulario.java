import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Formulario  extends JFrame implements ActionListener {

    private JButton b1,b2,b3;
    private JLabel l1;

    public Formulario(){

        setLayout(null);

        l1 = new JLabel("Waiting");
        l1.setBounds(10,10,300,30);
        add(l1);

        b1 = new JButton("1");
        setBounds(10,100,90,30);
        add(b1);
        b1.addActionListener(this);

        b2= new JButton("2");
        setBounds(110,100,90,30);
        add(b2);
        b2.addActionListener(this);

        b3= new JButton("3");
        setBounds(210,100,90,30);
        add(b3);
        b3.addActionListener(this);

    }

    public void actionPerformed(ActionEvent e){
        if(e.getSource()==b1){
            l1.setText("Haz precionado el boton 1");
        } else if (e.getSource()==b2) {
            l1.setText("Haz precionado el boton 2");
        }else if (e.getSource()==b3) {
            l1.setText("Haz precionado el boton 3");}
    }

    public static void main(String[] args) {

        Formulario f1 = new Formulario();
        f1.setBounds(0,0,500,500);
        f1.setVisible(true);
        f1.setLocationRelativeTo(null);

    }


}
