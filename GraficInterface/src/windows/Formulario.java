package windows;


import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.Normalizer;

public class Formulario extends JFrame implements ActionListener {

    private JTextField textField_1;
    private JLabel label_1;
    private JButton boton_1;

    private Formulario(){
        setLayout(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        label_1 = new JLabel("Este es el mensaje.");
        label_1.setBounds(15,10,100,15);
        add(label_1);

        textField_1 = new JTextField();
        textField_1.setBounds(80,16,190,20);
        add(textField_1);

        boton_1 = new JButton("Click me!!!");
        boton_1.setBounds();
        add(boton_1);
        boton_1.addActionListener(this);

    }

    @Override
    public void actionPerformed(ActionEvent e){

        if(e.getSource()==boton_1){
            String cadena = textField_1.getText();;
            JOptionPane.showMessageDialog(null,cadena);
        }
    }

    public static void main(String[] args) {
        Formulario formulario = new Formulario;
        formulario.setBounds(0,0,300,150);
        formulario.setVisible(true);
        
    }

}
