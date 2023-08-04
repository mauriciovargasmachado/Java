import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Formulario extends JFrame implements ActionListener {

    // Atributes
    private JTextField f1;

    private  JButton b1;

    private  JScrollPane s1;
    private JTextArea a1;

    String text="";

    //Methods
    public Formulario(){

        setLayout(null);

        f1 = new JTextField();
        f1.setBounds(10,10,200,30);
        add(f1);

        b1 = new JButton("Add");
        b1.setBounds(250,10,100,30);
        add(b1);
        b1.addActionListener(this);

        a1 = new JTextArea();
        s1 = new JScrollPane(a1);
        s1.setBounds(10,50,400,300);
        add(s1);

    }

    public void actionPerformed(ActionEvent click){

        if(click.getSource()==b1){
          text += f1.getText() + "\n";
          a1.setText(text);
          f1.setText("");
        }

    }

}
