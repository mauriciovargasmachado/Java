import javax.swing.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class Formulario extends JFrame implements ItemListener {

    private JComboBox c1;

    private JLabel l1;

    public String text;

    public Formulario(){

        setLayout(null);

        c1 = new JComboBox();
        c1.setBounds(20,20,80,30);
        add(c1);
        c1.addItemListener(this);

        c1.addItem("Red");
        c1.addItem("Blue");
        c1.addItem("Green");
        c1.addItem("Yellow");
        c1.addItem("Orange");
        c1.addItem("Brown");

    }

    public void itemStateChanged(ItemEvent click){
        if(click.getSource()==c1){
            text = c1.getSelectedItem().toString();
            setTitle(text);

        }
    }


}
