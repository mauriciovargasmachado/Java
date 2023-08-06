import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Formulario extends JFrame implements ActionListener {

    private JMenuBar mb1;

    private JMenu m1;

    private JMenuItem mi1,mi2,mi3;

    public Formulario(){

        setLayout(null);

        mb1 = new JMenuBar();
        setJMenuBar(mb1);

        m1 = new JMenu("Opciones");
        mb1.add(m1);

        mi1 = new JMenuItem("Red");
        mi1.addActionListener(this);
        m1.add(mi1);

        mi2 = new JMenuItem("Green");
        mi2.addActionListener(this);
        m1.add(mi2);

        mi3 = new JMenuItem("Blue");
        mi3.addActionListener(this);
        m1.add(mi3);

    }

    public void  actionPerformed(ActionEvent click){

        Container f = this.getContentPane();

        if(click.getSource()==mi1){
            f.setBackground(new Color(255,0,0));
        }
        if (click.getSource()==mi2) {
            f.setBackground(new Color(0,255,0));
        }
        if (click.getSource()==mi3) {
            f.setBackground(new Color(0,0,255));
        }
    }

}
