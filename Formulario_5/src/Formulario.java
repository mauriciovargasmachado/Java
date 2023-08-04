import javax.swing.*;

public class Formulario extends JFrame {

    private JLabel l1;
    private JTextField t1;
    private JTextArea a1;
    private JScrollPane s1;


    public Formulario(){

        setLayout(null);

        t1 = new JTextField();
        t1.setBounds(10,30,200,30);
        add(t1);

        a1 = new JTextArea();
        s1 = new JScrollPane(a1);// para añadir el scrolPane al area
        s1.setBounds(10,70,300,300);
        add(s1);




    }


}
