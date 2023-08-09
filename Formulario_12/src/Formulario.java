import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class Formulario extends JFrame implements ChangeListener {

    private JCheckBox c1,c2,c3;

    public Formulario(){

        setLayout(null);

        c1 = new JCheckBox("Red");
        c1.setBounds(50,50,200,30);
        add(c1);
        c1.addChangeListener(this);


        c2 = new JCheckBox("Green");
        c2.setBounds(50,130,200,30);
        add(c2);
        c2.addChangeListener(this);

        c3 = new JCheckBox("Blue");
        c3.setBounds(50,210,200,30);
        add(c3);
        c2.addChangeListener(this);

    }

    public void stateChanged(ChangeEvent chick){

        String cad="";

        if(c1.isSelected()==true){
            cad = cad+"Red - ";
        }
        if(c2.isSelected()==true){
            cad = cad+"Green - ";
        }
        if(c3.isSelected()==true){
            cad = cad+"blue - ";
        }

        setTitle(cad);
    }



}
