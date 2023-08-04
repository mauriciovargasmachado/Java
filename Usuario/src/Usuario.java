import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Usuario extends JFrame implements ActionListener {

    private JButton b1;

    private JTextField t1;

    private JLabel l1;


    public Usuario() {

        setLayout(null);

        l1 = new JLabel("User");
        l1.setBounds(10, 10, 100, 30);
        add(l1);

        t1 = new JTextField("");
        t1.setBounds(120, 17, 150, 20);
        add(t1);

        b1 = new JButton("Accept");
        b1.setBounds(10, 80, 100, 30);
        add(b1);
        b1.addActionListener(this);

    }

    public void actionPerformed(ActionEvent click) {

        if (click.getSource() == b1) {
            String text = t1.getText();
            setTitle(text);

        }


    }
}
