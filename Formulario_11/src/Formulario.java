import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Formulario extends JFrame implements ActionListener {

    private JMenuBar b1;

    private JMenu m1,m2,m3;

    private JMenuItem mi1,mi2,mi3,mi4;


    public Formulario(){

        setLayout(null);

        b1 = new JMenuBar();
        setJMenuBar(b1);

        m1 = new JMenu("Options");
        b1.add(m1);

        m2 = new JMenu("Screen Size");
        m1.add(m2);

        m3 = new JMenu("Background Color");
        m1.add(m3);

        mi1 = new JMenuItem("300*200");
        m2.add(mi1);
        mi1.addActionListener(this);

        mi2 = new JMenuItem("640*480");
        m2.add(mi2);
        mi2.addActionListener(this);

        mi3 = new JMenuItem("Red");
        m3.add(mi3);
        mi3.addActionListener(this);

        mi4 = new JMenuItem("Green");
        m3.add(mi4);
        mi4.addActionListener(this);
    }

    public void actionPerformed(ActionEvent selection){

        if(selection.getSource()==mi1){
            setSize(300,200);
        }
        if(selection.getSource()==mi2){
            setSize(640,481);
        }
        if(selection.getSource()==mi3){
            getContentPane().setBackground(new Color(255, 0, 0));
        }
        if(selection.getSource()==mi4){
            getContentPane().setBackground(new Color(0, 255, 0));
        }
    }






}
